package arrayshow;
import java.util.Arrays;

public class ArrayStringSorting {

   public static void main(String[] args)
   {
      String[] array = {"Prabhat", "Nagendra", "Uttam", "Bhandari","India", "Profile"};
      int size = array.length;
      for(int a = 0; a < size - 1; a++)
      {
         for(int b = a + 1; b < array.length; b++)
         {
            if(array[a].compareTo(array[b]) > 0)
            {
               String temp = array [a];
               array [a] = array [b];
               array [b] = temp;
            }
         }
      }
      System.out.println(Arrays.toString(array));
   }
}

