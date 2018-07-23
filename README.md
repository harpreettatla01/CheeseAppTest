# CheeseAppTest

This Repo illutrates a test automation framework(POM) using Appium & Java for the below scenario's. 

Scenario1: Check if all the 3 categories of cheese are displayed. 

Secanario2:  Check if all the 3 sections are displayed for the selected cheese 

Scenario 3: Change the mode to Night(Always)

Please note, for scenario 1 : I have implemented 2 different methods to show alternative ways of accomplishing this (one by passing parameters via feature file and the other by specifying values within the HomePage file). 

This is a maven project and the apk file for this resides in /AutomationTest/src/test/resources/app-debug.apk.


## Executing tests

To execute the tests, please ensure maven is installed. Then run the below command which will generate cucumber reports:
          mvn test verify
          
          
## Result

I have attached a cucumber report containing the results of all three scenario's. Please open any html file and it will launch the report from which you can navigate to its may sections. 
