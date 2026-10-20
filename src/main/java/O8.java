/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class O8
implements Comparator {
    public int t(Long l2, Long l3) {
        String string = km_0.U();
        long l4 = l2 - l3;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (string == null) {
            if (l5 > 0) {
                return 1;
            }
            long l6 = l2 - l3;
            l5 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
        }
        if (string == null) {
            if (l5 < 0) {
                return -1;
            }
            l5 = 0;
        }
        return (int)l5;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.t((Object)((Long)object), (Object)((Long)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

