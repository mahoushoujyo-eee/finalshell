/*
 * Decompiled with CFR 0.152.
 */
package com.b;

import com.b.V;
import com.b.a;
import com.ky_2;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;

public class f
extends V {
    protected a O;
    protected V t;
    protected List k;

    public f(FileFilter[] fileFilterArray) {
        this(a.AND, fileFilterArray);
    }

    public f(a a10, FileFilter[] fileFilterArray) {
        this(fileFilterArray != null && fileFilterArray.length > 0 && fileFilterArray[0] instanceof V ? (V)fileFilterArray[0] : null, a10, fileFilterArray);
    }

    public f(V v2, a a10, FileFilter[] fileFilterArray) {
        this.O = a10;
        this.t = v2;
        this.k = new ArrayList();
        if (fileFilterArray != null) {
            Collections.addAll(this.k, fileFilterArray);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public ImageIcon b() {
        ky_2[] ky_2Array = V.L();
        V v2 = this.t;
        if (ky_2Array != null) {
            if (v2 == null) return null;
            v2 = this.t;
        }
        ImageIcon imageIcon = v2.b();
        return imageIcon;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String getDescription() {
        ky_2[] ky_2Array = V.L();
        V v2 = this.t;
        if (ky_2Array != null) {
            if (v2 == null) return null;
            v2 = this.t;
        }
        String string = v2.getDescription();
        return string;
    }

    @Override
    public boolean accept(File file) {
        f f10;
        ky_2[] ky_2Array;
        block6: {
            block7: {
                ky_2Array = V.L();
                f10 = this;
                if (ky_2Array == null) break block6;
                if (!f10.O.equals((Object)a.AND)) break block7;
                Iterator iterator = this.k.iterator();
                while (iterator.hasNext()) {
                    block9: {
                        boolean bl;
                        block10: {
                            FileFilter fileFilter;
                            block8: {
                                FileFilter fileFilter2;
                                fileFilter = fileFilter2 = (FileFilter)iterator.next();
                                if (ky_2Array == null) break block8;
                                if (fileFilter == null) break block9;
                                fileFilter = fileFilter2;
                            }
                            bl = fileFilter.accept(file);
                            if (ky_2Array == null) break block10;
                            if (bl) break block9;
                            bl = false;
                        }
                        return bl;
                    }
                    if (ky_2Array != null) continue;
                    ky_2.K(new String[5]);
                    break;
                }
                return true;
            }
            f10 = this;
        }
        Iterator iterator = f10.k.iterator();
        while (iterator.hasNext()) {
            block14: {
                boolean bl;
                block13: {
                    block12: {
                        FileFilter fileFilter;
                        block11: {
                            FileFilter fileFilter3;
                            fileFilter = fileFilter3 = (FileFilter)iterator.next();
                            if (ky_2Array == null) break block11;
                            if (fileFilter == null) break block12;
                            fileFilter = fileFilter3;
                        }
                        bl = fileFilter.accept(file);
                        if (ky_2Array == null) break block13;
                        if (!bl) break block14;
                    }
                    bl = true;
                }
                return bl;
            }
            if (ky_2Array != null) continue;
        }
        return false;
    }

    @Override
    public boolean n(Object object) {
        return this.accept((File)object);
    }
}

