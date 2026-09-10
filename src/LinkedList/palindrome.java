// class Solution {
//     public boolean isPalindrome(ListNode head) {

//         // 1. Find middle
//         ListNode slow = head;
//         ListNode fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // 2. Reverse second half
//         ListNode prev = null;
//         ListNode curr = slow;

//         while (curr != null) {
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         // 3. Compare first and reversed second half
//         ListNode first = head;
//         ListNode second = prev;

//         while (second != null) {
//             if (first.val != second.val) {
//                 return false;
//             }

//             first = first.next;
//             second = second.next;
//         }

//         return true;
//     }
// }