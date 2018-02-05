Simple Text Document Processor
The team you are working on are trying to create a document processor for text documents. They are at the stage where they are figuring out some of the features 
they want and would like to create a prototype. Here is the document that the team created with all the requirements about the document processor.

The prototype should deal with headers, numbering of headers as well as itemized and enumerated lists. Here is an example input that the design team has put 
together that includes some of the requirements as well:

# Header at Level 1

Headers appear on a line of their own. A header starts with the one or
more occurrences of the symbol `#` followed
by one space followed by text and ends with a newline.
Headers are section titles. The number of `#` symbols indicate the
nesting of headers.

## This is a header at level 2 

Nested Headers might appear out of order, for example 

#### Out of order header 

# Paragraphs

Paragraphs are free form text. Paragraphs are separated by new lines. 

This is the second paragraph in this section

# Lists 

There are 2 kinds of lists, itemizations and enumerations.

## Itemization Lists

These are also called "bullet" lists. An itemization list always starts on a new line 
and can use any of the following simbols to denote the beginning of at item 
`*` or `+` or `-` followed by one space and then text for example 

* itemization list, first element 
* itemization list, second element 
* itemization list, third element 

We can mix the symbols as well, e.g., 

* itemization list, first element 
+ itemization list, second element 
- itemization list, third element 

The last element of an itemization list is the one that is followed 
by an empty line. 

And of course we can nest itemization lists by adding 2 spaces in the beginning 
of the line for evey nested level, e.g., 

* itemization list 1, first element 
  * itemization list 2, first element 
  * itemization list 2, second element 
    * itemization list 3, first element 
  * itemization list 2, third element 
* itemization list 1 , second element 

## Enumeration  Lists 

Enumeration lists are similar to itemization lists but the items are marked with a numeral 
that increases for each item. 

Enumeration lists appear on a separate line and start with either `.` followed by one space 
or two special characters `1.` followed by a space. 

For example here is a numbered lists 

1. This is the first item 
1. the second item 
1. the third item

As with itemization lists we can mix and match the special characters, e.g., 

. This is the first item 
1. the second item 
. the third item

The last element of an enumeration list is the one that is followed by an empty 
line. 

We can nest ordered lists by adding 2 spaces followed by the same special
characters (`.` or `1.`) for numbered lists, e.g.,

1. This is the first item of the outer list 
1. This is the second item of the outer list 
  1. This is the first item of the inner list 
  1. This is the second item of the inner list 
1. This is the third item of the outer list
                
Your program must be a command line program that allows the users to specify the name of a file to process as an argument. The file should contain text like the 
example above. The output of your program will be another text file that will correctly replace headers to include the sections number, e.g., 1, 1.1, 1.2 etc. 
and replace numbered lists to include an item's appropriate number e.g., 1, 2, 3. Make sure you provide a reasonable name for the output file so that we can easily 
match the input filename to the output filename.

Given the example above, your program should output the following text file

1 Header at Level 1

Headers appear on a line of their own. A header starts with the one or
more occurrences of the symbol `#` followed
by one space followed by text and ends with a newline.
Headers are section titles. The number of `#` symbols indicate the
nesting of headers.

1.1 This is a header at level 2 

Nested Headers might appear out of order, for example 

1.1.1.1 Out of order header 

2 Paragraphs

Paragraphs are free form text. Paragraphs are separated by new lines. 

This is the second paragraph in this section

3 Lists 

There are 2 kinds of lists, itemizations and enumerations.

3.1 Itemization Lists

These are also called "bullet" lists. An itemization list always starts on a new line 
and can use any of the following simbols to denote the beginning of at item 
`*` or `+` or `-` followed by one space and then text for example 

* itemization list, first element 
* itemization list, second element 
* itemization list, third element 

We can mix the symbols as well, e.g., 

* itemization list, first element 
* itemization list, second element 
* itemization list, third element 

The last element of an itemization list is the one that is followed 
by an empty line. 

