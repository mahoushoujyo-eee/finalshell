/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ac
 */
class ac_0
implements Runnable {
    final Y3 e;

    ac_0(Y3 y3) {
        this.e = y3;
    }

    @Override
    public void run() {
        try {
            this.e.z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

