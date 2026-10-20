/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class K4
implements Runnable {
    final WT v;

    K4(WT wT) {
        this.v = wT;
    }

    @Override
    public void run() {
        try {
            this.v.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

