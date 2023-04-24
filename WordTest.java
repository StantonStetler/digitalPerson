import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.compress.utils.Lists;

import java.util.Comparator;
import java.util.List;

/**
 * @author demo
 * @date 2022/08/10 18:03
 **/
public class WordTest {
    public static void main(String[] args) {
        List<String> list = CollUtil.toList("a", "b", "A", "B");
        if (CollUtil.isNotEmpty(list)) {
            // resource sort
            list.sort((o1, o2) -> {
                Comparator<String> comparator = new StringComparator(true);
                return comparator.compare(o1, o2);
            });

        }
        list.stream().forEach(e -> {
            System.out.println(e);
        });
    }
}