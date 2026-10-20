/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/*
 * Renamed from uP
 */
class up_1
implements ActionListener {
    final VN Y;

    up_1(VN vN) {
        this.Y = vN;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((JTextArea)this.Y.O).setText("");
    }
}

