
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int val = n;
        int row;
        int col;
	    for(row = 1; row <= n; row++)
	    {
            
	        for(col = val; col >= 1; col--)
	        {
	            System.out.print(col);
	        }
	        val--;
	        System.out.println();
	    }
	}
}