class SmallestInfiniteSet {
    List<Integer> list = new ArrayList<Integer>();
    public SmallestInfiniteSet() {
    for(int i=1;i<=1000;i++){
        list.add(i);
    }
    }
    
    public int popSmallest() {
            int val = list.get(0);
            list.remove(list.get(0));
            return val;
    }
    
    public void addBack(int num) {
        if(list.contains(num)==false){
            list.add(num);
        }
        Collections.sort(list);
    }
}
