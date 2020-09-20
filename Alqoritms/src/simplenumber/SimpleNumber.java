package simplenumber;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleNumber {

    public static void main(String[] args) {

        int i, j, k = 0;
        Set<Integer> set = new TreeSet<Integer>();

        for (i = 0; i < 20; i++) {

            if (i % 2 == 0) {     //eger 2 ye bolunurse demekki sade deil
                continue;
            }

            for (j = 3; j < i; j++) {   ///2 den yuxari reqemlere bolunmesi yoxlanilir

                if (i % j == 0) {      ////eger 2 den yuxari ededlere tam bolunurse demek hemin eded sade deil  dovrden cixilir
                    break;

                } else {               /// 2 den boyuk ve ozunnen kicik ededlere bolundukde qaliq qalirsa demek sade ededdir
                    set.add(i);
                }

            }
        }
        System.out.println(set);
    }
}
