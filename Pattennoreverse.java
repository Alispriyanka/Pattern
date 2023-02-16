public class Pattennoreverse{
   public static void main(String[]args){
   int n=4,m=8;
  for(int i=n;i>=1;i--){
   for(int j=1;j<=n;j++){
   
   System.out.print(" ");
}

   for(int k=1;k<=i;k++){
     System.out.print(" "+m);
   }
   m=m-2;
   System.out.println(" ");
     

     } 
  }
}
