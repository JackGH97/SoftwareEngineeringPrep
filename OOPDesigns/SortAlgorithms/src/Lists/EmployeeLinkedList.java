package Lists;

public class EmployeeLinkedList {

    private  EmployeeNode head;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }
}
