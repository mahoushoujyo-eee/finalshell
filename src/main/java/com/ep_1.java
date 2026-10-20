/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.co_0;
import com.ed_1;
import com.wo_2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from com.eP
 */
public class ep_1
extends ed_1 {
    private final Object i = new Object();
    private final Map g = new HashMap();

    public ep_1() {
    }

    public ep_1(String string) {
        this.e(string);
    }

    public ep_1(File file) {
        this.x(file);
    }

    public ep_1(File[] fileArray) {
        this.v(fileArray);
    }

    public ep_1(List list) {
        this.r(list);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void F() {
        Object object = this.i;
        synchronized (object) {
            block5: {
                String string = co_0.U();
                for (Map.Entry entry : this.g.entrySet()) {
                    ((wo_2)entry.getValue()).j(null);
                    if (string != null) {
                        if (string != null) continue;
                    }
                    break block5;
                }
                this.g.clear();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public wo_2 X(File file) {
        String string;
        String string2 = co_0.U();
        File file2 = file;
        if (string2 != null) {
            if (file2 == null) {
                string = null;
                return this.b(string);
            }
            file2 = file;
        }
        string = file2.getAbsolutePath();
        return this.b(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public wo_2 b(String string) {
        Object object = this.i;
        synchronized (object) {
            return (wo_2)this.g.get(string);
        }
    }

    public void e(String string) {
        this.F();
        this.K(this.J(this.i(new File(string))));
    }

    public void x(File file) {
        this.F();
        this.K(this.J(this.i(file)));
    }

    public void v(File[] fileArray) {
        this.F();
        this.K(this.J(fileArray));
    }

    public void r(List list) {
        this.F();
        this.K(this.v(list));
    }

    protected File[] i(File file) {
        block3: {
            File file2;
            block2: {
                String string = co_0.U();
                file2 = file;
                if (string == null) break block2;
                if (file2 == null) break block3;
                file2 = file;
            }
            return file2.listFiles();
        }
        return new File[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected List J(File[] fileArray) {
        ArrayList<wo_2> arrayList;
        ArrayList<wo_2> arrayList2;
        block7: {
            File[] fileArray2;
            String string;
            block6: {
                string = co_0.U();
                arrayList2 = new ArrayList<wo_2>(fileArray != null ? fileArray.length : 0);
                fileArray2 = fileArray;
                if (string == null) break block6;
                if (fileArray2 == null) break block7;
                fileArray2 = fileArray;
            }
            for (File file : fileArray2) {
                wo_2 wo_22 = new wo_2(file);
                arrayList = arrayList2;
                if (string == null) return arrayList;
                arrayList.add(wo_22);
                Object object = this.i;
                synchronized (object) {
                    this.g.put(file.getAbsolutePath(), wo_22);
                }
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected List v(List list) {
        ArrayList<wo_2> arrayList;
        block5: {
            ArrayList<wo_2> arrayList2;
            block7: {
                List list2;
                String string;
                block6: {
                    string = co_0.U();
                    arrayList2 = new ArrayList<wo_2>(list != null ? list.size() : 0);
                    list2 = list;
                    if (string == null) break block6;
                    if (list2 == null) break block7;
                    list2 = list;
                }
                for (File file : list2) {
                    wo_2 wo_22 = new wo_2(file);
                    arrayList = arrayList2;
                    if (string == null) break block5;
                    arrayList.add(wo_22);
                    Object object = this.i;
                    synchronized (object) {
                        this.g.put(file.getAbsolutePath(), wo_22);
                    }
                    if (string != null) continue;
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }
}

