Feature: Login

  @Login
  Scenario: Succesful Login
    Given  user is on the website
    When user enters his credentials
    Then the user will see the text Make Appointment
