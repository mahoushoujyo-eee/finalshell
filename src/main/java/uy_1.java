/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uY
 */
class uy_1
implements tk_2 {
    final boolean M;
    final jx_0 q;

    uy_1(jx_0 jx_02, boolean bl) {
        this.q = jx_02;
        this.M = bl;
    }

    @Override
    public void R(U u10) {
        try {
            u10.w(this.M);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

