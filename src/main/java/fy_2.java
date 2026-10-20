/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fy
 */
class fy_2
implements Runnable {
    final b7_0 n;

    fy_2(b7_0 b7_02) {
        this.n = b7_02;
    }

    @Override
    public void run() {
        try {
            this.n.T.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

