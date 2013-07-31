class ex4{
	public static void main(String args[]){

		char letter = 'A';

		if ((letter <= 'f' &&  letter >= 'a') || (letter <= 'F' &&  letter >= 'A') ){
			System.out.println("male");
		}
		
		else if((letter <= 'z' && letter >= 'g') || (letter <= 'Z' && letter >= 'G') ){
			System.out.println("female");
		}
		

	}
}