#Author: Team Automation
# Language: en

@OneFeature
Feature: Our First Test

  @One
  Scenario Outline: Your Page

    Given I open the main page
    And Click on sign in link
    When I type my email kjjlkih@gmail.com address in Create and account section.
    And Click on Create an Account button.
    And Type my Personal Information <Name>,<LastName>,<Pass>,<Company>,<AddressOne>,<AdressTwo>,<City>,<PostalCode>,<OtherInfo>,<HomePhone>,<MobilePhone>,<Alias> , Address and Contact inf.
    And  Click on Register button.
    Then I check that the user was registered <Name>,<LastName>
    Given I choose a product
    And I add to the product to the cart
    When I do the purchase
    Then I got a purchase confirmation Your order on My Store is complete.
    Examples:
      | Name | LastName   | Pass        | Company | AddressOne | AdressTwo  | City     | PostalCode | OtherInfo | HomePhone | MobilePhone | Alias          |
      | Test | Automation | 14092011Ab* | RP      | Cr89#92C   | Cr89#92C D | Medellin | 00000      | Thanks    | 7748954   | 3005647895  | TestAutomation |