
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/rerun.txt"},
        tags = "@practiceLogin",
        plugin = {"pretty", "html:target/cucumber2.html"}
)
public class RunCukesTest2 {
}
