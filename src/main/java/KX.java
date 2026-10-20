/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class KX
implements Runnable {
    final o9_0 e;
    private final int u;

    KX(o9_0 o9_02, int n10) {
        this.e = o9_02;
        this.u = n10;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var2_1 = 0;
        var1_2 = QI.N();
        if (var1_2 != null) ** GOTO lbl34
        do {
            var3_3 = Math.abs(o9_0.U.nextInt());
            var4_4 = new WX(var3_3);
            var5_5 = var4_4.H();
            var5_5.setAddress(this.e.L);
            var5_5.setPort(this.e.b);
            try {
                var6_7 = 0;
                if (var1_2 != null) ** GOTO lbl17
                block5: while (true) {
                    this.e.k.send(var5_5);
                    do {
                        ++var6_7;
lbl17:
                        // 2 sources

                        if (var6_7 < this.e.R) continue block5;
                    } while (var1_2 == null);
                    break;
                }
            }
            catch (IOException var6_8) {
                var6_8.printStackTrace();
                break;
            }
            var6_6 = new lc_2();
            var6_6.q = var3_3;
            var6_6.T = System.currentTimeMillis();
            this.e.C.put(var3_3, var6_6);
            try {
                Thread.sleep(this.e.t);
            }
            catch (InterruptedException var7_9) {
                var7_9.printStackTrace();
            }
            ++var2_1;
lbl34:
            // 2 sources

        } while (var2_1 < this.u);
    }
}

