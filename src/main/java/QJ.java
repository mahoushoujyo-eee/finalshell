/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

class QJ
implements Runnable {
    final String S;
    final nq_0 Q;
    final List r;
    final String K;
    final yd_0 I;

    QJ(yd_0 yd_02, String string, nq_0 nq_02, List list, String string2) {
        this.I = yd_02;
        this.S = string;
        this.Q = nq_02;
        this.r = list;
        this.K = string2;
    }

    @Override
    public void run() {
        String string;
        try {
            string = (String)F6.C(this.S);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        try {
            this.Q.Y(this.r, this.S, this.K, (Object)string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

