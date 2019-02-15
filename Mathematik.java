public class Mathematik {

	static long a=14;
	static long b=19;

	public static void main(String args[])
	{
		a = fakultaet(a);
		System.out.printf("%20d\n",a);
		b = fakultaet(b);
		System.out.printf("%20d\n",b);
		System.out.printf("%20d\n",(a+b));
	}


	public static long fakultaet(long x) {
		x = x*rekursiv(x);
		return x;
	}


	public static long rekursiv(long a)
	{
		a=a-1;
		if (a<=1)
		{
			return 1;
		}
		else
		{
			a = a*rekursiv(a);
			return a;
		}

	}
}
