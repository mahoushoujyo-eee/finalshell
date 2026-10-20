/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class DM
implements Runnable {
    final lm_2 F;

    DM(lm_2 lm_22) {
        this.F = lm_22;
    }

    @Override
    public void run() {
        try {
            ka_0.i(this.F.t.G);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

