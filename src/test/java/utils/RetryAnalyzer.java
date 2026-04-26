package utils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int count=0;
    int maxretry=2;

    @Override
    public boolean retry(ITestResult result) {
        if (count < maxretry) {
            count++;
            return true;
        }
        return false;
    }
}
