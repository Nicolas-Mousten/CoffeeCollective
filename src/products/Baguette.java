package products;

public class Baguette {
    private String title = "Baguette";
    private static int price = 30;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Baguette{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
