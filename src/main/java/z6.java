/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;

class z6
implements Runnable {
    final qu_0 j;
    private static final long a;

    z6(qu_0 qu_02) {
        this.j = qu_02;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var1_1 = QI.N();
        try {
            try {
                if (var1_1 != null) ** GOTO lbl19
                block7: while (true) {
                    var2_2 = new byte[(int)z6.a];
                    var3_4 = new DatagramPacket(var2_2, var2_2.length);
                    this.j.T.receive(var3_4);
                    this.j.K(var3_4);
                    v0 = var3_4.getLength();
                    if (var1_1 != null) {
                        try {
                            if (v0 > qu_0.Y) {
                                qu_0.Y = var3_4.getLength();
                            }
                        }
                        catch (IOException v1) {
                            throw z6.a(v1);
                        }
                    }
                    ** GOTO lbl21
lbl19:
                    // 2 sources

                    do {
                        v0 = this.j.n;
lbl21:
                        // 2 sources

                        if (v0 != 0) continue block7;
                    } while (var1_1 == null);
                    break;
                }
            }
            catch (IOException var2_3) {
                this.j.T();
            }
        }
        finally {
            this.j.T();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7554952516090738692L;
        a = 0x49C146E218883DD8L ^ l2;
    }
}

