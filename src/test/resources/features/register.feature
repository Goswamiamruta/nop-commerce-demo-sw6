Feature: NopCommercedemo Register Test
  As a User I am able To Nevigate on register page successfully
@author_Amruta @smoke  @regression
Scenario: Verify User Should Navigate To Register Page Successfully
Given     I am on home page
When      I Click on Register Link
Then      I Verify "Register" text

@author_Amruta @sanity
Scenario Outline: Verify That FirstName LastName EmailPassword And ConfirmPassword Fields Are Mandatory
Given     I am on home page
When      I Click on Register Link
And       Click on "REGISTER" button
Then      Verify the error message "<errormessage>"

Examples:  | errorMessage |
|First name is required.|
|Last name is required. |
|Email is required.     |
|Password is required.  |
|Password is required.  |

@author_Amruta @regression
Scenario: Verify That User Should Create Account Successfully
Given     I am on Home Page
When      I Click on Register Link
And       Select gender "Female"
And       Enter firstname "Kunjan"
And       Enter lastname "Patel"
And       Select day "01"
And       Select month "january"
And       Select year "1996"
And       Enter email "Kunjanpatel@gmail.com"
And       Enter password "kunjan16"
And       Enter Confirm Password "kunjan16"
And       Click on "REGISTER" button
Then      Verify message "Your registration completed"