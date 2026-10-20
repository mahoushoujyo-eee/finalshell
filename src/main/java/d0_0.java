/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from d0
 */
class d0_0
implements Runnable {
    final ff_0 s;

    d0_0(ff_0 ff_02) {
        this.s = ff_02;
    }

    @Override
    public void run() {
        try {
            this.s.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

