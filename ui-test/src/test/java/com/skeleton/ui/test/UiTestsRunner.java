package com.skeleton.ui.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features")
public class UiTestsRunner extends AbstractTestNGCucumberTests {
}
