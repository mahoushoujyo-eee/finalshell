/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Fo
 */
class fo_0
implements Runnable {
    final mx_0 S;

    fo_0(mx_0 mx_02) {
        this.S = mx_02;
    }

    @Override
    public void run() {
        try {
            KM.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

