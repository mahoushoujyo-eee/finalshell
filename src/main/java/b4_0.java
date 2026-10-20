/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from b4
 */
class b4_0
implements ActionListener {
    final on_2 k;

    b4_0(on_2 on_22) {
        this.k = on_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.k.P = false;
        this.k.k = null;
        ((on_2)this.k).setVisible(false);
    }
}

