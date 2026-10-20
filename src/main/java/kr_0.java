/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Kr
 */
class kr_0
implements Runnable {
    final zD s;

    kr_0(zD zD2) {
        this.s = zD2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var1_2 = zD.d();
        for (var2_1 = 0; var2_1 < dd_1.e; ++var2_1) {
            try {
                v0 = (zD)this.s;
                if (!var1_2) {
                    if (v0.P) break;
                }
                ** GOTO lbl14
            }
            catch (Exception v1) {
                throw kr_0.a(v1);
            }
            try {
                v0 = (zD)this.s;
lbl14:
                // 2 sources

                try {
                    v0.D();
                    continue;
                }
                catch (InvocationTargetException v2) {
                    throw v2.getTargetException();
                }
            }
            catch (Exception var3_3) {
                try {
                    if (!var1_2) break;
                    if (!var1_2) continue;
                    break;
                }
                catch (Exception v3) {
                    throw kr_0.a(v3);
                }
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

