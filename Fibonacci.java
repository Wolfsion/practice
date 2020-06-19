package homework;

public class Fibonacci {
	
	private static int of(int index) {
		if(index == 1 || index == 2) {
			return 1;
		}
		else {
			int result = 1;
			int nums1 = 1;
			int nums2 = 1;
			for(int temp = index; temp >= 3; temp --) {
				result = nums1 + nums2;
				nums1 = nums2;
				nums2 = result;
			}
			return result;
		}
	}
	
	private static int ofRec(int index) {
		if(index == 1 || index == 2) {
			return 1;
		}
		else {
			return (ofRec(index - 2) + ofRec(index - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int temp = 1; temp < 20; temp++) {
			int res = Fibonacci.of(temp);
			if(res > 200) {
				break;
			}
			System.out.println("Fibonacci.of("+ temp + ") == " + res);
		}
	}
}
