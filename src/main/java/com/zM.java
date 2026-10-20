/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BG;
import com.by_0;
import com.ej_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

class zM
implements ActionListener {
    final JProgressBar k;
    final ej_0 R;
    private static final long a;

    zM(ej_0 ej_02, JProgressBar jProgressBar) {
        this.R = ej_02;
        this.k = jProgressBar;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block2: {
            int n10;
            block3: {
                int n11 = by_0.J();
                n10 = ej_0.g(this.R);
                if (n11 != 0) break block2;
                if (n10 >= (int)a) break block3;
                ej_0.L(this.R);
                if (n11 == 0) break block2;
            }
            n10 = ej_0.X(this.R, 0);
        }
        SwingUtilities.invokeLater(new BG(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5785545440390487775L;
        a = 0xAF1ED752C65B1EF8L ^ l2;
    }
}

