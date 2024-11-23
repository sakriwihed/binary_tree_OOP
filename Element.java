package binaryTree;

public class Element { //Die Klasse Element
    private Element left;
    private Element right;
    private Element parent;
    private Pair data;

    public Element(Pair data){ 
        this.data=data;
        this.left=null;
        this.right=null;
        this.parent=null;
    }

    public Element setLeft(Element left){
       return this.left=left;
    }

    public Element setRight(Element right){
        return this.right=right;
    }

    public Element getLeft(){
        return left;
    }

    public Element getRight(){
        return right;
    }
    public Pair getData(){
        return data;
    }
    
    public Element setParent(Element parent){
        return this.parent=parent;
    }

}
