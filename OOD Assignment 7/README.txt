Custom implementation of HashSet
A company who is working on a new small device are using Java want a specialized implementation of a HashSet library. 
As such they are looking for people to implement specialized code for their application to use.

They would like an implementation of a HashSet for their application and they have hired you to implement it. 

Here is the specification that they provided:

We would like a new implementation for a HashSet for Integers only. We would like the new implementation to only support the following operations

the ability to create a new HashSet with its initial capacity.
the ability to add a new element. The add operation should return a boolean, true when the operation succeeds and false otherwise. 
If the element passed to the add operation that is already a member of our HashSet the operation must succeed and leave the HashSet unchanged. 
If the add operation is called on a HashSet that is at 80% capacity, your implementation must increase the capacity and allow the addition of the element:

the ability to check if the HashSet is empty or not. This operation should return a boolean.
the ability to provide an element to be removed. If the element is not in the HashSet then the HashSet must remain unchanged.
the ability to check if an element is already a member of our HashSet
the ability to return the total number of elements in our HashSet
the ability to return the union with another HashSet. The result should be a valid  HashSet
the ability to return the intersection with another HashSet. The result should be a valid HashSet.

Other requirements for your implementation include:

You implementation should provide a Set interface. Your customized HashSet class must be a concrete implementation of the Set interface.
The load factor for your HashSet implementation should be 80%.
Your implementation should be space efficient.
Your implementation for the contains, add and remove operations should on average have a complexity of O(1)
For the union and intersection operations operations your documentation should state clearly which objects are being mutated (altered)
NOTE: The notes covered in one of our labs are a very good starting point for a hash table implementation. Your implementation must support chaining. 
There is no requirement to implement any of the interfaces from java.util. You are also not allowed to extend java.util.HashSet or any other java.util class.

Using java.util:
For this question you are required to use the types in java.util for your solutions.

A publishing house would like to generate the index for books that they publish. The index is a set of key words in the book and for each key word there 
is a list of page numbers that contain the key word.

Their current programs analyze the contents of a book and generate a java.util.Map<K,V> that contains pages as keys and a list of words as values. 
Here is an example of what the map contains once the program processes a book:

               Page No.   | Word 
               ---------------------------------------------------------
                 1        | "abstract", "class", "fields", "methods"
                 2        | "class", "fields", "types"
                 3        | "method", "argument", "expression", "return" 
                 4        | "abstract", "abstraction", "parameter",
                 7        | "interface", "signature", "inheritance"
              
What they would like is for you to design a program that given the Map that they already have, returns a new Map that is the book index. 
So given the preceding example, your program should produce a Map that should hold the following data:

                 Word          | Page Nos.
                 -------------------------
                 "abstract"    | 1, 4
                 "abstraction" | 4
                 "class"       | 1, 2
                 "fields"      | 1, 2
                 "methods"     | 1
                 "types"       | 2
                 "method"      | 3
                 "argument"    | 3
                 "expression"  | 3
                 "return"      | 3
                 "parameter"   | 4
                 "interface"   | 7
                 "signature"   | 7
                 "inheritance" | 7
  
              
Note that our output should contain the page numbers for a word in sorted order from smallest to largest page number.