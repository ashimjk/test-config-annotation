package com.ashimjk.testconfigannotation;

import com.ashimjk.testconfigannotation.beans.DefinedInAppConfig;
import com.ashimjk.testconfigannotation.beans.DefinedInTestConfig;
import com.ashimjk.testconfigannotation.beans.OverriddenByTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(ImportTestConfig.class)
public class ImportTestConfigTest {

    @Autowired private DefinedInAppConfig definedInAppConfig;
    @Autowired private DefinedInTestConfig definedInTestConfig;
    @Autowired private OverriddenByTestConfig overriddenByTestConfig;

    @Test
    void testImportTestConfig() {
        definedInAppConfig.print();
        definedInTestConfig.print();
        overriddenByTestConfig.print();
    }

}
