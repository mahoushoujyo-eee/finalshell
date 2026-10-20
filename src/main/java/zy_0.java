/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from zy
 */
class zy_0
implements Runnable {
    final WT u;

    zy_0(WT wT) {
        this.u = wT;
    }

    @Override
    public void run() {
        try {
            this.u.C();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

