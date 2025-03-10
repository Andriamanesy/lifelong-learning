public class Cast
{
	public static void main(String argc[])
	{
		int a = 100;
		float b = 2.5f;
		float tmp = 0;

		System.out.println("On va faire permitation de valeur de a type int et b type float, a= "+a+" b= "+b+"\n");
		tmp = (float)a;
		a = (int)b;
		b = tmp;
		System.out.println("Actuellement a= "+(float)a+" b= "+(int)b);
	}
}
