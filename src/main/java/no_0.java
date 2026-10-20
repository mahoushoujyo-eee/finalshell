/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from no
 */
class no_0
implements Runnable {
    final U i;

    no_0(U u10) {
        this.i = u10;
    }

    @Override
    public void run() {
        try {
            this.i.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

