import java.util.Random;

public class ans1 {
	static int[] randomArray(int len, int max) {
		Random rand = new Random();
		int ary[]= new int[len];
		for (int i=0;i<len;i++) {
			ary[i]=rand.nextInt(max);
			// System.out.println(ary[i]);
		};
		return ary;
	}

	static void print(int[] ary) {
		for (int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
	}

	static int arrSum(int[] ary) {
		int sum=0;
		for (int i=0;i<ary.length;i++) {
			sum+=ary[i];
		}
		return sum;
	}

	static int contains(int[] ary, int x) {
		for (int i=0;i<ary.length;i++) {
			if (ary[i]==x) {
				return i;
			}
		}
		return -1;
	}

	static boolean contains2(int[] ary, int x) {
		for (int i=0;i<ary.length;i++) {
			if (ary[i]==x) {
				return true;
			}
		}
		return false;
	}

	static int countMultiplesOf(int[] ary, int x) {
		int mulSum=0;
		for (int i=0;i<ary.length;i++) {
			if (ary[i]%x==0 || x%ary[i]==0) {
				mulSum+=ary[i];
			}
		}
		return mulSum;
	}	
	public static void main(String[] args) {
		int testArr[] = randomArray(100, 21);
		print(testArr);
		System.out.printf("average of the array elements = %d",arrSum(testArr));
		
		boolean testBool = contains(testArr, 12);
		System.out.print("12 is in testArr: ");
		System.out.print(testBool);
		
		System.out.printf("12 = testArr[%d]",contains2(testArr,12));

		System.out.print(countMultiplesOf(testArr,7));
	}
}