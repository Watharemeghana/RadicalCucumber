Feature: This file contains test scenarios of add employee

Scenario: Validate New employee getting created and searched in HRMS System
Given Login with admin user
When Go to PIM Tab
#When: hit Add Employee section
#When: enter user details
#When: hit save button
#When: search the user 
Then validate user gettting searched

Scenario: validate employee not getting created if mandatory fields missing.
Given Login with admin user
When Go to PIM Tab
#When: hit Add Employee section
#When: don’t enter all mandatory user details
#When: hit save button
#When: search the user 
Then User should not be searchable