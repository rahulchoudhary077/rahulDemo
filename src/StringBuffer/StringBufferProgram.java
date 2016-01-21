package StringBuffer;

public class StringBufferProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer b=new StringBuffer("rahul");
		
		System.out.println(b.capacity());
		b.append("choudhary");
		System.out.println("after string is append "+b.capacity());

		
		System.out.println("Strin0g buffer demo ="+b.codePointAt(1));
		System.out.println(b.codePointCount(0, 14));
		
	}

}
