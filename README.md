# SPRINT 1
## TASK 7: Annotations

### LEVEL 1 - EXERCISE 1
Create an object hierarchy with three classes: Worker,
Online Worker and Face-to-face Worker.

The Worker class has the attributes name, surname,
price/hour, and the method calcarSou() that receives the
number of hours worked as a parameter and multiplies it by
the price/hour. Child classes must override it, using
@Override.

From the main() of the Main class, make the necessary
invocations to demonstrate the operation of the @Override
annotation.

For face-to-face workers, the method to calculate their
salary will receive the number of hours worked per month
as a parameter. When calculating the salary, the number
of hours worked will be multiplied by the price/hour,
plus the value of a static attribute called benzino
that we will add to this class.

For online workers, the method to calculate their salary
will receive the number of hours worked per month as a
parameter. When calculating the salary, the number of
hours worked will be multiplied by the price/hour and
the price of the flat rate Internet, which will be a
constant of the TreballadorOnline class.

### LEVEL 1 - EXERCISE 2
Add some obsolete (deprecated) methods to the child
classes, and use the corresponding annotation.
Invoke the obsolete methods from an external class,
suppressing the “warnings” for being obsolete using the
corresponding annotation.

### LEVEL 2 - EXERCISE 1
Create a custom annotation that should allow serializing
a Java object into a JSON file. The annotation should
receive the directory where the resulting file will be
placed.

### TECHNOLOGIES
| Package                    | Version | Description                |
|----------------------------|---------|----------------------------|
| `java`                     | ^24.0.1 | Principal project language |
| `java.util`                | ^24.0.1 | Java standard library      |
| `Apache maven`             | ^4.0.0  | Project management tool    |

### REQUIREMENTS
- Local environment: `IntelliJ or Eclipse`
- JDK 8 or superior
- Compatible file system (Windows, Linux, etc.)
###  INTELLIJ EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

### 🛠️ SCRIPTS

- Step 1: Create program's font code
- Step 2: Compile & Run the program

```bash
cd C:\Users\elyri\IdeaProjects\S1_07_Annotations   # Go to root file directory
javac -d out src\s1_07_annotations\*.java   # -d out indicates that the compiled .classes will be placed in an out folder
java -cp out s1_07_annotations.Task7  # -cp out tells Java where to look for the .class
```