/*
 * Decompiled with CFR 0.152.
 */
class JZ
extends Thread {
    final ob_1 y;
    private static final long a;
    private static final long b;

    JZ(ob_1 ob_12) {
        this.y = ob_12;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block7: {
            var2_1 = 0;
            var1_2 = QI.N();
            try {
                if (var1_2 == null) {
                    while (true) {
                        if (this.y.k == null) break block7;
                        break;
                    }
                }
                ** GOTO lbl20
            }
            catch (InterruptedException v0) {
                throw JZ.a(v0);
            }
            if (var1_2 != null) ** GOTO lbl21
        }
        try {
            Thread.sleep(JZ.b);
        }
        catch (InterruptedException var3_3) {
            var3_3.printStackTrace();
        }
        do {
            ++var2_1;
lbl20:
            // 2 sources

            if (var2_1 < (int)JZ.a) ** continue;
lbl21:
            // 2 sources

        } while (var1_2 == null);
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7401182919832832537L;
        a = 0x27FFC5A006530A07L ^ l2;
        long l3 = 5282880152178032161L;
        b = 0x49508F822D887DC9L ^ l3;
    }
}

