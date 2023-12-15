package customer_tablevalidation;

public class StringExample {

	public static void main(String[] args) {

//		String str = "Tendersoftware";
//		//String str1= "Tendersoftware";
//		
//		int len = str.length();
//		System.out.println(len);
//		//To convert the string to lower case
//		str=str.toLowerCase();
//		boolean isPresent = str.contains("tender");
//		System.out.println(isPresent);
//		
//		//Method 2:
//		
//		if(str.contains("tender") || str.contains("Tender"))
//		{
//			System.out.println("Is Present");
//			
//		}
//		else
//		{
//			System.out.println("Is not Present");
//		}
//		
//		// to convert string to array
//		
//		char[] cha = str.toCharArray();
//		System.out.println(cha[3]);
//		for (int i = 0; i < cha.length; i++) {
//			System.out.println(cha[i]);
//			
//		}
//		// to convert char to array
//		
//				char charAt = str.charAt(1);
//				System.out.println(charAt);
//				for (int i = 0; i < charAt; i++) {
//					System.out.println(cha[i]);
//					
//				}
				
		// To reverse the string
				
				String str2= "Tender software india pvt ltd";
				char[] charA = str2.toCharArray();
				for (int i= charA.length-1; i<=0; i--) {
					System.out.println(charA[i]);
					
				}
	}
}


