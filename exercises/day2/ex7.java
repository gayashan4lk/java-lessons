class ex7{
	public static void main(String args[]){

		int a = 90;

		switch(a)
		case 90:
			System.out.println("A+");
			break;
		
		case 80:
			System.out.println("A");
			break;
		
		case 70:
			System.out.println("B+");
			break;
		
		case 60:
			System.out.println("B");
			break;
		
		case 50:
			System.out.println("C+");
			break;
		
		case 40:
			System.out.println("C");
			break;
		
		case 30:
			System.out.println("Fail");
			break;
		
		default:
			System.out.println("value invalid");
			break;
	}
}