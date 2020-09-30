/*
Jack Greco
9/29/20
9/30/20
Node class for Java
 */

public class Node <T> {
    private T node; //Private Instance Data for node
    private T pointer1; //First Pointer
    private T pointer2; //Second Pointer

    public  Node(){} //Empty constructor

    public Node(T initialData){ //constructor for just data
        node = initialData;
    } //Constructor for just data

    public Node(T data, T pointer1, T pointer2){ //constructor for info and pointers
        this.node = data;
        this.pointer1 = pointer1;
        this.pointer2 = pointer2;
    }

    public void setNode(T updatedData){ //set data
        this.node = updatedData;
    } //Updates data

    public void setPointer1(T updtaedPointer1){ //set first pointer
        pointer1 = updtaedPointer1;
    } //Updates first pointer

    public void setPointer2(T updatedPointer2){ //set second pointer
        pointer2 = updatedPointer2;
    } //Updates second pointer

    public Object getNode() { //access node
        return node;
    } //retrieves data

    public Object getPointer1() { //access first pointer
        return pointer1;
    } //retrieves first pointer

    public Object getPointer2() { //access second pointer
        return pointer2;
    } //retrieves second pointer

    @Override
    public String toString() {
        return "Node: " + getNode() + ", " + getPointer1() + ", " + getPointer2();
    } //updated toString


    public boolean equals(T obj, T obj2) {
        if(obj instanceof Node && obj2 instanceof Node){
            return ((Node) obj).getNode() == ((Node) obj2).getNode() &&
                    ((Node) obj).getPointer1() == ((Node) obj2).getPointer2() &&
                    ((Node) obj).getPointer2() == ((Node) obj2).getPointer2();
        }
        else return false;
    }





}

class TestNode{
    public static void main(String[] args) {
        int intA = 5;
        Object node1 = new Node(intA);
        int intB = 10;
        String StringA = "Hello";
        String StringB = "World";
        Object node2 = new Node(intB,StringA,StringB);
        System.out.println(((Node) node1).toString());
        System.out.println(((Node) node2).toString());
        ((Node) node1).setNode(10);
        ((Node) node1).setPointer1("Hello");
        ((Node) node1).setPointer2("World");
        System.out.println(((Node) node1).toString());
        System.out.println(((Node) node2).toString());
        System.out.println(node1.equals(node2));
    }
}
