/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

class TG
implements Runnable {
    final String W;
    final nq_0 Y;
    final List r;
    final String I;
    final nK J;

    TG(nK nK2, String string, nq_0 nq_02, List list, String string2) {
        this.J = nK2;
        this.W = string;
        this.Y = nq_02;
        this.r = list;
        this.I = string2;
    }

    @Override
    public void run() {
        String string;
        try {
            string = (String)F6.C(this.W);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        try {
            this.Y.Y(this.r, this.W, this.I, (Object)string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

