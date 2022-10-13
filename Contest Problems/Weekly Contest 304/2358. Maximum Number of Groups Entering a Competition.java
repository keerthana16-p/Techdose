class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        return (int)(Math.sqrt(1+8*n)-1)/2;
    }
}
