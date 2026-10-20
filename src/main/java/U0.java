/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class U0
implements Runnable {
    final TF L;

    U0(TF tF) {
        this.L = tF;
    }

    @Override
    public void run() {
        try {
            this.L.V.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

