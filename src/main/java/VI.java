/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class VI
implements Runnable {
    final mT h;

    VI(mT mT2) {
        this.h = mT2;
    }

    @Override
    public void run() {
        try {
            this.h.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

