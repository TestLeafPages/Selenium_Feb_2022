Feature: Login and logout of Leaftaps

Background:
Given A Chrome browser is launched
And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/main'
And Maximize the browser

Scenario Outline: TC001 Login and Logout Positive flow
# Given -> The user to provide precondition
Given Enter the username as <username>
And Enter the password as <password>
When The Login button is clicked
Then The Welcome Page should be displayed
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


#Scenario: TC002 Login and Logout Negative flow
## Given -> The user to provide precondition
#Given Enter the username as 'Demosalesmanager'
#And Enter the password as crmsfa
#When The Login button is clicked
#But The error message is displayed