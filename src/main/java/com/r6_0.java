/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aL;
import com.cb_1;
import com.cy_1;
import com.cz_0;
import com.d_0;
import com.nk_0;
import com.np_0;
import com.on_0;
import com.rp_2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from com.r6
 */
public class r6_0
extends rp_2 {
    protected List l;

    public r6_0(File[] fileArray) {
        this.l = aL.e(fileArray);
        this.F = new d_0();
        this.m = nk_0.C;
    }

    public r6_0(List list) {
        this.l = list;
        this.F = new d_0();
        this.m = nk_0.C;
    }

    public r6_0(on_0 on_02, File[] fileArray) {
        this.l = aL.e(fileArray);
        this.F = new d_0();
        this.m = on_02;
    }

    public r6_0(on_0 on_02, List list) {
        this.l = list;
        this.F = new d_0();
        this.m = on_02;
    }

    public cy_1 D() {
        return this.l.size() == 1 ? new cy_1((File)this.l.get(0)) : new cy_1(null);
    }

    public void b(cy_1 cy_12, np_0 np_02) {
        try {
            List list;
            np_0 np_03;
            try {
                np_03 = np_02;
                list = cy_12.D() == null ? this.F() : this.B(cy_12);
            }
            catch (Throwable throwable) {
                throw r6_0.a(throwable);
            }
            np_03.S(list);
        }
        catch (Throwable throwable) {
            np_02.l(throwable);
        }
    }

    protected List F() {
        ArrayList<cy_1> arrayList;
        block2: {
            ArrayList<cy_1> arrayList2 = new ArrayList<cy_1>(this.l.size());
            Iterator iterator = this.l.iterator();
            String[] stringArray = cb_1.C();
            while (iterator.hasNext()) {
                File file = (File)iterator.next();
                arrayList = arrayList2;
                if (stringArray != null) {
                    arrayList.add(new cy_1(file));
                    if (stringArray != null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public List B(cy_1 cy_12) {
        ArrayList<cy_1> arrayList;
        block6: {
            String[] stringArray;
            File[] fileArray;
            block9: {
                block8: {
                    File[] fileArray2;
                    block7: {
                        fileArray = cy_12.D().listFiles();
                        stringArray = cb_1.C();
                        fileArray2 = fileArray;
                        if (stringArray == null) break block7;
                        if (fileArray2 == null) break block8;
                        fileArray2 = fileArray;
                    }
                    if (fileArray2.length != 0) break block9;
                }
                return new ArrayList(0);
            }
            ArrayList<cy_1> arrayList2 = new ArrayList<cy_1>(fileArray.length);
            for (File file : fileArray) {
                arrayList = arrayList2;
                if (stringArray != null) {
                    arrayList.add(new cy_1(file));
                    if (stringArray != null) continue;
                }
                break block6;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public on_0 j(cy_1 cy_12) {
        return cy_12.D() == null ? null : super.h(cy_12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l(cy_1 cy_12) {
        String[] stringArray = cb_1.C();
        File file = cy_12.D();
        if (stringArray != null) {
            if (file == null) return false;
            file = cy_12.D();
        }
        boolean bl = cz_0.z(file);
        if (stringArray == null) return bl;
        if (bl) return false;
        return true;
    }

    @Override
    public boolean y(cb_1 cb_12) {
        return this.l((cy_1)cb_12);
    }

    @Override
    public on_0 h(cb_1 cb_12) {
        return this.j((cy_1)cb_12);
    }

    @Override
    public void w(cb_1 cb_12, np_0 np_02) {
        this.b((cy_1)cb_12, np_02);
    }

    @Override
    public cb_1 z() {
        return this.D();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

