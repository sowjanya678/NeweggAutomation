package stepDefs;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:output/report",
                "json:output/cucumber.json",
                "junit:output/cucumber.xml"
        },
        features = {"src/test/java/features"},
        glue = {"classpath:stepDefs"})
public class CukesRunTest {
}
