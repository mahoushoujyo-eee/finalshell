/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class m_
implements Runnable {
    final cc_0 A;

    m_(cc_0 cc_02) {
        this.A = cc_02;
    }

    @Override
    public void run() {
        try {
            this.A.u(lk_0.k);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

