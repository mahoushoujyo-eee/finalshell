/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class T
implements Runnable {
    final YQ c;

    T(YQ yQ) {
        this.c = yQ;
    }

    @Override
    public void run() {
        try {
            this.c.Q(lk_0.k);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

