package bublesort;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Hello, Mac");
		
		int temp;
		
		int a[] = {7,6,5,4,3,2,1};
		
		for(int i = 0; i<7; i++)
		{ 
			for(int j=0; j<7-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
							
							
				}
			}
				
		}
		
	 for(int n =0; n<7; n++)
	 {
		 System.out.println(a[n]);
	 }
	

	}

}
