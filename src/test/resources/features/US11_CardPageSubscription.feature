@US11, @smoketest
Feature:US11_Verify Subscription in Cart page

Scenario: TC1101_Verify Subscription in Cart page

Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click 'Cart' button
When Scroll down to footer
Then Verify text 'SUBSCRIPTION'
When Enter email address in input and click arrow button
Then Verify success message 'You have been successfully subscribed!' is visible