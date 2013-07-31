

class ex7{
	public static void main(String args[]){

		double gpa = 2.0;
		double a = gpa/0.5 ;
		int b =  (int)a ;


		switch(b){

			case 8:
				System.out.println("1st classs");
				break;

			case 7:
				System.out.println("1st classs");
				break;

			case 6:
				System.out.println("1st classs");
				break;

		 	case 5:
				System.out.println("2nd upper classs");
				break;

			case 4:
				System.out.println("2nd lower classs");
				break;

			case 3:
				System.out.println("general class");
				break;

			case 2:
				System.out.println("general class");
				break;

		 	case 1:
				System.out.println("general class");
				break;

			case 0:
				System.out.println("general class");
				break;

			default:
				System.out.println("invalied !");
				break;
		}

	}
}