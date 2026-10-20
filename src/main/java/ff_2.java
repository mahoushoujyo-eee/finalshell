/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ff
 */
class ff_2
implements Runnable {
    final bq_0 h;

    ff_2(bq_0 bq_02) {
        this.h = bq_02;
    }

    @Override
    public void run() {
        try {
            bq_0.H(this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

