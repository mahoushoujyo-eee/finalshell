/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Yq
 */
class yq_0
implements Runnable {
    final String N;
    final TL E;

    yq_0(TL tL, String string) {
        this.E = tL;
        this.N = string;
    }

    @Override
    public void run() {
        try {
            this.E.W.S.j(this.N, true, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

