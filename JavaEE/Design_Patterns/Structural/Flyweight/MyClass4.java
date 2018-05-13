public class MyClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character a=Character.valueOf('A');
		Character b=Character.valueOf('A');
		if(a==b)
		{
			System.out.println("a and b are ==");
		}
		else
		{
			System.out.println("a and b are not ==");
		}

		if(a.equals(b))
		{
			System.out.println("a and b are equals");
		}
		else
		{
			System.out.println("a and b are not equals");
		}
		
System.out.println("Now Using value outside the range");
		Character c=Character.valueOf((char)128);
		Character d=Character.valueOf((char)128);
		if(c==d)
		{
			System.out.println("c and d are ==");
		}
		else
		{
			System.out.println("c and d are not ==");
		}

		if(c.equals(d))
		{
			System.out.println("c and d are equals");
		}
		else
		{
			System.out.println("c and d are not equals");
		}

	}

}
