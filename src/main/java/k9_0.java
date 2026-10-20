/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from k9
 */
class k9_0
implements Comparator {
    final yf_0 j;

    k9_0(yf_0 yf_02) {
        this.j = yf_02;
    }

    public int v(lv_2 lv_22, lv_2 lv_23) {
        long l2;
        long l3;
        try {
            l3 = (Long)lv_23.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            l2 = (Long)lv_22.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return Long.compare(l3, l2);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.v((Object)((lv_2)object), (Object)((lv_2)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

