package stringclass;

public class stringMETHODS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a=new String("people");
String b=new String("public");
String c="crowd";
String d="RIOTS";
if(a.equals(b))
{
System.out.println("both are same");	
}
else
{
	System.out.println("both are not same");
}
System.out.println(a.substring(1,4));
System.out.println(c.toUpperCase());
System.out.println(d.toLowerCase());
System.out.println(d.charAt(1));
System.out.println(b.length());
System.out.println(c.concat(a));
	}

}
