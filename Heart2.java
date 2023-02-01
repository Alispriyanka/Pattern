public class Heart2
{
public static void main(String[]args)
{
int n=7;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n;j++)
{
if((i==0&&j%3==0)||(i==5&&i+j!=8)||(i==3&&(j==0||j==6))||(i==4&&(j<2||j>4)))
System.out.print("  ");

else
System.out.print(" *");
}

System.out.println();
}
}
}
