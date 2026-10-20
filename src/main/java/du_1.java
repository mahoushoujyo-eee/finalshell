/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from dU
 */
class du_1
implements Runnable {
    final yj_1 o;

    du_1(yj_1 yj_12) {
        this.o = yj_12;
    }

    @Override
    public void run() {
        block6: {
            Object object;
            wx_0 wx_02;
            block5: {
                int[] nArray = a3.I();
                wx_02 = (wx_0)this.o.W;
                if (nArray == null) break block5;
                if ((tf_2)wx_02.G == null) break block6;
                wx_02 = (wx_0)this.o.W;
            }
            try {
                object = wx_02.d.R();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.V(this.o.W.G);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

