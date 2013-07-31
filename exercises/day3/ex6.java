class ex6{
	public static void main(String args[]){

		double gpa = 3.8;
		int result = 0 ;


		if(gpa >= 3.4 && gpa <= 4.0){
			result = 1 ;
		}
		else if(gpa >= 2.9 && gpa <= 3.4){
			result = 2 ;
		}
		else if(gpa >= 2.4  && gpa <= 2.9){
			result = 3 ;
		}
		else if(gpa >= 0.0  && gpa <= 2.4){
			result = 4 ;
		}


		switch(result){
			case 1:
				System.out.println("1st classs");
				break;

		 	case 2:
				System.out.println("2nd upper classs");
				break;

			case 3:
				System.out.println("2nd lower classs");
				break;

			case 4:
				System.out.println("general class");
				break;
		 
			default:
				System.out.println("invalied !");
				break;
		}

	}
}