/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class B6
implements Runnable {
    final fx_0 Y;

    B6(fx_0 fx_02) {
        this.Y = fx_02;
    }

    @Override
    public void run() {
        try {
            this.Y.Y.s.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

