package hw_6;

import java.util.List;

public class CompareAverageList {
    public final double getAverage(final List<Integer> list)  {
        if (list.size() == 0) {
            throw new RuntimeException("Список пуст");
        }
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }

    public final String compareAverage(final List<Integer> list1,
                                       final List<Integer> list2) {
        double mean1 = getAverage(list1);
        double mean2 = getAverage(list2);
        if (mean1 > mean2) {
            return "Cреднее арифметическое значение первого списка больше";
        } else if (mean1 < mean2) {
            return "Cреднее арифметическое значение второго списка больше";
        } else {
            return "Средние арифметические значения равны";
        }
    }
}
