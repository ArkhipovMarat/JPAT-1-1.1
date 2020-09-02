import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("создаем список");
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        logger.log("выводим список на экран");
        System.out.println(arrayList);

        int threshold = 5;
        logger.log("задаем границу для фильтрации - " + threshold);


        logger.log("начинаем фильтрацию");
        Filter filter = new Filter(threshold);
        List<Integer> newArrayList = filter.filterOut(arrayList);

        logger.log("фильтр прошло " + newArrayList.size() + " элементов из " + arrayList.size());
        logger.log("выводим новый список на экран");
        System.out.println(newArrayList);
    }
}
