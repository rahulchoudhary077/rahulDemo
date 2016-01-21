package CommandLine;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		switch(args.length)
		{
		
		case 0 : 
		System.out.println("usage : java helloo ");
		break;
		case 1:
			System.out.println(args[0]);
			break;
		 default:
			 for(int i=0;i<args.length;i++)
			 {
			System.out.println(args[i]);
			 }
		
		}

	}

}
