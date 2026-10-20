/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class OM
implements Runnable {
    final U z;

    OM(U u10) {
        this.z = u10;
    }

    @Override
    public void run() {
        try {
            this.z.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

