# coreJava

## Classes and Final modifier [ e-8 ]
* **Local Variable:**
  * Once we assign value to final variable, it is stored in memory from this time onwards we can't change it anymore.
  * var key word makes it mandatory to initialize at the time of declaration only.
  * Like this we make local variable constant.
  * Keep in mind that method parameters are also part of local variable.
* **class:**
  * Sometimes we want once we have assign a value to an attribute of a class, that value should remain there for every 
  instance of that class i.e. constant. Those instance variable we can declare final.
  * So the attribute of that instance will be stored in the memory at the time you create the instance itself.
    * One of the way is simply provide the value in the blueprint itself. That is by using = operator.
      * But it's not vary practical in real life scenario. Because the value is fixed for every instance of that class.
    * In real life scenario even if we want to make the attribute constant, but specific to that instance itself
      * For Example: Bottle with attribute volume
      * For this we will initialize the attribute at the time of object creation i.e. inside constructor. Because 
      constructor is the place where instance is created.
    * Again it's not practical but we can initialize in Anonymous block too. 
* **static Key word wrt variable:**
  * we can only declare variables of class as static. We can't have static variable somewhere locally.
  * When we declare a class variable as static, we say that the variable does not belong to the instance anymore.
  * Its called as class variable. This variable value is always same for that class, and to access it we don't  even 
  need have an instance. We can refer to the variable directly from class.
  * The basic different is that suppose we have a class Foo and a static variable y, no matter how many instances we create 
  for Foo, we will have only one y.
  * Even if you access the static variable by instance reference, at compile time it will be replaced by class name.
* **final and static modifier for variable:**
  * order of modifiers does not matter.
    `
      final static int x = 0;
      static final int x = 0;
    `
  * whenever you declare the variable we need to initialize it.
  * Again it's not recommended but we can initialize static final variables in static block too.

## Static & Anonymous blocks in the class and Overloading
* Initialization of the variable done before the execution of the static block.
* When the class loaded for the 1st time into the memory all the static blocks executed in the order the way it is 
declared, and its only once.
* After that anonymous block and after that constructor will be executed every time you create an instance.

## Overloading
* Applies to methods as well as constructors in Java.
* Multiple methods with same identifier with in the same class, but the method should differ with parameter
(by number, by type of at least one of them, order of types).
* Only identifier and parameter are important when discussing overloading, so the return type of method is not 
important.

    ` void a() {} `

    ` int a() { return 10; } // CE`
* For Java always first priority is to choose the methods for which no implicit conversion are needed.
  * Example: 
  * if we have two methods on takes int another double, we call method with int value, the method take int as 
    parameter will be executed.
  * If we delete the method having int parameter and call the method with int value, the method having double parameter
    will handle it.
  * But suppose we delete the method with double parameter and call the method having int parameter with double value we
    will get CE. One workaround will be call it like (int) 10.0.

