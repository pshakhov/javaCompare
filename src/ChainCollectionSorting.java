/**
 * Класс, реализующий
 * сортировку по цепочкам:
 * сначала по имени, затем
 * по количеству продуктов.
 *
 * @version   1.0 05 Nov 2018
 * @author    Pavel Shakhov
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**Реализуем сортировку по цепочке.*/
public final class ChainCollectionSorting {

    /** Количество пар обуви Dr.Martens.*/
    private static final int MARTENS_COUNT = 10;
    /** Adidas Gazelle.*/
    private static final int GAZELLE_COUNT = 5;
    /** Adidas Samba.*/
    private static final int SAMBA_COUNT = 7;
    /** Converse.*/
    private static final int CONVERSE_COUNT = 8;

    /**Создаем конструктор.
     */
    private ChainCollectionSorting() { };

    /** Добавляем продукты и сортируем их.
     /**@param args .
     *@throws Exception .*/
    public static void main(final String[] args) {
        Comparator<Product> pcomp = new
        CountComparator().thenComparing(new NameComparator());
        Set<Product> products = new TreeSet(pcomp);
        products.add(new Product("Dr.Martens boots", MARTENS_COUNT));
        products.add(new Product("Adidas Gazelle", GAZELLE_COUNT));
        products.add(new Product("Adidas Samba", SAMBA_COUNT));
        products.add(new Product("Converse", CONVERSE_COUNT));

        for (Product p : products) {
            System.out.print(p.getName()
                    + ", " + p.getCount() + " pcs" + ".\n");
        }
    }
}
