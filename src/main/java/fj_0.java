/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Fj
 */
class fj_0
implements Runnable {
    final U q;

    fj_0(U u10) {
        this.q = u10;
    }

    @Override
    public void run() {
        try {
            this.q.W();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

