/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._n_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

/*
 * Renamed from com.li
 */
class li_2
extends MouseAdapter {
    final JComponent S;
    final _n_0 T;
    private static final long a;

    li_2(_n_0 _n_02, JComponent jComponent) {
        this.T = _n_02;
        this.S = jComponent;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        _n_0.r(this.T).repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        _n_0.q(this.T).repaint();
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        _n_0.K(this.T).repaint();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        block5: {
            _n_0 _n_02;
            block2: {
                li_2 li_22;
                block4: {
                    block3: {
                        this.T.y = true;
                        int n10 = _n_0.G();
                        _n_02 = this.T;
                        if (n10 != 0) break block2;
                        if (!_n_02.h()) break block3;
                        li_22 = this;
                        if (n10 != 0) break block4;
                        if (!li_22.S.isEnabled()) break block3;
                        this.T.v.u();
                        if (n10 == 0) break block5;
                    }
                    this.T.B = (int)a;
                    li_22 = this;
                }
                _n_02 = li_22.T;
            }
            _n_0.s(_n_02).repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        block5: {
            _n_0 _n_02;
            block2: {
                li_2 li_22;
                block4: {
                    block3: {
                        this.T.y = false;
                        int n10 = _n_0.W();
                        _n_02 = this.T;
                        if (n10 == 0) break block2;
                        if (!_n_02.h()) break block3;
                        li_22 = this;
                        if (n10 == 0) break block4;
                        if (!li_22.S.isEnabled()) break block3;
                        this.T.v.u();
                        if (n10 != 0) break block5;
                    }
                    this.T.B = 0;
                    li_22 = this;
                }
                _n_02 = li_22.T;
            }
            _n_0.X(_n_02).repaint();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 488343422258881099L;
        a = 0x65FE244E5423A24EL ^ l2;
    }
}

