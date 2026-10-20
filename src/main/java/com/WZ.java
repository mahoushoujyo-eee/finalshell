/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KB;
import com.dx_2;
import com.j_0;
import com.ko_0;
import com.pe_1;
import com.q_0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class WZ {
    private final List o = new ArrayList();
    private final Map r = new HashMap();
    private int B = 0;
    private static final String a;

    public List E(j_0 j_02) {
        String string = dx_2.g();
        j_0 j_03 = j_02;
        if (string == null) {
            if (j_03 instanceof q_0) {
                q_0 q_02 = (q_0)j_02;
                List list = (List)this.r.get(q_02.V());
                if (list != null) {
                    ArrayList<KB> arrayList = new ArrayList<KB>();
                    for (KB kB : list) {
                        KB kB2 = this.B(kB, q_02.p(), q_02.p() + q_02.length());
                        if (kB2 != null) {
                            arrayList.add(KB.Z((Integer)kB2.X - q_02.p(), (Integer)kB2.S - q_02.p()));
                        }
                        if (string == null) continue;
                    }
                    return arrayList;
                }
                return null;
            }
            j_03 = this.r.get(j_02);
        }
        return (List)((Object)j_03);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private KB B(@NotNull KB kB, int n10, int n11) {
        int n12 = Math.max((Integer)kB.X, n10);
        int n13 = Math.min((Integer)kB.S, n11);
        String string = dx_2.g();
        int n14 = n12;
        if (string == null) {
            if (n14 >= n13) return null;
            n14 = n12;
        }
        KB kB2 = KB.Z(n14, n13);
        return kB2;
    }

    public void I(ArrayList arrayList, int n10, int n11) {
        block8: {
            String string;
            block11: {
                KB kB;
                int n12;
                block9: {
                    block10: {
                        string = dx_2.g();
                        n12 = arrayList.size();
                        if (string != null) break block9;
                        if (n12 <= 1) break block10;
                        kB = KB.Z(n10, ((ko_0)arrayList.get((int)0)).G.length());
                        this.Z(((ko_0)arrayList.get((int)0)).G, kB);
                        if (string == null) break block11;
                    }
                    n12 = n10;
                }
                kB = KB.Z(n12, n11 + 1);
                this.Z(((ko_0)arrayList.get((int)0)).G, kB);
            }
            for (int i2 = 1; i2 < arrayList.size() - 1; ++i2) {
                this.Z(((ko_0)arrayList.get((int)i2)).G, KB.Z(0, ((ko_0)arrayList.get((int)i2)).G.length()));
                if (string == null) {
                    if (string == null) continue;
                }
                break block8;
            }
            int n13 = arrayList.size();
            if (string == null) {
                if (n13 > 1) {
                    KB kB = KB.Z(0, n11 + 1);
                    this.Z(((ko_0)arrayList.get((int)(arrayList.size() - 1))).G, kB);
                }
                n13 = this.o.add(new pe_1(arrayList, n10, n11, this.o.size() + 1, null)) ? 1 : 0;
            }
        }
    }

    private void Z(j_0 j_02, KB kB) {
        block4: {
            j_0 j_03;
            Map map;
            block2: {
                block3: {
                    String string = dx_2.g();
                    map = this.r;
                    j_03 = j_02;
                    if (string != null) break block2;
                    if (!map.containsKey(j_03)) break block3;
                    ((List)this.r.get(j_02)).add(kB);
                    if (string == null) break block4;
                }
                map = this.r;
                j_03 = j_02;
            }
            map.put(j_03, new ArrayList<KB>(List.of(kB)));
        }
    }

    @NotNull
    public List B() {
        return this.o;
    }

    @NotNull
    public pe_1 G() {
        this.q();
        return (pe_1)this.o.get(this.B);
    }

    @NotNull
    public pe_1 T() {
        this.q();
        this.B = (this.B + 1) % this.o.size();
        return this.G();
    }

    @NotNull
    public pe_1 U() {
        this.q();
        this.B = (this.B + this.o.size() - 1) % this.o.size();
        return this.G();
    }

    private void q() {
        if (this.o.isEmpty()) {
            throw new AssertionError((Object)a);
        }
    }

    public void Y() {
        this.r.clear();
        this.o.clear();
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
                char[] cArray3 = "V`y\f\u0012\nIk".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 123;
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
                            n17 = 99;
                            break;
                        }
                        case 1: {
                            n17 = 116;
                            break;
                        }
                        case 2: {
                            n17 = 34;
                            break;
                        }
                        case 3: {
                            n17 = 30;
                            break;
                        }
                        case 4: {
                            n17 = 29;
                            break;
                        }
                        case 5: {
                            n17 = 20;
                            break;
                        }
                        default: {
                            n17 = 95;
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

