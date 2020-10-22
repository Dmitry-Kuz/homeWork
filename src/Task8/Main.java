package Task8;

public class Main {

    public static void main (String[] args){

       int a = 2000;
       int b = 0;

       if (a % 4 == 0){
           b = 1;
       }if(a % 100 == 0) {
           b = 0;
       }if(a  % 400 == 0){
           b = 1;
       }if(b == 1){
           System.out.println("Высокосный");
       }else{
           System.out.println("Не высокосный");
        }

    }

}
