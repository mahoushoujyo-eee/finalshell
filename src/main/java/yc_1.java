/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yC
 */
class yc_1
implements Runnable {
    final YQ e;

    yc_1(YQ yQ) {
        this.e = yQ;
    }

    @Override
    public void run() {
        try {
            this.e.Q(lk_0.n);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

