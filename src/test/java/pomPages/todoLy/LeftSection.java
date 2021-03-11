package pomPages.todoLy;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
    public TextBox fullName= new TextBox(By.xpath("//div[contains(.,'Full Name')]/input[@id='ctl00_MainContent_SignupControl1_TextBoxFullName']"));
    public TextBox emailTextBox= new TextBox(By.xpath("//div/input[@id='ctl00_MainContent_SignupControl1_TextBoxEmail']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//div/input[@id='ctl00_MainContent_SignupControl1_TextBoxPassword']"));
    public Button loginButton= new Button(By.xpath("//div/input[@id='ctl00_MainContent_SignupControl1_ButtonSignup']"));
    public Button checkBox= new Button(By.xpath("//input[@id='ctl00_MainContent_SignupControl1_CheckBoxTerms']"));
    public Button recycle= new Button(By.xpath("//li[last()]//td[contains(.,'Recycle Bin')]"));
    public Button menu = new Button(By.xpath("//li[@id='ItemId_-3']//img[@src='/Images/dropdown.png' ]"));
    public Button delete= new Button(By.xpath("///li[@class='delete']/a[contains(.,'Empty')]"));
    public Button verification= new Button(By.xpath("//div /span[@id='InfoMessageText']"));


    public LeftSection(){

    }

    public void clickOnProject(String nameProject){
        Label projectInList= new Label(By.xpath("//li[last()]//div[contains(.,'"+nameProject+"') and @class='ItemContentDiv']"));
        projectInList.click();
    }

}
