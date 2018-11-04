![alt text](https://www.seleniumconf.us/perch/resources/logo.svg)
#### ice-cream cone vs testing pyramid  
* Testing should be in an ideal testing pyramid proportion not the ice-cream cone proportion. 
* Exploratory manual regression testing at the top of the pyramid.
----
#### Fast feedback 
* Tests should run really fast and give a very fast feedback
* Parallelization
    * Parallel execution is the key - 60 min vs 6 min (15 x 4 = 60 | 4 x 1 = 4)
* Automatic Retry of Failed Tests
----
#### Misc Talks
* Video recording with FFmpeg
* Allure report
----
#### Machine Learning and AI 
* Test.io - Using Machine Learning and AI to find locators and perform actions
* Latest Appium includes test.io 's logic (https://appiumpro.com/)
* Appium classifier plugin (https://www.npmjs.com/package/test-ai-classifier)
* TensorFlow - Free AI engine
###### Other Android Testing Tech
* Robotium - Android testing (https://github.com/RobotiumTech/robotium)
* Espresso - Android testing (https://developer.android.com/training/testing/espresso/)
----
#### AWS Lambdas to run Selenium tests
* Blackboard/lambda-selenium (https://github.com/blackboard/lambda-selenium)
----
#### Misc Resources
- **Allure Reports,** http://allure.qatools.ru/
- **Marco Lüthy,** https://github.com/adieuadieu
- **Alister Scott,** https://watirmelon.blog/
- **Noah Isaacson,** https://github.com/nisaacson
----
#### Make tests less rude: 
* Jain Waldrip **3 ways not to use Selenium**
* Checkout `ExpectedConditions` class which has a lot more methods now to wait efficiently.
    * https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/support/ui/ExpectedConditions.html
----
#### UI automation is not free
• exploratory testing
• bug bash
----
#### Key Note - Aslak Hellesøy, CEO, cucumber.io
###### Book References
* The Everything Psychology Book
* Flow
----
* Tests should tell exactly *where* the problem is. It should be testing probably just one thing and `assert` everywhere there could be a failure
* ```Integration Confidence``` (more components) vs ```Functionality Conference``` (less components.) Concept of running the same suite of test to run with different configuration.
* >I block time on calendar every month to revisit the code
    * to refactor or make any enhancements I can.
 ----   
#### Accessibility Testing
* Axe core - accessibility testing (https://github.com/dequelabs/axe-core )
----
#### Misc Takeaways 
* Fast and easy way to emulate mobile devices using capabilities on ChromeDriver
```java
public class Test{
    public void setup(){
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Galaxy S9");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);        
    }
}
```
----
#### `Sleep` is not your friend
###### `wait`, using `javascriptExecutor()` to check for a variable 
 * set a variable, then clear that variable when the process is complete. Check for the variable using `javascriptExecutor()` rather than `Thread.sleep()`.
----
Efficiency - Independence - Isolation
