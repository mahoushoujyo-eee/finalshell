/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from aw
 */
class aw_0
implements Runnable {
    final YI R;

    aw_0(YI yI) {
        this.R = yI;
    }

    @Override
    public void run() {
        try {
            try {
                this.R.o.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

