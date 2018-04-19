Feature: Delete a lead

Scenario Outline: Deleting the lead with positive result

Given Enter the Username as <login>
And Enter the Password as <pwd>
And Click on login
And Click on CRMSFA
And Click on Leads
And Click on Find Leads
And Enter First name as <fname>
And Click on Find Lead button
And Select the first index
And Click on Delete button
Then Changes has been done
Examples:
|login|pwd|fname|
|DemoSalesManager|crmsfa|Vignesh|