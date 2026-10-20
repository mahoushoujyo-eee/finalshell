/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ji
 */
class ji_0
implements fb_0 {
    final on_2 n;

    ji_0(on_2 on_22) {
        this.n = on_22;
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
                this.n.a();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

