Feature: Test Smoke Facebook scenario

  BO-12318
  There is can be some information about feature.
  Reporter: Aleh Rutski;
  Asignee: Sasha Makar;
  20.12.2018

  Scenario: Open browser and verify log-in

    There is can be some information about test case
    Reporter: Sasha Zavoiskih
    Asignee: Aleh Rutski;

    Given Open "opera" and start application
    When some actions
    Then first assert
    Then second assert

  Scenario Outline: Open browser

    Given Open "<browser>" and open "<site>"
    When some actions
    Then first assert

    Examples:
      | browser | site         |
      | chrome  | google.com   |
      | opera   | vk.ru        |
      | ie      | facebook.com |