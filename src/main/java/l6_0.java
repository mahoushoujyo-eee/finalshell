/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from l6
 */
class l6_0
implements Runnable {
    final JA O;

    l6_0(JA jA) {
        this.O = jA;
    }

    @Override
    public void run() {
        try {
            this.O.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

