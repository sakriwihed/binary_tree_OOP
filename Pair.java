  package binaryTree;

  public class Pair implements Comparable <Pair> {
      private int key;
      private String val;

      public Pair(int key,String val){
          this.key=key;
          this.val=val;
      }

      public int getKey(){
          return key;
      }

      public String getVal(){
          return val;
      }

      @Override
      public int compareTo(Pair obj){
          return Integer.compare(this.key,obj.key);//das ist eine static Methode ,die zwei integer vergleicht
      }
  }
