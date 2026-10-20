/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oO
 */
class oo_1
implements Runnable {
    final ln_0 E;

    oo_1(ln_0 ln_02) {
        this.E = ln_02;
    }

    @Override
    public void run() {
        boolean bl = ln_2.R();
        ln_0 ln_02 = (ln_0)this.E;
        if (!bl) {
            if ((fc_0)ln_02.L != null) {
                try {
                    this.E.L.C();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            ln_02 = (ln_0)this.E;
        }
        ln_02.F = false;
    }
}

