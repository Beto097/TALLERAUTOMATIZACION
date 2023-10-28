# Autor: Alberto Caballero
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate un screenplay at the Choucair Academy with the automation course
    @scenario
    Scenario: Search for automation course
      Given that Rose wants to learn automation at the academy Choucair
      | strUser  |  strPassword |
      | 892059   | Choucair2021*|
      When she search for the course on the Choucair academy platform
      | strCourse                        |
      | Metodología Bancolombia          |
      Then she finds the course
      | strCourse                        |
      | Metodología Bancolombia          |
