package com.sampa.unit.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MathTest.class, SomeTests.class})
public class RunnerAllTest { }
