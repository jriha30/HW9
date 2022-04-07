import java.net.*;
import java.util.ArrayList;

public class Server
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket s = new ServerSocket(2222);
        ArrayList<ChatWorkerThread> theThreads = new ArrayList<ChatWorkerThread>();
        while(true)
        {
            System.out.println("Listening for Connection...");
            Socket client = s.accept(); //blocks
            ChatWorkerThread t = new ChatWorkerThread(client);
            theThreads.add(t);
            t.start();
        }
    }
}