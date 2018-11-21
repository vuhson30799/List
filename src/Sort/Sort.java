package Sort;

public class Sort {
    public static void main(String[] args) {
        System.out.println("SelectionSort: ");
        int[] unsort1 = {42,11,13,45,49};
        int[] sort1 = selectionSort(unsort1);

        System.out.println("BubbleSort: ");
        int[] unsort2 = {42,46,11,13,12};
        int[] sort2 = bubbleSort(unsort2);

        System.out.println("InserttionSort: ");
        int[] unsort3 = {42,47,43,45,44,15,14,16};
        int[] sort3 = insertionSort(unsort3);
    }
    public static int[] selectionSort (int[] unsort){
        int indexOfMinElement = 0, temp = 0;
        for (int i = 0; i < unsort.length - 1; i++) {
            indexOfMinElement = i;
            for (int j = i + 1; j < unsort.length; j++) {
                if (unsort[indexOfMinElement] > unsort[j]){
                    indexOfMinElement = j;
                }
            }
            if (indexOfMinElement != i){
                temp = unsort[indexOfMinElement];
                unsort[indexOfMinElement] = unsort[i];
                unsort[i] = temp;
            }
            System.out.println(i + ".");
            for (int x :
                    unsort) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        return unsort;
    }
    public static int[] insertionSort (int[] unsort){
        int j = 0, temp = 0;
        for (int i = 1; i < unsort.length; i++) {
            j = i - 1;
            temp = unsort[i];
            while (j >=0 && temp < unsort[j]){
                unsort[j + 1] = unsort[j];
                j--;
            }
            unsort[j + 1] = temp;
            System.out.println(i + ".");
            for (int x :
                    unsort) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        return unsort;
    }

    public static int[] bubbleSort (int[] unsort) {
        int temp = 0;
        boolean stop;
        for (int i = 0; i < unsort.length - 1; i++) {
            stop = true;
            for (int j = 0; j < unsort.length - 1 - i; j++) {
                if (unsort[j] > unsort[j + 1]){
                    temp = unsort[j + 1];
                    unsort[j + 1] = unsort[j];
                    unsort[j] = temp;
                    stop = false;
                }//
            }
            System.out.println(i + ".");
            for (int x :
                    unsort) {
                System.out.print(x + " ");
            }
            System.out.println();
            if (stop) break;
        }
        return unsort;
    }
}
