/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class VR
implements tk_2 {
    final m6 i;

    VR(m6 m62) {
        this.i = m62;
    }

    @Override
    public void R(U u10) {
        try {
            u10.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

