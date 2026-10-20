/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YP;
import com.im_2;
import com.j_0;
import com.pt_1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.pl
 */
class pl_2
extends pt_1 {
    int h;
    final StringBuilder N;
    final Map x;
    final im_2 G;
    private static final String a;

    pl_2(im_2 im_22, StringBuilder stringBuilder, Map map) {
        this.G = im_22;
        this.N = stringBuilder;
        this.x = map;
        this.h = 0;
    }

    @Override
    public void N(int n10, int n11, @NotNull YP yP, @NotNull j_0 j_02, int n12) {
        boolean bl = j_0.g();
        int n13 = n10;
        if (bl) {
            if (n13 == 0) {
                this.N.append("\n");
            }
            n13 = yP.q();
        }
        int n14 = n13;
        pl_2 pl_22 = this;
        if (bl) {
            if (!pl_22.x.containsKey(n14)) {
                this.x.put(n14, this.h++);
            }
            pl_22 = this;
        }
        pl_22.N.append(String.format(a, this.x.get(n14)));
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
                char[] cArray3 = "GP6]\"".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 58;
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
                            n17 = 88;
                            break;
                        }
                        case 1: {
                            n17 = 90;
                            break;
                        }
                        case 2: {
                            n17 = 62;
                            break;
                        }
                        case 3: {
                            n17 = 3;
                            break;
                        }
                        case 4: {
                            n17 = 56;
                            break;
                        }
                        case 5: {
                            n17 = 75;
                            break;
                        }
                        default: {
                            n17 = 110;
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

