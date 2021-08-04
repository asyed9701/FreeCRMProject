Feature: This feature file is for Free CRM google play store icon functionality feature

  @Sanity @Regression
  Scenario: Verify ios app store icon is functional
    Given customer is in freecrm homepage
    When customer  clicks on google play store icon
    Then customer should be able to see the freecrm google play store page
