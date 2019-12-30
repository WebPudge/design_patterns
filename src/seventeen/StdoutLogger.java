package seventeen;

public class StdoutLogger extends Logger {

    public StdoutLogger( int mask ) { this.mask = mask; }

    @Override
    protected void writeMessage(String msg) {
        System.out.println( "Writting to stdout: " + msg );
    }
}
