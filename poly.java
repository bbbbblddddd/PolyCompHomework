//Q1
//Polymorphism is a way of making code more flexible by allowing objects to take on different attributes depending
// on the context in which they are used.

//Q2
//When Polymorphism is used in Object Orientated design an object

//Q3
//We can use interfaces to implement Polymorphism in Java

//Q4
//As many forms as we need.

//Q5
//For example you could have a person Class and an animal class. Both of these classes have a method in which the
//person / animal speaks. This is done by returning a simple string. The speak() method would return in the same way,
//however the result would be different each time. So creating an ISpeak interface could help in this way.

//Q6
//Composition is a coding design methodology that steers away from inheritance and instead creates objects from other
//class objects.

//Q7
//YOu could use composition when creating a Face class for example. A Face has eyes, a nose and mouth. But some faces
//perhaps have a moustache or earring. So by using composition. We could create a face class that comes with all the elements
//of a face you might expect and create another separate class for moustache and earring for example. And only when appropriate
//pull these other classes in. Let's say we were making a face that included a moustache. It might look like this...


//==================================================================================
import components.Moustache;

public class NewFace extends Face {

    private Moustache moustache;

    public NewFace(String eyes, String nose, String mouth, String moustache);
    super(eyes, nose, mouth);
    this.moustache = moustache
//==================================================================================

//The face elements have been extended to NewFace and the moustache hasbeen brought in through composition

//Q8
//Composition is a stronger way of creating new object classes as they have ownership over the class objects they have pullled in.
//Aggregation could cause errors down the line if say they were deleted because other classes elsewhere may depend on them.

//Q9
//The advantages of composition make it less likely for errors to occur.


