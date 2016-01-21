package CoreString;

public class DemoStringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="       Rahul choudhary -s/o -Kailashchandra-Choudhary     ";
		
		String delimeter="-";
		System.out.println("Length of the String name ="+name.length());
		System.out.println("print last name ="+name.substring(6));
		System.out.println("print without space or omitted  ="+name.trim());
		
		System.out.println("replace is ="+name.replace('a', 'R'));
		System.out.println("replaceall  is ="+name.replaceAll("rahul", "choudhary"));
		System.out.println("upar case print string ="+name.toUpperCase());
		System.out.println("char array print "+name.charAt(7));
		System.out.println("search the stirng in given string "+name.contains("rahul"));
		
		String a[]=name.split(delimeter);
		String b[]=name.split(delimeter, 0);
		for(int i=0;i<b.length;i++)
		{
			
		System.out.println(b[i]);
			
		}

	}

}
