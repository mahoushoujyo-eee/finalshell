/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from Ux
 */
class ux_0
implements Runnable {
    final U h;
    private static final String a;

    ux_0(U u10) {
        this.h = u10;
    }

    @Override
    public void run() {
        ((aE)this.h.d).addPropertyChangeListener(a, new WL(this));
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
                char[] cArray3 = "\u0019I@c\u0002xi1OUk\u0012tt\u0013".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 95;
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
                            n17 = 34;
                            break;
                        }
                        case 1: {
                            n17 = 127;
                            break;
                        }
                        case 2: {
                            n17 = 105;
                            break;
                        }
                        case 3: {
                            n17 = 85;
                            break;
                        }
                        case 4: {
                            n17 = 57;
                            break;
                        }
                        case 5: {
                            n17 = 66;
                            break;
                        }
                        default: {
                            n17 = 68;
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
    }
}

