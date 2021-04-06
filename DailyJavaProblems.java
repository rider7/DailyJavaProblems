//Description:
//Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.
//Example:
//
//"riley" --> "Hello Riley!"
//"JACK"  --> "Hello Jack!"

//Solution:
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

//Description:
//Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
//For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.

//Solution:
public class Kata {
  public static int quarterOf(int month) {
    if (month <= 3){
      return 1;
    }if (month <=6){
      return 2;
    }if(month<=9){
      return 3;
    }else{
      return 4;
    }
  }
}
//Other:
interface Kata {
  static int quarterOf(int month) {
    return (int) Math.ceil(month / 3.);
  }
}
//NOTES:
//The java.lang.Math.ceil(double a) returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.