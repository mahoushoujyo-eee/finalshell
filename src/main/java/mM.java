/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class mM
implements Q0 {
    final F5 V;

    mM(F5 f52) {
        this.V = f52;
    }

    @Override
    public void a(B0 b0) {
        try {
            this.V.L.a(((dx_1)this.V.F).n().C());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = ((dx_1)this.V.F).n().y();
        try {
            this.V.L.W(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

