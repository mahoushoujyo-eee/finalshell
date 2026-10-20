/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.HashMap;

/*
 * Renamed from tA
 */
class ta_1
implements Comparator {
    final HashMap j;
    final f8_0 y;

    ta_1(f8_0 f8_02, HashMap hashMap) {
        this.y = f8_02;
        this.j = hashMap;
    }

    public int I(Thread thread, Thread thread2) {
        Long l2 = (Long)((HashMap)this.j).get(thread.getId());
        Long l3 = (Long)((HashMap)this.j).get(thread2.getId());
        return l3.compareTo(l2);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.I((Object)((Thread)object), (Object)((Thread)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

