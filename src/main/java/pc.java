/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

class pc
implements ActionListener {
    final JLabel F;
    final Color U;
    final W8 K;
    final String I;
    final jx_0 z;

    pc(jx_0 jx_02, JLabel jLabel, Color color, W8 w8, String string) {
        this.z = jx_02;
        this.F = jLabel;
        this.U = color;
        this.K = w8;
        this.I = string;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((JLabel)this.F).setBackground((Color)this.U);
        ((W8)this.K).setBackground((Color)this.U);
        try {
            lk_0.z(this.I);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

