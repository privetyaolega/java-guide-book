package com.eis.conspect.java.java8;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

    public static void main(String[] args) {

		/*
		 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		 *

			Predicate<T> - 				boolean test(T t);
			BinaryOperator<T> - 		R apply(T t, U u);
			UnaryOperator<T> -			T apply(T t);
			Function<T,R> - 			R apply(T t);
			Consumer<T> - 				void accept(T t);
			Supplier<T> - 				T get();

		 */

        UnaryOperator<Integer> uo = x -> x * 2;
        uo.apply(10); // 20

        Predicate<Integer> predicate = x -> x > 5;
        boolean result = predicate.test(20); // true


    }

}
