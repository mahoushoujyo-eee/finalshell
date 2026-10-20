/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class J3
implements Runnable {
    final da_1 J;

    J3(da_1 da_12) {
        this.J = da_12;
    }

    @Override
    public void run() {
        try {
            this.J.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

