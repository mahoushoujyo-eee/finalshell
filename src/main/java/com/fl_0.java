/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._n_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Fl
 */
class fl_0
implements ActionListener {
    final _n_0 y;

    fl_0(_n_0 _n_02) {
        this.y = _n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            _n_0 _n_02;
            block5: {
                block6: {
                    int n10;
                    int n11;
                    block2: {
                        block3: {
                            n11 = _n_0.G();
                            n10 = this.y.y;
                            if (n11 != 0) break block2;
                            if (n10 == 0) break block3;
                            n10 = this.y.B++;
                            if (n11 != 0) break block2;
                            if (n10 >= 5) break block3;
                            _n_0.a(this.y).repaint();
                            if (n11 == 0) break block4;
                        }
                        _n_02 = this.y;
                        if (n11 != 0) break block5;
                        n10 = _n_02.y ? 1 : 0;
                    }
                    if (n10 != 0) break block6;
                    _n_02 = this.y;
                    if (n11 != 0) break block5;
                    if (_n_02.B <= 0) break block6;
                    --this.y.B;
                    _n_0.l(this.y).repaint();
                    if (n11 == 0) break block4;
                }
                _n_02 = this.y;
            }
            _n_02.v.Y();
        }
    }
}

