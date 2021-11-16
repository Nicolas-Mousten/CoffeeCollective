package products;

public class Americano {
    private String title = "Americano";
    private static int price = 15;

    public Americano(){}


    public String getTitle() {
        return title;
    }

    public static int getPrice() {
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
