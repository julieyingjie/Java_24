package _02_array;

import java.util.Random;

public class Main {
    private int size;
    private int[] array;

    public Main() {
        this.array = getRandArray(100, 9);
        size = array.length >> 1;
    }

    public static void main(String[] args) {
//        int [] arr = {11,22,33,44};
        Main main = new Main();

        main.printArray(main.array);
        System.out.println();
        main.clear();
        main.printArray(main.array);

        for (int i = 0; i < 6; i++){
            main.add(100, 3);
        }

        System.out.println();
        main.printArray(main.array);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        int index = 0;
//        while (index < arr.length) {
//            System.out.print(arr[index++] + " ");
//        }

//        int count = 0;
//        for (int ele : arr) {
//            count++;
//            if (count <= arr.length >> 1) {
//                System.out.print(ele + " ");
//            }
//        }

    }

    // 需求2: 往一个数组中，加值。要求1: 不允许跳位充值。要求2:数组长度不够的情况，需要数组动态扩容。

    /**
     * 1. 尾部追加
     * 2. 普通位置添加 （index <= length - 1）记得从后向前添加
     * 3. 在添加的过程中，如果容量不够，需要扩容
     */
    public void add(int element, int index) {
        if (index < 0 || index > array.length)  return;
        extendCapacity(size + 1);

        if (index == size){
            array[size] = element;
        }else {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
        }
        size++;
//        System.out.println(size);

    }

    public void extendCapacity(int capacity){
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

    // 需求1：把随机产生的数组的后一半给删掉。
    public void clear(){
        int mid = array.length >> 1;
        for (int i = mid; i < array.length; i++){
            array[i] = 0;
        }
    }

    public int[] getRandArray(int range, int length){
        if (length < 0) length = 10;
        Random random = new Random();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int randNum = random.nextInt(100); //[0, 100)
            array[i] = randNum;
        }

        return array;

    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1)  System.out.print(array[i] + " ");
            else System.out.print(array[i]);

        }
    }
}
