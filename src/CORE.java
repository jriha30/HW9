import java.io.PrintStream;
import java.util.ArrayList;

public class CORE
{
    private static ArrayList<PrintStream> theClientStreams = new ArrayList<PrintStream>();

    public static synchronized void addClientThreadPrintStream(PrintStream ps)
    {
        System.out.println("adding client thread");
        CORE.theClientStreams.add(ps);
        System.out.println("Number of connected clients: " + theClientStreams.size());
    }
    public static synchronized void removeClientThreadPrintStream(PrintStream ps)
    {
        System.out.println("removing client thread");
        CORE.theClientStreams.remove(ps);
        System.out.println("Number of connected clients: " + theClientStreams.size());
    }

    public static void broadcastMessage(String message)
    {
        System.out.println("About to broadcast....");
        for (PrintStream ps : CORE.theClientStreams)
        {
            ps.println(message);
        }
    }
}