package products;

public class Americano {
    private String title = "Americano";
    private int price = 15;

    public Americano(){}


    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Americano{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
