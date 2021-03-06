package pk.ciit.sc.final1.calculator;

public class Calculator {
	
	
	
	/**
	 * This method return the max value
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return max
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	
	
	/**
	 * this method return the square of number
	 * @param num
	 * @return result
	 * @throws IllegalArgumentException
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
	
	/**
	 * @author Haris
	 *
	 */
	
	/**
	 * this method return the cube of number
	 * @param num
	 * @return result
	 * @throws IllegalArgumentException
	 */
	
	
	public int cube(int num)throws IllegalArgumentException {
		int result = 0;
		if(num > 0 && num < 10){
			result = num * num * num;
		} else
			throw new IllegalArgumentException();
		return result;
			
		
	}

}

