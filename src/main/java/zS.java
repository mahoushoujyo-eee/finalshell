/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;
import java.lang.reflect.InvocationTargetException;

class zS
implements Runnable {
    final KQ l;

    zS(KQ kQ) {
        this.l = kQ;
    }

    @Override
    public void run() {
        ne_2 ne_22;
        try {
            ne_22 = (ne_2)this.l.a.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ne_22.requestFocus();
    }
}

