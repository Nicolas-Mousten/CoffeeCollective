package products;

public class Espresso {
    private String title = "Espresso";
    private int price = 40;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
