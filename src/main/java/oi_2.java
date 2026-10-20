/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oi
 */
class oi_2
implements Runnable {
    final CB X;

    oi_2(CB cB) {
        this.X = cB;
    }

    @Override
    public void run() {
        try {
            this.X.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

