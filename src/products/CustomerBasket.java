package products;

import java.util.ArrayList;

public class CustomerBasket {
    private ArrayList<Americano> americansOrdered = new ArrayList<Americano>();
    private ArrayList<Espresso> espressosOrdered = new ArrayList<Espresso>();
    private ArrayList<Tea> teaOredered = new ArrayList<Tea>();
    private ArrayList<Croissant> croissantsOrdered = new ArrayList<Croissant>();
    private ArrayList<Baguette> baguettesOrdered = new ArrayList<Baguette>();

    public void addToAmericano(Americano order){
        americansOrdered.add(order);
    }
    public void addToEspresso(Espresso order){
        espressosOrdered.add(order);
    }
    public void addToTea(Tea order){
        teaOredered.add(order);
    }
    public void addToCroissant(Croissant order){
        croissantsOrdered.add(order);
    }
    public void addToBaguette(Baguette order){
        baguettesOrdered.add(order);
    }

    public int getTotalPrice(){
        int priceTotal = 0;
        for (int i = 0; i < americansOrdered.size(); i++) {
            americansOrdered.get(i);
        }
        for (int i = 0; i < espressosOrdered.size(); i++) {
            espressosOrdered.get(i);
        }
        for (int i = 0; i < teaOredered.size(); i++) {
            teaOredered.get(i);
        }
        for (int i = 0; i < croissantsOrdered.size(); i++) {
            espressosOrdered.get(i);
        }
        for (int i = 0; i < baguettesOrdered.size(); i++) {
            baguettesOrdered.get(i);
        }
        return priceTotal;
    }
}
