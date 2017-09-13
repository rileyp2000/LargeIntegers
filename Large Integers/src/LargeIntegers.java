/**
 * <p>This program will add to large integers that are represented as arrays</p>
 * @author Patrick Riley
 */

/**
 * @author Patrick
 *	
 */
public class LargeIntegers{
	private static final int N = 30;

	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return int[] of result of a+b
	 */
	public static int[] add(int[] a, int[] b){
		int[] result = new int[30];
		int carry = 0;
		
		for(int i = N-1; i >=0; i++){
			if(a[i] + b[i] + carry < 10){
				result[i] = a[i] + b[i] + carry;
				carry = 0;
			}
			else {
				result[i] = (a[i] + b[i] + carry)-10;
				carry = 1;
			}
		}
		return result;
	}


}
