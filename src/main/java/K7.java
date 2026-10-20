/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class K7
implements Runnable {
    final yt_1 p;

    K7(yt_1 yt_12) {
        this.p = yt_12;
    }

    @Override
    public void run() {
        try {
            this.p.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

