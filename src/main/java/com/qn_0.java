/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cd_2;
import com.db_0;
import com.dm_2;
import com.i3_0;
import java.util.Vector;

/*
 * Renamed from com.Qn
 */
public class qn_0
implements cd_2 {
    private i3_0 i;

    public qn_0(db_0 db_02) {
        this.i = new i3_0(db_02);
    }

    @Override
    public Vector e() {
        return this.i.d();
    }

    @Override
    public boolean D(byte[] byArray) {
        return this.i.Z(byArray);
    }

    @Override
    public boolean i(byte[] byArray) {
        return this.i.R(byArray);
    }

    @Override
    public void u() {
        this.i.k();
    }

    @Override
    public String r() {
        return this.i.p().B();
    }

    @Override
    public int p() {
        boolean bl = dm_2.F();
        int n10 = this.i.p().x();
        if (bl) {
            if (n10 != 0) {
                return 2;
            }
            n10 = 1;
        }
        return n10;
    }
}

