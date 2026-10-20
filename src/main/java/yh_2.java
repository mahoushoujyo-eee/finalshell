/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yh
 */
class yh_2
implements tk_2 {
    final lv_2 g;
    final yf_0 F;

    yh_2(yf_0 yf_02, lv_2 lv_22) {
        this.F = yf_02;
        this.g = lv_22;
    }

    @Override
    public void R(U u10) {
        Object object;
        try {
            object = this.g.g();
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

