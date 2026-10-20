/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wg
 */
class wg_0
implements Runnable {
    final _y_0 C;
    final U h;

    wg_0(U u10, _y_0 _y_02) {
        this.h = u10;
        this.C = _y_02;
    }

    @Override
    public void run() {
        ty_0 ty_02 = ((_y_0)this.C).M();
        String[] stringArray = F8.y();
        ty_0 ty_03 = ty_02;
        if (stringArray == null) {
            if (ty_03 != null) {
                try {
                    ty_02.p();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            ty_03 = new ty_0((_y_0)this.C);
        }
        ty_0 ty_04 = ty_03;
        ((_y_0)this.C).V(ty_04);
        try {
            ty_04.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

