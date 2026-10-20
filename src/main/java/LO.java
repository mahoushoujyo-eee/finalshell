/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.OutputStream;

class LO
extends Thread {
    final bg_0 k;
    private final OutputStream M;
    private static final String a;
    private static final long b;

    LO(bg_0 bg_02, OutputStream outputStream) {
        this.k = bg_02;
        this.M = outputStream;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var2_1 = new byte[(int)LO.b];
        var3_2 = 0;
        var1_3 = QI.N();
        if (var1_3 != null) ** GOTO lbl20
        block4: do {
            ++var3_2;
            try {
                this.M.write(var2_1);
                System.out.println(LO.a + var3_2);
                ** GOTO lbl15
            }
            catch (IOException var4_4) {
                try {
                    var4_4.printStackTrace();
                    if (var1_3 != null) break;
lbl15:
                    // 3 sources

                    while (true) {
                        ++var3_2;
                        continue block4;
                        break;
                    }
                }
                catch (IOException v0) {
                    throw LO.a(v0);
                }
            }
lbl20:
            // 2 sources

        } while (var3_2 < 5);
        ** while (var1_3 == null)
lbl22:
        // 1 sources

    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u51b9\u5160\u5b9d\u6212g".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 117;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 85;
                            break;
                        }
                        case 1: {
                            n17 = 112;
                            break;
                        }
                        case 2: {
                            n17 = 100;
                            break;
                        }
                        case 3: {
                            n17 = 119;
                            break;
                        }
                        case 4: {
                            n17 = 50;
                            break;
                        }
                        case 5: {
                            n17 = 117;
                            break;
                        }
                        default: {
                            n17 = 44;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 3842574752230863022L;
        b = 0x88C68863D99AF5D6L ^ l2;
    }
}

