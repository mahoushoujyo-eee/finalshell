/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Tx
 */
class tx_0
implements Runnable {
    final yt_1 V;

    tx_0(yt_1 yt_12) {
        this.V = yt_12;
    }

    @Override
    public void run() {
        try {
            cf_0.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

