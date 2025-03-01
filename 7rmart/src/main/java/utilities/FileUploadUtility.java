package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileUploadUsingSendKeys(WebElement  element,String path) {	
		element.sendKeys(path);
	
	}
public void fileUploadUsingRobotClass(WebElement  element,String path) throws AWTException {	
		{
		
			StringSelection s=new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
			Robot r=new Robot();
			r.delay(2500);//delay in milliseconds
			//r.keyPress(KeyEvent.VK_ENTER);//
			//r.keyRelease(KeyEvent.VK_ENTER);//
			r.keyPress(KeyEvent.VK_CONTROL);//press control (paste)
			r.keyPress(KeyEvent.VK_V);//press v
			r.keyRelease(KeyEvent.VK_CONTROL);//release control
			r.keyRelease(KeyEvent.VK_V);//release v
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	}
	
}