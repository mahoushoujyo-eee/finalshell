/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.co_2;
import com.wp_1;

/*
 * Renamed from com.kr
 */
class kr_2
implements Runnable {
    final wp_1 B;
    private static final String a;

    kr_2(wp_1 wp_12) {
        this.B = wp_12;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block7: {
            long l2;
            block6: {
                long l3 = wp_1.h(this.B).lastModified();
                String string = co_2.n();
                l2 = l3;
                if (string != null) break block6;
                try {
                    block8: {
                        if (l2 <= wp_1.T()) break block7;
                        break block8;
                        catch (Exception exception) {
                            throw kr_2.a(exception);
                        }
                    }
                    l2 = l3;
                }
                catch (Exception exception) {
                    throw kr_2.a(exception);
                }
            }
            wp_1.D(l2);
            try {
                wp_1.p(this.B);
                System.out.println(a);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
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
                char[] cArray3 = "^\u0001v7O\u0003".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 90;
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
                            n17 = 118;
                            break;
                        }
                        case 1: {
                            n17 = 62;
                            break;
                        }
                        case 2: {
                            n17 = 64;
                            break;
                        }
                        case 3: {
                            n17 = 2;
                            break;
                        }
                        case 4: {
                            n17 = 116;
                            break;
                        }
                        case 5: {
                            n17 = 61;
                            break;
                        }
                        default: {
                            n17 = 10;
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

