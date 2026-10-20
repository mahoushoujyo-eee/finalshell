/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from Ya
 */
class ya_0
implements Comparator {
    ya_0() {
    }

    public int m(L1 l1, L1 l12) {
        long l2;
        long l3;
        try {
            l3 = (Long)l12.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            l2 = (Long)l1.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return Long.compare(l3, l2);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.m((Object)((L1)object), (Object)((L1)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

