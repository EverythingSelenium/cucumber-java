
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        tags = "(@smoke)",
        plugin = {"pretty", "html:target/cucumber.html", "rerun:target/rerun.txt"}
)
public class RunCukesTest {
}
