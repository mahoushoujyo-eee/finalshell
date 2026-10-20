/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from zk
 */
class zk_0
implements Runnable {
    final gJ X;

    zk_0(gJ gJ2) {
        this.X = gJ2;
    }

    @Override
    public void run() {
        try {
            this.X.T.G(ka_1.a, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

