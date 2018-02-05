Binary Search Trees with mutation
You asked to design a program in Java to implement the following Binary Search Tree (BST) data type.

create() : BST - creates an empty BST
add(Integer n) : void - adds the element n into the BST. If the element we are trying to add is already in the BST, the BST remains unchanged.
remove(Integer n) : void - removes the element n from the BST. If the element is not present in the BST then the BST remains unchanged.
contains(Integer n) : Boolean - returns true if the element n is in the BST and false otherwise.
size() : Integer - returns the total number of elements in the BST
Queue with mutation
You are asked to design a program in Java to implement the following first in, first out (FIFO) Queue data type.

create() : Queue - creates an empty Queue
isEmpty() : Boolean - returns true of the Queue is the empty one and false otherwise
enqueue(String n) : void - adds the element n into the Queue.
dequeue() : String - removes the oldest element from the Queue and returns it to the caller.
remove(String n) : void  - removes the element n from the Queue. If the element is not in the Queue the Queue remains unchanged. 
After the removal of an element, the remaining elements should maintain their order, e.g., given a queue ("a","b","c","d") after removing "c" the 
Queue's behavior should be identical to the Queue ("a","b","d")
size() : Integer - returns the total number of elements in the Queue