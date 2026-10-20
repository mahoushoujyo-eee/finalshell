/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class OY
implements Comparable {
    private dm_1 v;
    int t;

    public OY(dm_1 dm_12, int n10) {
        this.v = dm_12;
        this.t = n10;
    }

    public int d(OY oY) {
        int n10;
        try {
            n10 = (Integer)dm_1.e(this.v, this.t, oY.t);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }

    public int compareTo(Object object) {
        int n10;
        try {
            n10 = (Integer)this.d((OY)object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

