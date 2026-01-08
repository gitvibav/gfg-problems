class Solution {
    public void sortIt(int[] arr) {
        List<Integer> al1 = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 1){
                al1.add(arr[i]);
            }
        }
        
        Collections.sort(al1,Collections.reverseOrder());
        
        List<Integer> al2 = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                al2.add(arr[i]);
            }
        }
        
        Collections.sort(al2);
        
        for(int i=0;i<al1.size();i++){
            arr[i] = al1.get(i);
        }
        
        int idx = al1.size();
        
        for(int i=0;i<al2.size();i++){
            arr[idx++] = al2.get(i);
        }
    
    }
}
