/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cK
 */
class ck_1
implements Runnable {
    ck_1() {
    }

    @Override
    public void run() {
        int n10 = bn_1.C();
        try {
            bn_1.E(2);
        }
        catch (InterruptedException interruptedException) {
        }
        catch (Exception exception) {
            block7: {
                block8: {
                    try {
                        try {
                            exception.printStackTrace();
                            if (n10 != 0) break block7;
                            if (bg_2.D() != null) break block8;
                        }
                        catch (InterruptedException interruptedException) {
                            throw ck_1.a(interruptedException);
                        }
                        bg_2.t(exception);
                    }
                    catch (InterruptedException interruptedException) {
                        throw ck_1.a(interruptedException);
                    }
                }
                bg_2.b().interrupt();
            }
            bg_2.Y().interrupt();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

