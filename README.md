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

# #2 Java Attributes/Properties
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
## Source
> https://www.w3schools.com/java/java_classes.asp
