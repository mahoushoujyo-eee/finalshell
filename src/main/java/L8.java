/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class L8
implements Runnable {
    final aa_0 X;

    L8(aa_0 aa_02) {
        this.X = aa_02;
    }

    @Override
    public void run() {
        try {
            this.X.E.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

