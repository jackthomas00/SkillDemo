import java.util.ArrayList;

import java.io.IOException;
import java.util.Arrays;

public class SkillDemo {
  public static Integer enumerate(Integer counter) {
    return counter + 1;
  }

  public static Integer getNumberFromList(ArrayList<Integer> listOfNums, Integer index) {
    return listOfNums.get(index);
  }

  public static void main(String[] args) throws IOException {
    Integer number = enumerate(11);
    Integer value = getNumberFromList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 4);

    System.out.println(number);
    System.out.println(value);
  }
}
