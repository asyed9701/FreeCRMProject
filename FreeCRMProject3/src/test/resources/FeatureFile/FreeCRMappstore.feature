Feature: This feature file is for Free CRM app store icon functionality feature

  @Sanity @Regression
  Scenario: Verify ios app store icon is functional
    Given customer is in freecrm homepage
    When customer  clicks on ios app store icon
    Then customer should be able to see the freecrm ios app store page
