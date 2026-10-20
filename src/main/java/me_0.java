/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from me
 */
class me_0
implements Runnable {
    final yt_1 O;

    me_0(yt_1 yt_12) {
        this.O = yt_12;
    }

    @Override
    public void run() {
        try {
            cf_0.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

