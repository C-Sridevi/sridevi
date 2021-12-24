public class Trade {
String name;
String city;





public Trade(String name,String city) {
this.name=name;
this.city=city;
}
public String getName() {
return name;



}
public String getCity() {
return city;
}
public String toString() {
return "Trade[name="+name+",city="+city+"]";
}



}