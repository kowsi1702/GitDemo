

Feature: Application Login


Background:
When launch the browser from config variables
And hit the home page url of banking site


@RegressionTest @netBanking
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with username "user" and password 0953
Then Home Page is displayed 
And Cards are displayed

#Reusable
@RegressionTest @smokeTest @mortgage
Scenario Outline: Mortgage User Page default login

Given User is on NetBanking landing page
When User login into application with username <username> and password <password>
Then Home Page is displayed
And Cards are displayed

Examples:
|username| |password|
|debituser| | 8907  |
|credituser| | 7890  |

