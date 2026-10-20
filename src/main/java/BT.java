/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class BT
implements Runnable {
    final String F;
    final lw_0 W;

    BT(lw_0 lw_02, String string) {
        this.W = lw_02;
        this.F = string;
    }

    @Override
    public void run() {
        try {
            this.W.Z.w.j(this.F, true, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

