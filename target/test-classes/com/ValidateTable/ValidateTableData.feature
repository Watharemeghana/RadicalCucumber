
Feature: Test the data table
  
 
  Scenario: Validate Demo QA data table
    Given hit the URI2
    Then Validate Values for below data
    |book[0].title		|Git Pocket Guide		 |
    |book[0].pages		|234								 |
    |book[0].author		|Richard E. Silverman|
    |book[0].publisher|O'Reilly Media      |
    
    