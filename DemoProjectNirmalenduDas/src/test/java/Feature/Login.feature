Feature: Application Login

Scenario: Login to WordPress My Profile
Given Initialize the Chrome Browser and launch the "https://wordpress.com/me"
And Navigate to WordPress Login Page
When User login into application with "nirmalautomation967448@gmail.com" and "Laksha#2"
Then My Profile page is populated and "My Profile" page header should be displayed
Then Username "nirmalenduautomation" should be displayed at the My Profile Page

Scenario: Validate that by default Hide Profile Details toggle button is unselected
Given User is on My Profile page
When Hide My Profile info toggle button is displayed
Then Hide My profile info toggle buton should not be selected by default

Scenario: Validate Save My Profile Details button functionality when First name and Last name is blank
Given Navigate to My Profile Page and "My Profile" page header is displayed
When First Name is "", Last Name is "" and About Me is "This is automation"
Then Save My Profile Details button enabled is "true"
Then Clear all fields

Scenario: Validate Save My Profile Details button functionality when About Me field is blank
Given Navigate to My Profile Page and "My Profile" page header is displayed
When First Name is "Name1", Last Name is "Title1" and About Me is ""
Then Save My Profile Details button enabled is "true"
Then Clear all fields

Scenario: Validate Save My Profile Details button functionality when all three fields are blank
Given Navigate to My Profile Page and "My Profile" page header is displayed
When First Name is "", Last Name is "" and About Me is ""
Then Save My Profile Details button enabled is "false"
Then Clear all fields

Scenario: Validate that after providing all valid information and click on save user is able to see the saved information while oggin again
Given Fill First Name as "Nirmalendu" and Last name as "Das" and AbountMe as "This is automation test case"
When User clicks on Save button, Save success message should be displayed
Then User logs out of the application and close the browser