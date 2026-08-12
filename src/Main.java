public class Main{
    public static class Node{
        int value;
        Node next ;
        public Node(int value){
            this.value = value;
        }

    }
    public static class linked_list{
        Node head;
        Node tail;
        int size ;
        void insert_first(int value){
            Node node = new Node(value);
            node.next = head;
            head = node ;
            if(tail == null){
                tail = head;
            }

            size++;

        }
        void display(){
            Node temp = head;
            while(temp !=null) {
                System.out.println(temp.value);
                temp = temp.next ;
            }
        }

    }
    public static void main(String[] args){
        linked_list list = new linked_list() ;
        list.insert_first(2);
        list.insert_first(3);
        list.display();


    }

}