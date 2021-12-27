package com.ashimjk.testconfigannotation;

import com.ashimjk.testconfigannotation.beans.DefinedInAppConfig;
import com.ashimjk.testconfigannotation.beans.OverriddenByTestConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DefinedInAppConfig definedInAppConfig() {
        return new DefinedInAppConfig("from @Configuration");
    }

    @Bean
    public OverriddenByTestConfig overriddenByTestConfig() {
        return new OverriddenByTestConfig("from @Configuration");
    }

}
