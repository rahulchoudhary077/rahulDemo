package Exercise;

public class ArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]={10,20,30,55,32,65};
		int n=32;
	int c=	Search(a, n);
	
	System.out.println("search element is =="+c);
	}
	
	
	public static int  Search(int a[],int n)
	{
		
 		for(int i=0;i<a.length;i++)
		{
			
			if(n==a[i])
			{
				return i;
				
			}
			
		}
		return -1;
}}