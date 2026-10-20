/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from d3
 */
class d3_0
implements Runnable {
    final aa_0 Q;

    d3_0(aa_0 aa_02) {
        this.Q = aa_02;
    }

    @Override
    public void run() {
        try {
            this.Q.E.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

