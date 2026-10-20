/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kL
 */
class kl_1
implements Runnable {
    final F5 X;

    kl_1(F5 f52) {
        this.X = f52;
    }

    @Override
    public void run() {
        try {
            this.X.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

