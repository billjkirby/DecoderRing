import java.io.* ;

public class EncodeDecode {
    public static void main( String[] args ) {
        
        InputStreamReader istream = new InputStreamReader(System.in) ;
        BufferedReader bufRead = new BufferedReader(istream) ;
        
        try {
            System.out.println("Please Enter 'E' for Encode, 'D' for Decode: ");
            String doWhat = bufRead.readLine();
        }
        catch (IOException err) {
            System.out.println("Error reading line");
        }
        
        switch (doWhat) {
            case 'E':  doWhatString = "Encode";
                       break;
            case 'D':  doWhatString = "Decode";
                       break;
        }
        
        System.out.println( "You want to " + doWhatString + "!" );
        System.exit( 0 ); //success
    }
}
