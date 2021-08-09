public class Runner
{
   public static void main(String[] args)
   {
      Person ada = new Person(208,"Ada","Lovelace");
      //testing getter methods
      ada.printInfo();
      ada.setPassword();
      System.out.println(ada.getFirstName());
      System.out.println(ada.getLastName());
      System.out.println(ada.getAge());
      System.out.println(ada.getPassword());
      //testing modifier methods
      ada.updateAge(21);
      ada.updateFirst("John");
      ada.updateLast("Doe");
      ada.printInfo();
      
   }
}