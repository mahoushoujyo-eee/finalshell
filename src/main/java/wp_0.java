/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Renamed from Wp
 */
class wp_0
implements ActionListener {
    final aW C;

    wp_0(aW aW2) {
        this.C = aW2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string = JOptionPane.showInputDialog((aW)this.C, (Object)"");
        if (string != null) {
            String string2;
            try {
                string2 = (String)lk_0.E(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JTextField)this.C.k).setText(string2);
        }
    }
}

