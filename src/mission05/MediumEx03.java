package mission05;

public class MediumEx03 {
    public static void main(String[] args) {

       for(int i = 1; i<=5; i++){
           for(int j=1; j<=5; j++){
               if(j*i<10) {
                   System.out.print("  ");
               }else{
                   System.out.print(" ");
               }
               System.out.print(j*i);
           }

           System.out.println("");
       }
    }
}
