/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class CD
implements Runnable {
    final YQ M;

    CD(YQ yQ) {
        this.M = yQ;
    }

    @Override
    public void run() {
        try {
            this.M.Q(lk_0.p);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

