Feature: This feature file is for Free CRM compare option feature

  @Sanity @Regression
  Scenario: Verify compare icon is functional
    Given customer is in freecrm homepage
    When customer  clicks compare icon
    Then customer should be able to see the freecrm compare page
