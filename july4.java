package Leetcode_July_Challenge;
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class july4 {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = head;
        ListNode left = head;
        ListNode right = head.next;
        int sum=0;
        while(right!=null){
            while(right.val!=0){
                sum+=right.val;
                right = right.next;  
            }
            right =right.next;
            left.next = new ListNode(sum);
            left=left.next;
            sum =0;
            
        }
        left=new ListNode();
        return dummy.next;
    }
}
