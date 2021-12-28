import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ColorWise {
public static void main(String[] args) {
List<Fruit> Fruits= Arrays.asList(
new Fruit("apple",40,60,"red"),
new Fruit("banana",79,80,"yellow"),
new Fruit("mango",70,60,"yellow"),
new Fruit("orange",50,70,"orange"),
new Fruit("grapes",60,50,"green"),
new Fruit("guva",30,40,"green")
);
Collections.sort(Fruits,(o1,o2)->(o1.getColor().compareTo(o2.getColor())));
Fruits.stream().forEach( p ->System.out.println(" "+p.toString()));
}
}

