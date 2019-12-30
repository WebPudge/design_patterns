package seventeen;

public abstract class Logger {
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;
    protected Logger next;
    public Logger setNext( Logger l)
    {
        next = l;
        return this;
    }

    public final void message( String msg, int priority )
    {
        if ( priority <= mask )
        {
            writeMessage( msg );
            if ( next != null )
            {
                next.message( msg, priority );
            }
        }
    }

    protected abstract void writeMessage( String msg );
}
