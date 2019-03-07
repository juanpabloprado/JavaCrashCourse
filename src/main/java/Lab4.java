import java.util.Arrays;

public class Lab4 {

    int[] nums = {1, 3, 7, 11, 13, 5};

    public static void main(String[] args) {

        Lab4 lab4 = new Lab4();
        lab4.usingAStream();

        lab4.usingStreamWithMethodReference();

    }

    public void usingAStream() {

        Arrays.stream(nums).sorted()
                .forEach(value -> {
                    System.out.println(value);
                });

    }

    public void usingStreamWithMethodReference() {

        Arrays.stream(nums).forEach(System.out::println);

    }
}
