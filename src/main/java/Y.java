/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Y
implements ActionListener {
    final gS Y;

    Y(gS gS2) {
        this.Y = gS2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((gS)this.Y).setVisible(false);
    }
}

