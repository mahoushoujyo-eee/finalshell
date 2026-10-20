/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from xn
 */
class xn_0
implements Runnable {
    final u__0 I;

    xn_0(u__0 u__02) {
        this.I = u__02;
    }

    @Override
    public void run() {
        try {
            this.I.s.G(ka_1.O, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

