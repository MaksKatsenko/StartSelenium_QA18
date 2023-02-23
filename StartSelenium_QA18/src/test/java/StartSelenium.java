import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSelenium {
    WebDriver wd;
    String str;
    int i;

    public static void mymethod(){

    }
    @BeforeMethod
   public void preCondition(){
        System.out.println("Opening web-site");
    wd = new ChromeDriver();

    }
    @Test
    public void testName(){

    }

    @AfterMethod
    public void postCondition(){

    }
}
