package com.eis.conspect.java.testing.junit.rule.examples.second.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SingleParameterDataSource  {
    Class clazz() default void.class;

    String value();

}