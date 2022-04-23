Feature: validating the Booking function of AdactinHotel Application

  @reg
  Scenario Outline: Validating the Adactin LoginPage
    Given user is open Adactin Page
    When user enters "<username>" and "<password>"
    And user should click the login button
    Then user should verify the login

    Examples: 
      | username      | password     |
      | premkumar7264 | Sivavis@4437 |

  @smoke
  Scenario Outline: Validating the Search and select hotel test
    Then user select "<Location>" and "<Hotels>" and "<Room Type>" and "<Number of Rooms>" and "<Adults per Room>" and "<Children per Room>" 
    And click Search
    
     Examples: 
| Location | Hotels      |Room Type|Number of Rooms|Adults per Room|Children per Room|
| Paris    | Hotel Creek |Double   |  1 - One      |   1 - One     |      1 - One    |
    
 @Adhoc
  Scenario: select hotel and radiobutton then continue button click
  Then click the radiobutton and continue button  
    And user verify the continue
    
 @sanity
  Scenario Outline: Validating the Book hotel test
    Then user select "<First Name>" and "<Last Name>" and "<Address>" and "<Card No>" and "<Card Type>" and "<Select Month>" and "<Select Year>" and "<CVV Num>" and click Search
      Then click the BookNow button
    And user check get order id or not
     Examples: 
| First Name | Last Name |Address|Card No          |Card Type|Select Month|Select Year|CVV Num |
| Prem       | Kumar     |India  |4545454565656565 |VISA     |  March     | 2022      |007     |
    
   
