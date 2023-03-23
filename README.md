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
But it's done, I got similar output on slightly highier version of JDK:<br>
![JDK from my environment](/assets/myjdk14.PNG "JDK from my environment")<br>
This was exhausting: nap time.
- Primitive vs Reference Types - There are 8 primitive types in Java: byte, short, int, long, float, double, char, boolean - they hold the value of interest directly. String is the only reference data type we saw so far - it holds the *memory address* of the object of interest

**23rd March 2023**
- Comments - single line vs. multiline comments
```java
// some comment here - single line
int number = 37;
/* 
        multiple lines
        of comments
 */
```
- Arthmetic Operators available in Java
