package com.skeleton.ui.test.configuration;

import com.skeleton.ui.test.Configuration;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {Configuration.class})
public class ContextConfiguration {
}
