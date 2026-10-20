/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from go
 */
class go_0
implements Runnable {
    final lf_1 J;

    go_0(lf_1 lf_12) {
        this.J = lf_12;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.J.J);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        try {
            this.J.G.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

