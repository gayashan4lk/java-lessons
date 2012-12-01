//MAIN CLASS THAT DISCRIBES COMPUTER
public class computer_demo{
    public static void main(String args[]){
        
        System.out.println("The compuer 1 was called..");
        computer mycomputer1 = new computer(5);
        
        mycomputer1.print_com_status();
        mycomputer1.print_add(10, 15, 20);
        
        System.out.println("\nThe compuer 2 was called..");
        computer mycomputer2 = new computer(0);
        
        mycomputer2.print_com_status(); 
        mycomputer2.current = 10;
        System.out.println("****user entered '10' for currrent..");
        mycomputer2.print_com_status(); 
        mycomputer2.print_add(15, 20, 30);
        mycomputer2.current = 0;
        
        
    }
}