Feature: Application Login

  Scenario Outline: Home page successful login
    Given User is on landing page
    When User login to application with <username> and <password>
    Then inventory page is loaded
    Examples:
      |username      | password    |
      |standard_user | secret_sauce|




#  Scenario Outline: Home page default login
#    Given User is on landing page
#    When User login to application with username "standard" and password "secret_sauce"
#    Then Home page is populated are "false"
#    And Products displayed are "false"