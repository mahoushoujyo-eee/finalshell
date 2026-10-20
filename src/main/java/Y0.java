/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class Y0
implements Runnable {
    final oa_0 j;

    Y0(oa_0 oa_02) {
        this.j = oa_02;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.j.P.d.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.R(this.j.P.G);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

