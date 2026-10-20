/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class zQ
implements Runnable {
    final ul_0 A;

    zQ(ul_0 ul_02) {
        this.A = ul_02;
    }

    @Override
    public void run() {
        try {
            this.A.e.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

