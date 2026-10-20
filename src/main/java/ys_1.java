/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from yS
 */
class ys_1
implements Runnable {
    int w;
    final a0 W;
    private final byte[] g;
    private final DataOutputStream c;
    private final int x;
    private final DataInputStream d;
    private final int L;
    private static final long a;

    ys_1(a0 a02, byte[] byArray, DataOutputStream dataOutputStream, int n10, DataInputStream dataInputStream, int n11) {
        this.W = a02;
        this.g = byArray;
        this.c = dataOutputStream;
        this.x = n10;
        this.d = dataInputStream;
        this.L = n11;
        this.w = 0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var2_1 = new byte[this.W.q];
        var3_2 = 0;
        var4_3 = System.currentTimeMillis();
        var1_4 = QI.N();
        try {
            block15: {
                try {
                    v0 = this;
                    if (var1_4 != null) {
                        if (v0.g == null) break block15;
                    }
                    ** GOTO lbl16
                }
                catch (IOException v1) {
                    throw ys_1.a(v1);
                }
                try {
                    v0 = this;
lbl16:
                    // 2 sources

                    v0.c.write(this.g, 0, this.x);
                }
                catch (IOException var6_5) {
                    var6_5.printStackTrace();
                    this.W.W();
                    return;
                }
            }
            var6_6 = false;
            try {
                if (var1_4 != null) ** GOTO lbl34
                do {
                    var7_7 = (int)ys_1.a * var3_2 / this.L;
                    var9_9 = System.currentTimeMillis();
                    try {
                        this.c.write(var2_1, 0, var3_2);
                    }
                    catch (IOException var11_10) {
                        if (var1_4 != null) break;
                    }
lbl34:
                    // 3 sources

                } while ((var3_2 = this.d.read(var2_1)) > 0);
            }
            catch (IOException var7_8) {}
        }
        finally {
            this.W.W();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2888595925355835383L;
        a = 0xD0DB1178E79AC1FL ^ l2;
    }
}

