/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from xk
 */
class xk_0
implements Runnable {
    final yb_1 C;

    xk_0(yb_1 yb_12) {
        this.C = yb_12;
    }

    @Override
    public void run() {
        try {
            this.C.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

