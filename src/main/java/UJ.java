/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

class UJ
implements ActionListener {
    final JFrame E;
    final U f;
    final K_ S;

    UJ(K_ k_, JFrame jFrame, U u10) {
        this.S = k_;
        this.E = jFrame;
        this.f = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int[] nArray = jx_0.O();
        JFrame jFrame = (JFrame)this.E;
        if (nArray == null) {
            if (!jFrame.isVisible()) {
                ((JFrame)this.E).pack();
                ((JFrame)this.E).setLocationRelativeTo((U)this.f);
            }
            ((JFrame)this.E).setVisible(true);
            jFrame = (JFrame)this.E;
        }
        jFrame.toFront();
    }
}

