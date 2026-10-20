/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Kx
 */
class kx_0
implements Runnable {
    final da_1 E;

    kx_0(da_1 da_12) {
        this.E = da_12;
    }

    @Override
    public void run() {
        try {
            this.E.s.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

