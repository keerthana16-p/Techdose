class LRUCache {
    class Node{
        int key,val;
        Node prev,next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
        Node(){
            this(0,0);
        }
    }
    int capacity,count;
    Map<Integer,Node> map;
    Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        count=0;
        map = new HashMap<>();
        head= new Node();
        tail = new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        Node temp=map.get(key);
        if(temp==null){
            return -1;
        }
        else{
            remove(temp);
            add(temp);
            return temp.val;
        }
    }
    
    public void put(int key, int value) {
        Node temp = map.get(key);
        if(temp==null){
            Node nn = new Node(key,value);
            map.put(key,nn);
            add(nn);
            count++;
        }
        else{
           temp.val=value;
           remove(temp);
            add(temp);
        }
        if(count>capacity){
            Node del = tail.prev;
            remove(del);
            map.remove(del.key);
            count--;
        }
    }
    public void add(Node temp){
        temp.next=head.next;
        temp.prev=head;
        head.next=temp;
        temp.next.prev=temp;
    }
    public void remove(Node temp){
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
}

