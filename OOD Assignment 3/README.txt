Problem 1
You are asked to design a Java program for list of strings. Your implementation must provide for the following operations on lists of strings.

isEmpty : to check if the list is empty or not.
size : to get the total number of elements in the list.
contains : consumes a string and checks if the string is in the list or not.
containsAll : consumes another list of string checks that all elements of this list are in the list passed as argument.
filterLargerThan : takes the maximum string length and returns a list with all list elements whose length is greater than the maximum length removed.
hasDuplicates : check if the list has at least one duplicate element.
removeDuplicates : returns the list with all duplicates removed.
Along with your implementation you are also required to provide

Templates for all your classes.
The UML Class Diagram for your final solution.
A sequence diagram for your implementation of removeDuplicates. The diagram should be based on an example of a list with at least 3 elements and at least 1 being 
a duplicate.

Problem 2
We are asked to extend our Shapes solution to accommodate for composite shapes. A composite shape is a collection of two or more Shapes. 
Our Shapes (including our new composite shape) must support the following operations

moveX : takes the amount of units to move the pin in the X direction. For a composite, all shapes that are part of the composite need to move by the amount provided.
moveY : takes the amount of units to move the pin in the Y direction. For a composite, all shapes that are part of the composite need to move by the amount provided.
area : returns the area of a shape. For a composite shape this is the sum of all areas of its shapes.
perimeter : returns the perimeter of a shape. For a composite shape this is the sum of all perimeters of its shapes.
Along with your implementation you are also required to provide

The UML Class diagram for your final solution.
A Sequence Diagram for the method moveX on a composite object. The composite object needs to be composed of at least 2 shapes.

Problem 3
You are asked to design a Java program for a list of list of integers that supports the following operations.

size : returns the number of list of integers inside this list, e.g., ((), (1), (2 3)) returns 3
length : returns the number of total integers inside this list, e.g., ((), (), (2, 3)) returns 2
sum : returns the sum of all integers inside this list, e.g., ((), (1), (2 3)) returns 6
isEmpty : check if this list is empty, e.g., () returns true, (()) returns false
add : takes a list of integers and prepends (adds) it to this list of list of integers
removeInteger : takes an integer and removes the first occurrence of this integer in the list
removeAllInteger : takes an integer and removes the all occurrence of this integer in the list