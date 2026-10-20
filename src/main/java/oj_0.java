/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Oj
 */
class oj_0
implements Runnable {
    final ox_1 U;

    oj_0(ox_1 ox_12) {
        this.U = ox_12;
    }

    @Override
    public void run() {
        try {
            this.U.A.t(this.U.k, this.U.k);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

