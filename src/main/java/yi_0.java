/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Yi
 */
class yi_0
implements Runnable {
    final t3_0 n;

    yi_0(t3_0 t3_02) {
        this.n = t3_02;
    }

    @Override
    public void run() {
        try {
            this.n.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

