public class LinkedList {
    Node head;
    Node tail;

    public void add(int value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = tail = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }

    public static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(25);
        list.add(4);
        list.add(-8);
        list.add(101);
        list.add(-150);
        list.add(9);


        System.out.println("Исходный список ");
        printList(list.head);
        System.out.println();
        System.out.println("Развернутый список ");
        list.revert();
        printList(list.head);
    }
}
