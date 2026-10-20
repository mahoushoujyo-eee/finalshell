/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ot
 */
class ot_2
implements Runnable {
    final yt_1 I;

    ot_2(yt_1 yt_12) {
        this.I = yt_12;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = bh_2.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        yt_1.c = object;
    }
}

