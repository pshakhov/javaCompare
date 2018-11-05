import java.util.Comparator;

public class CountComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getCount() - o2.getCount();
    }
}
