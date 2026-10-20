/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from Om
 */
public class om_0
implements Comparator {
    public int x(Integer n10, Integer n11) {
        return n10.compareTo(n11);
    }

    public int V(Float f10, Float f11) {
        return f10.compareTo(f11);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.x((Object)((Integer)object), (Object)((Integer)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

