package procedural;

public class ContToLabel {
    public static void main(String[] args) {

        overloop:
        for (int i = 0; i < 10; i++) {
            System.out.print("\nВнешний цикл: проход " + i + ", внутренний цикл: ");
            for (int j = 0; j < 10; j++) {
                if(j == 5) continue overloop;
                System.out.print(j);
            }
        }
    }
}
