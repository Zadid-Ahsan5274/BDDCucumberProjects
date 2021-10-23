Feature: OrangeHRM Login

Scenario: Logo Presence on OrangeHRM home Page
Given I launch chrome browser
When I open orange hrm homepage
Then I verify that the logo present on page
And close the browser