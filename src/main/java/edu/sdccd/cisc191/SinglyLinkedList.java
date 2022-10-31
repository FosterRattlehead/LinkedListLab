package edu.sdccd.cisc191;

class SinglyLinkedList<T>
{
    class Node
    {
        T data;
        Node next;
    };

    /**
     * recursively finds k-th node, deletes, and returns new head
     *
     * @param head the node to start at
     * @param k the kth element to remove (first element at 0)
     * @return the new head node with the kth element removed
     */
    public Node remove(Node head, int k) {
        if (k==0) { // checking to see what node to remove



            return head.next; // retarnoing the element after the one we are trying to remove


        }
        head.next=remove(head.next,k-1);// replacing the next node with the one that we want and we replace it with the actual value that we want

        return head;


    }

    /**
     *  inserts node at the beginning of the list
     * @param head the node to start at
     * @param new_data data to insert into the list
     * @return the new head node containing new_data followed with the rest of the linked list
     */
    public Node push(Node head, T new_data) {
        Node addedNode = new Node(); // making a a new node
        addedNode.data=new_data; // setting the data to the new node

        addedNode.next=head; // we are pushing the head node back and is the new head node
        return addedNode; // head is now added node




    }



    /**
     * recursively prints list starting from head
     * @param head the node to start at
     * @return a space separated string containing the data of each node starting from the head to the tail, end with a trailing space
     */
    public String toString(Node head) {
        if (head==null) { // stoping if we reach null
            return "";
        }


        return head.data +" "+ toString(head.next);// returning the current node with toString for the rest of the list




    }
}