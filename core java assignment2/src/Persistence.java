
public abstract class Persistence {
abstract void persistence(); void persistence1()
{
System.out.println("display persistence object");
}
}
class FilePersistence extends Persistence
{
void persistence()
{
System.out.println("file persistence");
}
}
class DatabasePersistence extends Persistence
{
void persistence()
{
super.persistence1();
System.out.println("database persistence");
}
}

