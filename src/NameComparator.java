import java.util.Comparator;

/**Имплементируем.*/
public class NameComparator implements Comparator<Product> {

    @Override
    /**Реализуем сортировку по имени.*/
    public int compare(final Product o1, final Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
