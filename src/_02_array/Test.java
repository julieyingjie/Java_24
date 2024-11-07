package _02_array;

import java.util.Random;

public class Test {

    public static void main(String[] args) {

        printArray();
        clear();
        System.out.println();
        printArray();
        for (int i = 0; i < 6; i++) {
            add(100, 2);
        }
        System.out.println();
        printArray();

    }

    /**
     * 1. 尾部追加
     * 2. 普通位置添加 （index <= length - 1）记得从后向前添加
     * 3. 在添加的过程中，如果容量不够，需要扩容
     * 4. parameter size, 是指我们的有效元素的个数。
     * 因为我们已经进行了clear的操作，数组的后半部分已经变为0，是无效元素。
     * 我们需要定位到最后一个有效元素才能进行add的操作
     */
    // global variable

    static int[] array = getRandArray(100, 10);
    static int size = array.length >> 1;

    public static void add(int element, int index) {
        // 不符合操作情景要求
        if (index < 0 || index > size) return;

        // 扩容操作
        extendCapacity(size, size + 1);

        // 尾部追加
        if (index == size) {
            array[size] = element;
        } else { // 普通位置添加
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
        }
        size++;
//        System.out.println("size: " + size);

    }

    public static void extendCapacity(int size, int capacity) {
        // 获取之前的容量
        int old = array.length;
        if (old >= capacity) return;
        // 需要扩容
        int newCapacity = 2 * old;
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public static void clear() {
        int mid = array.length >> 1;
        for (int i = mid; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static int[] getRandArray(int range, int length) {
        if (length < 0) length = 10;
        Random random = new Random();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int randNum = random.nextInt(range); //[0, 100)
            array[i] = randNum;
        }

        return array;

    }

    public static void printArray() {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) System.out.print(array[i] + " ");
            else System.out.print(array[i]);
        }
    }


}
