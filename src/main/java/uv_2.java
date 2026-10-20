/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uv
 */
class uv_2
implements Runnable {
    final o3_0 r;

    uv_2(o3_0 o3_02) {
        this.r = o3_02;
    }

    @Override
    public void run() {
        try {
            this.r.E.b.v.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((km_0)this.r.E.b).editCellAt(this.r.d, this.r.u);
    }
}

