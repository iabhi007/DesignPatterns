package abhi.design.pattern.decorator.impl;

import abhi.design.pattern.decorator.iface.Coffee;
import abhi.design.pattern.decorator.iface.CoffeeCondiment;

import java.util.HashMap;
import java.util.Map;

public class WordProcessor extends CoffeeCondiment {

    Map<Integer, String> countMap = Map.of(2, "double",
            3, "triple", 4, "quadruple");
    private final Coffee coffee;
    public WordProcessor(Coffee coffee) {
        this.coffee = coffee;
    }

    private String getDescription() {
        String coffeeName = processName(coffee.name());
        Double cost = coffee.cost();
        return coffeeName+ " will cost "+ cost +" rupees";
     }

    private String processName(String name) {
        String[] arr = name.split(":");
        Map<String, Integer> freq = new HashMap<>();
        for(String val : arr) {
            freq.put(val, freq.getOrDefault(val, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(String val : arr) {
            if(freq.containsKey(val)) {
                if(freq.get(val) > 1) {
                    sb.append(countMap.get(freq.get(val)))
                            .append(" ");
                }
                sb.append(val)
                        .append(",");
                freq.remove(val);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    @Override
    public Double cost() {
        return coffee.cost();
    }

    @Override
    public String name() {
        return getDescription();
    }
}
