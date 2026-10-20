/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Tt
 */
class tt_0
implements Runnable {
    final s F;

    tt_0(s s2) {
        this.F = s2;
    }

    @Override
    public void run() {
        try {
            this.F.V();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

