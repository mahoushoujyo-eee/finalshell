/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class WD
implements Runnable {
    final cc_0 O;

    WD(cc_0 cc_02) {
        this.O = cc_02;
    }

    @Override
    public void run() {
        try {
            this.O.u(lk_0.K);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

