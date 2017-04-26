package ua.training;


import org.junit.Assert;
import org.junit.Test;
import ua.training.controller.RegularExpressions;

/**
 * Unit test for Regular expressions.
 */
public class TestRegex {

    @Test
    public void testRightName() {
        String name = "Vasya";
        Assert.assertTrue(name.matches(RegularExpressions.REG_NAME));
    }

    @Test
    public void testNameWithSmallFirstLetter() {
        String name = "vasya";
        Assert.assertTrue(!name.matches(RegularExpressions.REG_NAME));
    }

    @Test
    public void testNameWithNumber() {
        String name = "Vasya1";
        Assert.assertTrue(!name.matches(RegularExpressions.REG_NAME));
    }

    @Test
    public void testRightHomeNumber() {
        String homeNumber = "+38(044)5608260";
        Assert.assertTrue(homeNumber.matches(RegularExpressions.REG_HOME_NUMBER));
    }

    @Test
    public void testHomeNumberWithOutPlus() {
        String homeNumber = "38(044)5608260";
        Assert.assertTrue(!homeNumber.matches(RegularExpressions.REG_HOME_NUMBER));
    }

    @Test
    public void testHomeNumberWithOutOneNumber() {
        String homeNumber = "+38(044)560826";
        Assert.assertTrue(!homeNumber.matches(RegularExpressions.REG_HOME_NUMBER));
    }

    @Test
    public void testHomeNumberWithOutBrackets() {
        String homeNumber = "+38044560826";
        Assert.assertTrue(!homeNumber.matches(RegularExpressions.REG_HOME_NUMBER));
    }

    @Test
    public void testSkipMobileNumber2() {
        String homeNumber = "next";
        Assert.assertTrue(homeNumber.matches(RegularExpressions.REG_MOBILE_NUMBER2));
    }

    @Test
    public void testRightEmail() {
        String email = "my-name@i.ua";
        Assert.assertTrue(email.matches(RegularExpressions.REG_EMAIL));
    }

    @Test
    public void testEmailWithOutAt() {
        String email = "my-namei.ua";
        Assert.assertTrue(!email.matches(RegularExpressions.REG_EMAIL));
    }

    @Test
    public void testEmailThatStartsFromDot() {
        String email = ".my-name@i.ua";
        Assert.assertTrue(!email.matches(RegularExpressions.REG_EMAIL));
    }

    @Test
    public void testEmailWithWrongDomain() {
        String email = "my-name@i.ua.ua";
        Assert.assertTrue(!email.matches(RegularExpressions.REG_EMAIL));
    }

    @Test
    public void testRightSkype() {
        String skype = "illa_gritsak";
        Assert.assertTrue(skype.matches(RegularExpressions.REG_SKYPE));
    }

    @Test
    public void testSkypeThatStartsFromDot() {
        String skype = ".illa_gritsak";
        Assert.assertTrue(!skype.matches(RegularExpressions.REG_SKYPE));
    }

    @Test
    public void testSkypeThatHasSpace() {
        String skype = "illa gritsak";
        Assert.assertTrue(!skype.matches(RegularExpressions.REG_SKYPE));
    }

    @Test
    public void testRightIndex() {
        String index = "02091";
        Assert.assertTrue(index.matches(RegularExpressions.REG_INDEX));
    }

    @Test
    public void testIndexWithLetter() {
        String index = "a02091";
        Assert.assertTrue(!index.matches(RegularExpressions.REG_INDEX));
    }

    @Test
    public void testIndexMoreThenFiveNumbers() {
        String index = "020910";
        Assert.assertTrue(!index.matches(RegularExpressions.REG_INDEX));
    }

    @Test
    public void testIndexLessThenFiveNumbers() {
        String index = "0209";
        Assert.assertTrue(!index.matches(RegularExpressions.REG_INDEX));
    }

    @Test
    public void testRightTown() {
        String town = "Kiev";
        Assert.assertTrue(town.matches(RegularExpressions.REG_TOWN));
    }

    @Test
    public void testTownThatStartsFromSmallLetter() {
        String town = "kiev";
        Assert.assertTrue(!town.matches(RegularExpressions.REG_TOWN));
    }

    @Test
    public void testTownThatHasNumber() {
        String town = "Kiev1";
        Assert.assertTrue(!town.matches(RegularExpressions.REG_TOWN));
    }

    @Test
    public void testRightStreet() {
        String street = "Dekabristov";
        Assert.assertTrue(street.matches(RegularExpressions.REG_STREET));
    }

    @Test
    public void testAnotherRightStreet() {
        String street = "Harkivske Highway";
        Assert.assertTrue(street.matches(RegularExpressions.REG_STREET));
    }

    @Test
    public void testStreetWithNumber() {
        String street = "Harkivske Highway1";
        Assert.assertTrue(!street.matches(RegularExpressions.REG_STREET));
    }

    @Test
    public void testStreetThatStartsFromSmallLetter() {
        String street = "harkivske highway1";
        Assert.assertTrue(!street.matches(RegularExpressions.REG_STREET));
    }

    @Test
    public void testRightHouseNumber() {
        String number = "30b";
        Assert.assertTrue(number.matches(RegularExpressions.REG_HOUSE_NUMBER));
    }

    @Test
    public void testAnotherRightHouseNumber() {
        String number = "30/18";
        Assert.assertTrue(number.matches(RegularExpressions.REG_HOUSE_NUMBER));
    }

    @Test
    public void testHouseNumberMoreThenThousand() {
        String number = "1001";
        Assert.assertTrue(!number.matches(RegularExpressions.REG_HOUSE_NUMBER));
    }

    @Test
    public void testHouseNumberThatStartsFromLetter() {
        String number = "a38";
        Assert.assertTrue(!number.matches(RegularExpressions.REG_HOUSE_NUMBER));
    }

    @Test
    public void testRightApartmentNumber() {
        String apartment = "380";
        Assert.assertTrue(apartment.matches(RegularExpressions.REG_APARTMENT_NUMBER));
    }

    @Test
    public void testApartmentNumberWithLetter() {
        String apartment = "380C";
        Assert.assertTrue(!apartment.matches(RegularExpressions.REG_APARTMENT_NUMBER));
    }

    @Test
    public void testApartmentNumberMoreThenThousand() {
        String apartment = "2100";
        Assert.assertTrue(!apartment.matches(RegularExpressions.REG_APARTMENT_NUMBER));
    }

    @Test
    public void testApartmentNumberWithDot() {
        String apartment = "120.";
        Assert.assertTrue(!apartment.matches(RegularExpressions.REG_APARTMENT_NUMBER));
    }


}
