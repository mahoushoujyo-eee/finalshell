/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yL
 */
class yl_1
implements Runnable {
    final yt_1 l;

    yl_1(yt_1 yt_12) {
        this.l = yt_12;
    }

    @Override
    public void run() {
        try {
            xK.r(0);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

