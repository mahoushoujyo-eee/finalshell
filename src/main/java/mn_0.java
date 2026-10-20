/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from mn
 */
class mn_0
implements cq_0 {
    final zD S;
    final String C;
    final String w;
    final JA P;

    mn_0(JA jA, zD zD2, String string, String string2) {
        this.P = jA;
        this.S = zD2;
        this.C = string;
        this.w = string2;
    }

    @Override
    public void u(VO vO) {
        block13: {
            block12: {
                boolean bl = F6.i();
                try {
                    int n10;
                    if (!bl) break block12;
                    try {
                        n10 = (Integer)vO.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (n10 != VO.Y) break block13;
                }
                catch (Exception exception) {
                    throw mn_0.a(exception);
                }
                try {
                    try {
                        this.S.f(this.P.V);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            this.P.I = System.currentTimeMillis();
            try {
                try {
                    lk_0.O(this.C, this.w, false);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

