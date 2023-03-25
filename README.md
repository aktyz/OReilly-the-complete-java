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