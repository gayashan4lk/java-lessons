class ex8{
	public static void main(String args[]){

		String name = "Nimal";
		float marks = 4.0f;
		char grade;
		
			if(marks >= 75){
				grade = 'a';

			}
			else if(marks >= 50){
				grade = 'b';
			}
			else if(marks >=25){
				grade = 'c';
			}
			else
				grade = 'f';

			System.out.println(grade);

			switch(grade){
				case 'a':
					System.out.println("You are exellent !");
					break;
				case 'b':
					System.out.println("You are good !");
					break;
				case 'c':
					System.out.println("You are ok. But you must improve !");
					break;
				default:
					System.out.println("You are bad . Now Work hard , then play hard !");
					break;


			}



	}
}