package anudipjava;


public class Reverse {

	public static void main(String[] args) {
		
		int[] a= {1,3,5,7,9};
		
		int i,j;
	//temp is used to store temperory value
		int temp=a[a.length-1];
		for(i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
			
					
		
		}
		a[0]=temp;
		
		for(i=0;i<=a.length-1;i++)
			
		System.out.print((a[i]));
		
		}
}
		
