/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from mt
 */
class mt_0
implements Runnable {
    final xW V;

    mt_0(xW xW2) {
        this.V = xW2;
    }

    @Override
    public void run() {
        try {
            try {
                this.V.H.q();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

