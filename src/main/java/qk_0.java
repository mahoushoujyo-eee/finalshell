/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Qk
 */
class qk_0
implements Runnable {
    final F6 l;

    qk_0(F6 f62) {
        this.l = f62;
    }

    @Override
    public void run() {
        try {
            this.l.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

