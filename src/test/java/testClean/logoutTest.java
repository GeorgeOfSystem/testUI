package testClean;

import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import pomPages.todoLy.MenuSection;


public class logoutTest extends  TestBaseTodoLy{

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection= new MenuSection();
    String user="gl@upbui.com";
    String pwd="123456789";
    String nombre = "george";
    String newNombre = "georgeUpdate";

    @Test
    public void verify_login_todoly() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.loginButton.click();
        loginModal.nameTextBox.set(nombre);
        loginModal.pwdTextBox.set(pwd);
        loginModal.loginButton2.click();
        loginModal.abrir.click();
        loginModal.noTime.click();


        loginModal.iconSettings.click();
        loginModal.logout.click();
        this.waitOnSecond(2);
        Assert.assertTrue("ERROR, no se deslogeo",mainPage.loginImage.controlIsDisplayed());



    }


}
