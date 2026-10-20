/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Oq
 */
class oq_0
implements Runnable {
    final YQ p;

    oq_0(YQ yQ) {
        this.p = yQ;
    }

    @Override
    public void run() {
        try {
            this.p.Q(lk_0.s);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

