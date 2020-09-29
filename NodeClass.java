public class NodeClass {
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


}
