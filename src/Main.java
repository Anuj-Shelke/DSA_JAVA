public class Main{
    public static class Node{
        int value ;
        Node next;

        public Node(int value){
            this.value = value;

        }


    }
    public static class LL{
        static Node head;
        static int size;
        Node tail;
        Node temp;
         public void Insert_first(int value){
             Node node = new Node(value);
             node.next = head;
             if(tail == null){
                 tail = node;
                 size++;
             }
             head = node;



         }
         public void insert(int value, int index){
             if(index == 1){
                 Insert_first(value);
                 return ;
             }
             if(index == size){
                 Insert_last(value);
                 return ;
             }
             Node temp = head;
             for(int i =0  ;i < index-1 ; i++){
                 temp = temp.next;

             }
             Node node = new Node(value);
             node.next = temp.next;
             temp.next = node;


         }
         public void Insert_last(int value){

             Node node = new Node(value);
             Node temp = node ;
             if(head == null){
                 Insert_first(value);
                 size++;
             }
             tail.next =  temp;
             tail = temp;




         }
         public void display(){
             temp = head;
             while(temp != null){
                 System.out.println(temp.value);
                 temp = temp.next;
             }


         }
         public int delete_first(){
             head = head.next;
             return head.value;
         }
         public void delete_last(){
             Node temp = head ;
             while(temp.next != tail){
                 temp = temp.next;
             }
             temp.next = null;
             tail = temp;





         }
    }
    public static void main(String[] args){
        LL linked_list = new LL();
        linked_list.Insert_first(1);
        linked_list.Insert_first(8);linked_list.Insert_first(1);
        linked_list.Insert_first(1);
        linked_list.Insert_first(1);
        linked_list.Insert_last(3);
        linked_list.insert(99,2);
        linked_list.display();
        int value = linked_list.delete_first();
        System.out.println("The element deleted is "+value);
        linked_list.display();
        System.out.println("After deleting the last element the Array becomes ");
        linked_list.delete_last();
        linked_list.display();






    }
}