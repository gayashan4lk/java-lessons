class ex3{
	public static void main(String args[]){

		String phrase = "abc";
		if(phrase == "abc" ){
			System.out.println("hi");
		}
		else 
			System.out.println("bye");

		System.out.println("=============================================================");

		double gpa = 2.42342d ;
		if(gpa >= 3.4 && gpa <= 4.0){
			System.out.println(" 1st class");
		}
		else if(gpa >= 2.9 && gpa <= 3.4){
			System.out.println(" 2nd upper class");
		}
		else if(gpa >= 2.4  && gpa <= 2.9){
			System.out.println(" 2nd lower class");
		}
		else if(gpa >= 0.0  && gpa <= 2.4){
			System.out.println("general class");
		}
		else 
			System.out.println("invalied gpa !");
	}
}