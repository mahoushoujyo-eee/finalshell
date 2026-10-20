/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from f0
 */
class f0_0
implements Comparator {
    final yf_0 I;

    f0_0(yf_0 yf_02) {
        this.I = yf_02;
    }

    public int g(lv_2 lv_22, lv_2 lv_23) {
        long l2;
        long l3;
        try {
            l3 = (Long)lv_23.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            l2 = (Long)lv_22.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return Long.compare(l3, l2);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.g((Object)((lv_2)object), (Object)((lv_2)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

