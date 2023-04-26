import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int score = scan.nextInt();
		try {
		    if (score < 0 || score > 100) {
		        throw new UnsupportedOperationException("Score not in range of 0-100");
		    }	
		    System.out.println("Score:" + score);
			}
			catch(InputMismatchException e){
		    	
		    	System.out.println("Invalid.");
		    }
		    catch (UnsupportedOperationException e) {
		    	System.out.println(e.getMessage());
		    }
		}
	}
