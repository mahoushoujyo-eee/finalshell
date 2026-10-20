/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class W5
implements Runnable {
    final FM z;

    W5(FM fM2) {
        this.z = fM2;
    }

    @Override
    public void run() {
        try {
            this.z.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

