/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class T4
implements Runnable {
    final ya_2 G;

    T4(ya_2 ya_22) {
        this.G = ya_22;
    }

    @Override
    public void run() {
        try {
            ka_0.i(this.G.m.N);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

