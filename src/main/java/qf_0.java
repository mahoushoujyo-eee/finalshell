/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Qf
 */
class qf_0
implements Runnable {
    final dt_0 O;

    qf_0(dt_0 dt_02) {
        this.O = dt_02;
    }

    @Override
    public void run() {
        try {
            this.O.C.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

