/**
 * Класс товара.
 *
 * @version   1.0 05 Nov 2018
 * @author    Pavel Shakhov
 */

public class Product {
    /**Наименование товара.*/
    private String name;
    /**Его количество.*/
    private int count;

    /**
     * @param count .
     * @param name  .*/
    public Product(final String name, final int count) {
        this.name = name;
        this.count = count;
    }

    /**Геттер наименования.
     * @return */
    public String getName() {
        return name;
    }

    /**Геттер количества.
     * @return */
    public int getCount() {
        return count;
    }
}
