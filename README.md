## Object-oriented Programming 10: Java Class, Object, Property, Method, Constructor, dan Visibility
> Created by Anita Nursi &nbsp;&middot;&nbsp;
> Student ID Number: 21343018 &nbsp;&middot;&nbsp;
> Majority of Informatics &nbsp;&middot;&nbsp;
> Faculcity of Engineering &nbsp;&middot;&nbsp;
> Universitas Negeri Padang
---

# #1 Java Classes/Object
Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

### Create a Class
To create a class, use the keyword class:
> Create a class named "Main" with a variable x:
```
public class Main {
  int x = 5;
}
```

### Create an Object
In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

To create an object of Main, specify the class name, followed by the object name, and use the keyword new:
> Create an object called "myObj" and print the value of x:
```
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
---

# #2 Java Class Attributes/Properties
In the previous chapter, we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:
> Create a class called "Main" with two attributes: x and y:
```
public class Main {
  int x = 5;
  int y = 3;
}
```
### Accessing Attributes
You can access attributes by creating an object of the class, and by using the dot syntax (.):

The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:
> Create an object called "myObj" and print the value of x:
```
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
---

# #3 Java Class Methods
> Create a method named myMethod() in Main:
```
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
```

myMethod() prints a text (the action), when it is called. To call a method, write the method's name followed by two parentheses () and a semicolon;
> Inside main, call myMethod():
```
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"
```
---

# #4 Java Constructors
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
> Create a constructor:
```
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

### Constructor Parameters
Constructors can also take parameters, which is used to initialize attributes.

The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:
```
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```

# #5 Java Modifiers/Visibility
We divide modifiers into two groups:
- Access Modifiers - controls the access level
- Non-Access Modifiers - do not control access level, but provides other functionality

### Access Modifiers
For classes, you can use either public or default:
![image](https://user-images.githubusercontent.com/112265105/198632628-7ad37cfe-0272-42c2-a15d-b1cbf47839af.png)

For attributes, methods and constructors, you can use the one of the following:
![image](https://user-images.githubusercontent.com/112265105/198632873-4ecc0433-fbed-4b69-88e0-fc3af20dd6a3.png)

### Non-Access Modifiers
For classes, you can use either final or abstract:
![image](https://user-images.githubusercontent.com/112265105/198633230-ee314edb-bcf3-478a-9808-f4c53a2b117d.png)

For attributes and methods, you can use the one of the following:
![image](https://user-images.githubusercontent.com/112265105/198633461-68dba591-cbb9-45b5-9bcd-8f2dab0ef291.png)

### Final
If you don't want the ability to override existing attribute values, declare attributes as final:
```
public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```

### Static
A static method means that it can be accessed without creating an object of the class, unlike public:
```
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}
```

### Abstract
An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
```
// Code from filename: Main.java
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
```
---

## Source
> https://www.w3schools.com/java/java_classes.asp
> https://www.w3schools.com/java/java_class_attributes.asp
> https://www.w3schools.com/java/java_class_methods.asp
> https://www.w3schools.com/java/java_constructors.asp
> https://www.w3schools.com/java/java_modifiers.asp
---
