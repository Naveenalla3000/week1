import java.util.Scanner;
public class harshitha{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Topic : ");
       char ch = scr.next().charAt(0);
       if(ch=='a'||ch=='b'||ch=='c'){
           System.out.println("Yes!");
       }
       else{
           System.out.println("No!");
       }
        
    }
}
