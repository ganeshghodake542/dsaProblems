// package Stacks;
// import java.util.*;

// class RemoveNode {
//     public ListNode removeNodes(ListNode head) {

//         Stack<Integer> st = new Stack<>();
//         ListNode temp = head;

//         while (temp != null) {

//             while (!st.isEmpty() && temp.val > st.peek()) {
//                 st.pop();
//             }

//             st.push(temp.val);
//             temp = temp.next;
//         }

//         ListNode newHead = null;

//         while (!st.isEmpty()) {
//             ListNode node = new ListNode(st.pop());
//             node.next = newHead;
//             newHead = node;
//         }

//         return newHead;
//     }

// }