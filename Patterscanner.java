import java.util.*;
public class Patterscanner{
  public static void main(String[]args){
    int row;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter row: ");
     row=sc.nextInt();
    for(int i=1;i<=row;i++){
     for(int j=1;j<i;j++){
      System.out.print(i +" ");

      }
           
      System.out.println();
    }
  }
}
