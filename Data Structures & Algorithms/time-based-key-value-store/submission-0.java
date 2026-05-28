class TimeMap {
    private static class Node {
        int timestamp;
        String value;

        Node(int timestamp, String value){
            this.timestamp = timestamp;
            this.value = value;
        }
    }
    
    private Map<String, List<Node>> store;
    public TimeMap() {
        store = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new ArrayList<>());
        store.get(key).add(new Node(timestamp, value));
        
    }
    
    public String get(String key, int timestamp) {
       if(!store.containsKey(key)) return "";

       List<Node> ans = store.get(key);

       return bs(ans, timestamp);
        
    }

    private String bs(List<Node> ans, int target){
        int left = 0, right = ans.size()-1;
        String res = "";
        while(left <= right){
            int mid = left + (right - left)/2;
            if(ans.get(mid).timestamp <= target){
                res = ans.get(mid).value;
                left = mid +1;
            }
            else {
                right = mid-1;
            }
        }
        return res;
    }
}
