# CS-116-Labs
Java files from labs in CS 116 - Object-Oriented Programming II

# Class Overview
Class introduces more advanced elements of object-oriented promaming such as recursion, searching and sorting, abstract data types, ineritance and polymorphism, and more in Java.
Lab 1 was omitted as it was a refresher on basic Java concepts. 

## Lab 2
The purpose of this lab was to get familiar with writing and testing user defined classes. `InvestCalcApp.java` calls an object of `InvestCalc` and asks the user for interest 
(decimal) and principal (dollars) and displays a table of future values 5, 10 and 20 years from then. `VehicleClient` makes a `Vehicle` object that can keep track of when the vehicle arrives
at a toll booth, the time it gets to the front of the line, and the time it leaves (all integers) and non valid values entered will be set to 0.

## Lab 3
The purpose of this lab was to be able to write and test classes that contain certain parameters. `Date` is a class that takes in values for month, day, and year, in that order 
with an additional method that determines if the year entered is a leap year or not. If any values entered the respective variable will be set to their default constructor value.
The `Zoning` class takes values for length and width of a lot and returns lot area, height limit and unit limit count based on the following table:
Zoning | Lot Area | Height Limit | Unit Count Limit
------ | -------- | ------------ | ----------------
1 | area ≤ 2000 sq. ft. | 25 ft. | 1
2 | 2000 < area ≤ 2500 sq. ft. | 25 ft. + 2% Lot Area > 2000 sq. ft. | 2
3 | 2500 < area ≤ 3500 sq. ft. | 35 ft. + 1% Lot Area > 2500 sq. ft. | 2
4 | 3500 < area ≤ 5000 sq. ft. | 45 ft. + 2% Lot Area > 3500 sq. ft. | 3
5 | area > 5000 sq. ft. | 52.5 ft. + 0.25% Lot Area > 5000 sq. ft. | 4

## Lab 4
The purpose of this lab was to demonstrate the ability to use while loops, arrays and reading files. The `Craps` class creates an object of the `Die` class to play the game of
craps. `RandomIntegerArrayCreator` generates a random integer array with a size of 15 or less and `CommonElements` sees how many elements two random integer arrays have in common and displays 
what they are while also displaying the arrays side by side. `FindDuplicates` goes through the text files and displays any duplicate keys found in said text file. 
`FindDuplicatesApp` asked the user to enter the file name while `input1.txt` and `input2.txt` were used to help test the classes. Text files were loaded via `Scanner`.

## Lab 5
The purpose of this lab was to test programs and user-defined objects that require/contain arrays. `ExamClient` creates an object of `ExamScores` asks the user how many exams
are to be entered and is asked to enter the scores while making sure they are valid values. After doing so it displays the average score and how many scores were above average.
`UnsortedData` has two `public static` methods: `countOutofPosistion` accepts an array of doubles to see how far "out of posistion" all the items are and `bubble`, which swaps
two items if the item is larger than the one after it. `UnsortedDataApp` asks for a file for the user to enter a text file and displays how many items were out of order before
and after calling `bubble`. The files used to test the class were `dataRondom.txt`, `dataSorted.txt`, and `dataReverseSorted.txt`.

## Lab 6
The purpose of this lab was to design and test user-defined classes using inheritance. `Vector` is a simple class that is able to calculate length of a vector based on points entered
and `BoundVector` inherits `Vector` that can specify initial point coordinates.

## Lab 7
The purpose of this lab was to demonstrate understanding of inheritance, polymorphism, abstract classes, and interfaces. 

## Lab 8
The purpose of this lab was to demonstrate understanding of abstract classes, interfaces and ArrayLists. `Player`, `PlayerInterface`, `PlayGame`, `SwitchPlayer`, `NoSwitchPlayer`,
 and `RandomSwitchPlayer` were all used in order to run, test, and research the Monty Hall Problem and display the chances of winning with each type of strategy.
 

## Lab 9
The purpose of this lab was to understand basics of sorting, runtime analysis and algorithm complexity. `sortMethods.java` is a class that contains insertion sort and binary
sort that runs multiple trials sorting large sets of integers. Runtime for both methods were calculated and compared.

## Lab 10
The purpose of this lab was to design and code recursive methods. `Palindrome.java` checks various words to see if they are palindromes though a recursive function.
`SquareRoot.java` takes in a a number 'a', and tolerance 't' (both doubles) and computes the square root with a degree of accuracy indicated by tolerance with the equation: 
`X(n+1) = (1/2) * (X(n) + a/X(n)), where: X(0) = a/2`

## Lab 11
The purpose of this lab to write a program utilizing even controlled while loops and idnetifying code iteration patterns seen in `Ball` and `BallApp`. The second part of the
 lab was implementing and handling exceptions for user input. Exception handling was added into `ballApp` and `DateInvalidException` was written for the `Date` class.
 

