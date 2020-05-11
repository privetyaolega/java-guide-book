package com.eis.conspect.java.java8.stream.methods.Examples;

import com.eis.conspect.java.java8.stream.methods.TestModels.Person;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static toolkit.verification.CustomAssertions.assertThat;

public class Example1 {

    private List<Person> persons = getPersonsList();

    @Test
    public void peopleFromUSA() {
        persons.stream().filter(person -> person.getCountry().equals("US"))
                .forEach(System.out::println);
    }

    @Test
    public void averageAgeFromMexico() {
        double averageAge = persons.stream()
                .filter(person -> person.getCountry().equals("Mexico"))
                .mapToInt(Person::getAge)
                .summaryStatistics()
                .getAverage();
        double peopleFromUS = new BigDecimal(averageAge).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("Average age people's from Mexico = " + peopleFromUS);
    }

    @Test
    public void sortUSAndNonUSPersons() {
        Map<Boolean, List<Person>> peopleFromUS = persons.stream().collect(Collectors.groupingBy(x -> x.getCountry().equals("US")));

        peopleFromUS.get(true).forEach(person -> assertThat(person.getCountry()).isEqualTo("US"));
        peopleFromUS.get(false).forEach(person -> assertThat(person.getCountry()).isNotEqualTo("US"));
        assertThat(peopleFromUS.get(false).size()).isEqualTo(5);
        assertThat(peopleFromUS.get(true).size()).isEqualTo(3);

        /**
         GroupingBy collector is used for grouping objects by some property and storing results in a Map instance.

         PartitioningBy is a specialized case of groupingBy that accepts a Predicate instance and collects Stream
         elements into a Map instance that stores Boolean values as keys and collections as values. Under the “true”
         key, you can find a collection of elements matching the given Predicate, and under the “false” key, you can
         find a collection of elements not matching the given Predicate.
         */
        Map<Boolean, Long> countFromUS = persons.stream().collect(Collectors.groupingBy(c -> c.getCountry().equals("US"), Collectors.counting()));

        Map<String, Long> countryCount = persons.stream().collect(Collectors.groupingBy(c -> c.getCountry(), Collectors.counting()));

        Map<String, List<Person>> countryCount1 = persons.stream().collect(Collectors.groupingBy(c -> c.getCountry()));

        Map<String, Double> countryAverageAge = persons.stream().collect(Collectors.groupingBy(Person::getCountry,
                Collectors.averagingDouble(Person::getAge)));


        String firstWord = "hello";
        String secondWord = "lloeh";
        String thirdWord = "llloenn";

        Map<Character, Long> collect1 = firstWord.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> collect2 = secondWord.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> collect3 = thirdWord.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> collect4 = thirdWord.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }


    private List<Person> getPersonsList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(23, "US", "John"));
        persons.add(new Person(33, "Mexico", "Elizabet"));
        persons.add(new Person(18, "Mexico", "Cristiano"));
        persons.add(new Person(19, "US", "Alex"));
        persons.add(new Person(23, "Canada", "Carl"));
        persons.add(new Person(13, "Mexico", "Ann"));
        persons.add(new Person(17, "Brazil", "Huan"));
        persons.add(new Person(18, "US", "Aleh"));
        return persons;
    }
}