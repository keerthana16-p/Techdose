class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
       List<String> res = new ArrayList<>();
       Map<String,List<String>> adj = new HashMap<>();
       Map<String,Integer> indegree = new HashMap<>();
       for(int i=0;i<ingredients.size();i++){
           for(int j=0;j<ingredients.get(i).size();j++){
               adj.putIfAbsent(ingredients.get(i).get(j),new ArrayList<String>());
               adj.get(ingredients.get(i).get(j)).add(recipes[i]);
               indegree.put(recipes[i],ingredients.get(i).size());
           }
       }
        Queue<String> q = new LinkedList<>();
        for(String s : supplies){
            q.add(s);
        }
       while(!q.isEmpty()){
           String supply = q.poll();
           if(!adj.containsKey(supply)){
               continue;
           }
           for(String recipe:adj.get(supply)){
               indegree.put(recipe,indegree.get(recipe)-1);
               if(indegree.get(recipe)==0){
                   res.add(recipe);
                   q.add(recipe);
               }
           }
       }
        return res;
    }
}
