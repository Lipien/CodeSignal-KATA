package pl.pawtel.uniqueNames;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> mySet1 = new HashSet<String>(Arrays.asList(names1));
        Set<String> mySet2 = new HashSet<String>(Arrays.asList(names2));
        Set<String> union = new HashSet<String>(mySet1);
        union.addAll(mySet2);
        return union.toArray(new String[union.size()]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        String[] names = uniqueNames(names1, names2);
        Arrays.sort(names);
        for (String n : names)
            System.out.print(" " + n); // should print Ava, Emma, Olivia, Sophia
    }
}
