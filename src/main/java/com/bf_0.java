/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B2;
import com.j_0;
import com.lu_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.Bf
 */
class bf_0
implements Iterable {
    private final List D = new ArrayList();
    private int e = 0;

    private bf_0() {
    }

    public void n(lu_2 lu_22) {
        block3: {
            boolean bl;
            block4: {
                boolean bl2 = j_0.g();
                bl = lu_22.v().Y();
                if (!bl2) break block3;
                if (bl) break block4;
                for (lu_2 lu_23 : this.D) {
                    block6: {
                        j_0 j_02;
                        block5: {
                            j_02 = lu_23.v();
                            if (!bl2) break block5;
                            bl = j_02.Y();
                            if (!bl2) break block3;
                            if (!bl) break block6;
                            j_02 = lu_23.v();
                        }
                        j_02.D();
                    }
                    if (bl2) continue;
                }
            }
            bl = this.D.add(lu_22);
        }
        this.e += lu_22.s();
    }

    private List m() {
        return this.D;
    }

    @NotNull
    public Iterator iterator() {
        return this.D.iterator();
    }

    public int o() {
        return this.e;
    }

    public void e() {
        this.D.clear();
        this.e = 0;
    }

    bf_0(B2 b2) {
        this();
    }

    static int h(bf_0 bf_02) {
        return bf_02.e;
    }

    static List T(bf_0 bf_02) {
        return bf_02.m();
    }

    static List I(bf_0 bf_02) {
        return bf_02.D;
    }
}

