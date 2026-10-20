/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from tT
 */
class tt_1
implements Runnable {
    final UZ J;

    tt_1(UZ uZ2) {
        this.J = uZ2;
    }

    @Override
    public void run() {
        try {
            this.J.P.s.a(this.J.P, this.J.P);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

