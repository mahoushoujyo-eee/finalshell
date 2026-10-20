/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from k6
 */
class k6_0
implements Runnable {
    final cc_0 c;

    k6_0(cc_0 cc_02) {
        this.c = cc_02;
    }

    @Override
    public void run() {
        try {
            this.c.u(lk_0.p);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

