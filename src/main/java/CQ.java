/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class CQ
implements Runnable {
    final dz_0 p;

    CQ(dz_0 dz_02) {
        this.p = dz_02;
    }

    @Override
    public void run() {
        try {
            this.p.V.u.h.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        boolean bl = ((km_0)this.p.V.u.s).editCellAt(this.p.n, 0);
    }
}

