package SearchAlgorithrm;

public class MaxAscendingString {
    private static String string = "FGEefgmnjkl";
    private static char[] chars = string.toCharArray();

    public static void main(String[] args) {

    }
    // not accomplish
    public static char[] findAscendingString (int index){
        int[] check = new int[chars.length];
        check[index] = 1;
        int i = index + 1;
        while ((i < chars.length)){
            if (chars[index] < chars[i]){
                i++;
                check[i] = 1;
            }else {
                i++;
            }
        }
        for (int j = check.length; j > 0; j--) {
            int[] newCheck = createNewCheck(check,j);
            if (isDiffrent(newCheck,check)) return charsFromCheck(newCheck);
        }
        return chars;
    }

    private static char[] charsFromCheck(int[] newCheck) {
        char[] result = new char[newCheck.length];
        for (int i = 0; i < newCheck.length; i++) {
            if (newCheck[i] == 1) result[i] = chars[i];
        }
        return result;
    }

    private static boolean isDiffrent(int[] newCheck, int[] check) {
        for (int i = 0; i < check.length; i++) {
            if (newCheck[i] != check[i]) return false;
        }
        return true;
    }
        // not accomplish
    private static int[] createNewCheck(int[] check, int j) {
        check[j] = 0;
        if (isAscendingString(check)) return check;
        if (j < check.length - 1)createNewCheck(check,j+1);
        if (j == check.length - 1) return check;
        return check;
    }

    private static boolean isAscendingString(int[] check) {
        String temp = "";
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 1) temp += chars[i] + "";
        }
        char[] charsOfTemp = temp.toCharArray();
        for (int i = 0; i < charsOfTemp.length; i++) {
            if (charsOfTemp[i] > charsOfTemp[i + 1]) return false;
        }
        return true;
    }

}
