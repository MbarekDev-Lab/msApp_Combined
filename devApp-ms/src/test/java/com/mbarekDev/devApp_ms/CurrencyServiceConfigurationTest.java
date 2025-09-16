package com.mbarekDev.devApp_ms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CurrencyServiceConfigurationTest {

    @Test
    void contextLoads() {
        // This is a basic test to ensure the test context loads.
        // In a real scenario, you would inject CurrencyServiceConfiguration
        // and test its properties or behavior.
        assertNotNull(new CurrencyServiceConfiguration());
    }
}
