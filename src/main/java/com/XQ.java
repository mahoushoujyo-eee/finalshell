/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.R3;
import com.YP;
import com.j_0;
import com.pg_1;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class XQ {
    private final int U;
    private final int w;
    private final YP a;
    private final int u;
    private final int x;
    private final boolean B;
    private final boolean C;
    private final int Q;
    private final pg_1[] i;

    public XQ(int n10, int n11, @NotNull YP yP, boolean bl, boolean bl2, R3 r3) {
        boolean bl3 = j_0.g();
        this.i = new pg_1[4];
        boolean bl4 = bl3;
        this.U = n10;
        this.w = n11;
        this.a = yP;
        this.B = bl;
        this.C = bl2;
        this.u = r3.V().l();
        this.x = r3.I().l();
        this.Q = r3.D();
        for (int i2 = 0; i2 < 4; ++i2) {
            this.i[i2] = r3.D(i2).X();
            if (bl4) continue;
        }
    }

    public int e() {
        return this.U;
    }

    public int q() {
        return this.w;
    }

    public YP e() {
        return this.a;
    }

    public int g() {
        return this.u;
    }

    public int S() {
        return this.x;
    }

    public boolean Z() {
        return this.B;
    }

    public boolean u() {
        return this.C;
    }

    public int Y() {
        return this.Q;
    }

    public pg_1[] E() {
        return this.i;
    }
}

