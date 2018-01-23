import java.io.* ;

public class EncodeDecode {
    public static void main( String args[] ) {

        InputStreamReader istream = new InputStreamReader(System.in) ;
        BufferedReader bufRead = new BufferedReader(istream) ;

        String doWhat = null;

        try {
            System.out.println("Please Enter 'E' for Encode, 'D' for Decode: ");
            doWhat = bufRead.readLine();
        }
        catch (IOException err) {
            System.out.println("Error reading line");
        }

        if (doWhat.equals("E")) {
            System.out.println("Enter line to Encode!");
        }
        else if (doWhat.equals("D")) {
            System.out.println("Enter line to Decode!");
        }
        else {
            System.out.println("Invalid Entry!");
        }

        System.exit( 0 ); //success
    }
}
