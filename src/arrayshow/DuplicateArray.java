package arrayshow;

public class DuplicateArray {
	public static void main(String[] args) {      
       
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,10, 10};   
          
        System.out.println("Duplicate elements are ");  
        //Searching the duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println (arr[j]);  
            }
        }
	}
}

