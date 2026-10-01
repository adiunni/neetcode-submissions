class MyHashSet {
    List<Integer> numList;

    public MyHashSet() {
        this.numList = new ArrayList<>();
    }
    
    public void add(int key) {
        this.numList.add(key);
    }
    
    public void remove(int key) {
        this.numList.removeIf(num -> num == key);
    }
    
    public boolean contains(int key) {
        return this.numList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */