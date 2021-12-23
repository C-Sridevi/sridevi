@interface Test
{
}
@Test
class details
{
String name;
public details(String name) {
super();
this.name = name;
}
}
public class TestCase {
public static void main(String[] args) {
details obj=new details("Sridevi");
System.out.println(obj.name);
}
}