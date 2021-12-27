package com.ashimjk.testconfigannotation;

import com.ashimjk.testconfigannotation.beans.DefinedInTestConfig;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class ImportTestConfig {

    @Bean
    public DefinedInTestConfig definedInTestConfig() {
        return new DefinedInTestConfig("from @TestConfiguration");
    }

}