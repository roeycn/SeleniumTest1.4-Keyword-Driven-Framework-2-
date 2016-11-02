package config;

public class Constants {

	//List of System Variables
	public static final String URL = "http://www.store.demoqa.com";
	public static final String URL2 = "http://ciserver:8080/view/Appium/";
	public static final String Path_TestData = "D://Eclipse_enviromen//workspace//SeleniumTest1.4(Keyword Driven Framework-2)//src//dataEngine//DataEngine.xlsx";
	public static final String Path_OR = "D://Eclipse_enviromen//workspace//SeleniumTest1.4(Keyword Driven Framework-2)//src//config//OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";

	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =3 ;
	public static final int Col_ActionKeyword =4 ;
	//New entry in Constant variable
	public static final int Col_RunMode =2 ;

	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	//New entry in Constant variable
    public static final String Sheet_TestCases = "Test Cases";

	//List of Test Data
	public static final String UserName = "testuser_2";
	public static final String Password = "Test@123";
	
	
	//results column of Test Case sheet and Test Step sheet
	public static final int Col_Result =3 ;
	public static final int Col_TestStepResult =5 ;
	
	//Pass results & Fail result
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
	//roey add-on 
	public static final String KEYWORD_NONE = "none";
	
	
	

}