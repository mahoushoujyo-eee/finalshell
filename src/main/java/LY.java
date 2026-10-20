/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class LY
implements Runnable {
    final L9 n;
    final kd_0 G;

    LY(kd_0 kd_02, L9 l9) {
        this.G = kd_02;
        this.n = l9;
    }

    @Override
    public void run() {
        try {
            this.G.O.f(this.n);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

