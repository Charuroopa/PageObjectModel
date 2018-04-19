Feature: Create a Lead in LeafTaps

Scenario Outline: Creating a Lead with positive result

And Enter the Username as <login>
And Enter the Password as <pwd>
And Click on login
And Click on CRMSFA
And Click on Leads
And Click on Create Lead
And Enter the Company name as <cName>
And Enter the First name as <fName>
And Enter the Last name as <lName>
When Click on the Create Lead button
Then Verify the new lead is created
Examples:
|login|pwd|cName|fName|lName|
|DemoSalesManager|crmsfa|TestLeaf|Charu|Roopa|
|DemoSalesManager|crmsfa|TestLeaf|Trilok|Vignesh|
|DemoSalesManager|crmsfa|TestLeaf|Madhu|Vignesh|
