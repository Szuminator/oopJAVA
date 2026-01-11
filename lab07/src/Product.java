import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Product implements Comparable<Product>{
    String name;
    double price;
    LocalDate expirationDate;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        int byData = o.expirationDate.compareTo(this.expirationDate);
        if (byData !=0) return byData;

        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
