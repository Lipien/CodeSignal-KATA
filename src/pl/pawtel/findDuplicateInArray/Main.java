package pl.pawtel.findDuplicateInArray;

public class Main {
    static int findDuplicate(int[] a) {
        int temp = 0;
        int duplicate = -1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicate = a[j];
                    break;
                }
            }
        }
        System.out.println("The duplicate is: " + duplicate);
        return duplicate;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 2, 8};
        findDuplicate(a);
    }
}
