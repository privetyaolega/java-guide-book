package com.eis.conspect.java.testing.junit.rule.examples.second.annotations;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NeedFreshDriver  {


}
