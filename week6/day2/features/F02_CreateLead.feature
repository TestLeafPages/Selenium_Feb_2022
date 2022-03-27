Feature: Create Lead of Leaftaps

@functional
Scenario: TC003 Create Lead with mandatory fields
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When The Login button is clicked
Then The Welcome Page should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' should be displayed
When Click on 'Leads' link
Then 'My Leads' should be displayed