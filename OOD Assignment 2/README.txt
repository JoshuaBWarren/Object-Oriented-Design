Problem 1

A Professor from another department asked for your help in order to write a program that will manipulate technical publications.

A publication can be one of

Conference. These are paper that have been published at a conference. We would like to capture the following information for conference publications.
Title: this is the paper's title.
Author: the author's name. There can only be one author.
Conference Name: the name of the conference.
Location: the location of the conference, typically a city and country, e.g. "Seattle, USA"
Month: the first three letters of the month, e.g., Oct
Year: the 4-digit calendar year.
Journal. These are papers that have been published to a Journal. We would like to capture the following information for journal publications.
Title: this is the paper's title.
Author: the author's name. There can only be one author.
Journal Name: the name of the Journal.
Issue: the issue number of the Journal, typically a number, e.g., 26
Month: the first three letters of the month, e.g., Oct
Year: the 4-digit calendar year.
Technical Report. These are papers that have been published as technical reports. 
We would like to capture the following information for technical report publications.
Title: this is the paper's title.
Author: the author's name. There can only be one author.
TR-ID: an identifier for this technical report, typically a number, e.g., 3425
Institution: the name of the institution publishing the technical report.
Year: the 4-digit calendar year.
Author names come in two flavours. An author's name is one of

Full Name: consists of the author's first and last name.
Official Name: consists of the author's first, middle, last names and title.
Design Java classes to capture the above requirements including implementations for toString(), hashCode() and  equals(Object o).
The professor would like to add a reference id to each publication. A reference id is a string, e.g., "FFJ95" that we can set on a publication. 
Extend your design to accommodate for reference ids.
Provide your UML Class Diagram for your design at this point.
The professor would also like to add book chapters as another type of publication. A book chapter has the following information associated with it
Chapter Title: this is the chapter's title as a string
Author: the author's name. There can only be one author
Book Title: the book's title as a string.
Month: the month the book was published.
Year: the year the book was published.
Editor: the editor's name. There can only be on editor.
Extend your design and your code to accommodate for book chapters. You do not need to update your UML Class diagram for this part of the question, only your code.
The professor would also like the ability to take an existing Technical Report and turn it into a Journal. 
Your program should provide a method defined on Technical reports that will accept
the Journal's name
the Journal's issue
the month
and the year
and return a new Journal that has the new Journal name, issue, month and year, but all other values are copied from the Technical Report. 

For example, if I have a Technical Report with the following information:
Title: "The art of lies"
Author: "John Steward"
TR-ID: 1224
Institution: "Institute of Human Behavior"
Year: 1999
and provide the following Journal information
Name: "Science of Lies"
Issue: 33
Month: Jul
Year: 2001

We should get back a Journal with the following information:
Title: "The art of lies"
Author: "John Steward"
Journal Name: "Science of Lies"
Issue: 33
Month: Jul
Year: 2001
Provied the final UML Class Diagram for your final solution to this problem.

Problem 2

We are asked to implement a simplified version of the game rock-paper-scissors.

The game consists of two players. The players select one of three states

Rock,
Paper, or,
Scissors
The players make their selection simultaneously. The winner is decided based on the following rules

Rock beats Scissors
Scissors beats Paper
Paper beats Rock
Design a Java program to represents the three possible states of the game
Include in your design a method shared by all states that consumes another state and returns a boolean indicating a win according to the rules above by returning 
true or a loss by returning false. For example if we have an object that represents the state Paper and we pass to that object another object that represents Rock, 
the we should return true since the object that received the challenge won based on the game rules. 
NOTE: You can solve this problem without casting or the use of  getClass(). For this problem only we will allow solutions that use casting or  getClass().

Problem 3
We are trying to build a prototype for a video game. The game designers have an idea and would like you to build a program to test their idea out.

The game consists of a map that we are going to represent as a grid and we are going to use Cartesian coordinates to designate position, e.g., (x,y). 
The game has Pieces. A Piece is one of

Civilian
Soldier
A Civilian is one of

Farmer
Engineer
A Soldier is one of

Sniper
Marine
The designers provided the following properties

All pieces must keep track of their current position as a Cartesian coordinate
All pieces must be able to move given a target location (another Cartesian coordinate). Pieces however move at different speeds towards their target.
Civilians move at most 1 unit in the x or y or both directions. If we have a civilian at location (2,3) and the civilian is given a target of (10,10) then 
the civilian can move 1 unit in the x-direction and one unit in the y direction. Another example, if the civilian is at location (3,6) and the target given 
is location (3,9) the civilian can move to (3,7). If the target location and the location of the civilian is the same then the civilian does not move at all.
Soldiers have the same restrictions but soldiers can move at most 2 units in the x or y or both directions.
Civilians generate wealth. Each civilian must keep track of its wealth. Wealth is basically a number. We should be able to increase a civilian's wealth by 
passing a number to add to the current wealth of a civilian. We should be able to decrease a civilian's wealth by passing a number to remove from the current 
wealth of a civilian.
Soldiers keep track of their stamina. Each soldier must keep track of its stamina. Stamina is basically a number. We should be able to increase a soldier's 
stamina by passing a number to add to the current stamina of a soldier. We should be able to decrease a soldier's stamina by passing a number to remove from the 
current stamina of a soldier.
Design a Java program to capture the information and properties described by the game designers. Provide your final UML Class Diagram as well as your code.