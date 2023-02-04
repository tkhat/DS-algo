package heightChecker;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int[] expected = sorter(heights);
        int counter = 0;
        for(int i =0; i< heights.length; i++){
            if(expected[i] != heights[i]){
                counter++;
            }
        }
        return counter;

    }

    public int[] sorter(int[] expected){
        for(int i =0; i < expected.length; i++){
            for(int j = 0; j < expected.length; j++){
                if(expected[j] > expected[i]){
                    int local = expected[j];
                    expected[j] = expected[i];
                    expected[i] = local;
                }
            }
        }
        return expected;
    }
}
