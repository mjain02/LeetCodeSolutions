class Solution {
    public int distributeCandies(int[] candyType) {
        int candies = candyType.length / 2;
        //int types = 1;
        int currentType = candyType[0];
        HashMap<Integer, Integer> types = new HashMap<>();
        for (int i = 0; i < candyType.length; i++) {
            types.put(candyType[i], i);
        }
        return types.size() <= candies? types.size() : candies;
    }
}