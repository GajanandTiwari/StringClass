package stringclass;

public class stringBUFFER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a = new StringBuffer("military");
StringBuffer b=new StringBuffer("Sodiers");
System.out.println(b);
b.insert(2,"l");
System.out.println(b);
System.out.println(a.append(b));
System.out.println(a);

	}

}
