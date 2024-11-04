public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {7,3,5,8,6,7,4,5};
        sort(arr);
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int ele:arr) {
            System.out.print(ele + " ");
        }
    }

    public static void sort(int[] arr){
        // 1. 创建counts数组 长度= max - min + 1
        //  找最大值和最小值
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i]; // 此处不算用comparison
            if (min > arr[i]) min = arr[i];
        }

        int[] counts = new int[max - min + 1];

        // 2. 统计元素出现的次数frequency
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i] - min]++;
        }

        // 3. 对counts 数组统计的元素出现的次数从左到右进行一次累加
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

        // 4. 创建新数组，存排序后的结果
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[--counts[arr[i] - min]] = arr[i];
        }

        //5. 把当前值，全都迁回原数组
        for (int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
        }

    }

    public static void sort1(int[] arr) {
        // 1. 找最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i]; // 此处不算用comparison
        }
        // 2. 创建一个新数组 （counts），用于统计元素出现的次数，长度为最大值+1
        int[] counts = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]] ++; //++ 的好处是让我们的值产生+1的效果；还可以让我们的指针向前移动，只是此处未呈现
        }
        // 3. 通过counts数组中所有非零元素的index进行排序

        // 新做一个指针，用于取出的index值放入原数组的index
        int index = 0;
        // 遍历counts 数组
        for (int i = 0; i < counts.length; i++) {
            while (counts[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
}
