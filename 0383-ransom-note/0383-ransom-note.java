class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int n1 = ransomNote.length(), n2 = magazine.length();
        for(int i=0; i<n1; i++){
            char ch = ransomNote.charAt(i);
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<n2; i++){
            char ch = magazine.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for(char key : hm1.keySet()){
            if(hm1.containsKey(key) && hm2.containsKey(key)){
                if(hm1.get(key) <= hm2.get(key)){
                    count++;
                }
            }
        }
        System.out.println(count+" "+hm1.size()+" "+hm2.size());
        if(count == hm1.size()){
            return true;
        }
        return false;
    }
}