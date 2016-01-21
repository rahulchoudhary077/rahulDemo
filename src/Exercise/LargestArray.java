package Exercise;

public class LargestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int a[]={20,32,12,54,254,55,232,2,8,10};
		n=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(n<a[i])
			{
				n=a[i];			
			}	
		}
		System.out.println(n);
	}

}
