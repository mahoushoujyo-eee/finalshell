/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class QW
implements Runnable {
    final String I;
    final mL l;

    QW(mL mL2, String string) {
        this.l = mL2;
        this.I = string;
    }

    @Override
    public void run() {
        try {
            this.l.T.g(this.I);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

