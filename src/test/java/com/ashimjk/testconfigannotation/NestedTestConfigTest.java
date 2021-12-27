package com.ashimjk.testconfigannotation;

import com.ashimjk.testconfigannotation.beans.DefinedInAppConfig;
import com.ashimjk.testconfigannotation.beans.DefinedInTestConfig;
import com.ashimjk.testconfigannotation.beans.OverriddenByTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {"spring.main.allow-bean-definition-overriding=true"})
public class NestedTestConfigTest {

    @Autowired private DefinedInAppConfig definedInAppConfig;
    @Autowired private DefinedInTestConfig definedInTestConfig;
    @Autowired private OverriddenByTestConfig overriddenByTestConfig;

    @Test
    void testNestedTestConfig() {
        definedInAppConfig.print();
        definedInTestConfig.print();
        overriddenByTestConfig.print();
    }

    @TestConfiguration
    static class NestedTestConfig {

        @Bean
        public DefinedInTestConfig definedInTestConfig() {
            return new DefinedInTestConfig("from @TestConfiguration");
        }

        @Bean
        public OverriddenByTestConfig overriddenByTestConfig() {
            return new OverriddenByTestConfig("from @TestConfiguration");
        }

    }

}
