/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class C1
implements Runnable {
    final yt_1 Q;

    C1(yt_1 yt_12) {
        this.Q = yt_12;
    }

    @Override
    public void run() {
        try {
            lk_0.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

