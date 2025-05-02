package practice_6.Collections.task_1.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 123.12);
        costCounter.addCosts(2, 1233.2);
        costCounter.addCosts(3, 3737.2);
        costCounter.addCosts(4, 344.2);
        costCounter.addCosts(5, 1233.2);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());
    }

}
