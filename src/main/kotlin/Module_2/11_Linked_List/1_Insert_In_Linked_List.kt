/*
You are given A which is the head of a linked list. Also given is the value B and position C.
Complete the function that should insert a new node with the said value at the given position.

Notes:
In case the position is more than length of linked list, simply insert the new node at the tail only.
In case the pos is 0, simply insert the new node at head only.
Follow 0-based indexing for the node numbering.

 */


class InsertLinkedList {
    fun solve(A: ListNode?, B: Int, C: Int): ListNode? {

        var node = ListNode(B)
        if (C == 0 || A == null) {
            node.next = A
            return node
        }

        var idx = 1
        var head = A

        while (idx < C && head!!.next != null) {
            head = head.next
            idx++
        }

        node.next = head!!.next
        head.next = node
        return A
    }


}
