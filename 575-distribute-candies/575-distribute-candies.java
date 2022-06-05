class Solution {
    public int distributeCandies(int[] candyType) {
        int candies = candyType.length / 2;
        int currentType = candyType[0];
        HashMap<Integer, Integer> types = new HashMap<>();
        for (int i = 0; i < candyType.length; i++) {
            types.put(candyType[i], i);
            if (types.size() > candies)
                return candies;
        }
        return types.size();
    }
}