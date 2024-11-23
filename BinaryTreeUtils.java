package binaryTree;

public final class BinaryTreeUtils {

    public static Element createBinaryTree( Pair[] data , int left ,int right){
        if(left==right){ //base case fuer die Rekursion
            return null;
        }

        int mid=(left+right)/2;
        Element element=new Element(data[mid]);
        element.setLeft(createBinaryTree(data,left,mid)); // wir nutzen die selbe Funktion mit Rekursion um den links Teil aufzubauen

        if(element.getLeft()!= null){
            element.getLeft().setParent(element);
        }

        element.setRight(createBinaryTree(data,mid+1,right)); //wir nutzen die selbe Funktion mit Rekursion um den rechts Teil aufzubauen
        if(element.getRight()!= null){
            element.getRight().setParent(element);
        }

        return element;
    }

    public static void inorder(Element root) { // diese Funktion drueckt links , dann Wurzel , dann Rechts
        if (root != null) {
            inorder(root.getLeft());
            System.out.print(root.getData().getVal() + " ");
            inorder(root.getRight());
        }
    }

    public static void preorder(Element root) { // diese Funktion drueckt Wurzel , dann Links , dann Rechts
        if (root != null) {
            System.out.print(root.getData().getVal() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public static void postorder(Element root){ // diese Funktion drueckt Links ,dann Rechts , dann Wurzel
       if (root!=null){
           postorder(root.getLeft());
           postorder(root.getRight());
           System.out.print(root.getData().getVal() + " ");
       }
    }

    public static int getHeight(Element root){
       if (root==null){
           return 0;
       }
       return Math.max(getHeight(root.getLeft()),getHeight(root.getRight()))+1; //weil der Links und Rechts Teil vom Baum koennen nicht gleich sein
    }

}
