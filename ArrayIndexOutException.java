public class ArrayIndexOutException {

	public static void main(String[] args) {
	
		int i;
		
		int a[]={12,23,34,56,78};
		
		try
		{	
		for(i=0;i<5;i++)
		{
			System.out.println(a[5]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
	        System.out.println("Warning: ArrayIndexOutOfBoundsException, cannot be >5");
	     }

	}

}