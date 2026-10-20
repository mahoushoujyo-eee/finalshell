/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from cE
 */
class ce_1
implements Runnable {
    final tf_2 H;
    final yy_1 y;

    ce_1(yy_1 yy_12, tf_2 tf_22) {
        this.y = yy_12;
        this.H = tf_22;
    }

    @Override
    public void run() {
        try {
            this.y.L.S.x(this.H);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

