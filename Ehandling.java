import java.io.*;
import java.util.*;
class Nsolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        try{
        int x=sc.nextInt();
        int y=sc.nextInt();
            int k=x/y;
            System.out.println(k);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
                System.out.println(e);
                }finally{
            sc.close();
        }
    }
}