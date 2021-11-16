package products;

public class Croissant {
    private String title = "Croissant";
    private static int price = 20;

    public String getTitle() {
        return title;
    }

    public static int getPrice() {
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
