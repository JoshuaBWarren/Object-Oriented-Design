Iterators
For this question you are allowed to reuse code from previous assignment. If you do reuse your code from previous assignments make sure you update your old 
solutions to address any issues pointed out by the graders. You can also design and implement a new solution from scratch.

From assignment 5, problem 3, you designed an integer binary search tree (ibst). Develop the following features/operations for your ibst.

Develop an iterator that iterates over your ibst using a pre-order tree walk.
Develop an iterator that iterates over your ibst using a post-order tree walk.
Develop an iterator that iterates over your ibst using a in-order tree walk.
Your BST should provide 3 separate methods, one for each iterator so that clients can call the method that returns the iterator that they prefer.

Video Library
One of the professors from the Media department would like you to develop a small, simple library to manage a video library. 
Here is the description that they provided:

The video library is a collection of movies. There is no order in our library. For each movie however we would like to store the following information:

The movie's alias. This is a short name that I want to give to the movie. I would like to have the video library have unique aliases. 
So if I try to add a new movie and use an alias that is already in the video library, then I should be told that my alias is already used and then I will come 
up with a new alias:

The movie's title.
The movie's release year as a four digit number.
The movie's directors, there can be one or more. A director is typically a person's name.
The movie's main actors, there can be one or more. For each actor we provide their name.
Now once I populate my video library I would like to be able to perform the following tasks.

Given a director's name, I should be able to get all the movies that they directed. If there is more than 1 movie directed the results should be sorted by 
the movies release year. Most recent movie first.
I should be able to add a new movie to my video library. See my earlier comment on aliases.
I should be able to specify that I used the movie in my class. For example I want to keep track how many times a given movie was used. I should be able to 
provide the movie alias and the library should add 1 to the number of times that the movie was used.
I should be able to ask the video library to return the most used movie in my class. This is the movie that I used the most number of times in my class. 
If there are more than 1 movie then return any one of them. more than 1 most used
The professor is planning to have one of his students take over your solution and extend it in the future. For this reason, for each of the operations on the 
video library he would like you to add the runtime and space complexity of the operation in your documentation.