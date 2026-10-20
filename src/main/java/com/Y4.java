/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O3;
import com.dm_2;
import com.dn_0;
import com.dy_1;
import com.ou_1;
import com.s_0;
import com.uJ;
import java.io.IOException;

class Y4 {
    O3[] G;
    int r;
    int R;
    final dy_1 Y;
    private static final String a;
    private static final long b;

    Y4(dy_1 dy_12, int n10) {
        block2: {
            this.Y = dy_12;
            boolean bl = dm_2.J();
            this.G = null;
            this.G = new O3[n10];
            for (int i2 = 0; i2 < this.G.length; ++i2) {
                this.G[i2] = new O3(this);
                if (!bl) {
                    if (!bl) continue;
                }
                break block2;
            }
            this.w();
        }
    }

    void w() {
        this.R = 0;
        this.r = 0;
    }

    void Y(int n10, long l2, int n11) {
        int n12;
        boolean bl = dm_2.J();
        int n13 = this.R;
        if (!bl) {
            if (n13 == 0) {
                this.r = 0;
            }
            n13 = n12 = this.r + this.R;
        }
        if (!bl) {
            if (n12 >= this.G.length) {
                n12 -= this.G.length;
            }
            this.G[n12].y = n10;
            this.G[n12].P = l2;
            this.G[n12].C = n11;
            ++this.R;
        }
    }

    /*
     * WARNING - void declaration
     */
    O3 y(int n10) throws ou_1, dn_0 {
        O3 o3;
        block21: {
            int n11;
            int n12;
            int n13;
            boolean bl;
            block19: {
                block20: {
                    --this.R;
                    bl = dm_2.J();
                    n13 = this.r++;
                    try {
                        try {
                            n12 = this.r;
                            n11 = this.G.length;
                            if (bl) break block19;
                            if (n12 != n11) break block20;
                        }
                        catch (ou_1 ou_12) {
                            throw Y4.a(ou_12);
                        }
                        this.r = 0;
                    }
                    catch (ou_1 ou_13) {
                        throw Y4.a(ou_13);
                    }
                }
                try {
                    o3 = this.G[n13];
                    if (bl) break block21;
                    n12 = o3.y;
                    n11 = n10;
                }
                catch (ou_1 ou_14) {
                    throw Y4.a(ou_14);
                }
            }
            if (n12 != n11) {
                int n14;
                long l2;
                block22: {
                    void var6_6;
                    l2 = this.M();
                    boolean n15 = false;
                    for (int i2 = 0; i2 < this.G.length; ++i2) {
                        boolean bl2;
                        block23: {
                            try {
                                try {
                                    try {
                                        n14 = this.G[i2].y;
                                        if (bl) break block22;
                                        if (bl) break block23;
                                    }
                                    catch (ou_1 ou_15) {
                                        throw Y4.a(ou_15);
                                    }
                                    if (n14 != n10) continue;
                                }
                                catch (ou_1 ou_16) {
                                    throw Y4.a(ou_16);
                                }
                                bl2 = true;
                            }
                            catch (ou_1 ou_17) {
                                throw Y4.a(ou_17);
                            }
                        }
                        var6_6 = bl2;
                        try {
                            this.G[i2].y = 0;
                            if (!bl) break;
                            if (!bl) continue;
                            break;
                        }
                        catch (ou_1 ou_18) {
                            throw Y4.a(ou_18);
                        }
                    }
                    n14 = var6_6;
                }
                try {
                    if (n14 != 0) {
                        throw new ou_1(this, l2);
                    }
                }
                catch (ou_1 ou_19) {
                    throw Y4.a(ou_19);
                }
                throw new dn_0(4, a + n10);
            }
            this.G[n13].y = 0;
            o3 = this.G[n13];
        }
        return o3;
    }

    int J() {
        return this.R;
    }

    int D() {
        return this.G.length;
    }

    void W(s_0 s_02, uJ uJ2) throws IOException {
        block9: {
            int n10 = this.R;
            boolean bl = dm_2.J();
            int n11 = 0;
            block6: while (true) {
                int n12 = n11;
                int n13 = n10;
                block7: while (n12 < n13) {
                    s_02 = dy_1.b(this.Y, uJ2, s_02);
                    int n14 = s_02.W;
                    if (bl) break block9;
                    for (int i2 = 0; i2 < this.G.length; ++i2) {
                        block10: {
                            O3 o3;
                            try {
                                o3 = this.G[i2];
                                if (bl) break block10;
                                n12 = o3.y;
                                n13 = s_02.w;
                                if (bl) continue block7;
                            }
                            catch (IOException iOException) {
                                throw Y4.a(iOException);
                            }
                            try {
                                if (n12 != n13) continue;
                                o3 = this.G[i2];
                            }
                            catch (IOException iOException) {
                                throw Y4.a(iOException);
                            }
                        }
                        try {
                            o3.y = 0;
                            if (!bl) break;
                            if (!bl) continue;
                            break;
                        }
                        catch (IOException iOException) {
                            throw Y4.a(iOException);
                        }
                    }
                    dy_1.B(this.Y, n14);
                    ++n11;
                    if (!bl) continue block6;
                }
                break;
            }
            this.w();
        }
    }

    long M() {
        long l2 = b;
        boolean bl = dm_2.J();
        for (int i2 = 0; i2 < this.G.length; ++i2) {
            long l3;
            block4: {
                int n10;
                block3: {
                    n10 = this.G[i2].y;
                    if (bl) break block3;
                    if (n10 == 0 && !bl) continue;
                    l3 = l2;
                    if (bl) break block4;
                    long l4 = l3 - this.G[i2].P;
                    n10 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                }
                if (n10 <= 0) continue;
                l3 = this.G[i2].P;
            }
            l2 = l3;
            if (!bl) continue;
        }
        return l2;
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
                char[] cArray3 = "By\"G7J\bAi6G7\u0003\\er8\\=N\u00120n6C'\\\u000fd<:Vr".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 76;
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
                            n17 = 92;
                            break;
                        }
                        case 1: {
                            n17 = 80;
                            break;
                        }
                        case 2: {
                            n17 = 31;
                            break;
                        }
                        case 3: {
                            n17 = 126;
                            break;
                        }
                        case 4: {
                            n17 = 30;
                            break;
                        }
                        case 5: {
                            n17 = 117;
                            break;
                        }
                        default: {
                            n17 = 48;
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
        long l2 = 4939171300816766569L;
        b = 0x3B7489DEEA033996L ^ l2;
    }
}

