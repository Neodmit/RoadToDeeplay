import java.util.ArrayList;
import java.util.List;

public class ExecutingСommands {
    public static List<Integer> getResult(final String input) {
        List<Integer> result = new ArrayList<Integer>();
        int workingNumber = 0;
        for (char symbol : input.toCharArray()) {
            switch (symbol) {
                case 'i':
                    workingNumber++;
                    break;
                case 'd':
                    workingNumber--;
                    break;
                case 's':
                    workingNumber = (int) Math.pow(workingNumber, 2);
                    break;
                case 'o':
                    result.add(workingNumber);
                    break;
            }
        }
        return result;
    }
}
