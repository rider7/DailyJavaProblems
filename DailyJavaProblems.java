//Description:
//Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.
//Example:
//
//"riley" --> "Hello Riley!"
//"JACK"  --> "Hello Jack!"

//Solved:
public class GreetMe{
  public static String greet(String name){
    String output = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    return "Hello " + output + "!";
  }
}

//Other:
public class GreetMe{
  public static String greet(String name){
    return String.format("Hello %s!", name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
  }
}

//NOTES:
//The java string substring() method returns a part of the string.
//
//We pass begin index and end index number position in the java substring method where start index is inclusive
//and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.
//
//The java string format() method returns the formatted string by given locale, format and arguments.
//%s returns the string value. see example other.