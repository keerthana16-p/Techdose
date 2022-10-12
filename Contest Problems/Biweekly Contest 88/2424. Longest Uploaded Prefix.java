class LUPrefix {
    private Set<Integer> set = new HashSet<Integer>();
    private int longestPrefix=0;
    public LUPrefix(int n) {
        
    }
    
    public void upload(int video) {
        set.add(video);
        while(set.contains(longestPrefix+1)){
            longestPrefix++;
        }
    }
    
    public int longest() {
        return longestPrefix;
    }
}
