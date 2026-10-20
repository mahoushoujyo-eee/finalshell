/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.A;
import com.cz_0;
import java.io.File;
import javax.swing.Icon;
import javax.swing.filechooser.FileView;

public class MZ
extends FileView {
    final A b;

    public MZ(A a10) {
        this.b = a10;
    }

    @Override
    public String getName(File file) {
        return cz_0.X(file);
    }

    @Override
    public String getDescription(File file) {
        return this.getTypeDescription(file);
    }

    @Override
    public String getTypeDescription(File file) {
        return cz_0.T(file);
    }

    @Override
    public Icon getIcon(File file) {
        return cz_0.B(file);
    }
}

