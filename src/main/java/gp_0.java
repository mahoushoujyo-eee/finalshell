/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from gp
 */
class gp_0
implements Runnable {
    final or_1 j;

    gp_0(or_1 or_12) {
        this.j = or_12;
    }

    @Override
    public void run() {
        try {
            this.j.y.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

