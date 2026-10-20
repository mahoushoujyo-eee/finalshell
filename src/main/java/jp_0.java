/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Jp
 */
class jp_0
implements Runnable {
    final nj_0 L;

    jp_0(nj_0 nj_02) {
        this.L = nj_02;
    }

    @Override
    public void run() {
        try {
            this.L.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

