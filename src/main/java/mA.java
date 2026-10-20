/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.qe_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mA
implements ActionListener {
    final qe_0 c;
    final nj_0 L;

    mA(nj_0 nj_02, qe_0 qe_02) {
        this.L = nj_02;
        this.c = qe_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            nj_0 nj_02;
            block4: {
                int n10;
                block2: {
                    String[] stringArray = F8.y();
                    n10 = ((qe_0)this.c).getModel().isSelected();
                    if (stringArray != null) break block2;
                    if (n10 == 0) break block3;
                    nj_02 = (nj_0)this.L;
                    if (stringArray != null) break block4;
                    n10 = nj_02.T;
                }
                if (n10 == this.L.l) break block3;
                nj_02 = (nj_0)this.L;
            }
            nj_02.T = this.L.l;
        }
    }
}

