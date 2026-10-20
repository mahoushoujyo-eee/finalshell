/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class F1
implements Runnable {
    final ux_2 H;

    F1(ux_2 ux_22) {
        this.H = ux_22;
    }

    @Override
    public void run() {
        try {
            this.H.y.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

