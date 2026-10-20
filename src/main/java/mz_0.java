/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from mz
 */
class mz_0
implements Runnable {
    final U N;

    mz_0(U u10) {
        this.N = u10;
    }

    @Override
    public void run() {
        F8 f82;
        Object object;
        try {
            object = this.N.C.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            f82 = (F8)object.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        F8 f83 = f82;
        if (f83.getClass().equals(CL.class)) {
            try {
                this.N.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

