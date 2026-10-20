/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class F9
implements Runnable {
    final cc_0 F;

    F9(cc_0 cc_02) {
        this.F = cc_02;
    }

    @Override
    public void run() {
        try {
            this.F.u(lk_0.s);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

