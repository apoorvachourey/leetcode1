class LRUCache {

    class Node {
        Node prev;
        Node next;
        int key;
        int value;
        public Node(int k, int v){
            key = k;
            value = v;
        }
    }
    
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    
    HashMap<Integer,Node> map = new HashMap<>();
    int cap;
    
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==cap){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    public void insert(Node node){
        map.put(node.key,node);
        Node nextOfHead = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextOfHead;
        nextOfHead.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */