/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from Cl
 */
class cl_0
implements ActionListener {
    final FB R;

    cl_0(FB fB2) {
        this.R = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((FB)this.R).setVisible(false);
    }
}

