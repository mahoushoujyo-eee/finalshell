/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

class aG
implements ActionListener {
    final fx_1 q;
    final String D;
    final JPopupMenu N;
    final W8 S;
    final mi_0 m;

    aG(mi_0 mi_02, fx_1 fx_12, String string, JPopupMenu jPopupMenu, W8 w8) {
        this.m = mi_02;
        this.q = fx_12;
        this.D = string;
        this.N = jPopupMenu;
        this.S = w8;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        W8 w8;
        try {
            this.q.o(this.D);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.m.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JPopupMenu)this.N).remove((W8)this.S);
        ((JPopupMenu)this.N).validate();
        ((JPopupMenu)this.N).pack();
        Dimension dimension = ((JPopupMenu)this.N).getPreferredSize();
        try {
            w8 = (W8)this.m.X(this.D);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        W8 w82 = w8;
        ((ArrayList)this.m.G).remove(w82);
    }
}

