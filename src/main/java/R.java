/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

class R
implements ActionListener {
    final jr_0 N;

    R(jr_0 jr_02) {
        this.N = jr_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            String string;
            block4: {
                String string2 = ((JLabel)this.N.X).getText();
                String[] stringArray = KV.b();
                string = string2;
                if (stringArray != null) break block4;
                if (string.equals("-")) break block5;
                string = string2;
            }
            try {
                lk_0.u(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

