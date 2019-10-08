class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] counter = new int[2001];
        for(int i:arr){
            counter[i+1000] ++;
        }
        
        Set<Integer> countSet = new HashSet<>();
        for(int i:counter){
            if(i != 0){
                if(countSet.contains(i)){
                    return false;
                }else{
                    countSet.add(i);
                }
            }
        }
        return true;
    }
}