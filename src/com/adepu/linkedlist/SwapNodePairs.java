package com.adepu.linkedlist;

class ListNode{
    int val;
    ListNode next;
    ListNode(){
    }
    ListNode(int val){
        this.val = val;
    }
}
public class SwapNodePairs {
    public static void main(String[] args){
        SwapNodePairs swapNodePairs = new SwapNodePairs();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result  = swapNodePairs.swapPairs(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
}
