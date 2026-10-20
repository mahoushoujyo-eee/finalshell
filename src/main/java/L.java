/*
 * Decompiled with CFR 0.152.
 */
import com._C;
import com.c;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

class L
implements ActionListener {
    final fx_1 l;
    final String Q;
    final JPopupMenu h;
    final W8 L;
    final jx_0 n;
    private static final long a;

    L(jx_0 jx_02, fx_1 fx_12, String string, JPopupMenu jPopupMenu, W8 w8) {
        this.n = jx_02;
        this.l = fx_12;
        this.Q = string;
        this.h = jPopupMenu;
        this.L = w8;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        W8 w8;
        try {
            this.l.o(this.Q);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.n.W();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JPopupMenu)this.h).remove((W8)this.L);
        ((JPopupMenu)this.h).validate();
        ((JPopupMenu)this.h).pack();
        Dimension dimension = ((JPopupMenu)this.h).getPreferredSize();
        ((JPopupMenu)this.h).show((_C)this.n.H, (int)a, ((_C)this.n.H).getHeight() + 4);
        try {
            w8 = (W8)this.n.d(this.Q);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        W8 w82 = w8;
        ((ArrayList)this.n.s).remove(w82);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3271412899196078400L;
        a = 0xA238CA3B05C976BBL ^ l2;
    }
}

