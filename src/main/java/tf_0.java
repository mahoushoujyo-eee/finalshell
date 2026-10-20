/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Tf
 */
class tf_0
implements Runnable {
    final yt_1 y;

    tf_0(yt_1 yt_12) {
        this.y = yt_12;
    }

    @Override
    public void run() {
        try {
            U.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

