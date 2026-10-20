/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from nt
 */
class nt_0
implements Runnable {
    final cc_0 x;

    nt_0(cc_0 cc_02) {
        this.x = cc_02;
    }

    @Override
    public void run() {
        try {
            this.x.u(lk_0.n);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

