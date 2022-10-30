class MedianFinder {
   PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
   PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
    public void addNum(int num) {
        maxheap.offer(num);
        minheap.offer(maxheap.poll());
        if(minheap.size() > maxheap.size()){
            maxheap.offer(minheap.poll());
        }
    }
    
    public double findMedian() {
        if(maxheap.size() > minheap.size()){
            return maxheap.peek();
        }
        return (maxheap.peek()+minheap.peek())/2.0;
    }
}
