package stringClass;

public class StringClassMethod 
{
	public static void main(String[] args) {
		String s1 = " Java Developers";
		String s2 = "Pinspire Academy";
		String s3 = "pinspire academy";
		String s4 = "PINSPIRE Institute";
		String s5 = "Java";
		String s6 = new String ("Pinspire");
		String s7 = "";
		
		System.out.println(s1.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s7.isBlank());
		System.out.println(s1.length());
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.startsWith("Mavan"));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.concat(" is totally Smart Developers"));
		System.out.println(s2.concat(s1));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.charAt(8));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 10));
		System.out.println(s2.equals(s3));// False
		System.out.println(s2.equalsIgnoreCase(s3));// True
		System.out.println(s2==s3);// False
		System.out.println(s2==s6);// False
		System.out.println(s2.equals(s6));// False
		System.out.println(s1.replaceAll("Java", "Mavan"));
		System.out.println(s1.trim());
	}


}
