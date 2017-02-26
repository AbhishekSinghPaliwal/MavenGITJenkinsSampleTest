package SeleniumHQ.Tabs;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SampleLogin {

    @Test
	public static void test1() throws InterruptedException, IOException {
        
        WebDriver driver=null;
        //WebElement driver=null;
        //Launching browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
         driver=new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
       //System.setProperty("webdriver.firefox.marionette", "Drivers/geckodriver.exe");
       //driver=new FirefoxDriver();
        
        

//        driver=new ChromeDriver();
         //Launching flipkart
      driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
        //Thread.sleep(5000);
        // Login 
       driver.findElement(By.xpath("//a[text()='Log In']")).click();

		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("abhi.myth21@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("96@123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
        //MouseHover On men
       // Thread.sleep(9000);
        WebDriverWait wait1=new WebDriverWait(driver, 180);
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Men']")));
        WebElement mousehover=driver.findElement(By.xpath("//span[text()='Men']"));
        Actions actobj=new Actions(driver);
        actobj.moveToElement(mousehover).build().perform();
        System.out.println("Step1 Pass");
        //Thread.sleep(15000);
        //Here I guess WebDriverWait is not required, that's why commenting it here
//        WebDriverWait wait2=new WebDriverWait(driver, 120);
//        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sports Shoes']")));
        //Click on Sports Shoes
        //driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
       WebElement element1= driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
        JavascriptExecutor executor1= (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element1);
        System.out.println("Step2 Pass");
        //Thread.sleep(9000);
        WebDriverWait wait3=new WebDriverWait(driver, 15);
        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_3nSxeA']//select[@class='a_eCSK']")));
      
        //Now Select price range
        WebElement selectPoint=driver.findElement(By.xpath("//div[@class='_3nSxeA']//select[@class='a_eCSK']"));
        Select selValue=new Select(selectPoint);
        selValue.selectByValue("3000");
        System.out.println("Step3 Pass");
       //code  to scroll down

        JavascriptExecutor jse1=(JavascriptExecutor)driver; 
        jse1.executeScript("window.scrollBy(0,600)","");
        
        //WebDriverWait wait4=new WebDriverWait(driver, 120);
       // wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='_1cEG7-']//div[@class='_4IiNRh _-9cJSB' and @title='Adidas']//div[@class='_1p7h2j']")));
       // wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='_1cEG7-']//div[@class='_4IiNRh _-9cJSB' and @title='Adidas']//div[@class='_2kFyHg _-9cJSB']")));
        //wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='_1cEG7-']//div[@class='_4IiNRh _-9cJSB' and @title='Adidas']")));
        Thread.sleep(15000);
        //Select brand Adidas
        //driver.findElement(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='_1cEG7-']//div[@class='_4IiNRh _-9cJSB' and @title='Adidas']//div[@class='_1p7h2j']")).click();
       try{
        Actions actObj= new Actions(driver);
        actObj.moveToElement(driver.findElement(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='_1cEG7-']//div[@class='_4IiNRh _-9cJSB' and @title='Adidas']//div[@class='_2kFyHg _-9cJSB']"))).click().build().perform();
        System.out.println("Step4 Pass");
       }
       catch(Exception e)
       {
    	   System.out.println("exceptin is "+e);
       }
       // driver.findElement(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='_1cEG7-']//div[@class='_4IiNRh _-9cJSB' and @title='Adidas']")).click();
        
        WebDriverWait wait5=new WebDriverWait(driver, 15);
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='dRqIrL _2GQLOX']")));
        //Thread.sleep(5000);
        
        //Click on more link of size filter
        //driver.findElements(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[text()='Size - UK/India']"));
        //List<WebElement> leftItemCollection=driver.findElements(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']"));
        List<WebElement> leftItemCollection=driver.findElements(By.xpath("//section[@class='_2XJuDa _2Zm4Qh']//div[@class='dRqIrL _2GQLOX']"));
        int leftItemSize=leftItemCollection.size();
        System.out.println("total left size is"+leftItemSize);
        for(int l=1;l<=leftItemSize;l++)
        {
        	String leftItemText=driver.findElement(By.xpath("(//section[@class='_2XJuDa _2Zm4Qh'])["+l+"]//div[@class='dRqIrL _2GQLOX']")).getText();
        	System.out.println("inside 3rd loop"+  l);
        	System.out.println("leftItemText is"  +l+   leftItemText );
        	Thread.sleep(6000);
        	//if((leftItemText.contains("Size - UK/India")) || (leftItemText.equalsIgnoreCase("Size - UK/India")))
        		if(leftItemText.equalsIgnoreCase("Size - UK/India")){
        		System.out.println("inside 3rd if"+  l);
        		 WebElement element6=driver.findElement(By.xpath("(//div[@class='_1cEG7-'])["+l+"]//span[text()=' MORE']"));
        	        
        	        JavascriptExecutor executor6= (JavascriptExecutor)driver;
        	        executor6.executeScript("arguments[0].click()", element6);
        	        System.out.println("clicked on more");
        	        break;
        		
        	}
        }
       // System.out.println("left items size is" +leftItemSize);
              
        
        
//        WebElement element6=driver.findElement(By.xpath("//div[@class='_1cEG7-']//span[text()=' MORE']"));
//        System.out.println("clicked on more");
//        JavascriptExecutor executor6= (JavascriptExecutor)driver;
//        executor1.executeScript("arguments[0].click()", element6);
        WebDriverWait wait6=new WebDriverWait(driver, 15);
        wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_2kFyHg _-9cJSB']//div[text()='8']")));
        // Thread.sleep(5000);
        
        //Select different sizes
      
        WebElement element7=driver.findElement(By.xpath("//div[@class='_2kFyHg _-9cJSB']//div[text()='8']"));
        //WebElement element7=driver.findElement(By.xpath("//div[@class='_1C8YsH']//div[@title='8']"));
        JavascriptExecutor executor7= (JavascriptExecutor)driver;
        executor7.executeScript("arguments[0].click()", element7);
//        JavascriptExecutor executor8= (JavascriptExecutor)driver;
//        executor8.executeScript("arguments[0].click()", element7);
        System.out.println("element 7 clicked successfully");
        
        WebElement element8=driver.findElement(By.xpath("//div[@class='_2kFyHg _-9cJSB']//div[text()='9']"));
        JavascriptExecutor executor9= (JavascriptExecutor)driver;
        executor9.executeScript("arguments[0].click()", element8);
        System.out.println("filter successfully selected");
        
        //Thread.sleep(5000);
        WebDriverWait wait7=new WebDriverWait(driver, 15);
        wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='_3fPYHw']//li[text()='Price -- Low to High']")));
        //Select shorting low to high
        WebElement element2=driver.findElement(By.xpath("//ul[@class='_3fPYHw']//li[text()='Price -- Low to High']"));
        JavascriptExecutor executor2= (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element2);
        System.out.println("Step5 Pass");
        WebDriverWait wait8=new WebDriverWait(driver, 15);
        wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='Zhf2z-']")));
        //Thread.sleep(9000);
        //Now choose a shoe from 2nd row 2nd column
        //
        //driver.findElement(By.xpath("((//div[@class='_3yI_5w'])[2]//a[@class='Zhf2z-'])[2]")).click();
//        try{
//        	
//        }
//        catch(Exception e){
//        	
//        }
      
       
        
      // List<WebElement> totalSpanText=driver.findElements(By.xpath("//div[@class='_3yI_5w']//a[@class='Zhf2z-']//span"));
      // int totalSize=totalSpanText.size();
       //System.out.println("text is "+totalSize);
        List<WebElement> totalShoesList=driver.findElements(By.xpath("//a[@class='Zhf2z-']"));
        int totalShoes=totalShoesList.size();
        System.out.println("Total shoes are"+totalShoes);
        for(int i=1;i<=totalShoes;i++)
        {
        	
        	
        		//WebElement element3=driver.findElement(By.xpath("(//a[@class='Zhf2z-'])["+i+"]//span"));
        	     WebElement element3=driver.findElement(By.xpath("(//a[@class='Zhf2z-'])["+i+"]"));
        		String spanText=element3.getText();
        		System.out.println("text is"+i+spanText);
        		System.out.println("inside loop"+i);
        		if(spanText.equalsIgnoreCase("Out Of Stock")==false)
        		{
        			System.out.println("value of i is"+i);
        			//WebElement element4=element3;
        			 JavascriptExecutor executor4= (JavascriptExecutor)driver;
        		        executor4.executeScript("arguments[0].click()", element3);
        			System.out.println("inside id value of i"+i);
        			break;
        		}
        	
        	
        }
        
       //Click on webelement through javascriptexecutor
//        WebElement element2=driver.findElement(By.xpath("//div[@class='_3yI_5w']//a[@class='Zhf2z-']//span[text()='Out Of Stock']"));
//        JavascriptExecutor js2= (JavascriptExecutor)driver;
//		js2.executeScript("arguments[0].click()", element2);
     
        System.out.println("Step6 Pass");
//        WebDriverWait wait9=new WebDriverWait(driver, 15);
//        wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_2a2WU_ _2PBcpj']//ul[@class='eaKBCI']//li")));
        Thread.sleep(30000);
        //Now choose size of the shoe
       
       // List<WebElement> sizeCollection=driver.findElements(By.xpath("//div[@class='_2a2WU_ _2PBcpj']//ul[@class='eaKBCI']//li"));
        List<WebElement> sizeCollection=driver.findElements(By.xpath("//div[@class='_2a2WU_ _2PBcpj']/span"));
        int totalSize=sizeCollection.size();
        System.out.println("total size are"+   totalSize);
        for(int j=1;j<=totalSize;j++)
        {
        	String text7=driver.findElement(By.xpath("(//div[@class='_2a2WU_ _2PBcpj']/span)["+j+"]")).getText();
        	System.out.println("text related to Size-UK/India is"+"  +   "+text7);
        	if(text7.equalsIgnoreCase("Size- UK/India"))
        	{
        		System.out.println("inside 2nd for loop step1"+j);
            	//WebElement element5=driver.findElement(By.xpath("(//div[@class='_2a2WU_ _2PBcpj']//ul[@class='eaKBCI']//li)["+j+"]"));
        		WebElement element5=driver.findElement(By.xpath("(//div[@class='_2a2WU_ _2PBcpj'])["+j+"]//ul[@class='eaKBCI']//li"));
            	element5.click();
            	String text2=driver.findElement(By.xpath("(//div[@class='_2a2WU_ _2PBcpj']//ul[@class='eaKBCI']//li)["+j+"]")).getText();
            	System.out.println("text for each size is"+j+"  "+text2);
            	System.out.println("inside 2nd for loop step2"+j);
            	if(text2.contains("This combination is currently unavailable. Choose Another variant")==false)
            	{
            		System.out.println("inside 3rd if step1"+j);
            		//driver.findElement(By.xpath("(//div[@class='_2a2WU_ _2PBcpj']//ul[@class='eaKBCI']//li)["+j+"]")).click();
            		
            		 JavascriptExecutor executor5= (JavascriptExecutor)driver;
     		        executor5.executeScript("arguments[0].click()", element5);
            		System.out.println("inside 3rd if step2"+j);
            		break;
            	}
        	}
        	
        }
        
        //Current Running static code
       // driver.findElement(By.xpath("//li[@id='swatch-0-size']")).click();
        
        //driver.findElement(By.xpath("//div[@class='_2a2WU_ _2PBcpj']//li[@id='swatch-0-size']")).click();
        System.out.println("Step7 Pass");
        WebDriverWait wait10=new WebDriverWait(driver, 15);
        wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']")));
        boolean elementStatus8=driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']")).isEnabled();
        System.out.println("element 8 status is"+elementStatus8);
        //Thread.sleep(5000);
        //click on buy now
       // driver.findElement(By.xpath("//a[@class='btn btn-orange btn-large btn-continue no-underline']")).click();
        
        List<WebElement> totalBuyNowText=driver.findElements(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']"));
        int totalSize9=totalBuyNowText.size();
        System.out.println("size of total item related to webelement is"+totalSize9);
//        Actions actObj9= new Actions(driver);
//        actObj9.moveToElement(driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']"))).click().build().perform();
        
       
        //String stringtext8=driver.findElement(By.xpath("//li[@class='col col-6-12']//button")).getText();
        String stringtext8 = null;
        //String stringText88="no such element: Unable to locate element";
        int i=1;
       
        do{
        	 try{
//        	stringtext8=driver.findElement(By.xpath("//li[@class='col col-6-12']//button")).getText();
        		 stringtext8=driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']")).getText();
        	
        	
        	
        	System.out.println("inside do text is "+"i"+stringtext8);
        	Actions actObj9= new Actions(driver);
             actObj9.moveToElement(driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']"))).click().build().perform();
        	 }
        	 catch(Exception e)
        	 {
        		 System.out.println("Step8 Pass");
        	        
        	        //Click on continue
        	        WebDriverWait wait11=new WebDriverWait(driver, 60);
        	        wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-orange btn-large btn-continue no-underline']")));
        	        
        	        driver.findElement(By.xpath("//a[@class='btn btn-orange btn-large btn-continue no-underline']")).click();
        	        System.out.println("catch step 1");
        	        
//        	        Thread.sleep(9000);
//        	        actObj9.moveToElement(driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']"))).click().build().perform();
        	        //actObj9.moveToElement(driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']"))).click().build().perform();
        	       // actObj9.moveToElement( driver.findElement(By.xpath("//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']"))).click().build().perform();
        	        //driver.findElement(By.xpath("//button[@class='_2AkmmA _3Plo8Q _16LyaZ _7UHT_c' and text()='BUY NOW']")).click();
        	        ////a[@class='btn btn-orange btn-large btn-continue no-underline']
        	        System.out.println("Step9 Pass"); 
        	        break;
        	 }
             
//             else{
//            	 System.out.println("Buy Now Clicked successfully");
//             }
             	
             
             System.out.println("checking step 8 do");
             	//boolean stringStatus8=stringtext8.equalsIgnoreCase("");
             	
             
        }while(stringtext8.equalsIgnoreCase("BUY NOW"));
        
        //while(stringtext8!="BUY NOW");
       
       
        //Cash on Delivery
        WebDriverWait wait12=new WebDriverWait(driver, 60);
        wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Cash on Delivery']")));
        
        List<WebElement> listCollection10= driver.findElements(By.xpath("//div[@class='pure-u-1-5 link-container']//li//span"));
        int listCollectionSize10=listCollection10.size();
        System.out.println("listCollectionSize10 is" + listCollectionSize10);
        for(int k=1;k<=listCollectionSize10;k++)
        {
        	String singleCollectionValue=driver.findElement(By.xpath("(//div[@class='pure-u-1-5 link-container']//li//span)["+k+"]")).getText();
        	Actions actObj10=new Actions(driver);
    		//if we want to click on every payment mode
        	//actObj10.moveToElement(driver.findElement(By.xpath("(//div[@class='pure-u-1-5 link-container']//li//span)["+k+"]"))).click().build().perform();
        	//if we want to click every time for "cash on deliver"
        	actObj10.moveToElement(driver.findElement(By.xpath("//span[text()='Cash on Delivery']"))).click().build().perform();
        	
        	
        	
        	if(singleCollectionValue.equalsIgnoreCase("Cash on Delivery"))
        	{
        	break;
        }
        else
        {
        System.out.println("collection text"+k+singleCollectionValue);
        	continue;	
        }	
        }
        
        //Thread.sleep(5000);
//        String textValue11="Confirm Order";
//        String textValue10=null;
//        String orderTextCalculated = null;
//        do{
//        	try{
//        		 
//        	         textValue10=driver.findElement(By.xpath("//span[text()='Cash on Delivery']")).getText();
//        	         
//        	        System.out.println("text of textvalue10 is "+ textValue10);
//        	        Actions actObj10=new Actions(driver);
//        	        actObj10.moveToElement(driver.findElement(By.xpath("//span[text()='Cash on Delivery']"))).click().build().perform();
//        	        //boolean status10=driver.findElement(By.xpath("//span[text()='Cash on Delivery']")).isSelected();
//        	        //System.out.println("whether 'cash on deliver selected ?'"+ status10);
//        	        orderTextCalculated =driver.findElement(By.xpath("//button[text()='Confirm Order']")).getText();
//        	        //driver.findElement(By.xpath("//input[@id='svd-crd-pay']")).ggetClass()
//        	        System.out.println("valye of 'orderTextCalculated'"+orderTextCalculated);
//
//        	}
//        	catch(Exception e){
//        		System.out.println("inside step 10 catch");
//        		Actions actObj10=new Actions(driver);
//        		actObj10.moveToElement(driver.findElement(By.xpath("//span[text()='Cash on Delivery']"))).click().build().perform();
//        		break;
//        		
//        		
//        		
//        	}
//        }while(!orderTextCalculated.equalsIgnoreCase("Confirm Order"));
       
        
        System.out.println("Step10 Pass");
       
        
        
}
}