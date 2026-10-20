/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

class K9
implements Comparator {
    final yf_0 Y;

    K9(yf_0 yf_02) {
        this.Y = yf_02;
    }

    public int C(lv_2 lv_22, lv_2 lv_23) {
        long l2;
        long l3;
        long l4;
        long l5;
        try {
            l5 = (Long)lv_22.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        long l6 = l5;
        int[] nArray = lv_2.H();
        try {
            l4 = (Long)lv_22.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (nArray != null) {
            long l7;
            try {
                l7 = (Long)lv_22.b();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (l4 > l7) {
                long l8;
                try {
                    l8 = (Long)lv_22.y();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                l6 = l8;
            }
            try {
                l4 = (Long)lv_23.b();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        long l9 = l4;
        try {
            l3 = (Long)lv_23.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            l2 = (Long)lv_23.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        long l10 = l3 - l2;
        long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
        if (nArray != null) {
            if (l11 > 0) {
                long l12;
                try {
                    l12 = (Long)lv_23.y();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                l9 = l12;
            }
            l11 = Long.compare(l9, l6);
        }
        return (int)l11;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.C((Object)((lv_2)object), (Object)((lv_2)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

