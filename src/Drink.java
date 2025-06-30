import java.util.TreeSet;

class A { void foo() throws Exception {  }
}
class SubB2 extends A {
    static String o="";

    void foo() {
        o=o+2;
    System.out.println("B "+o+2); }
}
   public class Drink implements Comparable {

       Drink t;

       public String name;

    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "name :"+ name;
    }

    public static void main(String args[]) throws Exception {

        Drink one = new Drink();
     Drink two = new Drink();
     one.name= "Coffee";
     two.name= "Tea";
     TreeSet set = new TreeSet();
     set.add(one);
     set.add(two);
     System.out.println( "  " + set);
        A a = new SubB2();
        a.foo();
    /*    args = null;
        args[0] = "test";
        System.out.println(args[0]);*/
        for (int i = 0; i <= 10; i++) {
            if (i > 6)
                break;
        }

        String a1 = "127";
        String b1 =   a1;//"127";
        a1="11";
        System.out.println( a1==b1 );

    }
}