#Autor: Ramiro Monroy Ramos

@tag1
Feature:Test the functionality for the creation of new users in the JOIN TODAY
        registration option of the website Utest.com

Scenario Outline: validate the creation of new users

  Given the user is on the website

  When enter the JOIN TODAY option for fill out the form

    | firstName | lastName | email | month | day | year | city | country | postalCode | mobileDevice | model | operatingSystem | password | confirmPassword |
    |<firstName>|<lastName>|<email>|<month>|<day>|<year>|<city>|<country>|<postalCode>|<mobileDevice>|<model>|<operatingSystem>|<password>|<confirmPassword>|

  Then the user can see the welcome message <welcomeMessage>

  Examples:
    | firstName  | lastName |   email    | month | day | year | city | country | postalCode | mobileDevice |   model   | operatingSystem |    password    | confirmPassword | welcomeMessage |
    |    Juan    |  Pedroza | jp5@jp.com |  May  |  4  | 1984 | Cali | Colombia|   472     |     Apple    | iPhone 4S |    iOS 11.0.2   | Mipassword2022 | Mipassword2022  | Welcome to the world's largest community of freelance software testers! |

