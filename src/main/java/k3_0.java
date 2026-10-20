/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from k3
 */
class k3_0
implements Comparator {
    final ln_0 T;

    k3_0(ln_0 ln_02) {
        this.T = ln_02;
    }

    public int S(kb_2 kb_22, kb_2 kb_23) {
        long l2;
        long l3;
        try {
            l3 = (Long)kb_23.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            l2 = (Long)kb_22.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return Long.compare(l3, l2);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.S((Object)((kb_2)object), (Object)((kb_2)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

