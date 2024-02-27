import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Base64Project {
	
	
	public static void main(String[] args) {
		
	// decoding the Base64
	try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
        System.out.println("Enter The base64 text to be translated back to normal charachters:");
        String input = reader.readLine();
        
        // Decoding the Base64 String into a byte array
        byte[] decodedBytes = Base64.getDecoder().decode(input);
        
		// Converting bytes back to string 
        String decodedString = new String(decodedBytes);
		
        
        // printing the decoded result 
        System.out.println("Your decoded Base64 text is: "  + decodedString);
        
        
        // Converting a normal text to Base64 String or text
        System.out.println("Enter some text:");
        String inputString = reader.readLine();
        
        // Converting the string From Buffered reader to bytes
        byte[] inputBytes = inputString.getBytes();
        
        //Converting the inputBytes into Base64 encoding
        String encodedString = Base64.getEncoder().encodeToString(inputBytes);
        System.out.println("You entered: " + encodedString);
        
	} catch (IOException e1) {
		e1.printStackTrace();
	}

    
   
	
}
}
