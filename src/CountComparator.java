import java.util.Comparator;

/**Имплементируем.*/
public class CountComparator implements Comparator<Product> {

    /**Реализуем сортировку по количеству.*/
    @Override
    public int compare(final Product o1, final Product o2) {
        return o1.getCount() - o2.getCount();
    }
}
