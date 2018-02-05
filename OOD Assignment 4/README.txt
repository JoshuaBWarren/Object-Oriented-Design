You are asked to provide the design and implementation in Java for a Set, as in the mathematical notion of a set. 
Here is the specification given to you describing all the operations on Set. The specification uses:

{} to denote the empty set,
{1,2,3} to denote the set with the elements 1, 2, 3.
? to denote union of two sets, i.e.,  a ? b.
Operation	Specification	Comments

emptySet(): Set	
emptySet() = {}
                                        
Creates an empty set.

isEmpty() : Boolean	
{}.isEmpty()        = true

{1,2,...}.isEmpty() = false 
Calling isEmpty() on an empty set must return true.
Calling isEmpty() on a non empty set must return false.

add(Integer n) : Set	
{}.add(n)   = {n}

aSet.add(n) = aSet,
    if aSet.contains(n) = true

aSet.add(n) = {n} ? aSet,
    if aSet.contains(n) = false
                                        
Calling add(n) on the empty set adds the new element n to the empty set.
alling  add(n) on a non-empty set  aSet returns the same set aSet if n is already a member of  aSet.
Calling add(n) on a non-empty set aSet returns the union of  aSet with the set {n}.

contains(Integer n) : Boolean	
{}.contains(n)   = false

aSet.contains(n) = true,
    if n ? aSet

aSet.contains(n)      = false,
    if n ? aSet
                                        
Calling contains(n) on the empty set returns false.
Calling contains(n) on a non-empty set aSet returns true if  n is a in the set  aSet.
Calling contains(n) on a non-empty set aSet returns false if  n is not in aSet

remove(Integer ele) : Set	
{}.remove(x)   = {}
aSet.remove(x) = bSet,
     if aSet.contains(x) == true  
     then aSet = bSet.add(x)

aSet.remove(x) = aSet,
     if aSet.contains(x) == false
                                        
Calling remove(x) on the empty set returns the empty set.
Calling remove(x) on a non-empty set  aSet that contains the element x returns the set bSet that has the same elements as aSet but with the element x removed.
Calling remove(x) on a non-empty set aSet that does not contain the element x returns the set aSet unchanged.

size() : Integer	
{}.size()   = 0
aSet.size() = n,  
     where |aSet| = n
                                        
Calling size() on the empty set returns  0.
Calling size() on a non-empty set  aSet returns the number of elements in aSet

You are also required to provide the following methods for Sets

equals(Object o) should return true if and only if the two sets have the same number of elements and for each element in this the same element 
exists in o and for each element in o also exists in this.
hashCode() ensure that your implementation of hashCode() and equals() satisfies the contracts for both methods.
Problem 2
All Java source code that is part of your solution to this problem must reside inside a java package with the name edu.neu.ccs.cs5004.assignment4.problem2

You are asked to provide the design and implementation in Java of a Bag. A Bag is a container for a group of data, in our case a Bag can hold Strings. 
A Bag can contain duplicates. The elements of a Bag have no order. Here is the specification given to you describing all operations on Bags. 
The specification uses:

[] to denote an empty Bag
[a,b,s] to denote a bag with three strings a b, s. The order of the elements does not matter, e.g.,  [a,b,c] is the same Bag as [b,c,a] and [c,a,b] etc.,
++ to denote the addition of an element in a Bag, e.g.,  b ++ [a,b] = [a,b,b]
|aBag| to denote the number of elements in aBag.
Operation	Specification	Comments

emptyBag() : Bag	
emptyBag() = []
                                    
Creates an empty bag.

isEmpty() : Boolean	
[].isEmpty()   = true

aBag.isEmpty() = false,
    if aBag ? []

                                    
Calling isEmpty() on the empty bag returns true.
Calling isEmpty() on a non-empty bag  aBag returns false.

size() : Integer	
[].size()   = 0

aBag.size() = n,
    where |aBag| = n

                                    
