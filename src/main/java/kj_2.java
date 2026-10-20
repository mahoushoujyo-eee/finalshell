/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kj
 */
class kj_2
implements Runnable {
    final yt_1 d;

    kj_2(yt_1 yt_12) {
        this.d = yt_12;
    }

    @Override
    public void run() {
        long l2 = System.currentTimeMillis();
        this.d.T = new fx_2();
        try {
            this.d.T.J();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

