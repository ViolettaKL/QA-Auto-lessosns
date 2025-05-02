package practice_6.Collections.task_1.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // массив, индекс = номер месяца
    private ArrayList<Double> costPerMonth = new ArrayList<>();


    public CostCounter(){
        this.costPerMonth = new ArrayList<>();
    }

    // метод добавления значения по номеру месяца(от 1 до 12) и расходам в этот месяц
    public void addCosts(int month, Double costs){
        costPerMonth.add(month - 1, costs);
    }

    // метод получения значения расхода по месяцу
    public Double getCosts(int month){
        return costPerMonth.get(month-1);
    }

    // считать минимальный расход за месяц
    public Double minCostsPerMonth(){
        AtomicReference<Double> min = new AtomicReference<>(costPerMonth.getFirst());
        costPerMonth.forEach(
                costPerMonth -> {
                    if(costPerMonth < min.get()){
                        min.set(costPerMonth);
                    }
                }
        );
        return min.get();
    }
}
