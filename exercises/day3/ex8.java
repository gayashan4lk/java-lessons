class ex8{
	public static void main(String args[]){

	/*for(int i=1000 ; i >= 1; i-- ){
		System.out.println(i);
	}*/

	/*for(int i = 0; i < 10; i++  ){

		String s = "";

		for(int j = 0; j < 5 ; j++ ){
			s = s + "*";
		}
		System.out.println(s);	
		*/
		
		/*	String s = "";

			for(int j = 0; j < 5 ; j++ ){
				s = s + "*";
				System.out.println(s);
			}

			*/
			
			for(int i = 5 ; i >= 0; i-- ){

				for(int j = 1 ; j <=i  ; j++){
					System.out.print(" ");
				}
				for(int h = 5 ; h >= i; h--){
					System.out.print("*");
				}
				for(int k = 1 ; k > i; k--){
					System.out.print("*");
				}
				for(int l = 5 ; l > i; l--){
					System.out.print("*");
				}
				//second half
			
				System.out.println();
			}	

			for(int i = 5 ; i >= 0; i-- ){

				for(int l = 5 ; l > i; l--){
					System.out.print("*");
				}
				for(int k = 1 ; k > i; k--){
					System.out.print("*");
				}
				for(int h = 5 ; h >= i; h--){
					System.out.print("*");
				}
				for(int j = 1 ; j <=i  ; j++){
					System.out.print(" ");
				}
				//second half
			
				System.out.println();
			}	
		
		

	}
}