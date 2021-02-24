Feature: To validate the Login functionality
Background:
Given User is on Facebook application Login Page

@Sanity
Scenario: To validate the Login functionality
When User enter username and password
And User Click Login button
Then User should be in invalid Credentials Page

@Smoke
Scenario: To validate the forgot password link 
When User has to Click the forgot password link
And User has to enter the mob no
And Click the search button
Then User has to navigate to the OTP page