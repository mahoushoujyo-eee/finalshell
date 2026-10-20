/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from d4
 */
class d4_0
implements Runnable {
    final yt_1 t;

    d4_0(yt_1 yt_12) {
        this.t = yt_12;
    }

    @Override
    public void run() {
        try {
            this.t.x();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

