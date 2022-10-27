class RandomizedSet {
    List<Integer> list;
    Map<Integer,Integer> map;
    public RandomizedSet() {
        list=new ArrayList<>();
         map=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)==false){
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
      if(map.containsKey(val)==true){
        int index=map.get(val);
        int lastind = list.size()-1;
        list.set(index,list.get(lastind));
        map.put(list.get(lastind),index);
        list.remove(lastind);
        map.remove(val);
          return true;
      }
        return false;
    }
    
    public int getRandom() {
        Random random = new  Random();
        int ind = random.nextInt(list.size());
        return list.get(ind);
    }
}
