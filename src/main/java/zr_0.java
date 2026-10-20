/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from zr
 */
class zr_0
implements Runnable {
    final YI G;

    zr_0(YI yI) {
        this.G = yI;
    }

    @Override
    public void run() {
        try {
            this.G.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

