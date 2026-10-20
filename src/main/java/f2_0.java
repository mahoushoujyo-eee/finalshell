/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from f2
 */
class f2_0
implements Runnable {
    int I;
    final or_2 T;
    private final byte[] S;
    private final DataOutputStream L;
    private final int G;
    private final DataInputStream j;

    f2_0(or_2 or_22, byte[] byArray, DataOutputStream dataOutputStream, int n10, DataInputStream dataInputStream) {
        this.T = or_22;
        this.S = byArray;
        this.L = dataOutputStream;
        this.G = n10;
        this.j = dataInputStream;
        this.I = 0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var2_1 = new byte[this.T.c];
        var1_2 = qm_0.J();
        var3_3 = 0;
        try {
            block16: {
                try {
                    v0 = this;
                    if (var1_2 != null) {
                        if (v0.S == null) break block16;
                    }
                    ** GOTO lbl15
                }
                catch (IOException v1) {
                    throw f2_0.a(v1);
                }
                try {
                    v0 = this;
lbl15:
                    // 2 sources

                    v0.L.write(this.S, 0, this.G);
                }
                catch (IOException var4_4) {
                    var4_4.printStackTrace();
                    this.T.G();
                    return;
                }
            }
            var4_5 = false;
            try {
                if (var1_2 != null) ** GOTO lbl31
                block12: while (true) {
                    try {
                        this.L.write(var2_1, 0, var3_3);
                    }
                    catch (IOException var5_6) {
                        if (var1_2 != null) break;
                    }
lbl31:
                    // 3 sources

                    do {
                        if ((var3_3 = this.j.read(var2_1)) > 0) continue block12;
                    } while (var1_2 == null);
                    break;
                }
            }
            catch (IOException var5_7) {}
        }
        finally {
            this.T.G();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

