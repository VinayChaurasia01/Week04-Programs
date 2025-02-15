package unit_testing.basic;

import static org.junit.jupiter.api.Assertions.*;

import junit_testing.basic.PerformanceTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTesterTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        PerformanceTester.longRunningTask();
    }
}
