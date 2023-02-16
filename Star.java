public class Star{
 public static void main(String[]args){
  int row=5,length=1,i,j;
  for(i=0;i<row;i++){
  for(j=0;j<i;j++){
    if(i==j){
System.out.print(" ");
      }
System.out.print(length++ +" ");
    }
System.out.println();
  }
 }
}
