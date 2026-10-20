/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class VZ
implements Runnable {
    final String Q;
    final boolean H;
    final boolean n;
    final F6 u;

    VZ(F6 f62, String string, boolean bl, boolean bl2) {
        this.u = f62;
        this.Q = string;
        this.H = bl;
        this.n = bl2;
    }

    @Override
    public void run() {
        try {
            this.u.s(this.Q, this.H, this.n);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.u.H(this.Q, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

