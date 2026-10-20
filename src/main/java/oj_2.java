/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oj
 */
class oj_2
implements Runnable {
    final FA Q;

    oj_2(FA fA2) {
        this.Q = fA2;
    }

    @Override
    public void run() {
        try {
            this.Q.o.z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

