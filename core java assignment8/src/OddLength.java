import java.util.ArrayList;
import java.util.Arrays;
public class OddLength {
interface Stringlength{
int getLength(String str);
}
public static void main(String[] args) throws CloneNotSupportedException
{
ArrayList<String> names = new ArrayList<>(Arrays.asList("sridevi","likitha","sravani","ruthika","deepika"));
names.removeIf((String str)-> str.length()%2 == 1 );
System.out.println(names);
}
}