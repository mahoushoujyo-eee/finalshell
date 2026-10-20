/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Da
 */
class da_0
implements Runnable {
    final f3_0 y;

    da_0(f3_0 f3_02) {
        this.y = f3_02;
    }

    @Override
    public void run() {
        try {
            this.y.Q.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

