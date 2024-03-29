package generic;
public class AutoUtils 
{
	//Method to take screenshot
	public static String getPhoto(WebDriver driver, String folder, String fileName)
	{
		try
		{
			String dateTime=new Date().toString().replace(":", "_");
			String path=folder+fileName+dateTime+".png";
			TakesScreenshot t=(TakesScreenshot) driver;
			File sourceFile = t.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File(path);
			FileUtils.copyFile(sourceFile, destinationFile);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return fileName;
	}
	//Method to take value from Property file
	public static String getProperty(String path, String key)
	{
		String v="";
		try
		{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return v;
	}
}
