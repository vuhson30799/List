package Sort;

public class Sort {
    public static void main(String[] args) {
        int[] unsort = {42,11,13,45,49};
        /*int[] sort1 = selectionSort(unsort);
        System.out.println("SelectionSort: ");
        for (int x :
                sort1) {
            System.out.print(x + " ");
        }*/

       /* int[] sort2 = bubbleSort(unsort);
        System.out.println("BubbleSort: ");
        for (int x :
                sort2) {
            System.out.println(x + " ");
        }*/

       int[] sort3 = insertionSort(unsort);
        for (int x :
                unsort) {
            System.out.print(x + " ");
        }
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
        }
        return unsort;
    }

    public static int[] bubbleSort (int[] unsort) {
        int temp = 0;
        boolean stop;
        for (int i = 0; i < unsort.length - 1; i++) {
            stop = true;
            for (int j = i; j < unsort.length - 1; j++) {
                if (unsort[j] > unsort[j + 1]){
                    temp = unsort[j + 1];
                    unsort[j + 1] = unsort[j];
                    unsort[j] = temp;
                    stop = false;
                }
            }
            if (stop) break;
        }
        return unsort;
    }
}
