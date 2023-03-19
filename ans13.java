import java.util.Random;

public class ans13 {
	static int[] buildHistogram(int[] scores) {
        int max=scores[0];
        for (int i=1;i<scores.length;i++) {
            if (scores[i]>max) {
                max=scores[i];
            }
        }
        int[] hist=new int[max+1];

        // for (int i=0;i<scores.length;i++) {
        //     for (int j=i+1;j<scores.length;j++) {
        //         if (scores[i]==scores[j]) {
        //             System.out.printf("i = %d\n",i);
        //             System.out.printf("j = %d\n",j);
        //             System.out.println("debug");
                    
        //             hist[scores[i]]+=1;
        //         }
        //     }
        // }

        for (int i=0;i<hist.length;i++) {
            for (int j=0;j<scores.length;j++) {
                if (i==scores[j]) {
                    hist[i]+=1;
                }
            }
        }
		
		return hist;
	}	

    static void printHistogram(int[] histogram) {
        // System.out.print("+");
        for (int i=0;i<histogram.length;i++) {
            System.out.print("---+");
        }
        System.out.println();

        for (int i=0;i<histogram.length;i++) {
            System.out.printf(" %d |",histogram[i]);
        }
        System.out.println();

        for (int i=0;i<histogram.length;i++) {
            System.out.print("---+");
        }
        System.out.println();

        for (int i=0;i<histogram.length;i++) {
            System.out.printf(" %d |",i);
        }
        System.out.println();
        System.out.println();
        System.out.println();



        for (int i=0;i<histogram.length;i++) {
            System.out.printf("%d: %d: ",i,histogram[i]);
            for (int j=0;j<histogram[i];j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
        int[] inputList={1,1,3,4,1,1,1};
		int[] histogram = buildHistogram(inputList);
        printHistogram(histogram);
	}
}