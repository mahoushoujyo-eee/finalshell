/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ad
 */
class ad_0
implements tk_2 {
    final lv_2 n;
    final yf_0 L;

    ad_0(yf_0 yf_02, lv_2 lv_22) {
        this.L = yf_02;
        this.n = lv_22;
    }

    @Override
    public void R(U u10) {
        Object object;
        try {
            object = this.n.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            u10.j(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

