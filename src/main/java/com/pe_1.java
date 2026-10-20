/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KB;
import com.L7;
import com.XE;
import com.dx_2;
import com.ko_0;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.pE
 */
public class pe_1 {
    final ArrayList Q;
    final int h;
    final int L;
    final int Y;

    private pe_1(ArrayList arrayList, int n10, int n11, int n12) {
        this.Q = new ArrayList(arrayList);
        this.h = n10;
        this.L = n11;
        this.Y = n12;
    }

    @NotNull
    public String O() {
        StringBuilder stringBuilder;
        block10: {
            int n10;
            block14: {
                String string;
                block13: {
                    KB kB;
                    int n11;
                    block11: {
                        block12: {
                            stringBuilder = new StringBuilder();
                            string = dx_2.g();
                            n11 = this.Q.size();
                            if (string != null) break block11;
                            if (n11 <= 1) break block12;
                            kB = KB.Z(this.h, ((ko_0)this.Q.get((int)0)).G.length());
                            stringBuilder.append(((ko_0)this.Q.get((int)0)).G.D(kB));
                            if (string == null) break block13;
                        }
                        n11 = this.h;
                    }
                    kB = KB.Z(n11, this.L + 1);
                    stringBuilder.append(((ko_0)this.Q.get((int)0)).G.D(kB));
                }
                for (int i2 = 1; i2 < this.Q.size() - 1; ++i2) {
                    stringBuilder.append(((ko_0)this.Q.get((int)i2)).G);
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block10;
                }
                n10 = this.Q.size();
                if (string != null) break block14;
                if (n10 <= 1) break block10;
                n10 = 0;
            }
            KB kB = KB.Z(n10, this.L + 1);
            stringBuilder.append(((ko_0)this.Q.get((int)(this.Q.size() - 1))).G.D(kB));
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return this.O();
    }

    public int A() {
        return this.Y;
    }

    public XE s() {
        return new XE(((ko_0)this.Q.get((int)0)).v + this.h, ((ko_0)this.Q.get((int)0)).E);
    }

    public XE E() {
        return new XE(((ko_0)this.Q.get((int)(this.Q.size() - 1))).v + this.L, ((ko_0)this.Q.get((int)(this.Q.size() - 1))).E);
    }

    pe_1(ArrayList arrayList, int n10, int n11, int n12, L7 l7) {
        this(arrayList, n10, n11, n12);
    }
}

