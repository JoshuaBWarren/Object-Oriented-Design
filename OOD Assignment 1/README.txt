Problem 1
A friend is trying to create a program to keep track runners that take 
part in a marathon. For each runner that takes part in the marathon we 
need to keep track of their name, their start time and their end time.

We keep track of time by recording the hour, minutes and second. 
A valid time is one where

the hours is between 0 and 23 inclusive
the minutes is between 0 and 59 inclusive
the seconds is between 0 and 59 inclusive
He has started designing the program and after a first 
iteration your friend has created the following UML class diagram.

Runner Class Diagram
Your friend asked you to create the Java code based on his Class Diagram
Add a method in class Runner with the following signature public 
Time getEndTime() that will return the runner's end time for the 
marathon. A runner's total time is calculated using the following 
formula  startTime + duration. Note your method should return a valid Time.

Problem 2
You have been tasked to help with designing a program for a bank. The 
bank maintains deposit accounts. A deposit accounts consists of:

The account holder's name. An account holder is an individual with a 
first and last name.
The current account balance as an amount. An amount consist of:
An integer value for the dollar amount greater or equal to 0
An integer value for the cents amount, greater or equal to 0 and less than 
or equal to 99.
The bank would like to capture the event of a deposit to the account. 
Customers can deposit (add) money to their account. Design a method that 
will allow deposits on an account, the method should consume an amount and 
will return a new account such that the account balance has been increase 
by the amount deposited.
The bank would like to capture the event of a withdrawal to the account. 
Customers can withdraw (take away) money from their account. Design a 
method that allow withdrawals on an account, the method should consume an 
amount and will return a new account such that the account balance has been 
decreased by the amount deposited. You may assume that the amount withdrawn 
is less than or equal to the current balance of the account.
