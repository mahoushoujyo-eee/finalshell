/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class KH
implements Runnable {
    final LS A;

    KH(LS lS) {
        this.A = lS;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.A.M.d.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.x(this.A.V);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

