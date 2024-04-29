Feature: Application Login


Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page default login
Given User is on NetBanking landing page 
When User login into application with username admin and password 4321
Then Home Page is displayed
And Cards are displayed

@RegressionTest
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with username "user" and password 0953
Then Home Page is displayed 
And Cards are displayed

#Reusable
@RegressionTest @smokeTest 
Scenario Outline: Mortgage User Page default login

Given User is on NetBanking landing page
When User login into application with username <username> and password <password>
Then Home Page is displayed
And Cards are displayed

Examples:
|username| |password|
|debituser| | 8907  |
|credituser| | 7890  |

@mobileTest
Scenario: User Page default Sign up

Given User is on Practice landing page
When User Signup into application
| rahul |
| shetty|
|contact@email.com|
|54343646463|
|hello|
Then Home Page is displayed 
And Cards are displayed
