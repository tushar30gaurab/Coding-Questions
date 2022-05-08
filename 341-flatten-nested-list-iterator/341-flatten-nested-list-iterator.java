public class NestedIterator implements Iterator<Integer> {
    
    class Node{
        Node next;
        int data;
        
        Node( int data){
          this.data = data;
        }
    }
    
    Node head;

    public NestedIterator(List<NestedInteger> nestedList) {
        head = createLL(nestedList);
    }
    
    private Node createLL(List<NestedInteger> nestedList){
        Node dummy = new Node(0);
        Node temp = dummy;
        
        for(NestedInteger x: nestedList){
            if(x.isInteger()){
                temp.next = new Node(x.getInteger());
                temp = temp.next;
            }
            else{
                temp.next = createLL(x.getList());
                while(temp.next != null){
                    temp = temp.next;
                }
            }
        }
        
        return dummy.next;
    }

    @Override
    public Integer next() {
        int val = head.data;
        head = head.next;
        return val;
    }

    @Override
    public boolean hasNext() {
        return (head != null);
    }
}