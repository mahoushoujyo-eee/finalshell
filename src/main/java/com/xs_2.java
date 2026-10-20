/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.cy_1;
import com.cz_0;
import com.ne_2;
import com.ry_1;
import com.wb_0;
import com.xa_1;
import java.io.File;
import javax.swing.text.JTextComponent;

/*
 * Renamed from com.xs
 */
public class xs_2
extends xa_1 {
    final ry_1 U;

    protected xs_2(ry_1 ry_12) {
        this.U = ry_12;
        super(ry_12);
    }

    public void E(cy_1 cy_12) {
        File file = cy_12.D();
        ((ne_2)ry_1.x(this.U)).v(new wb_0(cz_0.B(file)));
        cz_0.D((JTextComponent)ry_1.P(this.U), file);
        super.y(cy_12);
    }

    @Override
    public boolean p() {
        File file = ((cy_1)this.j).D();
        String string = ((ne_2)ry_1.T(this.U)).getText();
        String[] stringArray = cb_1.C();
        boolean bl = string.equals(file.getName());
        if (stringArray != null) {
            if (!bl) {
                File file2 = new File(file.getParent(), string);
                boolean bl2 = file.renameTo(file2);
                if (stringArray != null) {
                    if (bl2) {
                        ((cy_1)this.j).h(file2);
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
        this.E((cy_1)object);
    }
}

