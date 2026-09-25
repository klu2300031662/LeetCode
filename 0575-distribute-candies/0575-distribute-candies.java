class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<candyType.length; i++){
            hs.add(candyType[i]);
        }
        int doc = candyType.length / 2;
        if(hs.size() > doc){
            return doc;
        }
        return hs.size();
    }
}