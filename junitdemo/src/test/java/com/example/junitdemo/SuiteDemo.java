package com.example.junitdemo;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({ Demotest.class, Demotest2.class })
@ExcludeTags("sanity")
@SuiteDisplayName("A demo Test Suite")
public class SuiteDemo {

}
