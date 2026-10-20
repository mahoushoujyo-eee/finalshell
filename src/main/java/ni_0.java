/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ni
 */
class ni_0
implements Runnable {
    final tf_2 G;
    final String p;
    final a3 O;

    ni_0(a3 a32, tf_2 tf_22, String string) {
        this.O = a32;
        this.G = tf_22;
        this.p = string;
    }

    @Override
    public void run() {
        try {
            this.O.z.O(this.G);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.O.h.M(this.p);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = ((km_0)this.O.h).getSelectedRow();
        if (n10 > -1) {
            try {
                this.O.h.V(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

