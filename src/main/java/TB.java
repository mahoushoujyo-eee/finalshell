/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class TB
implements Runnable {
    final JD E;

    TB(JD jD) {
        this.E = jD;
    }

    @Override
    public void run() {
        try {
            this.E.b.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

