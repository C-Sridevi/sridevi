import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class KeyValuePairs {
public static void main(String[] args) {
TreeMap<Integer,String> map=new TreeMap<Integer, String>();
map.put(10,"Sravani");
map.put(20,"Likitha" );
System.out.println("TreeMap:"+map);
System.out.println("TreeMap elements");
for(Map.Entry m:map.entrySet()){
System.out.println(m.getKey()+""+m.getValue());
}
}
}
