import java.io.FileWriter;
public class Hpatten
 {
public static void main(String[]args)
  {
try
{
FileWriter file=new FileWriter("/home/alis/java/Pattern");
file.write(" ");
file.flush();
file.close();
System.out.println("Successfully written");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
