package PageObjects;

import BaseTest.BaseClass;
import Utilities.ReadPropertyFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DetailsVerification extends BaseClass {


    String verifymail= ReadPropertyFile.getProperty1("mail");
    String verifynumber= ReadPropertyFile.getProperty1("mobile");
    String fname= ReadPropertyFile.getProperty1("name");

    String sexual= ReadPropertyFile.getProperty1("manhood");

    String lname= ReadPropertyFile.getProperty1("surname");

    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[1]")
    WebElement phonenumber;

    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div[2]")
    WebElement mailid;

    @FindBy(xpath = "//*[@data-testid='name']")
    WebElement fullname;

    @FindBy(xpath = "//*[@data-testid='type_gender_birth']")
    WebElement sex;

    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[5]/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[1]")
    WebElement cabinbag;

    @FindBy(xpath = "//*[@id=\"basiclayout\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[5]/div/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[2]/div/div[1]")
    WebElement checkbag;

    public DetailsVerification() throws Exception {

        PageFactory.initElements(driver,this);
    }

    public void verify()
    {

//        System.out.println("TheContact Details are:");
        String phn=phonenumber.getText();
//        System.out.println(phn);
        String mail=mailid.getText();
//        System.out.println(mail);
//        System.out.println("The Traveller Details are");
        String name=fullname.getText();
//        System.out.println(name);
        String gender=sex.getText();
//        System.out.println(gender);
//        System.out.println("The Baggage Details are");
        String CabinBag=cabinbag.getText();
//        System.out.println(CabinBag);
        String CheckBag=checkbag.getText();
//        System.out.println(CheckBag);

        verifynumber="+91"+verifynumber;
//        System.out.println(verifynumber);
        String newname=fname+" "+lname;
        String newgender=gender.substring(gender.length()-4);
//        System.out.println(newgender);
//        System.out.println(newname);


        if (verifymail.equals(mail) && verifynumber.equals(phn)
                && newname.equals(name) && sexual.equals(newgender)
                && FlightsSelect.cabinBag.equals(CabinBag) && FlightsSelect.checkBag.equals(CheckBag)) {
            System.out.println("Successfully Verified Contact, Traveller Details & Baggage Details");
        } else if (!(verifymail.equals(mail) && verifynumber.equals(phn))) {
            System.out.println("False Information");
        } else if (!(newname.equals(name) && sexual.equals(newgender))) {
            System.out.println("Failed in the Traveller Details");
        } else {
            System.out.println("Mismatch in the Baggage Details");
        }

        System.out.println("The Contact Details are:");
        System.out.println("Mail Id="+mail+" "+"Phone number="+phn);
        System.out.println("The Traveller Details are:");
        System.out.println("Name is"+newname+" "+"Gender is"+newgender);
        System.out.println("The Baggage Details are:");
        System.out.println(CabinBag+" "+CheckBag);

    }
}
