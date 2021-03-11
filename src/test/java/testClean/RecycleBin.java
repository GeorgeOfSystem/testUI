package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.CenterSection;
import pomPages.todoLy.LeftSection;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import singletonSession.Session;

public class RecycleBin extends  TestBaseTodoLy {
    MainPage mainPage= new MainPage();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    String user="gl3@upbui.com";
    String pwd="1234";
    String fullName="george";

    @Test
    public void verify_create_project_todoly() throws InterruptedException {
        Session.getSession().getDriver().get("http://todo.ly/");
        String name="CleanProject";
        mainPage.loginImageTD.click();
        leftSection.fullName.set(fullName);
        leftSection.emailTextBox.set(user);
        leftSection.pwdTextBox.set(pwd);
        leftSection.checkBox.click();
        leftSection.loginButton.click();
        leftSection.recycle.click();
        leftSection.menu.click();
        //leftSection.delete.click();
        this.waitOnSecond(1);
        Assert.assertTrue("ERROR, no Borro el recycle bin",leftSection.verification.controlIsDisplayed());





    }




}
