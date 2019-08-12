package Lesson_2;


import java.util.Random;

public class MainArray {
    public static void main(String[] args) {

        int size = 1_000_000;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = randomNumber();
        }

        checkSort(arr, "Bubble");
        checkSort(arr, "Select");
        checkSort(arr, "Insert");
        checkSort(arr, "fast");
    }

    private static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void checkSort(int[] arr, String methodOfSort){
        new Thread(new Runnable() {
            @Override
            public void run() {
                ArrayImpl<Integer> array = new ArrayImpl<>();

                for (int value : arr) {
                    array.add(value);
                }

                switch (methodOfSort){
                    case "Bubble":
                        System.out.println("Start bubble sorting");
                        long start = System.currentTimeMillis();
                        array.sortBubble();
                        long finish = System.currentTimeMillis();

                        double result = (finish - start) / 1000.0;

                        System.out.println("Bubble sort ready in " + result + " seconds");
                        break;

                    case "Select":
                        System.out.println("Start select sorting");
                        start = System.currentTimeMillis();
                        array.sortSelect();
                        finish = System.currentTimeMillis();

                        result = (finish - start) / 1000.0;

                        System.out.println("Select sort ready in " + result + " seconds");
                        break;

                    case "Insert":
                        System.out.println("Start insert sorting");
                        start = System.currentTimeMillis();
                        array.sortInsert();
                        finish = System.currentTimeMillis();

                        result = (finish - start) / 1000.0;

                        System.out.println("Insert sort ready in " + result + " seconds");
                        break;
                    case "fast":
                        System.out.println("Start fast sorting");
                        start = System.currentTimeMillis();
                        array.fastSort();
                        finish = System.currentTimeMillis();

                        result = (finish - start) / 1000.0;

                        System.out.println("Fast sort ready in " + result + " seconds");
                        break;
                }
            }
        }).start();
    }

}
