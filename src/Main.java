
/**
 * Демонстрационный класс для проверки работы контейнера IntContainer.
 *
 */
public class Main {

    public static void main(String[] args) {

        IntContainer container = new IntContainer();

        container.add(10);
        container.add(20);
        container.add(30);

        System.out.println(container.get(1));
        container.remove(1);

        System.out.println(container.get(1));
    }
}