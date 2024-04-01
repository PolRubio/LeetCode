public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1;
        ListNode list2;

        list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(solution.mergeTwoLists(list1, list2)); // [1,1,2,3,4,4]

        list1 = null;
        list2 = null;
        System.out.println(solution.mergeTwoLists(list1, list2)); // []

        list1 = null;
        list2 = new ListNode(0);
        System.out.println(solution.mergeTwoLists(list1, list2)); // [0]
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list;
        if(list1 != null){
            if(list2 != null){
                if(list1.val < list2.val) list = new ListNode(list1.val, mergeTwoLists(list1.next, list2));
                else list = new ListNode(list2.val, mergeTwoLists(list1, list2.next));
            }
            else list = list1;
        } else list = list2;
        return list;
    }
}