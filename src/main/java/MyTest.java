import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browser.BrowserGetter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

	private BrowserGetter driver1= new BrowserGetter();
	private WebDriver driver2;
	@BeforeAll
	public void beforeAll() {
		driver2=driver1.getChromeDriver();
	}
	@AfterAll
	public void afterAll() {
		driver2.quit();
	}
	}
	
    @Test
    public  void testExample() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }
}
