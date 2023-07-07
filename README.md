# O'Reilly-the-complete-java
Notes and code taken during watching [O'Reilly The Complete Java Course](https://learning.oreilly.com/videos/the-complete-java/9781801075190/)

## First observations
**22nd March 2023**<br>
I am not a fan of Java... it's needed for my work projects though<br><br>

When watching the second section of the course there's first difficult question:<br>
- *Which version of which Java should I install?* - The answer come, as usual, when I was away from the computer:<br>
install the version that is used in the course - jdk-14.0.1 - maybe just take the last version of jdk-14.<br>
![JDK version from the course](/assets/jdk14.PNG "JDK version from the course")<br><br>
Once done with the course one would need to start jumping through the release notes of Oracle to learn what's new on upper versions. Or find some documentation on how to do stuff on earlier versions of Java for already existing projects.<br>
Let's see if my patience grow up to such a point. I already feel a scratch of annoyance in my brain for learning this language.<br>
Ok, so Java 14 is already on [Oracle archive](https://www.oracle.com/pl/java/technologies/javase/jdk14-archive-downloads.html)...<br>
...and I need to create an account...<br>
[JDK 14 Documentation link](https://docs.oracle.com/en/java/javase/14/index.html)<br>
[Java 14 API Documentation link](https://docs.oracle.com/en/java/javase/14/docs/api/index.html)<br>
But it's done, I got similar output on slightly higher version of JDK:<br>
![JDK from my environment](/assets/myjdk14.PNG "JDK from my environment")<br>
This was exhausting: nap time.
- Primitive vs Reference Types - There are 8 primitive types in Java: byte, short, int, long, float, double, char, boolean - they hold the value of interest directly. String is the only reference data type we saw so far - it holds the *memory address* of the object of interest

**23rd March 2023**
- Comments - single line vs. multiline comments
```java
// some comment here - single line
class Number {
    int number = 37;
/* 
        multiple lines
        of comments
 */
}
```
- Arithmetic Operators available in Java
- Relational Operators available in Java
- Logical Operators available in Java

**24th March 2023**
- User Input - here we are touching for the first time JAVA packages: java.lang & java.util.Scanner<br>
```java
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.println("What's your name?");
        name = keyboard.nextLine();

        System.out.println("Hello, " + name);
    }//end main
}
```
<br>java.lang package is the default package - it is imported automatically in the beginning of each Java File, once we create .java file.<br>
### java.util.Scanner gotchas
> [Java 14 Scanner Class docs](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html)<br>
1. number reading functions are leaving EOL char in the stream causing your following nextLine() function to skip getting user input
2. floating number inputs are taking the ./, from the system, so I needed to input "3,5" instead of "3.5", however the program output was:<br>
   ![program output with a dot](/assets/twiceYourNumber.PNG "Java program output with a dot")<br><br>

**25th March 2023**<br>
I am sick of Java and of this world. Here's my version of your learning example John p. Baugh:<br>
```shell
There's once was a stupid boy named John who was a fat programmer in the Kingdom of Earth.
He loved to wear glasses and to masochism.
He wanted to marry the wise layer named Lucy but his mother, Queen Lucia forbid him from seeing her.
```
Why does coding classes include this sick theme of males forbidding females of doing something? I need to throw up...
Go choke on it John!
Fuck this shit!
## Section 3
### Control Statements Overview
**Control flow** - the order in which instructions are executed within a program<br>
There are 3 Categories of Control Statements in Java:
- Sequential (Sequence)
- Selection (Decision)
- Repetition (Loops)


**Selection Control Statements**<br>
- The **if** statement
- The **if-else** statement
- the **switch** statement<br><br>

**Repetition Control Statements**<br>
- The **while** loop
- The **do-while** loop
- The **for** loop
- The **for-each** loop (syntactic sugar)

**Continue and Break**
- statements to be used with loops
- continue used inside a loop sends the execution to loop's beginning while
break will exit the loop entirely:<br>
  ![continue vs. break loop output](/assets/continueBreak.PNG "Continue vs. break loop output")<br><br>

> Have a read on **Structured Programming Paradigm** in your free moment<br>

### Pseudo-Random Numbers Generators
I will skip the mathematical discussion on why machines are not able to generate truly random numbers <br>
> [Java 14 Random Class docs](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html)<br>

## Section 4
Very first data structures - collections of elements
### Arrays
- elements must be type homogenous

#### ChatGPT Array info:
You can find the Java SE 14 documentation for the java.util.Arrays class, which provides utility methods for working with arrays, including sorting, searching, and filling arrays, at the following link:

> [Java 14 Arrays docs](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html)

Additionally, you can find the Java SE 14 documentation for the java.lang.reflect.Array class, which provides **static methods for creating and manipulating arrays using reflection**, at the following link:

> [Java 14 Reflect Array docs](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/reflect/Array.html)

Both of these classes are part of the Java Standard Library and are included in the JDK (Java Development Kit) distribution.

**Creating and manipulating arrays using reflection** is a way of programmatically creating and modifying arrays at runtime, rather than at compile time. This can be useful in certain situations, such as when you don't know the size of the array until runtime or when you need to work with arrays of different types.

### Array List
- ArrayList can only hold Reference types, not the primitive types.
- We don't need to declare the size of Array List - as we can add and remove elements from it on the go.
- ArrayList are type of entity known as **generic**
- **Generics** can only work with reference types
- For handling the primitives we have 8 Wrapper Classes

> [Java 14 ArrayList docs](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/ArrayList.html)

### Wrapper Classes
Those classes wrap a value of primitive type variable in an object. An object of Wrapper Class contains a single field whose type is its corresponding primitive.
1. [Byte](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Byte.html)
2. [Short](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Short.html)
3. [Integer](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Integer.html)
4. [Long](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Long.html)
5. [Float](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Float.html)
6. [Double](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Double.html)
7. [Character](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Character.html)
8. [Boolean](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Boolean.html)

## Section 5
We are covering [String Class](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html) in this module and its descendants.

STRINGS ARE IMMUTABLE: the string object cannot be changed

[StringBuilder Class](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuilder.html)
STRINGBUILDERS objects are MUTABLE:
- the object can be modified (mutated)
- have many of the same methods as the String class (e.g. charAt(), indexOf(), length())
- have many methods the String class doesn't have

## Section 6
### User-Defined Methods
- Discussion on pass-by-value vs. pass-by-reference

|                                |                      Pass-by-value                      |                Pass-by-reference                |
|--------------------------------|:-------------------------------------------------------:|:-----------------------------------------------:|
| What is passed in?             | a copy of the variable data is made and being passed in | the memory address of the variable is passed in |
| Is the original data affected? |                           no                            |                       yes                       |
> Java only supports **pass-by-value**
- Methods overloading - SIGNATURE - combination of method's name and parameter list
- RECURSION - when a method calls itself - For a method to be recursive, it needs:
  - At least one base case (no recursion in it)
  - At least one recursive case(this is where recursion occurs)

> ### Running Java program from CMD with arguments
> 1. Open CMD in the file yours Java main method file is stored
> 2. Run in CMD: <code>java nameOfYourFile.java arg1 arg2</code>

### 2D Arrays (Side Topic)
Tensors and more specifics Matrices which are 2-dimensional Tensors

### Tic-Tac-Toe project
There's instruction document provided.
I will create it in this repo for the time being. After completing this course I can move this project to the separate repo and work out missing bits:
- divide into separate files
- add tests for the methods
- publish on your GitLab

### Help document for Tic-Tac-Toe project
#### What is Tic-Tac-Toe?
Paper and pen quick game of 9 fields, for two players, X and O
Objective is to have 3 symbols in a row
If no one gets 3 in a row, it's called a 'cat's game'
#### Winning Examples
- X wins with 3 in a column
- X wins with 3 in a row
- X wins in a diagonal
- X wins in a reverse diagonal
#### My Design and Hits
In this section of the document, I'll describe the way I went about solving this project. This does not mean you have to do it exactly the way I did it, or at all. However, I do expect you to use good modularization, and divide some complexity of the project across multiple methods.

##### Methods overview
The methods I implemented(in addition to main, of course):
- <code>runGame()</code> - the game loop
  - initialize the winner as a string that is empty, since no one has one yet
    - That string can be X, O or C which is the cat's game, that is, a tie
  - create the game-board array of dimensions ROWS X COLS in this method
  - call <code>initializeGame()</code>, which will fill the game-board 2D array with spaces
  - call <code>printCurrentBoard()</code>, which do the obvious
  - create the game loop that continues as long as the winner has not been found yet:
    - the game loop must keep track of whose turn it is
    - the game loop calls <code>getUserInput()</code> to obtain the user's input and modify the game-board if they select a valid move, and tell them to pick another cell if they select an invalid move
    - after user input, the game loop calls <code>printCurrentBoard()</code> since the game-board has been updated
    - the game loop calls <code>getWinner()</code> to establish if it is the end of the game of not
    - flip whose turn it is to prepare for the next round
    - at the end of the game loop, we check if the game-board is full and a winner hasn't been selected yet, in which case we set winner equal to C, which means it's the cat's game
  - Still inside my <code>runGame()</code> method, but after the loop, we tell the user if the cat has won, or if there is a winner X or O
- <code>initializeGame()</code> - sets the cells of the 2D array to spaces
  - loops through the game-board and ensures all elements are set to a space
  - Decide what character to use for empty game-board cell
- <code>printCurrentBoard()</code> - prints whatever is in the current game-board
  - prints the lines and the game-board according to their content
- <code>getUserInput()</code> - gets the user input, and if valid, sets the game-board appropriately
  - takes a parameter representing whose turn it is, and the game-board
  - goes into a loop to determine if the input has been valid yet or not
  - valid selections include values for rows and cols >= 0 and <= 2
  - call <code>cellAlreadyOccupied()</code> to determine if we keep asking or consider the selected row and column to be legitimate or not
  - after the validation loop, fill in the game-board cell with X or O depending on the turn
- <code>cellAlreadyOccupied()</code> - returns ture if a given cell (by row and column) is already occupied
  - takes the row and column being tested, and the game-board as parameters
  - returns whether the game-board has a space at that row and column, which would mean the cell is available
- <code>getWinner()</code> - returns "X", "O" if there is a clear winner, or a " " (a space) if there is no winner yet
  - take the game-board as parameter
  - checks winning conditions for the rows
  - checks winning conditions for the columns if there was no row winner
  - checks winning condition for diagonal top-left to bottom-right if no column winner
  - checks winning condition for diagonal bottom-left to top-right
  - default return value is empty string - remember that in the game loop, our winner variable is capturing the return value of <code>getWinner()</code>, and if it is empty string "", then the loop will continue
- <code>isBoardFull()</code> - returns if the game-board is full or not
  - takes the game-board as a parameter
  - loops through the game-board and determines if all the cells are occupied
  - Hint: there are 9 total cells, if I count nine non-spaces, then that means the game-board is full
  - this method is crucial for determining the cat's game, that is, that there is a tie - no winner

Strongly recommended not trying to write all the methods at once. For example, maybe try some "easier" methods that don't depend as much on the others, and then build your program up. Some relatively simple methods to work with at first, or at least get started:
- <code>initializeGame()</code>
- <code>printCurrentBoard()</code>
- <code>isBoardFull()</code>
- <code>cellAlreadyOccupied()</code>

### My notes during completing Tic-Tac-Toe project

[java.utils.Arrays](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html)
This class is a member of the [Java Collections Framework](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/package-summary.html#CollectionsFramework).
> Where you can find [Java Collections Tutorial](https://docs.oracle.com/javase/tutorial/collections/index.html) to go through next


## Section 7 Object-Oriented Programming (OOP)
In OOP, an object represents an entity that has both:
- behaviour
- data

This entity with its behaviour and data form OOP **encapsulation**. Which is first primary principle of OOP.

### Three primary principles of OOP
1. Encapsulation
   Refers to uniting behaviour and data in a single entity called an object.
   Advantages of encapsulation:
   - portability - we can combine various behaviour and data, and move/use it across project
   - security - information/implementation hiding
   We write a Java Class, which works like a blueprint for objects.
2. Inheritance
3. Polymorphism

### Instance methods&fields vs. static methods&fields
<code>static</code> in front of a method/field means the method/field will be one for all class instances created.

No <code>static</code> method/field is created as a new one for each class instance created and can have access to <code>this</code> methods/fields.

### UML Class Diagram example for Rectangle Java Class
> UML stands for Unified Modeling Language and is not specific to JAVA

Three sections in Class Diagram:
1. Class name
2. Class fields
3. Class methods

Class fields and methods take format: <br>
<code><+/-> <identifier(name of field/method)> : <field/function return type></code> <br>
where <code><+/-></code> stands for:
- <code>+</code> public type
- <code>-</code> private type

> My UML modeling tool: lucid.app <br>
> https://lucid.app/lucidchart/invitations/accept/inv_ff5e1a22-537f-45fb-8145-070f32e00bf0 <br>
> Under the link my example on Rectangle Class
<br><br>

> [Java 14 Math docs](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Math.html)<br><br>
> [String.format()](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...))<br>
> ```java public static String format(String format, Object... args)```<br>
> Parameters:<br>
> <code>format</code> - A format string with [specific syntax](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Formatter.html#syntax)<br>
> <code>args</code> - Arguments referenced by the format specifiers in the <code>format</code> string.<br>


