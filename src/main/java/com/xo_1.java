/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cz_0;
import com.kz_2;
import com.ne_2;
import com.rz_1;
import com.wb_0;
import com.xa_1;
import java.io.File;
import javax.swing.text.JTextComponent;

/*
 * Renamed from com.xO
 */
public class xo_1
extends xa_1 {
    final rz_1 h;

    protected xo_1(rz_1 rz_12) {
        this.h = rz_12;
        super(rz_12);
    }

    public void s(File file) {
        ((ne_2)rz_1.c(this.h)).v(new wb_0(cz_0.B(file)));
        cz_0.D((JTextComponent)rz_1.n(this.h), file);
        super.y(file);
    }

    @Override
    public boolean p() {
        String string = ((ne_2)rz_1.k(this.h)).getText();
        String string2 = kz_2.M();
        boolean bl = string.equals(((File)this.j).getName());
        if (string2 != null) {
            if (!bl) {
                File file = new File(((File)this.j).getParent(), string);
                boolean bl2 = ((File)this.j).renameTo(file);
                if (string2 != null) {
                    if (bl2) {
                        this.j = file;
                    }
                    bl2 = super.p();
                }
                return bl2;
            }
            super.a();
            bl = true;
        }
        return bl;
    }

    @Override
    public void y(Object object) {
        this.s((File)object);
    }
}

