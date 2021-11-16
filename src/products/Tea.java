package products;

public class Tea {
    private String title = "Tea";
    private static int price = 6;

    public String getTitle() {
        return title;
    }

    public static int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
