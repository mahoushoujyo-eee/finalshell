/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class CZ
implements cq_0 {
    final YI J;
    final String W;
    final ca_2 i;

    CZ(ca_2 ca_22, YI yI, String string) {
        this.i = ca_22;
        this.J = yI;
        this.W = string;
    }

    @Override
    public void u(VO vO) {
        int n10;
        boolean bl = F6.g();
        try {
            n10 = (Integer)vO.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (n10 == VO.Y) {
            F6 f62;
            try {
                f62 = (F6)this.J.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!bl) {
                if (f62 != null) {
                    try {
                        f62 = (F6)this.J.F();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                try {
                    f62.c(this.J, this.W);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

