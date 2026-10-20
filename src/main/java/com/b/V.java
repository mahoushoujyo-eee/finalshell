/*
 * Decompiled with CFR 0.152.
 */
package com.b;

import com.ky_2;
import com.on_0;
import java.io.File;
import java.io.FileFilter;
import javax.swing.ImageIcon;

public abstract class V
extends javax.swing.filechooser.FileFilter
implements FileFilter,
on_0 {
    private static ky_2[] W;

    public abstract ImageIcon b();

    @Override
    public abstract String getDescription();

    @Override
    public abstract boolean accept(File var1);

    @Override
    public boolean n(Object object) {
        return this.accept((File)object);
    }

    public static void Q(ky_2[] ky_2Array) {
        W = ky_2Array;
    }

    public static ky_2[] L() {
        return W;
    }

    static {
        if (V.L() == null) {
            V.Q(new ky_2[1]);
        }
    }
}

