/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wl
 */
class wl_0
implements Runnable {
    final yt_1 n;

    wl_0(yt_1 yt_12) {
        this.n = yt_12;
    }

    @Override
    public void run() {
        this.n.U = new DU(null);
        this.n.y2 = new aW((DU)this.n.U);
        try {
            this.n.U.E(this.n.y2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