Calling size() on the empty bag returns 0.
Calling size() on a non-empty bag  aBag returns the number of elements in aBag.

add(String s) : Bag	
[].add(s)   = [s]

aBag.add(s) = anotherBag,
    where anotherBag = s ++ aBag
                                      
Calling add(s) on the empty bag returns a new bag that holds only one element  s.
Calling add(s) on a non-empty bag aBag returns a new bag anotherBag that contains all the elements of aBag plus the newly added element s.

contains(String s) : Boolean	
[].contains(s) = false

aBag.contains(s) = true,
   if aBag = s ++ anotherBag


aBag.contains(s) = anotherBag.contains(s),
   if aBag = x ++ anotherBag, and,
   x ? s
                                    
Calling contains(s) on an empty bag returns  false
Calling contains(s) on a non-empty bag returns  true if the element is in the bag
Calling contains(s) on a non-empty bag returns  false if the element is not in the bag
You are also required to provide the following methods for Bags

equals(Object o) that returns true if the two bags have the same exact elements; exactly the same String and exactly the same number of times in the 
bag (if there are duplicates). Remember that the order of elements in the bag does not matter.
hashCode() ensure that your implementation of hashCode() and  equals() satisfies the contracts for both methods.

Problem 3

One of your teammates would like your help with one of his projects. He was given the following specification for a Queue and is asking you to provide a design 
and Java implementation. This Queue holds data in a first in first out (FIFO) order, thus the order by which the elements are added into the Queue matters. 
The specification uses:

[| |] to denote an empty Queue.
[|a,b,s|] to denote a queue with three integers a b, s.
| aQueue | to denote the number of elements in aQueue.
Operation	Specification	Comments

emptyQueue() : Queue	
emptyQueue() = [| |]
                                    
Creates an empty queue.

isEmpty() : Boolean	
[| |].isEmpty()  = true

aQueue.isEmpty() = false
    if aQueue ? [| |]
                                    
Calling isEmpty() on the empty queue returns  true.
Calling isEmpty() on a non empty queue returns false.

size() : Integer	
[| |].size()  = 0

aQueue.size() = n
    where |aQueue| = n
                                    
Calling size() on an empty queue returns 0
Calling size() on a non empty queue returns the number of elements in the queue.

add(Integer s) : Queue	
[| |].add(n)       = [| n |]

[|x,y,...|].add(n) = [|n,x,y,...|]
                                    
Calling add(n) on an empty queue returns a new queue that has only one element n.
Calling add(n) on a non empty queue returns a new queue with n as the first element followed by all the elements of the original queue in their original order.

contains(Integer x) : Boolean	
[| |].contains(x)  = false

aQueue.contains(x) = true
    if aQueue = [| x,a,b,... |]


aQueue.contains(x) = [|a,b,...|].contains(x)
    if aQueue = [| s,a,b,... |]
    and s ? x
                                    
Calling contains(x) on the empty queue returns false.
Calling contains(x) on a non-empty queue that contains x returns  true.
Calling contains(x) on a non-empty queue that does not contain x returns  false.

pop() : Queue	

[| |].pop()             = error

[| x |].pop()           = [| |]

[| x,y,...,w,z |].pop() = [| x,y,...,w |]
                                    
Calling pop() on an empty queue throws an error.
Calling pop() on a one element queue return the empty queue.
Calling pop() on a non-empty queue with more than one element, returns a new queue that has all the elements of the original queue except the last element.

peek(): Integer	
[| |].peek()          = error

[| x,y,...,w |].peek() = w
                                    
Calling peek() on an empty queue throws an error.
Calling peek() on a non empty queue returns the queue's last element.

You are also required to provide implementations for the methods equals(Object o) and hashCode(). For equals() two queues are equal if and only if they have the 
same exact elements and in the same order (identical), i.e., [| 1,2,3,1,2,3 |] is not equal with [| 1,2,3,1,2, |] or  [| 2,1,3,1,2,3 |].