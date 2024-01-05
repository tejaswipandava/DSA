/*
You are given the head of a linked list A and an integer B, check if there is any node which contains this value B.

Return 1 if such a node is present else return 0.
 */
class SearchInLinkedList {
    fun solve(A: ListNode?, B: Int): Int {
        var head = A
        while (head != null) {
            if (head.`val` == B) return 1
            head = head.next
        }

        return 0
    }
}
