package products;

public class Tea {
    private String title = "Tea";
    private int price = 60;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
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
