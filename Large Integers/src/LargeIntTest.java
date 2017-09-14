/**
 * <p>This project test the Large Integer class</p> 
 * Sep 14, 2017
 * @author Patrick Riley
 */

/**
 * @author rileyp
 *
 */
public class LargeIntTest {
	
	public static void main(String[] args) {
		
		int[] n1 = new int[] {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3};
		int[] n2 = new int[] {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3};
		
		int [] result = LargeIntegers.add(n1, n2);
		System.out.println(result);
		
	}
}
