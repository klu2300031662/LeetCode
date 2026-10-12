class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> str1 = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            str1.put(list1[i], i);
        }
        HashMap<String, Integer> str2 = new HashMap<>();
        for(int i=0; i<list2.length; i++){
            str2.put(list2[i], i);
        }
        int minIndex = Integer.MAX_VALUE;
        for(int i=0; i<list1.length; i++){
            if(str1.containsKey(list1[i]) && str2.containsKey(list1[i])){
                int sum = str1.get(list1[i]) + str2.get(list1[i]);
                if(sum < minIndex){
                    minIndex = sum;
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<list1.length; i++){
            if(str1.containsKey(list1[i]) && str2.containsKey(list1[i])){
                int sum = str1.get(list1[i]) + str2.get(list1[i]);
                if(sum == minIndex){
                    list.add(list1[i]);
                }
            }
        }
        String[] result = new String[list.size()];
        int i = 0;
        for(String temp : list){
            result[i++] = temp;
        }
        return result;



    }
}