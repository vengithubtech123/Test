public class Reference {
    public static void main(String args[]) {
        String s1a = "abc";
        String s1b = "abc";

        String s1c = new String("abc") ;
        s1b=s1c;
        System.out.println(" "+s1a==s1b);

        System.out.println(" "+s1b==s1c);


    }
}
