/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class UM
implements Runnable {
    final f3_0 w;

    UM(f3_0 f3_02) {
        this.w = f3_02;
    }

    @Override
    public void run() {
        try {
            this.w.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

