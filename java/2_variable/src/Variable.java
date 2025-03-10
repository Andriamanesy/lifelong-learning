public class Variable
{
	public static void main(String argc[])
	{
		System.out.println("------------Tout les types de variable---------------");
		System.out.println("Variable type byte: ");
		byte a;
		a = 10;
		System.out.println("La variable de type byte est égale: "+a +"\n");
		
		System.out.println("Variable type short: ");
		short b ;
		b = 20;
		System.out.println("La variable short est égale: "+b +"\n");

		System.out.println("Variable type int: ");
		int c ;
		c = 20;
		System.out.println("La variable int est égale: "+c +"\n");
		
		System.out.println("Variable type float: ");
		float d ;
		d = 3.14f;
		System.out.println("La variable float est égale: "+d +"\n");

		System.out.println("Variable type double: ");
		double e ;
		e = 20.85600000225;
		System.out.println("La variable double est égale: "+e +"\n");

		System.out.println("Variable type char (caractere): ");
		char f;
		f = 'A';
		System.out.println("La variable char est égale: "+f +"\n");

		System.out.println("Variable type boolean: ");
		boolean g;
		g = true;
		System.out.println("La variable boolean est égale: "+g +"\n");

		System.out.println("Variable type String: ");
		String h = new String();
		h = "Bonjour Brian, ceci est une variable de type String\n";
		System.out.println(h);

	}
}
