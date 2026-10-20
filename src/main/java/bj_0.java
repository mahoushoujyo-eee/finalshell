/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Bj
 */
class bj_0
implements Runnable {
    final F8 A;

    bj_0(F8 f82) {
        this.A = f82;
    }

    @Override
    public void run() {
        try {
            this.A.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

