/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ce
 */
class ce_0
implements Runnable {
    ce_0() {
    }

    @Override
    public void run() {
        try {
            KM.S.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

