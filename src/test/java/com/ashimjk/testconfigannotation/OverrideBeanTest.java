package com.ashimjk.testconfigannotation;

import com.ashimjk.testconfigannotation.beans.DefinedInAppConfig;
import com.ashimjk.testconfigannotation.beans.DefinedInTestConfig;
import com.ashimjk.testconfigannotation.beans.OverriddenByTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        classes = OverrideBeanConfig.class,
        properties = {"spring.main.allow-bean-definition-overriding=true"}
)
public class OverrideBeanTest {

    @Autowired private DefinedInAppConfig definedInAppConfig;
    @Autowired private DefinedInTestConfig definedInTestConfig;
    @Autowired private OverriddenByTestConfig overriddenByTestConfig;

    @Test
    void testOverrideBean() {
        definedInAppConfig.print();
        definedInTestConfig.print();
        overriddenByTestConfig.print();
    }

}
