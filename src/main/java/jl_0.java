/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from Jl
 */
class jl_0
implements Comparator {
    jl_0() {
    }

    public int I(ln_2 ln_22, ln_2 ln_23) {
        int n10;
        int n11;
        try {
            n11 = (Integer)ln_22.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)ln_23.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return Integer.compare(n11, n10);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.I((Object)((ln_2)object), (Object)((ln_2)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

