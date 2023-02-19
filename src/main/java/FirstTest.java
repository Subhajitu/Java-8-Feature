import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstTest {


    public FirstTest() {
    }

    public  static void main(String[] args){
//double value;
List<Integer> inc = Arrays.asList(0,1,2,3,4,4,5,5,6,7,7,8,9);
  List<Integer> uniqueList = new ArrayList<>();
  for(Integer i : inc) {
      if (!uniqueList.contains(i)) {
          uniqueList.add(i);
      }
  }
      System.out.println("print the list in imperative way" +uniqueList);

List<Integer> Uniquelist1= inc.stream().distinct().collect(Collectors.toList());
System.out.println("print the list in Declarative way" +Uniquelist1);
    }
}
