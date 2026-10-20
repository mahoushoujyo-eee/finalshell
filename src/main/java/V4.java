/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class V4
implements fb_0 {
    final f7_0 D;

    V4(f7_0 f7_02) {
        this.D = f7_02;
    }

    @Override
    public void O(ty_2 ty_22) {
        int n10;
        try {
            n10 = (Integer)ty_22.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (n10 == ty_2.M) {
            try {
                this.D.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

