Feature: Create a Lead

Scenario: Login to Leaftaps and create a lead

Given Open the browser
And Maximize the browser
And Use the timeouts
And Launch the url
And Enter the Username as DemoSalesManager
And Enter the Password as crmsfa
And Click on login
And Click on CRMSFA
And Click on Leads
And Click on Create Lead
And Enter the Company name as TestLeaf
And Enter the First name as Charu
And Enter the Last name as Roopa
When Click on the Create Lead button
Then Verify the new lead is created