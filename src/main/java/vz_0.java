/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Vz
 */
class vz_0
implements ActionListener {
    final nx_0 u;

    vz_0(nx_0 nx_02) {
        this.u = nx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((km_0)this.u.s).getSelectedRow();
        int n11 = ((km_0)this.u.s).convertRowIndexToModel(n10);
        try {
            yt_1.F.J(new dz_0(this, n10));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

