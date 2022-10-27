Feature: Login functionality

  Scenario: Login as a librarian
    Given librarian is on the loginPage
    Then verify that the title is "Login - Library"
    When librarian enters valid email address and password and clicks login button
    #Then verify that there are 3 models on the page

  Scenario: Login as a Student
    Given student is on the loginPage
    Then verify that the URL is "https://library1.cydeo.com/login.html"
    When student enters valid email address and password and clicks login button

#  Scenario: Negative credentials
#    Given librarian is on the loginPage
#    When user enters invalid email address or password and clicks login button
#    Then verify the error message "Sorry, Wrong Email or Password"

