Feature: FFM OT Member Login Panel


Scenario Outline: As an FFM OT member, I want to login to FFM platform

Given I should be able to view the FFM login panel
When I should be able to give valid "<email>" and "<password>"
And I should be able to click on the login button
Then I should be able to view the FFM platform

Examples:
|email|password|
|user@example.com|string|
|user@example.com|string|
|user@example.com|string|
|user@example.com|string|

