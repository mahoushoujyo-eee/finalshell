/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class n0
implements Q0 {
    final ty_0 N;

    n0(ty_0 ty_02) {
        this.N = ty_02;
    }

    @Override
    public void a(B0 b0) {
        try {
            this.N.U.a(((dx_1)this.N.k).n().C());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = ((dx_1)this.N.k).n().y();
        try {
            this.N.U.W(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

