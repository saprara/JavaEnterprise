
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raksh
 */
public class CoffeeExpert {
    public ArrayList<String>getStyles(String type) {
ArrayList<String> styles =
new ArrayList<String>();
if (type.equals("milky")) {
styles.add("latte");
styles.add("cappuccino");
}
else if (type.equals("frothy")) {
styles.add("latte");
styles.add("cappuccino");
styles.add("frappuccino");
}
        else if (type.equals("icey")) {
            styles.add("frappuccino");
        } else if (type.equals("strong")) {
            styles.add("espresso");
            styles.add("double espresso");
}
else {
styles.add("Vending Machine");
}
return (styles);
}
}
