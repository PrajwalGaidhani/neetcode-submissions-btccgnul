class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = s.length();

        // Step 1: store last occurrence of each character
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), i);
        }

        // Step 2: partitioning
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = Math.max(end, map.get(s.charAt(i))); // expand partition
            
            if (i == end) { // partition ends
                ans.add(end - start + 1);
                start = i + 1; // move to next partition
            }
        }
        return ans;
    }
}
