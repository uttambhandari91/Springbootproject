package arrayshow;

public class RemovingDuplicates {   
		   public static void main(String[] args) {  
			   int[] a = {1,4,4,6,8,11,14};
			   int[] temp = new int [a.length];
			   int j =0;
			   for (int i=0; i<a.length-1; i++)
			   {
				   if(a[i]!=a[i+1])
				   {
					   temp[i]=a[i];
					   j++;
				   }
			   
			   }
			   temp[j]=a[a.length -1];
			   for (int i=0; i<temp.length;i++)
			   {
				   System.out.println(temp[i]+"");
			   }
			   
		         
		   }
}
