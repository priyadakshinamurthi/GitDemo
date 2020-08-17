Feature: Application login

Scenario Outline: Login
Given Initialize the browser "chrome"
And click on Login button
And Enter <username> and <password>
When clicking Login button
Then User should navigate to home page

Examples:
|username           |password |
|ukarkar20@gmail.com|umesh222 |
|test9989@gmail.com |1234     |
