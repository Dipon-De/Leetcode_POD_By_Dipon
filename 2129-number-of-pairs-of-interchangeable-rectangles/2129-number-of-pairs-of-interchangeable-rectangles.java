class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> freq = new HashMap<>();
        
        // Step 1: store ratio counts
        for (int i = 0; i < rectangles.length; i++) {
            double r = (double) rectangles[i][0] / rectangles[i][1];
            freq.put(r, freq.getOrDefault(r, 0L) + 1);
        }

        // Step 2: count pairs
        long result = 0;
        for (long count : freq.values()) {
            result += (count * (count - 1)) / 2;
        }
        
        return result;
    }
}