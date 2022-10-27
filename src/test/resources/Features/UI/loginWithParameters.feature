Feature: Login with parameters
@Parametirezed
   Scenario: Login as librarian 11
     Given I am on the login page
     When I enter username "librarian1@library"
     And I enter password 'rs4BNN9G'
     And click the sign in button
     Then number of users should be 173
