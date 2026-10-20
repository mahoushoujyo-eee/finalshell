/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Cx
 */
class cx_0
implements tk_2 {
    final lv_2 z;
    final yf_0 s;

    cx_0(yf_0 yf_02, lv_2 lv_22) {
        this.s = yf_02;
        this.z = lv_22;
    }

    @Override
    public void R(U u10) {
        Object object;
        try {
            object = this.z.g();
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

