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
> 1. Open CMD in the file your's Java main method file is stored
> 2. Run in CMD: <code>java nameOfYourFile.java arg1 arg2</code>