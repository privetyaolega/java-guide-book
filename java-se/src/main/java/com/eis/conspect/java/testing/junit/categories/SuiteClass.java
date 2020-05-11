package com.eis.conspect.java.testing.junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({
        com.eis.conspect.java.testing.junit.categories.FirstTestClass.class,
})
@IncludeCategory(MyCategories.PositiveTests.class)
@ExcludeCategory(MyCategories.BrokenTests.class)
public class SuiteClass {


}
