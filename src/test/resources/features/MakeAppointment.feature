Feature: Make Appointment

  Background: Login
    Given  user is on the website
    When user enters his credentials

  @MakeAppointment
  Scenario: Make a successful appointment
    And The user fills out the scheduling form.
    Then the user will see the appointment confirmation message.
