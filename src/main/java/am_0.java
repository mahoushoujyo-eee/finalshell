/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/*
 * Renamed from am
 */
class am_0
implements Runnable {
    final String W;
    final nq_0 C;
    final List D;
    final String x;
    final yd_0 M;

    am_0(yd_0 yd_02, String string, nq_0 nq_02, List list, String string2) {
        this.M = yd_02;
        this.W = string;
        this.C = nq_02;
        this.D = list;
        this.x = string2;
    }

    @Override
    public void run() {
        String string;
        try {
            string = (String)F6.C(this.W);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        try {
            this.C.Y(this.D, this.W, this.x, (Object)string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

