package _03_method;

/**
 * 给定一个数组： eg {1,3,4,2,5}
 * 找出数组中每个值，左侧比该数值小的所有值，加在一起，得出一个和。
 * 把每个和加在一起，得出一个sum。
 * return this sum.
 * eg.
 * 1: null
 * 3: 1
 * 4: 1, 3
 * 2: 1
 * 5: 1,3,4,2
 * sum = 0 + 1 + 1 + 3 + 1 + 1 + 3 + 4 + 2 = 16
 */
public class Sum {

    public static void main(String[] args) {
        int[] array = {1,3,4,2,5};
        System.out.println(sum(array));
    }

    public static int sum(int[] arr) {
//        int sum = 0;
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] < arr[i]) {
//                    sum += arr[j];
//                }
//            }
//        }
//        return sum;
        return mergeSort(arr);
    }

    private static int mergeSort(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int l, int r) {
        if (l == r) return 0;
        int mid = (l + r) >> 1;
        return mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r) + merge(arr,l,mid,r);
    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int p1 = l;
        int p2 = mid + 1;
        int index = 0;
        int sum = 0;
        int[] help = new int[r - l + 1]; // 注意这个数组的长度
        while (p1 <= mid && p2 <= r) {
//            if (arr[p1] < arr[p2]) {
//                help[index++] = arr[p1++];
//            }else {
//                help[index++] = arr[p2++];
//            }
            sum += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++]; // 三位运算符来简化
        }

        while (p1 <= mid) help[index++] = arr[p1++];
        while (p2 <= r) help[index++] = arr[p2++];
        for (int i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }

        return sum;
    }
}
