import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Map<Integer, String> mapobbj = new HashMap();

        mapobbj.put(1, "apple");
        mapobbj.put(2, "sapota");
        mapobbj.put(3, "pineapple");
        mapobbj.put(4, "grapes");
        mapobbj.put(5, "mango");
        Set<Map.Entry<Integer, String>> entrySet = mapobbj.entrySet();
        for (Map.Entry<Integer, String> entry : mapobbj.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        entrySet.forEach(System.out::println);


/*

         Set<Integer> mapitr = mapobbj.keySet();
        Iterator itr = mapitr.iterator();
        while (itr.hasNext()) {
            String map = mapobbj.get(itr.next());
            System.out.println( " "+itr.next()+ " "+map);

        }
*/


      for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}