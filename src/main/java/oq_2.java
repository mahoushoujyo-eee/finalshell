/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/*
 * Renamed from oq
 */
class oq_2
implements FocusListener {
    final xl_0 u;

    oq_2(xl_0 xl_02) {
        this.u = xl_02;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        ((JTextField)this.u.C).selectAll();
    }
}

