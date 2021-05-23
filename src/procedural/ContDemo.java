package procedural;

public class ContDemo {
    public static void main(String[] args) {
        int i;
        //вывод чётный чисел от 0 до 100
        for (i = 0; i < 100; i++) {
            if ((i%2) != 0) continue;
            System.out.println(i);
        }
    }
}
