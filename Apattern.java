public class Apattern{
public static void main(String[]args){
for(int row=1;row<5;row++)
{
for(int col2=3;col2>=row;col2--)
{
System.out.print(" @");
}
for(int col1=1;col1<=row;col1++)
{
System.out.print(" *");
}
System.out.println( );


}
}
}

