import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TestClass
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String s;
        while(true)
        {
            s = sc.nextLine();
            if(s.equals("/quit"))
            {
                return;
            }
            System.out.println(s);
        }
    }
}