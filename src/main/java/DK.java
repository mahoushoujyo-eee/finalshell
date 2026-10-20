/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class DK
implements Runnable {
    final aM q;

    DK(aM aM2) {
        this.q = aM2;
    }

    @Override
    public void run() {
        try {
            this.q.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

