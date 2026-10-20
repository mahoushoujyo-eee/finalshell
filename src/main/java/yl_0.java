/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Yl
 */
class yl_0
implements Runnable {
    final CB y;

    yl_0(CB cB) {
        this.y = cB;
    }

    @Override
    public void run() {
        try {
            this.y.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

