class stringdemo{
public static void main(String args[]){

	String s = "santhosh";
	s= s.concat("kumar");
	System.out.println(s.toUpperCase());
//using newkeyword
	String str2 = new String("hary");
	s= str2.concat("packin");
 System.out.println(s.toLowerCase());

String str3 = "calculator";
String str4 ="";
String str5 = "welcome home";
System.out.println(s.length());
System.out.println(str5.trim());
System.out.println(str4.isEmpty());
char result = str4.charAt(0);
System.out.println(s.compareTo(str2));
System.out.println(s.equals(str2));
System.out.println(s.indexOf("packin"));
System.out.println(s.contains(str2));
System.out.println(str3.replace('r','o'));
System.out.println(str3.startsWith("ca"));
System.out.println(str5.endsWith("me"));
System.out.println(str5.hashCode());
//using buffer
StringBuffer sb= new StringBuffer("iprimed");
sb.append("education training");
System.out.println("sb");
//using bulider
StringBuilder sbu = new StringBuilder("hello");
sbu.append("iprimed");
System.out.println("sbu");


}
}