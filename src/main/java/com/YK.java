/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.r4_0;

class YK
implements Runnable {
    final r4_0 o;
    private static final String a;

    YK(r4_0 r4_02) {
        this.o = r4_02;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block7: {
            long l2;
            block6: {
                long l3 = r4_0.B(this.o).lastModified();
                int[] nArray = r4_0.g();
                l2 = l3;
                if (nArray != null) break block6;
                try {
                    block8: {
                        if (l2 <= r4_0.A()) break block7;
                        break block8;
                        catch (Exception exception) {
                            throw YK.a(exception);
                        }
                    }
                    l2 = l3;
                }
                catch (Exception exception) {
                    throw YK.a(exception);
                }
            }
            r4_0.N(l2);
            try {
                r4_0.J(this.o);
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
                char[] cArray3 = "1FxWi\u001b".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 44;
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
                            n17 = 111;
                            break;
                        }
                        case 1: {
                            n17 = 15;
                            break;
                        }
                        case 2: {
                            n17 = 56;
                            break;
                        }
                        case 3: {
                            n17 = 20;
                            break;
                        }
                        case 4: {
                            n17 = 36;
                            break;
                        }
                        case 5: {
                            n17 = 83;
                            break;
                        }
                        default: {
                            n17 = 75;
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

