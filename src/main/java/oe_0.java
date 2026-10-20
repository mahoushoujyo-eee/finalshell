/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Oe
 */
class oe_0
implements ActionListener {
    final br_0 s;

    oe_0(br_0 br_02) {
        this.s = br_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((nd_0)this.s.l).getSelectedRow();
        if (n10 > -1) {
            BS bS;
            try {
                bS = (BS)this.s.i.a(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            BS bS2 = bS;
            FB fB2 = new FB((br_0)this.s, bS2, true);
        }
    }
}

