package HW_6.HashSet.Task_3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueStrings {
    public static Set<String> getUniqueStrings(List<String> stringList){
        Set<String> uniqueSet = new HashSet<>(stringList);
        return uniqueSet;
    }
}
