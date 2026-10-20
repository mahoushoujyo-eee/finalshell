/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JMenuItem;

class i
implements Runnable {
    final JMenuItem J;
    final JMenuItem H;
    final JMenuItem w;
    final l5_0 t;

    i(l5_0 l5_02, JMenuItem jMenuItem, JMenuItem jMenuItem2, JMenuItem jMenuItem3) {
        this.t = l5_02;
        this.J = jMenuItem;
        this.H = jMenuItem2;
        this.w = jMenuItem3;
    }

    @Override
    public void run() {
        ArrayList arrayList;
        boolean bl;
        try {
            bl = (Boolean)this.t.D.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        boolean bl2 = bl;
        ((JMenuItem)this.J).setEnabled(bl2);
        String string = aA.z();
        ((JMenuItem)this.H).setEnabled(bl2);
        String string2 = string;
        JMenuItem jMenuItem = (JMenuItem)this.w;
        try {
            arrayList = (ArrayList)this.t.D.I.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        boolean bl3 = arrayList.size();
        if (string2 == null) {
            bl3 = bl3 > false;
        }
        jMenuItem.setEnabled(bl3);
    }
}

