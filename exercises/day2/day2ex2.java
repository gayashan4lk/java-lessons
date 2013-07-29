class day2ex2{
	public static void main(String args[]){
		int x = 2 , b = 3, c = 2;

		System.out.println(x);

		x = b + c++;
		System.out.println(x );
		System.out.println(c );

		x = 2 ; b = 3;  c = 2;
		x = b + ++c;

		System.out.println(x);
		System.out.println(c);


	}
}