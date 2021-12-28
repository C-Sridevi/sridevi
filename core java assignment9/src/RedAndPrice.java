import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class RedAndPrice {
public static void main(String[] args) {
List<Fruit> fruits= Arrays.asList(
new Fruit("apple",40,60,"red"),
new Fruit("banana",79,80,"yellow"),
new Fruit("mango",70,60,"yellow"),
new Fruit("orange",50,70,"orange"),
new Fruit("grapes",60,50,"green"),
new Fruit("guva",30,40,"green")
);



Collections.sort(fruits,(o1,o2) ->(o1.getPrice()-(o2.getPrice())));




fruits.stream().forEach(p-> {
if(p.getColor()=="red")
System.out.println("FruitName:"+p.getName()+" Calories: "
+p.getCalories()+" Price: "+p.getPrice()+" Color: "+p.getColor());



}
);
}



}