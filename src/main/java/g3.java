/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class g3
implements Runnable {
    final cq_1 L;

    g3(cq_1 cq_12) {
        this.L = cq_12;
    }

    @Override
    public void run() {
        this.L.T.H = new FP();
        this.L.T.i = new av_0((FP)this.L.T.H);
        this.L.T.W = new F7((FP)this.L.T.H);
        try {
            this.L.T.y8.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

