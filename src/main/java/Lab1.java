public class Lab1 {

    int x = 14;
    int y = 7;

    public static void main(String[] args) {

        Lab1 lab1 = new Lab1();

        System.out.println(lab1.add());

        System.out.println(lab1.subtract());
    }

    public int add() {
        int x = 12;
        int y = 34;

        return x + y;

    }

    public int subtract() {

        return x - y;
    }

}
