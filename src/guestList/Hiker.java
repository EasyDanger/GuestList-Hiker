package guestList;

public class Hiker {

    public static String add(String number) {
 
 //   String sub = number.substring(0, 1);
 //   int a = Integer.parseInt(sub);
  //  System.out.println("STRING");
 //   System.out.println(a);
 //   sub = number.substring(2);
 //   int b = Integer.parseInt(sub);
 //   System.out.println(b);
 //   int sum = a + b;
  //  System.out.println(sum);

 //  number = Integer.toString(sum);
  int sum = 0;
  
    String[] parts = number.split(",");
    
   for (int i = 0; i < parts.length; i++) {
   int a = Integer.parseInt(parts[i]);
   sum += a;
   }
   
   number = Integer.toString(sum);
   return number;
    }
}
