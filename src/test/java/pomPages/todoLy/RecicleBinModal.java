package pomPages.todoLy;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class RecicleBinModal {

    public TextBox fullName= new TextBox(By.xpath("//div[contains(.,'Full Name')]/input[@id='ctl00_MainContent_SignupControl1_TextBoxFullName']"));
    public TextBox emailTextBox= new TextBox(By.xpath("//div/input[@id='ctl00_MainContent_SignupControl1_TextBoxEmail']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//div/input[@id='ctl00_MainContent_SignupControl1_TextBoxPassword']"));
    public Button loginButton= new Button(By.xpath("//div/input[@id='ctl00_MainContent_SignupControl1_ButtonSignup']"));

    public TextBox nameTextBox= new TextBox(By.xpath("//input[@class='input_name']"));
    public Button loginButton2= new Button(By.xpath("//button/span[contains(.,'Registrarse ahora')]"));
    public Button abrir= new Button(By.xpath("//a[contains(.,'Abr')]\n"));
    public Button noTime = new Button(By.xpath("//a[@class='timezone_link timezone_link_block' and contains(.,'No ac')]"));
    public Button iconSettings = new Button(By.xpath("//button[@class='reactist_menubutton top_bar_btn settings_btn']"));
    public Button settings = new Button(By.xpath("//span[@class='user_menu_details_btn']"));
    public Button editName = new Button(By.xpath("//dd[@class='ajax_edit_cell']/a[contains(.,'Editar')]"));
    public TextBox nameBox = new TextBox(By.xpath("//dd/form/input"));
    public Button saveNameBox = new Button(By.xpath("//dd/form/a[contains(.,'Guardar')]"));
    public TextBox verification = new TextBox(By.xpath("//dd[@class='ajax_edit_cell']/span[@class='data']"));
    public Button logout = new Button(By.xpath("//button/span[contains(.,'Cerrar')]"));

    public RecicleBinModal(){}

    public void loginAction(String user, String pwd){
        emailTextBox.set(user);
        pwdTextBox.set(pwd);
        loginButton.click();
    }

}
