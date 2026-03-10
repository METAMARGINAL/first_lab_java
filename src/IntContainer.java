/**
 * Контейнер для хранения произвольного количества целых чисел.
 * <p>
 * Реализован на основе динамического массива без использования
 * встроенных коллекций Java.
 * Контейнер поддерживает добавление, получение и удаление элементов.
 */
public class IntContainer {
    /** Массив для хранения элементов контейнера */
    private int[] elements;
    /** Текущее количество элементов в контейнере */
    private int size;

    /**
     * Конструктор с начальной ёмкостью 10 элементов.
     */
    public IntContainer() {
        elements = new int[10];
        size = 0;
    }
    /**
     * функия для добавления нового значение в контейнер.
     *
     */
    public void add(int value) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = value;
        size++;
    }

    /**
     * Геттер по индексу.
     */
    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    /**
     * Функция удаления элемента по индексу
     *
     */
    public void remove(int index) {
        checkIndex(index);

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
    }

    /**
     * Гетер текущего размера массива
     *
     */
    public int GetSize() {
        return size;
    }

    /**
     *Функция, возвращает строковое представление объекта.
     *
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Функция увеличивающая массив в 2 раза.
     */
    private void resize() {
        int[] newArray = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;
    }

    /**
     * Функция проверки валидации индекса.
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }


}
