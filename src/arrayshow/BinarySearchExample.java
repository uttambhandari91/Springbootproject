package arrayshow;  
public class BinarySearchExample {
	public static void main(String[] args) {
		int [] a = {2,3,8,10,16,19,50,55,62,78,79};  
	     int search = 78; 
	     int li = 0;
	     int hi = a.length-1;
	     int mi = (li + hi) / 2 ;
	     while (li<= hi)
	     {
	     if (a[mi]== search) 
	     {
	    	 System.out.println("element is at "+mi+" index position");
	    	 break;
	     }
	     else if(a[mi]<search)
	     {
	    	 li = mi+1;
	     }
	     else
	     {
	    	 hi = mi-1;
	}  
	     mi=(li+hi)/2;
	     }
	     if (li>hi)
	     {
	    	 System.out.print("element not found");
	     }
	    	 
	     }
	}
	 

