/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;

/*
 * Renamed from Bp
 */
class bp_0
implements Runnable {
    String D;
    final TA E;

    bp_0(TA tA) {
        this.E = tA;
        this.D = null;
    }

    @Override
    public void run() {
        zD zD2;
        ((C_)this.E.Z).setEnabled(false);
        try {
            zD2 = (zD)this.E.N.w.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        zD zD3 = zD2;
        boolean bl = F6.i();
        bp_0 bp_02 = this;
        if (bl) {
            if ((String)bp_02.D != null) {
                JOptionPane.showMessageDialog(null, (String)this.D);
            }
            bp_02 = this;
        }
        ((C_)bp_02.E.Z).setEnabled(true);
    }
}

