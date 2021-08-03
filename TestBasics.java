import java.util.Arrays;

public class TestBasics {
    public static void main(String[] args){
        Basics test = new Basics();
        test.printNums();
        test.printOddNums();
        test.sumTo255();
        int[] numArr = {5,4,3,2,1};
        test.iteratingThruAnArray(numArr);
        test.findMax(numArr);
        test.arrayWithOddNums();
        test.getAverage(numArr);
        test.greaterThanY(numArr,3);
        int[] testNums = {1, 5, 10, -2};
        test.squareTheValues(testNums);
        int[] results = test.eliminateNegativeNums(testNums);
        System.out.println(Arrays.toString(results));

        double[] results2= test.maxMinAvg(testNums);
        System.out.println(Arrays.toString(results2));

        int[] results3 = test.shifter(testNums);
        System.out.println(Arrays.toString(results));
    }
}