And of course we can nest itemization lists by adding 2 spaces in the beginning 
of the line for evey nested level, e.g., 

* itemization list 1, first element 
  * itemization list 2, first element 
  * itemization list 2, second element 
    * itemization list 3, first element 
  * itemization list 2, third element 
* itemization list 1 , second element 

3.2 Enumeration  Lists 

Enumeration lists are similar to itemization lists but the items are marked with a numeral 
that increases for each item. 

Enumeration lists appear on a separate line and start with either `.` followed by one space 
or two special characters `1.` followed by a space. 

For example here is a numbered lists 

1. This is the first item 
2. the second item 
3. the third item

As with itemization lists we can mix and match the special characters, e.g., 

1. This is the first item 
2. the second item 
3. the third item

The last element of an enumeration list is the one that is followed by an empty 
line. 

We can nest ordered lists by adding 2 spaces followed by the same special
characters (`.` or `1.`) for numbered lists, e.g.,

1. This is the first item of the outer list 
2. This is the second item of the outer list 
  a. This is the first item of the inner list 
  b. This is the second item of the inner list 
3. This is the third item of the outer list
                        
Header numbering
Header numbering must start at 1. In the case that the document contains a nested header such that we jump nesting levels, then we start counting the missing 
nesting levels at 1 as well. For example

Input

# H

# H

## H

## H

#### H

#### H
                
Output

1 H

2 H

2.1 H

2.2 H

2.2.1.1 H

2.2.1.2 H
                
Also notice that the last digit on the header's number does not have a period after it. The first header has the number 1 with not period following the number.

Itemization lists
For itemizations lists we can nested them to any depth and we can have as many items as we like. For the output of items on itemizations lists we always 
generate a * regardless of what the input uses, for example

Input

* Item 
* Item 
  - Item 
    + Item 
    + Item 
  - Item 
* Item 
                            
                        
Output

* Item 
* Item 
  * Item 
    * Item 
    * Item 
  * Item 
* Item 
                            
                        
Enumeration lists
Enumeration lists are similar to itemization lists but rather than prepending the symbol * to each item, we need to calculate and prepend a numeral.

When nesting enumeration lists we expect the output to alter between numerals and characters for the numbering on the enumeration lists and its sub list. 
If we are to count the level of nesting for an enumeration list to start at 1 then all odd nested levels must use numerals for counting and all even nesting levels 
must use English characters for numbering. Here is an example to illustrate our rule.

Input

                            
1. Item, nesting level 1
  1. Item, nesting level 2
    1. Item, nesting level 3
      1. Item, nesting level 4
      1. Item, nesting level 4
    1. Item, nesting level 3
  1. Item, nesting level 2
1. Item, nesting level 1
                        
Output

1. Item, nesting level 1
  a. Item, nesting level 2
    1. Item, nesting level 3
      a. Item, nesting level 4
      b. Item, nesting level 4
    2. Item, nesting level 3
  b. Item, nesting level 2
2. Item, nesting level 1
                            
                        
We should be able to have as many nesting as we like and as many items as we like. If we are in an even nested depth and the elements in our list are more than 
26 (the characters in the English alphabet) then the 27th item gets the value aa., the 28th then gets ab. etc.

Mixing Itemization and Enumeration Lists
We can nest our two types of lists (itemization and enumerations) in any combination and to any depth. Our rule for our enumeration lists needs to be followed and 
it needs to take account the depth of the enumeration list, e.g.,

Input

                            
1. Item, nesting level 1
  * Item, nesting level 2
    1. Item, nesting level 3
      1. Item, nesting level 4
      1. Item, nesting level 4
    1. Item, nesting level 3
  * Item, nesting level 2
1. Item, nesting level 1
                        
Output

1. Item, nesting level 1
  * Item, nesting level 2
    1. Item, nesting level 3
      a. Item, nesting level 4
      b. Item, nesting level 4
    2. Item, nesting level 3
  * Item, nesting level 2
2. Item, nesting level 1
                            
                        