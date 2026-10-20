/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class nS
implements Runnable {
    final ty_0 m;

    nS(ty_0 ty_02) {
        this.m = ty_02;
    }

    @Override
    public void run() {
        try {
            this.m.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

