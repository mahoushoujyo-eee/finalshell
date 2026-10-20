/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from dV
 */
class dv_1
implements Runnable {
    final cp_0 U;

    dv_1(cp_0 cp_02) {
        this.U = cp_02;
    }

    @Override
    public void run() {
        try {
            this.U.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

