/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

class U9
implements ActionListener {
    final ak_0 h;

    U9(ak_0 ak_02) {
        this.h = ak_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((JTextArea)this.h.x).setText("");
    }
}

