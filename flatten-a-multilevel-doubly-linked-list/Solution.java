/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

    if(head == null){
        return head;
    }
  
  Stack<Node> stack = new Stack<>();

     Node temp = head;

     while(temp != null){

   if (temp.child != null) {

    if (temp.next != null)
        stack.push(temp.next);

    temp.next = temp.child;
    temp.child.prev = temp;
    temp.child = null;
}
     if (temp.next == null && !stack.isEmpty()) {

            Node temp2 = stack.pop();
            temp.next = temp2;
            temp2.prev = temp;
        }


      temp = temp.next;
     }
       return head;
    }
}