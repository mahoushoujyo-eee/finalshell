/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class m1
implements Runnable {
    final String F;
    final LG p;

    m1(LG lG, String string) {
        this.p = lG;
        this.F = string;
    }

    @Override
    public void run() {
        try {
            this.p.s.w.j(this.F, true, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

