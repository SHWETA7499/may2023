Feature: Login functionality
Background: user on main page
Given user launch  "chrome" browser with exe as "C:\\Automation support\\chromedriver.exe";
Given user open "http://primusbank.qedgetech.com/" application

Scenario: Login funcationality with valid credencials
When user enter "Admin" as username
When user enter "Admin" as password
When user click on login button
Then application shows user profile to user



         

