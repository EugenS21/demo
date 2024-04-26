package com.skeleton.ui.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(com.skeleton.ui.core.Configuration.class)
@org.springframework.context.annotation.Configuration
@ComponentScan
@Slf4j
public class Configuration {
}
