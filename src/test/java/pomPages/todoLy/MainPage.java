package pomPages.todoLy;

import controls.Image;
import org.openqa.selenium.By;

public class MainPage {

    public Image loginImage= new Image(By.xpath("//ul[@class='_3XsmI']//a[contains(.,'Reg')]"));
    public Image loginImageTD= new Image(By.xpath("//img[@src='/Images/design/pagesignup.png']"));

    public MainPage(){}
}
