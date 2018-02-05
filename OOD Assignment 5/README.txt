Problem 1

Extend your implementation of Set from your assignment 4 to include the following operations

union(Set s) : Set; calling s1.union(s2) where  s1  s2 are both Sets returns a new Set that is the set union of s1 and s2.
intersection(Set s) : Set; calling s1.intersection(s2) where  s1  s2 are both Sets returns a new Set that is the set intersection of s1 and s2.
difference(Set s) : Set; calling s1.difference(s2) where  s1  s2 are both Sets returns a new Set that is the set symmetric difference of s1 and s2.
subset(Set s) : Boolean; calling s1.subset(s2) where  s1  s2 are both Sets returns true if s1 is a subset of s2 and false otherwise.

Problem 2

You are asked to implement a Priority Queue (PQ). Each element of a PQ is made up of

a priority; typically an positive integer
a value associated with the priority; in our case the value will be a string
The PQ should have the following operations

createEmtpy() : PQ; creates an empty priority queue.
add(Integer priority, String value) : PQ; adds the given value with its associated priority in PQ.
peek() : String; returns the value in PQ that has the highest priority. For two positive integers i,j such that i < j then  i has a lower priority than j. 
The PQ remains unchanged. Calling peek() on an empty PQ should signal an error.
pop() : PQ; returns the PQ without the element with the highest priority. Calling pop() on an empty PQ should signal an error.
isEmpty() : Boolean; returns true if the PQ is empty, returns false otherwise.

Problem 3

Design and implement in Java an Integer Binary Tree (IBT) and an Integer Binary Search Tree (IBST) whose nodes can hold  Integer objects.

An IBT is one of

empty
a node that contains
an integer value inside the node
a left subtree that is itself an IBT,
a right subtree that is iteself an IBT
An IBT must not contain any duplicate integer values.

An IBST is similar to an IBT with the following extra restriction

every node in an IBST contains
an integer value inside the node
a left subtree that is itself an IBST, and, all the integer values in the left-subtree are smaller than the value of this node
a right subtree that is iteself an IBST, and, all the integer values in the right-subtree are larger than the value of this node.
Your design and implementation should support at a minimum the following operations on a IBT:

create an empty IBT
add a given integer to the IBT. The operation returns the IBT with the node added. You are free to chose where to add the new node in the IBT.
the ability to check if the tree is the empty tree
the ability to know if a given Integer is already stored in the IBT inside a node
Your design and implementation should support at a minimum the following operations on a IBST:

create an empty IBST
add a given integer value to an IBST. The operation should return a new IBST that should contain a new node with the new integer value passed as an argument. 
Your operation must return a valid IBST.
the ability to check if the tree is the empty tree
the ability to know if a given Integer is already stored in the IBST inside a node
add the operation deleteNode to IBST; the operation takes in an  Integer, element, and if there is a node with the value element in the IBST then remove that 
node from the IBST and return the new IBST, else if  element is not in the IBST return the IBST unchanged. The IBST returned must be a valid IBST with all nodes 
connected as a tree (no dead nodes/leafs).
add the operation mirror to IBST; the operation returns an IBT which is the mirror image of the current IBST. 

Finally you should design the following operation for both IBTs and IBSTs

an operation called isBst() that returns true when called on an instance that satisfies the conditions for an IBST, and false otherwise. 
Calling isBst() on the return values of the operation mirror should return false. Calling isBst() on the return values of the other operations that return 
an IBST should return true.
NOTE: all IBSTs are IBTs but not all IBTs are IBSTs. Your solution must exploid this property.