/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class aC
implements Runnable {
    final km_0 i;

    aC(km_0 km_02) {
        this.i = km_02;
    }

    @Override
    public void run() {
        try {
            this.i.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

