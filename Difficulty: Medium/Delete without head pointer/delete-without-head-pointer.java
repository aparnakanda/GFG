/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del_node) {
      if(del_node==null || del_node.next==null){
          return;
      }
      Node nextNode=del_node.next;
      del_node.data=nextNode.data;
      del_node.next=nextNode.next;
      nextNode.next=null;
        
        
    }
}