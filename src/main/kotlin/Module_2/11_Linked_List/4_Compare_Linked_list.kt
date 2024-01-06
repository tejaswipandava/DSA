/*
Given heads of two linked lists A and B, check if they are identical
i.e. each of their corresponding nodes should contain the same data.
The two given linked lists may or may not be of the same length.
 */


class CompareLinkedlist {
    fun solve(A: ListNode?, B: ListNode?): Int {
        var head1 = A
        var head2 = B
        while (head1 != null && head2 != null) {
            if (head1.`val` != head2.`val`) return 0

            head1 = head1.next
            head2 = head2.next
        }

        if (head1?.next != head2?.next) return 0

        return 1
    }
}
