/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ka
 */
class ka_2
implements Runnable {
    final U E;

    ka_2(U u10) {
        this.E = u10;
    }

    @Override
    public void run() {
        try {
            this.E.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

