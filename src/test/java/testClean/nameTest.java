package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import pomPages.todoLy.MenuSection;
import singletonSession.Session;


public class nameTest extends  TestBaseTodoLy{

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection= new MenuSection();
    String user="g7@upbui.com";
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
        loginModal.settings.click();
        loginModal.editName.click();
        loginModal.nameBox.set(newNombre);
        loginModal.saveNameBox.click();
        this.waitOnSecond(2);
        Assert.assertEquals("ERROR, no se Cambio el nobre",newNombre, loginModal.verification.getText());



    }


}
