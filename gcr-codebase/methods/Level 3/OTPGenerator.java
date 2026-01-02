//Creating a class name with OTPGenerator.
import java.util.Scanner;
import java.util.Arrays;
public class OTPGenerator {
	public static int generateOTP() {
        		return (int) (Math.random() * 900000) + 100000;
    	}
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true; 
    }
	public static void main(String[] args) 
        	{	int[] otpStorage = new int[10];
        		for (int i = 0; i < otpStorage.length; i++) 
            	{	otpStorage[i] = generateOTP();
        		}

        		System.out.println("Generated OTPs: " + Arrays.toString(otpStorage));
        		if (areOTPsUnique(otpStorage)) 
           	{	System.out.println("Validation Success: All 10 OTPs are unique.");
        		} 
		else {
            		System.out.println("Validation Failed: Duplicate OTPs found.");
        		}
    	}
}