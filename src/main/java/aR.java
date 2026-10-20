/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class aR
implements Runnable {
    final aa_0 M;

    aR(aa_0 aa_02) {
        this.M = aa_02;
    }

    @Override
    public void run() {
        try {
            this.M.E.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

