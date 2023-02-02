public class  ABCDEF{
public static void main(String[]args){
int a=1;
for(int row=1;row<=5;row++){
for(int len=1;len<=row;len++){
System.out.print(" "+(char)(a+64));
a++;
}
System.out.println();
}
}
}
