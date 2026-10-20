/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class m7
implements Runnable {
    final da_1 P;

    m7(da_1 da_12) {
        this.P = da_12;
    }

    @Override
    public void run() {
        try {
            this.P.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

