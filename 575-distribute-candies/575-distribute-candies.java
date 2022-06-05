class Solution {
    public int distributeCandies(int[] candyType) {
        int candies = candyType.length / 2;
        int currentType = candyType[0];
        HashSet<Integer> types = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            types.add(candyType[i]);
            if (types.size() > candies)
                return candies;
        }
        return types.size();
    }
}