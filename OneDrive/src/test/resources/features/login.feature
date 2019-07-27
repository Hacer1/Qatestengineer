#Author: acar591903@gmail.com
Feature: Login feature
  I want to use this template for my feature file
  
  # Login   to   OneDrive web application using user credentials. 
  #Attempt   to   upload a   0   byte   file   to   the   documents   folder. Verify and track the status   of   the upload. 
  #Attempt   to   upload a   text   file   with   content   to   the   documents   folder. Verify and track the status   of   the   upload. 
  #Select   the   uploaded   document   and   click   on   the   info   button   in   the   top   right   of   the   screen. Verify   metadata   about   the   document   is   correct   by   comparing   it   to   the   source   file. 
  #Update   the   contents   of   the   text   document   from   the   OneDrive   editor   and   click   on   save button   to   create   a   new   version   of   the   document   in   OneDrive. 
  #Download   both   the   versions   and   compare   the   contents   to   make   sure   they   download correctly. 
  #Delete   the   document   from   OneDrive.

  @tag1
  Scenario: Login to OneDriver
    Given I navigate to onedriver
    When I click to sign in
    And I enter email
    And I click the next button
    And I enter password
    And I click the Sign in button
    Then I logined home page

  
