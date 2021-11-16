package products;

public class Croissant {
    private String title = "Croissant";
    private int price = 20;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Croissant{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
