/*
   Title: Person Class
   Name: Davis Haden
   Created: 9/25/2020
   Last Modified: 12/1/2020
   Demonstrate class definition and structure
   Will NOT include a main method!
   Main will be included in a separate runner class
*/
import java.util.Scanner;
public class Person
{
   //private data
      private int age;
      private String firstName;
      private String lastName;
      private String password = "na";
   //constructor(s)
      public Person(int a, String first, String last){
         age = a;
         firstName = first;
         lastName = last;
      }
   //accessor methods
   public String getFirstName(){
         return firstName;
      }
   public String getLastName(){
         return lastName;
      }
   public int getAge(){
         return age;
      }
   public String getPassword(){
         return password;
   }
   //mutator methods
   public void updateFirst(String first){
      firstName = first;
   }
   public void updateLast(String last){
      lastName = last;
   }
   public void updateAge(int a){
      age = a;
   }
   public void setPassword(){
      String p;
      char character;
      int numChar;
      boolean capCheck = false;
      boolean numCheck = false;
      boolean lengthCheck = false;
      boolean passed = false;
      Scanner input = new Scanner(System.in);
      while(numCheck == false && capCheck == false && lengthCheck == false){
      System.out.print("Enter your desired password: ");
      p = input.nextLine();
      if(p.length() >= 8){//testing for 8 or more characters
         //System.out.println("CHECK! CHARACTERS > 8");
         lengthCheck = true;
         for(int times = 0; times <= p.length()-1; times++){
            character = p.charAt(times);
            numChar = (int) character;
            if(numChar >= 65 && numChar <= 90){
               capCheck = true;
               //System.out.println("CHECK! One Capital Letter!");
            }
            if(numChar >=48 && numChar <= 57){
               numCheck = true;
               //System.out.println("CHECK! One number!");
            }
         }
      }else{
         System.out.println("Hey! The password you just used does not match the criteria\nPlease have at least 8 characters.");
      }
      if(numCheck == true && capCheck == true){
         password = p;
         System.out.println("Thank you! We have recorded your password successfully!");
         passed = true;
      }else{
         if(numCheck == true && capCheck == false && lengthCheck == false){//if it is not long enough and does not contain a capital letter
         System.out.println("Hey! The password you just used does not match the criteria\nPlease use at least one capital letter and have at least 8 characters.");
         }
         if(numCheck == false && capCheck == true && lengthCheck == false){//does not contain a number
                  System.out.println("Hey! The password you just used does not match the criteria\nPlease use at least one number and have at least 8 characters.");
         }
         if(numCheck == false && capCheck == false && lengthCheck == true){// does not have a capital letter and a number
                  System.out.println("Hey! The password you just used does not match the criteria\nPlease use at least one capital letter and one number.");
         }
         if(numCheck == false && capCheck == true && lengthCheck == true){//does not contain a number
                  System.out.println("Hey! The password you just used does not match the criteria\nPlease use at least one number.");
         }
         if(numCheck == true && capCheck == false && lengthCheck == true){//no captial letters
                           System.out.println("Hey! The password you just used does not match the criteria\nPlease use at least one capital letter.");
         }
         if(numCheck == true && capCheck == true && lengthCheck == false){//not long enough
                           System.out.println("Hey! The password you just used does not match the criteria\nPlease have at least 8 characters.");
         }
      }
      }
   }
   //toString method 
   public void printInfo()
      {
         if(age>= 122){
            System.out.println("Your name is " + firstName + " " + lastName + " and you are dead.");
         }else{
            System.out.println("Your age is " + age + ". Your name is " + firstName + " " + lastName + ".");
         }
      }    
}