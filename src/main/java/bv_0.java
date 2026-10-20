/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Bv
 */
class bv_0
implements Runnable {
    final ty_0 V;

    bv_0(ty_0 ty_02) {
        this.V = ty_02;
    }

    @Override
    public void run() {
        try {
            c.d(395648233250236832L).invoke(null, c.a(this.V));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

