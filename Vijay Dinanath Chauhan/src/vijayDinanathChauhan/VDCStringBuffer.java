package vijayDinanathChauhan;

public class VDCStringBuffer {
		  public static void main(String[]args)
{
     StringBuffer sb= new StringBuffer("Vijay");
	 sb.append("Dinanath Chauhan");
		    	 
		    	 
		 		System.out.println(sb.length());
		 		System.out.println(sb.capacity());
		 		System.out.println(sb.charAt(1));
		 		System.out.println(sb.indexOf("Dinanath") );
		 		System.out.println(sb.replace(0, 5, "Jay") );
		 		System.out.println(sb.reverse() );



		     }
		     }