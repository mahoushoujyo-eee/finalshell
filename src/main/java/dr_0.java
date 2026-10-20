/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Dr
 */
class dr_0
implements Runnable {
    final String o;
    final BV b;

    dr_0(BV bV, String string) {
        this.b = bV;
        this.o = string;
    }

    @Override
    public void run() {
        try {
            this.b.n.t(this.o, true, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

