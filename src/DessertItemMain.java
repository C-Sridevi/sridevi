
import java.util.Scanner;
public class DessertItemMain {
public static void main(String[] args) { 
	Candy cnd = new Candy(); Cookies ck = new Cookies(); Icecream ic = new Icecream(); System.out.println("Press 1 if you are Owner \n Press 2 if you are Customer");
Scanner s=new Scanner(System.in); int v=s.nextInt(); if(v==1)
{
System.out.println("Dessert Items \nCandy :"+cnd.getCost()+"\nCoockie: "+ck.getCost()+"\nIcecream:"+ic.getCost());
}
else if(v==2)
{
System.out.println("\nPlace your order");
}
}}

