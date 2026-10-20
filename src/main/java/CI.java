/*
 * Decompiled with CFR 0.152.
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class CI
implements GenericFutureListener {
    final xE q;

    CI(xE xE2) {
        this.q = xE2;
    }

    /*
     * Unable to fully structure code
     */
    public void operationComplete(Future var1_1) throws Exception {
        block9: {
            block8: {
                var2_2 = xE.I();
                try {
                    try {
                        if (var2_2 == 0) break block8;
                        if (var1_1.isSuccess()) {
                        }
                        ** GOTO lbl17
                    }
                    catch (Exception v0) {
                        throw CI.a(v0);
                    }
                    this.q.j();
                }
                catch (Exception v1) {
                    throw CI.a(v1);
                }
            }
            try {
                if (var2_2 != 0) break block9;
lbl17:
                // 2 sources

                this.q.V();
            }
            catch (Exception v2) {
                throw CI.a(v2);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

