package addressbook;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        login("admin", "secret");
    }

    private void login(String username, String userpass) {
        driver.get("http://localhost/addressbook/");
        driver.manage().window().setSize(new Dimension(1256, 1020));
        driver.findElement(By.name("user")).click();
        driver.findElement(By.id("LoginForm")).click();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(userpass);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    protected void logout() {
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).sendKeys("secret");
    }

    protected void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    protected void fillGroupForm() {
        fillGroupForm(new GroupData("groupName", "headerText", "footerText"));
    }

    private void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(groupData.name());
        driver.findElement(By.cssSelector("form:nth-child(2)")).click();
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.header());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
    }

    protected void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    protected void gotoGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    public void deleteSelectedGroup() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      driver.findElement(By.cssSelector(".group:nth-child(7) > input")).click();
    }
}
