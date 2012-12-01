class ex1{
    public static void main(String args[]){
        String[]name1={"Osadha","sanjeewa","Kaushika","rani","Shanaka"};
        String[]name2=new String[5];
        int k=0;
        for(int i=0;i<=4;i++){
            if(i%2==0){
                name2[k]=name1[i];
                k++;
            }
        }
        name2[k]="Vimukthi";++k;
        name2[k]="Buddhi";
        for(int i=0;i<name2.length;i++)
            System.out.print(name2[i]);
    }
}