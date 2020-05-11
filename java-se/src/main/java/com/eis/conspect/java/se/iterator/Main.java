package com.eis.conspect.java.se.iterator;

import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {

		/*
		 * Иттератор - некий обьект, который последовательно возвращает каждое значение
		   Возможность перебора всех элементов объекта (не обязательно коллекция) любой обьект, где существует набор данных
		   Реализовывается с помощью интерфейса Iterable - стандартный Iterator, но с дополнительными реализованными методами;
		   Все дочерние классы от Collection поддерживают итераторы

		  - E next();
		  - boolean hasNext();
		  - void remove();

		   Интерфейс Map напрямую не наследуется от Iterable, но его ключи или значения ключей
		   могут быть преобразованы в Set, который поддерживает итерацию;

		   Нужно использовать Iterator вместо for-each, чтобы удалить текующий элемент
		*/

        List<Integer> list = new ArrayList<>();
        list.listIterator();

        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("G");
        set.add("C");
        set.add("B");
        set.add("E");

        Iterator<String> iter = set.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }


        // Как пробежаться по Map

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(5, "five");
        map.put(3, "three");
        map.put(2, "four");

        Iterator<Entry<Integer, String>> iterMap = map.entrySet().iterator();

        while(iterMap.hasNext()){
            Entry<Integer, String> entry = iterMap.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key - " + key + "; value - " + value);
        }



    }

}
