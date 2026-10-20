/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class CR
implements cq_0 {
    final YI C;
    final String m;
    final F6 I;

    CR(F6 f62, YI yI, String string) {
        this.I = f62;
        this.C = yI;
        this.m = string;
    }

    @Override
    public void u(VO vO) {
        int n10;
        try {
            n10 = (Integer)vO.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (n10 == VO.Y) {
            try {
                this.I.c(this.C, this.m);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

