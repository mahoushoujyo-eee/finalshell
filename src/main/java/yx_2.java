/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yx
 */
class yx_2
implements Runnable {
    final int U;
    final di_0 M;

    yx_2(di_0 di_02, int n10) {
        this.M = di_02;
        this.U = n10;
    }

    @Override
    public void run() {
        block18: {
            int n10;
            block20: {
                String[] stringArray;
                block19: {
                    bq_0 bq_02;
                    block17: {
                        block16: {
                            Point point;
                            block15: {
                                Point point2 = ((bq_0)this.M.q).getMousePosition();
                                stringArray = aM.s();
                                point = point2;
                                if (stringArray != null) break block15;
                                if (point != null) break block16;
                                bq_02 = (bq_0)this.M.q;
                                if (stringArray != null) break block17;
                                point = ((yg_0)bq_02.F).getMousePosition();
                            }
                            if (point == null) break block18;
                        }
                        bq_02 = (bq_0)this.M.q;
                    }
                    n10 = bq_02.S;
                    if (stringArray != null) break block19;
                    if (n10 == 0) {
                        Object object;
                        Object object2;
                        try {
                            object2 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object = object2.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n10 = ((Boolean)object.Q()).booleanValue() ? 1 : 0;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block18;
                }
                if (stringArray != null) break block20;
                if (n10 == 0) break block18;
                long l2 = System.currentTimeMillis() - this.M.q.g - (long)this.U;
                n10 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
            }
            if (n10 >= 0) {
                try {
                    this.M.q.X.X(this.M.q.B);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

