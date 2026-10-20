/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class OA
implements Runnable {
    final u8_0 F;
    final la_2 i;

    OA(la_2 la_22, u8_0 u8_02) {
        this.i = la_22;
        this.F = u8_02;
    }

    @Override
    public void run() {
        int n10;
        try {
            n10 = (Integer)this.F.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.i.Z.F(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

