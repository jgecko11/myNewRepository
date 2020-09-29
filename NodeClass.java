public class NodeClass<node1> {
    private Object node; //Private Instance Data for node
    private Object pointer1; //First Pointer
    private Object pointer2; //Second Pointer

    public  NodeClass(){} //Empty constructor

    public NodeClass(Object initialData){ //constructor for just data
        node = initialData;
    }

    public NodeClass(Object data, Object pointer1, Object pointer2){ //constructor for info and pointers
        this.node = data;
        this.pointer1 = pointer1;
        this.pointer2 = pointer2;
    }

    public void setNode(Object updatedData){ //set data
        this.node = updatedData;
    }

    public void setPointer1(Object updtaedPointer1){ //set first pointer
        pointer1 = updtaedPointer1;
    }

    public void setPointer2(Object updatedPointer2){ //set second pointer
        pointer2 = updatedPointer2;
    }

    public Object getNode() { //access node
        return node;
    }

    public Object getPointer1() { //access first pointer
        return pointer1;
    }

    public Object getPointer2() { //access second pointer
        return pointer2;
    }

    @Override
    public String toString() {
        return "Node: " + getNode() + ", " + getPointer1() + ", " + getPointer2();
    }


    public boolean equals(Object obj, Object obj2) {
        if(obj instanceof NodeClass && obj2 instanceof NodeClass){
            return ((NodeClass) obj).getNode() == ((NodeClass) obj2).getNode() &&
                    ((NodeClass) obj).getPointer1() == ((NodeClass) obj2).getPointer2() &&
                    ((NodeClass) obj).getPointer2() == ((NodeClass) obj2).getPointer2();
        }
        else return false;
    }





}

class testNode{
    public static void main(String[] args) {
        int intA = 5;
        Object node1 = new NodeClass(intA);
        int intB = 10;
        String StringA = "Hello";
        String StringB = "World";
        Object node2 = new NodeClass(intB,StringA,StringB);
        System.out.println(((NodeClass) node1).toString());
        System.out.println(((NodeClass) node2).toString());
        ((NodeClass) node1).setNode(10);
        ((NodeClass) node1).setPointer1("Hello");
        ((NodeClass) node1).setPointer2("World");
        System.out.println(((NodeClass) node1).toString());
        System.out.println(((NodeClass) node2).toString());
        System.out.println(node1.equals(node2));
    }
}
