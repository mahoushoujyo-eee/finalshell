/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from dh
 */
class dh_2
implements Runnable {
    final _y_0 W;
    final U c;

    dh_2(U u10, _y_0 _y_02) {
        this.c = u10;
        this.W = _y_02;
    }

    @Override
    public void run() {
        try {
            this.c.z(this.W);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((_y_0)this.W).N().V(((_y_0)this.W).M());
        try {
            ((_y_0)this.W).N().t().p(((_y_0)this.W).M());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

