/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uN
 */
class un_1
implements Runnable {
    final DI k;
    final F6 n;

    un_1(F6 f62, DI dI) {
        this.n = f62;
        this.k = dI;
    }

    @Override
    public void run() {
        try {
            try {
                F6.n(this.n, this.k);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

