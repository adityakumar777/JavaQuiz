package com.fusion.javaquiz;
import java.util.ArrayList;
import java.util.List;

public class Model {

    String question;
    String Op1;
    String Op2;
    String Op3;
    String Op4;
    String rightAns;

    public Model() {
    }

    public Model(String question, String op1, String op2, String op3, String op4, String rightAns) {
        this.question = question;
        Op1 = op1;
        Op2 = op2;
        Op3 = op3;
        Op4 = op4;
        this.rightAns = rightAns;
    }

public String getQuestion() {
        return question;
    }

    public String getOp1() {
        return Op1;
    }

    public String getOp2() {
        return Op2;
    }

    public String getOp3() {
        return Op3;
    }

    public String getOp4() {
        return Op4;
    }

    public String getRightAns() {
        return rightAns;
    }

    public static void setTest(List<Model> list , int testNumber){

        if (testNumber==1){

            list.add(new Model("What is the primary purpose of a constructor in Java?", "Initializing variables", "Defining class methods", "Declaring class fields", "Writing comments", "a"));

            list.add(new Model("Which keyword is used to declare a method in Java?", "class", "void", "method", "function", "b"));

            list.add(new Model("What is the term for a variable that is accessible only within the same class?", "Local variable", "Instance variable", "Static variable", "Global variable", "b"));

            list.add(new Model("In Java, which data type is used to store whole numbers?", "int", "double", "String", "boolean", "a"));

            list.add(new Model("Which of the following is not a valid access modifier in Java?", "public", "private", "protected", "final", "d"));

            list.add(new Model("What is the purpose of the 'this' keyword in Java?", "To create a new object", "To refer to the current instance of the class", "To specify the data type of a variable", "To terminate a loop", "b"));

            list.add(new Model("Which loop is used to iterate over elements of an array or collection in Java?", "if-else loop", "for loop", "while loop", "switch loop", "b"));

            list.add(new Model("What is the Java keyword used to explicitly throw an exception?", "catch", "try", "throw", "finally", "c"));

            list.add(new Model("Which Java feature is used to achieve multiple inheritance of interfaces?", "Inheritance", "Polymorphism", "Abstraction", "Interfaces", "d"));

            list.add(new Model("What is the default value of an uninitialized numeric variable in Java?", "0", "1", "null", "NaN", "a"));
        } else if (testNumber==2) {
            list.add(new Model("In Java, which data type is used to store text or a sequence of characters?", "int", "double", "char", "boolean", "c"));

            list.add(new Model("What is the primary purpose of the 'break' statement in a loop in Java?", "To exit the loop prematurely", "To skip the current iteration and continue with the next", "To check a condition", "To create a loop", "a"));

            list.add(new Model("Which Java keyword is used to define a constant variable?", "final", "static", "constant", "immutable", "a"));

            list.add(new Model("What is the term for a Java class that inherits properties and behaviors from another class?", "Child class", "Parent class", "Derived class", "Base class", "c"));

            list.add(new Model("What is the purpose of the 'super' keyword in Java?", "To access superclass methods and constructors", "To create a new object", "To terminate a loop", "To check for null values", "a"));

            list.add(new Model("Which Java keyword is used to allocate memory for an object?", "new", "create", "malloc", "allocate", "a"));

            list.add(new Model("What is the term for a Java method that has the same name as the class and is called when an object is created?", "Initializer method", "Constructor method", "Destructor method", "Static method", "b"));

            list.add(new Model("What is the purpose of the 'finally' block in a try-catch-finally statement in Java?", "To handle exceptions", "To execute code regardless of whether an exception occurs or not", "To define custom exceptions", "To ignore exceptions", "b"));

            list.add(new Model("Which Java access modifier allows a class or member to be accessible within the same package?", "public", "private", "protected", "package-private", "d"));

            list.add(new Model("What is the term for a Java construct that allows you to group related variables and methods?", "Package", "Class", "Object", "Interface", "b"));

        } else if (testNumber==3) {
            list.add(new Model("What is the term for a Java construct that defines a blueprint for creating objects?", "Class", "Object", "Interface", "Enum", "a"));

            list.add(new Model("Which Java keyword is used to implement method overriding in a subclass?", "override", "extends", "implements", "super", "a"));

            list.add(new Model("In Java, which collection type allows duplicate elements and preserves their insertion order?", "Set", "List", "Map", "Queue", "b"));

            list.add(new Model("What does the 'static' keyword indicate when used with a method in Java?", "The method can be called without creating an object of the class", "The method is not accessible", "The method is deprecated", "The method is a constructor", "a"));

            list.add(new Model("Which exception handling keyword is used to catch multiple exceptions in a single catch block in Java?", "catch", "try", "finally", "multi-catch", "d"));

            list.add(new Model("What is the purpose of the 'synchronized' keyword in Java?", "To make a method non-static", "To specify the data type of a variable", "To prevent multiple threads from accessing a resource simultaneously", "To define an interface", "c"));

            list.add(new Model("What is the Java keyword used to exit a loop prematurely and move to the next iteration?", "break", "continue", "return", "exit", "b"));

            list.add(new Model("In Java, what is the default value of an uninitialized boolean variable?", "true", "false", "null", "0", "b"));

            list.add(new Model("Which Java operator is used to check if two values are equal in both value and data type?", "==", "=", "!=", "===", "d"));

            list.add(new Model("What is the term for a Java interface with only one abstract method?", "Abstract interface", "Functional interface", "Single method interface", "Special interface", "b"));
        } else if (testNumber == 4){
            list.add(new Model("Which Java keyword is used to define a subclass that inherits from another class?", "subclass", "inherits", "extends", "implements", "c"));

            list.add(new Model("In Java, what is the purpose of the 'StringBuilder' class?", "To create immutable strings", "To manipulate strings efficiently", "To parse XML files", "To perform mathematical calculations", "b"));

            list.add(new Model("What is the term for a method that has the same name as another method in the same class but a different parameter list?", "Duplicate method", "Overloaded method", "Inherited method", "Private method", "b"));

            list.add(new Model("In Java, which access modifier allows a class or member to be accessed from any other class?", "public", "private", "protected", "package-private", "a"));

            list.add(new Model("What is the Java keyword used to explicitly call a superclass constructor from a subclass constructor?", "superclass", "extends", "this", "super", "d"));

            list.add(new Model("Which Java data type is used to represent a single 16-bit Unicode character?", "char", "String", "int", "byte", "a"));

            list.add(new Model("What is the term for a loop that continues to execute as long as a specified condition is true?", "For loop", "While loop", "Do-while loop", "Infinite loop", "b"));

            list.add(new Model("In Java, what is the purpose of the 'try' block in a try-catch-finally statement?", "To catch exceptions", "To specify the code to execute when an exception occurs", "To define custom exceptions", "To exit the program", "b"));

            list.add(new Model("Which Java keyword is used to declare a constant that is shared among all instances of a class?", "final", "static", "constant", "immutable", "b"));

            list.add(new Model("What does the 'volatile' keyword indicate when used with a variable in Java?", "The variable cannot be changed", "The variable is initialized to 0", "The variable can be accessed by multiple threads and changes are immediately visible to other threads", "The variable is a constant", "c"));
        }
        else if (testNumber == 5){
            list.add(new Model("What is the term for a Java construct that allows you to group related classes and interfaces?", "Package", "Module", "Namespace", "Container", "a"));

            list.add(new Model("In Java, which collection type does not allow duplicate elements and does not guarantee order?", "Set", "List", "Map", "Queue", "a"));

            list.add(new Model("What is the default value of an uninitialized reference variable in Java?", "null", "0", "false", "true", "a"));

            list.add(new Model("Which Java keyword is used to implement method overloading in a class?", "override", "extends", "implements", "static", "d"));

            list.add(new Model("In Java, what is the term for a method that has the same name as another method in the same class with the same parameter list?", "Duplicate method", "Overloaded method", "Inherited method", "Private method", "b"));

            list.add(new Model("What is the purpose of the 'throws' keyword in Java method declarations?", "To specify the return type of the method", "To declare that the method can throw exceptions", "To indicate that the method is deprecated", "To define method parameters", "b"));

            list.add(new Model("Which Java operator is used to create an instance of a class?", "new", "instanceof", "this", "super", "a"));

            list.add(new Model("What is the Java keyword used to specify a method that does not return any value?", "void", "null", "none", "empty", "a"));

            list.add(new Model("In Java, which data type is used to store floating-point numbers with single precision?", "float", "double", "decimal", "real", "a"));

            list.add(new Model("What is the term for a class that cannot be instantiated and is used as a base class for other classes?", "Final class", "Abstract class", "Static class", "Concrete class", "b"));
        }
        else if (testNumber == 6){
            list.add(new Model("What is the term for a Java construct that allows you to define a group of related constants?", "Package", "Enum", "Interface", "Module", "b"));

            list.add(new Model("In Java, what is the purpose of the 'default' case in a switch statement?", "To specify the default value of a variable", "To handle exceptions", "To execute code when none of the other cases match", "To define a constructor", "c"));

            list.add(new Model("Which Java keyword is used to explicitly release system resources such as file handles?", "close", "release", "dispose", "finalize", "a"));

            list.add(new Model("What is the term for a Java construct that allows you to define a template for a class with placeholder types?", "Abstract class", "Generic class", "Static class", "Final class", "b"));

            list.add(new Model("In Java, which access modifier restricts access to the class itself and its inner classes?", "public", "private", "protected", "package-private", "b"));

            list.add(new Model("What is the Java keyword used to specify that a variable cannot be modified after it is initialized?", "constant", "immutable", "final", "static", "c"));

            list.add(new Model("In Java, what is the purpose of the 'continue' statement in a loop?", "To exit the loop", "To skip the rest of the loop's code and move to the next iteration", "To return a value from the loop", "To restart the loop", "b"));

            list.add(new Model("Which Java operator is used to perform logical AND between two boolean expressions?", "&&", "||", "!", "&", "a"));

            list.add(new Model("What is the term for a Java class that inherits properties and behaviors from another class and can implement multiple interfaces?", "Child class", "Parent class", "Derived class", "Concrete class", "c"));

            list.add(new Model("What is the Java keyword used to specify a block of code that will be executed if a particular exception occurs?", "try", "catch", "throw", "finally", "b"));
        }
        else if (testNumber == 7){
            list.add(new Model("In Java, which operator is used to compare two values for equality, regardless of their data types?", "==", "=", "!=", "===", "d"));

            list.add(new Model("What is the term for a Java construct that allows you to define a class that cannot be instantiated and can only be inherited from?", "Final class", "Abstract class", "Static class", "Concrete class", "b"));

            list.add(new Model("In Java, which keyword is used to exit a loop prematurely and terminate its execution?", "break", "continue", "return", "exit", "a"));

            list.add(new Model("What is the purpose of the 'instanceof' operator in Java?", "To compare two strings", "To check if an object is an instance of a particular class or interface", "To perform arithmetic operations", "To create new instances of a class", "b"));

            list.add(new Model("In Java, what is the purpose of the 'enum' keyword?", "To create abstract classes", "To define enumerated types with a fixed set of values", "To define interfaces", "To declare constants", "b"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related methods with no implementation?", "Package", "Enum", "Interface", "Module", "c"));

            list.add(new Model("In Java, which access modifier allows a class or member to be accessed only within the same package and its subclasses?", "public", "private", "protected", "package-private", "d"));

            list.add(new Model("What is the Java keyword used to specify a method that can be called without creating an object of the class?", "static", "final", "abstract", "void", "a"));

            list.add(new Model("In Java, which exception is thrown when an array index is out of bounds?", "ArrayIndexOutOfBoundsException", "NullPointerException", "ArithmeticException", "IllegalArgumentException", "a"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related variables and methods, similar to a class but with no instance variables?", "Package", "Enum", "Interface", "Module", "c"));
        }
        else if (testNumber ==8 ){
            list.add(new Model("In Java, which keyword is used to create a new instance of a class?", "new", "create", "instance", "instantiate", "a"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related constants with associated values?", "Package", "Enum", "Interface", "Module", "b"));

            list.add(new Model("In Java, which exception is thrown when you try to access an object that is set to null?", "ArrayIndexOutOfBoundsException", "NullPointerException", "ArithmeticException", "IllegalArgumentException", "b"));

            list.add(new Model("What is the Java keyword used to specify a method that is not implemented in the current class but must be implemented by any concrete subclass?", "abstract", "implements", "extends", "override", "a"));

            list.add(new Model("In Java, which keyword is used to specify a block of code that will be executed after a try-catch block, regardless of whether an exception occurred or not?", "try", "catch", "throw", "finally", "d"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related methods with default implementations?", "Package", "Enum", "Interface", "Module", "c"));

            list.add(new Model("In Java, which data type is used to represent a sequence of characters?", "char", "String", "int", "byte", "b"));

            list.add(new Model("What is the Java keyword used to specify that a method can be overridden in subclasses?", "final", "static", "abstract", "override", "c"));

            list.add(new Model("In Java, which loop is used to execute a block of code at least once, even if the condition is false?", "for loop", "while loop", "do-while loop", "infinite loop", "c"));

            list.add(new Model("What is the term for a Java class that cannot be extended or inherited from?", "Final class", "Abstract class", "Static class", "Concrete class", "a"));
        }
        else if (testNumber ==9){
            list.add(new Model("In Java, which keyword is used to prevent a variable from being modified after it is initialized?", "immutable", "static", "final", "constant", "c"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related classes, interfaces, and enums?", "Package", "Enum", "Module", "Namespace", "a"));

            list.add(new Model("In Java, which exception is thrown when an arithmetic operation results in a value that is too large or too small to be represented?", "ArrayIndexOutOfBoundsException", "NullPointerException", "ArithmeticException", "IllegalArgumentException", "c"));

            list.add(new Model("What is the Java keyword used to specify a method that cannot be overridden by subclasses?", "final", "static", "abstract", "override", "a"));

            list.add(new Model("In Java, what is the purpose of the 'continue' statement in a loop?", "To exit the loop", "To skip the rest of the loop's code and move to the next iteration", "To return a value from the loop", "To restart the loop", "b"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related methods with no implementation?", "Package", "Enum", "Interface", "Module", "c"));

            list.add(new Model("In Java, which access modifier allows a class or member to be accessed only within the same package and its subclasses?", "public", "private", "protected", "package-private", "d"));

            list.add(new Model("What is the Java keyword used to specify a method that is not implemented in the current class but must be implemented by any concrete subclass?", "abstract", "implements", "extends", "override", "a"));

            list.add(new Model("In Java, which exception is thrown when you try to access an object that is set to null?", "ArrayIndexOutOfBoundsException", "NullPointerException", "ArithmeticException", "IllegalArgumentException", "b"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related methods with default implementations?", "Package", "Enum", "Interface", "Module", "c"));

        }
        else {
            list.add(new Model("In Java, what is the purpose of the 'default' case in a switch statement?", "To specify the default value of a variable", "To handle exceptions", "To execute code when none of the other cases match", "To define a constructor", "c"));

            list.add(new Model("Which Java keyword is used to create a new instance of a class?", "new", "create", "instance", "instantiate", "a"));

            list.add(new Model("What is the term for a Java construct that allows you to define a group of related constants with associated values?", "Package", "Enum", "Interface", "Module", "b"));

            list.add(new Model("In Java, which exception is thrown when you try to access an object that is set to null?", "ArrayIndexOutOfBoundsException", "NullPointerException", "ArithmeticException", "IllegalArgumentException", "b"));

            list.add(new Model("What is the Java keyword used to specify a method that is not implemented in the current class but must be implemented by any concrete subclass?", "abstract", "implements", "extends", "override", "a"));

            list.add(new Model("In Java, which access modifier allows a class or member to be accessed only within the same package and its subclasses?", "public", "private", "protected", "package-private", "d"));

            list.add(new Model("What is the Java keyword used to specify a block of code that will be executed after a try-catch block, regardless of whether an exception occurred or not?", "try", "catch", "throw", "finally", "d"));

            list.add(new Model("Which Java operator is used to compare two values for equality, regardless of their data types?", "==", "=", "!=", "===", "d"));

            list.add(new Model("In Java, what is the term for a method that has the same name as another method in the same class with the same parameter list?", "Duplicate method", "Overloaded method", "Inherited method", "Private method", "b"));

            list.add(new Model("What is the purpose of the 'instanceof' operator in Java?", "To compare two strings", "To check if an object is an instance of a particular class or interface", "To perform arithmetic operations", "To create new instances of a class", "b"));
        }
    }

}
