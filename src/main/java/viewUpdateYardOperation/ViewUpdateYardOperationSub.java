package viewUpdateYardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewUpdateYardOperationSub extends ViewUpdateYardOperationMain{
	public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public ViewUpdateYardOperationSub(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement typeUserName()
	{
		return driver.findElement(var_username);
	}
	
	public WebElement clickContinueButton()
	{
		return driver.findElement(var_continue_button);
	}
	
	public WebElement typePassword()
	{
		return driver.findElement(var_password);
	}
	
	public WebElement clicksubmit()
	{
		return driver.findElement(var_submit_btn);
	}
	
	
	public WebElement scrollToYardManagement()
	{
		By clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]");
		return driver.findElement(clickYardManagement);
	}
	public WebElement clickYardManagement()
	{
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement clickOnYardIn()
	{
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[4]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement ClickOnYardOperation()
	{
		By var_MarkSeizedHand = By.xpath("//*[@id=\"/:tenant/yard-in$Menu\"]/li[2]");
		return driver.findElement(var_MarkSeizedHand);
	}
	
	public WebElement ClickOnViewUpdateYardOperation()
	{
		By var_MarkSeizedHand = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/a/div");
		return driver.findElement(var_MarkSeizedHand);
	}
	
	public WebElement EnterSearchValue()
	{
		By var_EnterSearchValue = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/span/input");
		return driver.findElement(var_EnterSearchValue);
	}
	
	public WebElement ClickViewButton()
	{
		By var_ClickViewButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div[1]/button");
		return driver.findElement(var_ClickViewButton);
	}
	
	public WebElement ScrollToDown()
	{
		By var_ScrollToDown = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[6]/div/div[1]");
		return driver.findElement(var_ScrollToDown);
	}
	
	public WebElement ClickViewOkBtton()
	{
		By var_ClickViewOkBtton = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/button");
		return driver.findElement(var_ClickViewOkBtton);
	}

	public WebElement ClickUpdateLink()
	{
		By var_ClickUpdateLink = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div[2]/p/a");
		return driver.findElement(var_ClickUpdateLink);
	}

	public WebElement ScrollToDownUpload()
	{
		By var_ScrollToDownUpload = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[2]/div");
		return driver.findElement(var_ScrollToDownUpload);
	}

	public WebElement ClickToUploadImg()
	{
		By var_ClickToUploadImg = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[2]/div/form/div/div[1]/div/div[2]/section/div[1]/span/div[1]/span/input");
		return driver.findElement(var_ClickToUploadImg);
	}

	public WebElement ClickToUploadFile()
	{
		By var_ClickToUploadFile = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[2]/div/form/div/div[2]/div/div[2]/div[2]/div/div/span/div[1]/span/input");
		return driver.findElement(var_ClickToUploadFile);
	}

	public WebElement ScrollToDownOtherCondt()
	{
		By var_ScrollToDownOtherCondt = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[3]/form/div/div[2]");
		return driver.findElement(var_ScrollToDownOtherCondt);
	}

	public WebElement ClickOnDropdownTestCondt()
	{
		By var_ClickOnDropdownTestCondt = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[3]/form/div/div[2]/div[4]/div/div/div/div/div[2]/div/div/div/div");
		return driver.findElement(var_ClickOnDropdownTestCondt);
	}

	public WebElement SelectYesTestCondt()
	{
		By var_SelectYesTestCondt = By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div");
		return driver.findElement(var_SelectYesTestCondt);
	}

	public WebElement SelectDateTestCondt()
	{
		By var_SelectDateTestCondt = By.xpath("//*[@id=\"Test Conditiondate\"]");
		return driver.findElement(var_SelectDateTestCondt);
	}

	public WebElement ScrollToDownUploadExpireDates()
	{
		By var_ScrollToDownUploadExpireDates = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[5]/div/div");
		return driver.findElement(var_ScrollToDownUploadExpireDates);
	}

	public WebElement SelectDateInsuaranceDate()
	{
		By var_SelectDateInsuaranceDate = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[5]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/input");
		return driver.findElement(var_SelectDateInsuaranceDate);
	}

	public WebElement SelectDateLision()
	{
		By var_SelectDateLision = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[5]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/input");
		return driver.findElement(var_SelectDateLision);
	}

	public WebElement ClickOnDropdownTransmissionTyp()
	{
		By var_ClickOnDropdownTransmissionTyp = By.xpath("//*[@id=\"transmissionType\"]");
		return driver.findElement(var_ClickOnDropdownTransmissionTyp);
	}

	public WebElement SelectAuto()
	{
		By var_SelectAuto = By.xpath("/html/body/div[7]/div/div/div/div[2]/div[1]/div/div/div[2]/div");
		return driver.findElement(var_SelectAuto);
	}

	public WebElement ClickOnDropdownFuelTyp()
	{
		By var_ClickOnDropdownFuelTyp = By.xpath("//*[@id=\"fuelType\"]");
		return driver.findElement(var_ClickOnDropdownFuelTyp);
	}

	public WebElement SelectPetrol()
	{
		By var_SelectPetrol = By.xpath("/html/body/div[8]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectPetrol);
	}

	public WebElement SetMilage()
	{
		By var_SetMilage = By.xpath("//*[@id=\"mileage\"]");
		return driver.findElement(var_SetMilage);
	}

	public WebElement SetOwners()
	{
		By var_SetOwners = By.xpath("//*[@id=\"noOfOwners\"]");
		return driver.findElement(var_SetOwners);
	}

	public WebElement ScrollToDownToSave()
	{
		By var_ScrollToDownToSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div");
		return driver.findElement(var_ScrollToDownToSave);
	}

	public WebElement ClickSaveBtn()
	{
		By var_ClickSaveBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/button");
		return driver.findElement(var_ClickSaveBtn);
	}

	public WebElement ClickYesBtn()
	{
		By var_ClickYesBtn = By.xpath("/html/body/div[10]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickYesBtn);
	}

	public WebElement ScrollToBondedDetails()
	{
		By var_ScrollToBondedDetails = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[4]");
		return driver.findElement(var_ScrollToBondedDetails);
	}

	public WebElement ClickBondedDetailsCheckBox()
	{
		By var_ClickBondedDetailsCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[4]/div/label/span[1]/input");
		return driver.findElement(var_ClickBondedDetailsCheckBox);
	}

	public WebElement EnterOffence()
	{
		By var_EnterOffence = By.xpath("//*[@id=\"offence\"]");
		return driver.findElement(var_EnterOffence);
	}

	public WebElement EnterPoliceStation()
	{
		By var_EnterPoliceStation = By.xpath("//*[@id=\"policeStation\"]");
		return driver.findElement(var_EnterPoliceStation);
	}

	public WebElement SelectBondedDate()
	{
		By var_SelectBondedDate = By.xpath("//*[@id=\"bondedDate\"]");
		return driver.findElement(var_SelectBondedDate);
	}

	public WebElement EnterBondedValue()
	{
		By var_EnterBondedValue = By.xpath("//*[@id=\"bondValue\"]");
		return driver.findElement(var_EnterBondedValue);
	}

	public WebElement SelectNextHearingDate()
	{
		By var_SelectNextHearingDate = By.xpath("//*[@id=\"nextHearingDate\"]");
		return driver.findElement(var_SelectNextHearingDate);
	}

	public WebElement SelectBondedReleaseDate()
	{
		By var_SelectBondedReleaseDate = By.xpath("//*[@id=\"bondReleaseDate\"]");
		return driver.findElement(var_SelectBondedReleaseDate);
	}

	public WebElement ClickSelecLawyerLink()
	{
		By var_ClickSelecLawyerLink = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[5]/form/div/div[2]/div[5]/div[2]/div/div/div/div/div[1]/p/a");
		return driver.findElement(var_ClickSelecLawyerLink);
	}

	public WebElement EnterLawyerName()
	{
		By var_EnterLawyerName = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/div[1]/span/input");
		return driver.findElement(var_EnterLawyerName);
	}

	public WebElement ClickLawyerSearchButton()
	{
		By var_ClickLawyerSearchButton = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/div[1]/button");
		return driver.findElement(var_ClickLawyerSearchButton);
	}

	public WebElement ClickLawyerSelectButton()
	{
		By var_ClickLawyerSelectButton = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/span");
		return driver.findElement(var_ClickLawyerSelectButton);
	}

	public WebElement EnterCaseNumber()
	{
		By var_EnterCaseNumber = By.xpath("//*[@id=\"caseNo\"]");
		return driver.findElement(var_EnterCaseNumber);
	}

	public WebElement EnterCourtHouse()
	{
		By var_EnterCourtHouse = By.xpath("//*[@id=\"courtHouse\"]");
		return driver.findElement(var_EnterCourtHouse);
	}

	public WebElement EntereNameOfPerson()
	{
		By var_EntereNameOfPerson = By.xpath("//*[@id=\"nameOfThePersonAppear\"]");
		return driver.findElement(var_EntereNameOfPerson);
	}

	public WebElement EnterRemarksInBonded()
	{
		By var_EnterRemarksInBonded = By.xpath("//*[@id=\"remarks\"]");
		return driver.findElement(var_EnterRemarksInBonded);
	}





	public WebElement ScrollDownToSalesStop()
	{
		By var_ScrollDownToSalesStop = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[7]/div/div[2]/div");
		return driver.findElement(var_ScrollDownToSalesStop);
	}

	public WebElement ClickOnSalesStopCheckBox()
	{
		By var_ClickOnSalesStopCheckBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/form/label/span[1]/input");
		return driver.findElement(var_ClickOnSalesStopCheckBox);
	}

	public WebElement ClickOnSalesStopByLink()
	{
		By var_ClickOnSalesStopByLink = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/form/div/div[1]/div[2]/div/div/div/div/div[1]/p/a");
		return driver.findElement(var_ClickOnSalesStopByLink);
	}

	public WebElement EnterSearchValueInStopByLink()
	{
		By var_EnterSearchValueInStopByLink = By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/span/input");
		return driver.findElement(var_EnterSearchValueInStopByLink);
	}

	public WebElement ClickOnSearchResultInSalesStopBy()
	{
		By var_ClickOnSearchResultInSalesStopBy = By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td[3]");
		return driver.findElement(var_ClickOnSearchResultInSalesStopBy);
	}

	public WebElement EnterSalesStopDate()
	{
		By var_EnterSalesStopDate = By.xpath("//*[@id=\"stopDate\"]");
		return driver.findElement(var_EnterSalesStopDate);
	}

	public WebElement ClickOnDropdownStopReson()
	{
		By var_ClickOnDropdownStopReson = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/form/div/div[2]/div/div[1]/div/div/div/div/div");
		return driver.findElement(var_ClickOnDropdownStopReson);
	}

	public WebElement SelectClientAgreed()
	{
		By var_SelectClientAgreed = By.xpath("/html/body/div[11]/div/div/div/div[2]/div[1]/div/div/div[1]/div");
		return driver.findElement(var_SelectClientAgreed);
	}

	public WebElement ClickOnNeverExpire()
	{
		By var_ClickOnNeverExpire = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/label/span[1]/input");
		return driver.findElement(var_ClickOnNeverExpire);
	}

	public WebElement ClickOnSalesStopSaveBtn()
	{
		By var_ClickOnSalesStopSaveBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[7]/div/div[2]/div/div/div/div/button");
		return driver.findElement(var_ClickOnSalesStopSaveBtn);
	}

	public WebElement ClickOnSalesStopSaveBtnYes()
	{
		By var_ClickOnSalesStopSaveBtnYes = By.xpath("/html/body/div[13]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickOnSalesStopSaveBtnYes);
	}

	public WebElement ScrollToSave()
	{
		By var_ScrollToSave = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/button");
		return driver.findElement(var_ScrollToSave);
	}

	public WebElement ClickYesBtnInSalesStop()
	{
		By var_ClickYesBtnInSalesStop = By.xpath("/html/body/div[14]/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
		return driver.findElement(var_ClickYesBtnInSalesStop);
	}

	
	
}
