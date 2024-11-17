Feature: Login page Automation of saucedemo application

@smoke
Scenario Outline: Check the Login is Succesfull with valid credentials
Given User is on Login Page
When User enters valid "<Username>" and "<Password>"
And Clicks on Submit button
Then User should navigate to HomePage
And Close the Browser

Examples:
|	Username	|	Password	|
|	standard_user	|	secret_sauce |
|	problem_user	|	secret_sauce |

@regression
Scenario Outline: Check the Login is failed with locked user credentials
Given User is on Login Page
When User enters valid "<Username>" and "<Password>"
And Clicks on Submit button
Then User should navigate to HomePage
And Close the Browser

Examples:
|	Username	|	Password	|
|	locked_out_user	|	secret_sauce |

@performance
Scenario Outline: Check the Login for performance with valid user credentials
Given User is on Login Page
When User enters valid "<Username>" and "<Password>"
And Clicks on Submit button
Then User should navigate to HomePage
And Close the Browser

Examples:
|	Username	|	Password	|
|	performance_glitch_user	|	secret_sauce |

