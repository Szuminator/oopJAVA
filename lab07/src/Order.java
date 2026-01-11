import java.time.LocalDate;
import java.util.Comparator;

public class Order {
    int id;
    String customerName;
    LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

class DateComp implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getOrderDate().compareTo(o2.getOrderDate());
    }
}

class NameComp implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getCustomerName().compareTo(o2.getCustomerName());
    }
}
