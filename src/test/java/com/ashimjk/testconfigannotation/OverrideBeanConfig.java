package com.ashimjk.testconfigannotation;

import com.ashimjk.testconfigannotation.beans.DefinedInTestConfig;
import com.ashimjk.testconfigannotation.beans.OverriddenByTestConfig;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class OverrideBeanConfig {

    @Bean
    public DefinedInTestConfig definedInTestConfig() {
        return new DefinedInTestConfig("from @TestConfiguration");
    }

    @Bean
    public OverriddenByTestConfig overriddenByTestConfig() {
        return new OverriddenByTestConfig("from @TestConfiguration");
    }

}