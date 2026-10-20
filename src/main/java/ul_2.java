/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ul
 */
class ul_2
implements Runnable {
    final YQ U;

    ul_2(YQ yQ) {
        this.U = yQ;
    }

    @Override
    public void run() {
        try {
            this.U.Q(lk_0.K);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

