package addressbook;// Generated by Selenium IDE
import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void delGroup() {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup();
    logout();
  }

}
