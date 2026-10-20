/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oF
 */
class of_1
implements Runnable {
    final yt_1 E;

    of_1(yt_1 yt_12) {
        this.E = yt_12;
    }

    @Override
    public void run() {
        try {
            this.E.r();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

