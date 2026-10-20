/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.co_0;
import com.ed_1;
import com.uv_0;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.eR
 */
public class er_1
extends ed_1 {
    public void R(Object object) {
        this.T(new uv_0(object));
    }

    public void J(Object object, boolean bl) {
        this.T(new uv_0(object, bl));
    }

    public void O(int n10, Object object) {
        this.y(n10, new uv_0(object));
    }

    public void j(int n10, Object object, boolean bl) {
        this.y(n10, new uv_0(object, bl));
    }

    public boolean o(int n10) {
        return ((uv_0)this.A(n10)).Z();
    }

    public List a() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string = co_0.U();
        int n10 = 0;
        while (n10 < this.getSize()) {
            uv_0 uv_02 = (uv_0)this.A(n10);
            if (string != null) {
                if (uv_02.Z()) {
                    arrayList.add(uv_02.g());
                }
                ++n10;
            }
            if (string != null) continue;
        }
        return arrayList;
    }

    public void Y(int n10) {
        uv_0 uv_02 = (uv_0)this.A(n10);
        String string = co_0.U();
        boolean bl = uv_02.Z();
        if (string != null) {
            bl = !bl;
        }
        uv_02.i(bl);
        this.fireContentsChanged(this, n10, n10);
    }

    public boolean Z(int n10, boolean bl) {
        uv_0 uv_02 = (uv_0)this.A(n10);
        String string = co_0.U();
        boolean bl2 = uv_02.Z();
        if (string != null) {
            if (bl2 != bl) {
                uv_02.i(bl);
                this.fireContentsChanged(this, n10, n10);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }
}

