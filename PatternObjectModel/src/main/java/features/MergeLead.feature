Feature: Create a Lead in LeafTaps

Scenario Outline: Creating a Lead with positive result

And Enter the Username as <login>
And Enter the Password as <pwd>
And Click on login
And Click on CRMSFA
And Click on Leads
And Click on Merge Lead
And Click the from lead icon
And Go to new window and enter the first name as <fName>
And Click on find button on that page
And Click on first index of it.
And Click the to lead icon
And Go to new window and enter the first name as <lName>
And Click on find button on that page
And Go to get text
And Click on first index of it.
And Click on the Merge Lead button
And Click on Find Leads
And Enter the Lead ID from the get text
When Click on Find Lead button
Then Verify the new lead is created
Examples:
|login|pwd|fName|lName|
|DemoSalesManager|crmsfa|Charu|Vignesh|

