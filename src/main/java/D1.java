/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class D1
implements Runnable {
    final ul_0 W;

    D1(ul_0 ul_02) {
        this.W = ul_02;
    }

    @Override
    public void run() {
        try {
            this.W.e.T();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

