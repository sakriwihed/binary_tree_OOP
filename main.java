import binaryTree.*;

public class main{

    public static void BubbleSort(Pair[]array){ //wenn wie ein unsortiertes Array haben , nutzen wir dieses Sort
        int n=array.length;
        for (int i=n-1;i>=0;i--){
            for (int j=0;j<=i-1;j++){
                if (array[j].compareTo(array[j+1])>0){
                    //umtausch
                    Pair tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[]args){
        Pair[]arrayPairs_1={new Pair(1,"ein"), // wie gesehen , das ist das sortiertes Array
                           new Pair(2,"binaer"),
                           new Pair(3,"Baum"),
                           new Pair(4,"ist"),
                           new Pair(5,"eine"),
                           new Pair(6,"dynamische"),
                           new Pair(7,"Datenstruktur")};

        Element Baum_1 = BinaryTreeUtils.createBinaryTree(arrayPairs_1,0,arrayPairs_1.length);
        System.out.println("die inorder Ausgabe des Baums n 1:");
        BinaryTreeUtils.inorder(Baum_1);
        System.out.println();

        Pair[]arrayPairs_2={new Pair(12,"ein"), // array 2 ist nicht sortiert
                            new Pair(5,"binaer"),
                            new Pair(1,"Baum"),
                            new Pair(4,"ist"),
                            new Pair(2,"eine"),
                            new Pair(3,"dynamische"),
                            new Pair(6,"Datenstruktur")};

        BubbleSort(arrayPairs_2); // machen wir ein Sort um Array 2 auch zu sortieren
        Element Baum_2 = BinaryTreeUtils.createBinaryTree(arrayPairs_2,0,arrayPairs_2.length);
        System.out.println("die inorder Ausgabe vom Baum n 2: ");
        BinaryTreeUtils.inorder(Baum_2);
        System.out.println();
        System.out.println("die preorder Ausgabe vom Baum n 2: ");
        BinaryTreeUtils.preorder(Baum_2);
        System.out.println();
        System.out.println("die postorder Ausgabe vom Baum n 2: ");
        BinaryTreeUtils.postorder(Baum_2);
        System.out.println();
        System.out.println("die Hoehe vom Baum 2 ist : "+BinaryTreeUtils.getHeight(Baum_2));
    }
}
