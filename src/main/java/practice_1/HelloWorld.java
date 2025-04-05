package practice_1;

public class HelloWorld {

    public static void main(String[] args){
        int sum1 = sum(1001, 2000);
        System.out.println("Результат сложения "  + sum1);

        int mult1 = multiply(3, 2);
        System.out.println("Результат умножения " + mult1);
    }

    public static int sum(int x, int y){
        //тело метода
        return x + y; //возвращаемое значение из метода
    }

    public static int multiply(int p, int k){//аргументы метода
        int mult = p * k;// создана переменная, присвоено значение равное результату
        return mult;
    }

    public static int substrusct(int g, int l){
        return g - l;
    }
    //возвращаемый тип данных целое или нет?
    public static double divide(int s, int h) {
        return (double) s / h;
    }
}
