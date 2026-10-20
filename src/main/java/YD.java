/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class YD
implements Runnable {
    final WT O;

    YD(WT wT) {
        this.O = wT;
    }

    @Override
    public void run() {
        try {
            this.O.g.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

