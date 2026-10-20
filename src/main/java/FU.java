/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class FU
implements Runnable {
    final yt_1 K;

    FU(yt_1 yt_12) {
        this.K = yt_12;
    }

    @Override
    public void run() {
        try {
            m6.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

