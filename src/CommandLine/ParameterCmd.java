package CommandLine;

import java.io.IOException;

public class ParameterCmd {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		int ch=System.in.read();

		System.out.println("Acii code of the ch "+ch);
		
		if(ch=='A'||ch=='a')
		{
			
			AddByCmd.main(args);
			
		}
		
		
		
	}

}
