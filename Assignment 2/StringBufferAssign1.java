package classworkdayfive;

public class StringBufferAssign1 {
	public static void main(String[]args) {
//		Question 1
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		System.out.println("*********************");
		
//		Question 2
//		1)
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		
//		2)
		System.out.println(hannah.charAt(12));
		
//		3)
		System.out.println(hannah.charAt(15));
		System.out.println("*********************");
		
//		Question3
		String st = new String("Was it a car or a cat I saw?");
		StringBuffer sb1 = new StringBuffer("Was it a car or a cat I saw?");
		String result1 = st.substring(9,12);
		System.out.println(result1);
		System.out.println("*********************");
		
//		Question4
		String original = "software";

		StringBuffer result = new StringBuffer("hi");

		int index = original.indexOf('a');

		/*1*/ result.setCharAt(0, original.charAt(0));
		System.out.println(result);

		/*2*/ result.setCharAt(1, original.charAt(original.length()-1));
		System.out.println(result);

		/*3*/ result.insert(1, original.charAt(4));
		System.out.println(result);

		/*4*/ result.append(original.substring(1,4));
		System.out.println(result);

		/*5*/ result.insert(3, (original.substring(index, index+2) + " "));
		System.out.println(result);

		System.out.println(result);
		System.out.println("*********************");
		
//		Exercises
//		1)
		String s = "Hi, ";
		String s1 = "mom.";
		s = s.concat(s1);
		System.out.println(s);
		System.out.println("*********************");

//		2)
//		String name = "Sai anantha Lakshmi";
//		System.out.println(name.charAt(0)+" "+name.charAt(4)+" "+name.charAt(12));
		
		
		String Name = "Sai Anantha Lakshmi";
		String[] names = Name.split(" ");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i].charAt(0));
			
		}
		
		}

		


	}

