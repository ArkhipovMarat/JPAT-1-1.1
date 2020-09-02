import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut (List<Integer> source) {
        Logger logger = Logger.getInstance();
        Stream<Integer> stream = source.stream();
        return stream.filter(value -> {
            logger.log(logMessage(value));
            return value > threshold;}).collect(Collectors.toList());
    }

    public String logMessage (Integer value) {
        if (value <= threshold) {
            return "Элемент " + value + " не проходит фильтрацию";
        } else
            return "Элемент " + value + " проходит фильтрацию";
    }
}
