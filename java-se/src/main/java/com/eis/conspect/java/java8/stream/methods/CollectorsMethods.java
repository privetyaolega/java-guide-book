package com.eis.conspect.java.java8.stream.methods;

import com.eis.conspect.java.java8.stream.methods.TestModels.Person;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMethods {

    private List<Person> persons = getPersonsList();

    @Test
    public void testJoining() {
        persons.stream().map(Person::getCountry). // { US | Mexico | Mexico | US | Canada | Mexico | Brazil | US }
                collect(Collectors.joining(" | ", " { ", " } "));

        persons.stream().map(Person::getCountry). // USMexicoMexicoUSCanadaMexicoBrazilUS
                collect(Collectors.joining());

        persons.stream().map(Person::getCountry). // US ? Mexico ? Mexico ? US ? Canada ? Mexico ? Brazil ? US
                collect(Collectors.joining(" ? "));
    }

    @Test
    public void testGroupingByOnlyPredicate() {
        Map<Boolean, List<Person>> peopleFromUS = persons.stream()
                .collect(Collectors.groupingBy(x -> x.getCountry().equals("US")));
        /*
                true  = Persons with country  = US
                false = Persons with country != US
         */
    }

    @Test
    public void testGroupingByPredicate() {
        Map<Boolean, Long> countFromUS = persons.stream()
                .collect(Collectors.groupingBy(c -> c.getCountry().equals("US"), Collectors.counting()));
        /*
                true = Persons with country = US
                false = Persons with country != US
         */
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
