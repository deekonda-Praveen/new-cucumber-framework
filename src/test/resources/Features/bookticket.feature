Feature: Driver information tab in the TSRTC website
  Scenario: verify the driver information displayed in the driver information page
    Given the user should navigate to TSRTC website
    Then verify the TSRTC logo on the first page of the site
    Given user should navigate to driver information page
    When user enter the service number and date of journey
    And user should click on submit button
    Then verify the driver information displayed on the webpage
 