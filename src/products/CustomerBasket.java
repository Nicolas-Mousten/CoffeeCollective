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
            int currentPrice = americansOrdered.get(i).getPrice();
            priceTotal = priceTotal + currentPrice;
        }
        for (int i = 0; i < espressosOrdered.size(); i++) {
            int currentPrice = espressosOrdered.get(i).getPrice();
            priceTotal = priceTotal + currentPrice;
        }
        for (int i = 0; i < teaOredered.size(); i++) {
            int currentPrice = teaOredered.get(i).getPrice();
            priceTotal = priceTotal + currentPrice;
        }
        for (int i = 0; i < croissantsOrdered.size(); i++) {
            int currentPrice = espressosOrdered.get(i).getPrice();
            priceTotal = priceTotal + currentPrice;
        }
        for (int i = 0; i < baguettesOrdered.size(); i++) {
            int currentPrice = baguettesOrdered.get(i).getPrice();
            priceTotal = priceTotal + currentPrice;
        }
        return priceTotal;
    }

    public ArrayList<Americano> getAmericansOrdered() {
        return americansOrdered;
    }

    public ArrayList<Espresso> getEspressosOrdered() {
        return espressosOrdered;
    }

    public ArrayList<Tea> getTeaOredered() {
        return teaOredered;
    }

    public ArrayList<Croissant> getCroissantsOrdered() {
        return croissantsOrdered;
    }

    public ArrayList<Baguette> getBaguettesOrdered() {
        return baguettesOrdered;
    }

    public void setAmericansOrdered(ArrayList<Americano> americansOrdered) {
        this.americansOrdered = americansOrdered;
    }

    public void setEspressosOrdered(ArrayList<Espresso> espressosOrdered) {
        this.espressosOrdered = espressosOrdered;
    }

    public void setTeaOredered(ArrayList<Tea> teaOredered) {
        this.teaOredered = teaOredered;
    }

    public void setCroissantsOrdered(ArrayList<Croissant> croissantsOrdered) {
        this.croissantsOrdered = croissantsOrdered;
    }

    public void setBaguettesOrdered(ArrayList<Baguette> baguettesOrdered) {
        this.baguettesOrdered = baguettesOrdered;
    }
}
