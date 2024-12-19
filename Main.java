import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(417, 918, 274, 399, 944, 979, 858, 560, 502, 960, 847, 205, 178, 801, 464, 408, 910, 485, 927, 434, 93, 776, 675, 232, 578, 198, 741, 897, 386, 690, 858, 806, 458, 475, 22, 300, 117, 830, 72, 535, 867, 631, 426, 157, 12, 540, 165, 731, 723, 599, 77, 589, 656, 257, 286, 288, 72, 268, 34, 234, 284, 787, 196, 981, 8, 733, 302, 747, 475, 678, 229, 257, 162, 557, 718, 303, 518, 414, 857, 580, 501, 938, 275, 907, 3, 987, 4, 282, 929, 938, 653, 739, 711, 40, 292, 124, 347, 979, 628, 524));
        System.out.println("Исходный ряд: " + numbers);
        while (numbers.size() > 1) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < numbers.size(); i += 2) {
                if (i + 1 < numbers.size()) {
                    result.add(numbers.get(i) + numbers.get(i + 1));
                } else {
                    result.add(numbers.get(i));
                }
            }
            numbers = result;
            System.out.println("Промежуточный результат: " + numbers);
        }
        System.out.println("Итоговое число: " + numbers.get(0));
    }
}

