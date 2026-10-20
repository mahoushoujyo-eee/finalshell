/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.OutputStream;

class J2
extends Thread {
    final yf_1 e;
    private final OutputStream c;
    private static final String a;
    private static final long b;

    J2(yf_1 yf_12, OutputStream outputStream) {
        this.e = yf_12;
        this.c = outputStream;
    }

    @Override
    public void run() {
        byte[] byArray = new byte[(int)b];
        int n10 = 0;
        while (true) {
            ++n10;
            try {
                this.c.write(byArray);
                System.out.println(a + n10);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return;
            }
        }
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
                char[] cArray3 = "\u5184\u5159\u5bde\u6243\u007f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 62;
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
                            n17 = 35;
                            break;
                        }
                        case 1: {
                            n17 = 2;
                            break;
                        }
                        case 2: {
                            n17 = 108;
                            break;
                        }
                        case 3: {
                            n17 = 109;
                            break;
                        }
                        case 4: {
                            n17 = 97;
                            break;
                        }
                        case 5: {
                            n17 = 5;
                            break;
                        }
                        default: {
                            n17 = 38;
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
        long l2 = 3504185238073316157L;
        b = 0x5C8FE28C7687178DL ^ l2;
    }
}

