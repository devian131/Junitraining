package com.junit.tests.test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

    @RunWith(Categories.class)
    @Categories.IncludeCategory({MariaTest.class, AlinaTest.class})
    @Suite.SuiteClasses({ ModuloTest.class, MulTest.class})
    public class SmokeTestRunner {

    }

