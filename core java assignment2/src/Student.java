public class Student {
static Student st=new Student();

private Student()
{
System.out.println("sinleton class example");
}
static Student getInstance()
{

return st;

}
}

