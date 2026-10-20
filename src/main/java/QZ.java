/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class QZ
implements Runnable {
    final ca_2 w;

    QZ(ca_2 ca_22) {
        this.w = ca_22;
    }

    @Override
    public void run() {
        try {
            this.w.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

