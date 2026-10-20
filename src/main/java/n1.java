/*
 * Decompiled with CFR 0.152.
 */
class n1
implements Runnable {
    private static final long a;

    n1() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        int n10 = bn_1.C();
        try {
            bn_1.E(2);
            for (int i2 = 0; i2 < (int)a; ++i2) {
                try {
                    bn_1.y.write(new byte[4]);
                    if (n10 == 0 && n10 == 0) continue;
                    return;
                }
                catch (InterruptedException interruptedException) {
                    throw n1.a(interruptedException);
                    return;
                }
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        catch (Exception exception) {
            block10: {
                block11: {
                    try {
                        try {
                            exception.printStackTrace();
                            if (n10 != 0) break block10;
                            if (ba_2.A() != null) break block11;
                        }
                        catch (InterruptedException interruptedException) {
                            throw n1.a(interruptedException);
                        }
                        ba_2.c(exception);
                    }
                    catch (InterruptedException interruptedException) {
                        throw n1.a(interruptedException);
                    }
                }
                ba_2.y().interrupt();
            }
            ba_2.D().interrupt();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5760534633227030836L;
        a = 0xCC03E71771D512DCL ^ l2;
    }
}

