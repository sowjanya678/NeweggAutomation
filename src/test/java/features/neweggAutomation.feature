Feature: newegg automation

  Scenario: Verify add items to bag and update quantity
    Given I am on the home page
    When I search for products with "Micro SD Card"
    And I click on the product "San Disk 256GB Ultra"
    And I add product to the bag
    When I search for products with "PS4 games"
    And I click on the product "Uncharted: The Lost Legacy"
    And I add product to the bag
    When I search for products with "Smart Thermostats"
    And I click on the product "INSTEON Thermostat (2441TH)"
    And I add product to the bag
    And I navigate to shopping cart page
    And I update quantity as "4" for product "SanDisk"
    Then I should see price updated for item level


  Scenario: reset the password
    Given I am on the gmail page
    And I reset the password successfully