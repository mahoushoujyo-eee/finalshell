/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from cZ
 */
class cz_1
implements aL {
    final CE y;

    cz_1(CE cE) {
        this.y = cE;
    }

    @Override
    public void v(Y9 y9) {
        try {
            this.y.P.v();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void D(Y9 y9) {
    }

    @Override
    public void K(Y9 y9) {
    }

    @Override
    public void P(Y9 y9) {
    }

    @Override
    public void U(Y9 y9) {
    }
}

