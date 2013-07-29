class day2{
	public static void main(String args[]){
		byte b = -128 ;
		int i = 1234442;
		long l = 24332434;
		short s = 2424;

		String my_name = "code master";

		boolean boolt = true;
		boolean boolf = false;

		char c = 163;
		char c2 = 'A';

		float f = 34443.3434f;
		float f2 = 23424.32453F;
		float f3 = (float)23424.2342;
		double d1 = 09240.2424;
		double d2 = 4244;
		double d3 = 2323.323d;
		double d4 = 232.223D;
		//boolean boolnone = True;

		System.out.println("im\tgayashan");

		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		System.out.println(s);
		System.out.println(my_name);
		System.out.println(boolt);
		System.out.println(boolf);
		System.out.println(c);
		System.out.println(c2);
		System.out.println("************ Floating points(float) ************ \n" + f);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println("************ Floating points(double) ************ \n" +d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		//System.out.println(boolnone);

		System.out.println("this is representation a charachter escape " + '\"' + l + '\"' );
		System.out.println("this is representation a new line " + '\n' + '\"' + l + '\"' );
		System.out.println("this is representation a tab " + "        " + '\"' + l + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0001' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0002' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0003' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0004' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0006' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0007' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0008' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0009' + '\"' );
		System.out.println("this is representation a unicode character " +'\"' + '\u0010' + '\"' +'\n' );

		System.out.println("MY" +'\t' + "SRILANKA" + '\n' + "MY"+'\t' + "FUSION" );



/* HOME WORK  ==================================================================================
	
	  
	write a progamme to dispay all unicode characters with it's unicode value.
	HINT :  use for loop  

	find the ASCII and UNICODE character tables 	
 ============================================================================================= */

//   =================================   OPERATORS	=========================================	

 //   ================================= ARITHMATIC  OPERATORS	=======
 	int x = 0 , y=5;
 	x += 3;
 	y *= x;

 	System.out.println(" x " + x );
 	System.out.println(" y " + y  );
 	System.out.println('\n' );

 	String nophrase = "123";
 	nophrase += "45";
 	nophrase += 67 ; 

 	System.out.println(nophrase);

 	int myx = 10;
 	myx *=2+5 ;
 	System.out.println(myx );

 	myx = 10;
 	myx = myx  * 2 + 5 ;
 	System.out.println(myx);

 	myx = 10;
 	myx = (myx*2) +5;
 	System.out.println(myx );

 	myx = 10;
 	myx = myx*(2+5);
 	System.out.println(myx );

//*********** example 2 ******

 /*	int i2 = 125 ;
 	byte b2 = 10 ;
 	b = b + i;
 	System.out.println(" not compound   " + b2);	*/
 

//*********** example 2 ******
	int i3 = 125 ;
 	byte b3 = 4 ;  
 	b3 +=  i3 ;
 	System.out.println("compound  " + b3);


 }
}
