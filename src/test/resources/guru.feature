Feature: Guru Demo Site
  @TC2 @Lab02


  @TC3 @Scenario_Outline @Lab03
  Scenario Outline: Adding a new customer
    Given The user wants to see Guru demo site
    When the user wants to add a customer
    Then the user wants to verify "Add Customer" header
    Then The user wants to enter background check as "<bCheck>"
    Then The user wants to enter billingaddress as "<fName>" and "<lName>" and "<email>" and "<address>" and "<pNumber>"
    And The wants to verify message as "Access Details to Guru99 Telecom"
    Examples:
      |bCheck |fName |lName| email           |address     |pNumber  |
      |Done   |Joe   |Dave |joedave@gmail.com|10 fake st  |123456789|
      |Pending|Jason |Dave |jason@gmail.com  |11 fake st  |789654123|