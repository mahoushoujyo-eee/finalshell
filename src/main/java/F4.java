/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComboBox;

class F4
implements ItemListener {
    final zn_0 v;

    F4(zn_0 zn_02) {
        this.v = zn_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block5: {
            block4: {
                int[] nArray = zn_0.g();
                if (nArray != null) break block4;
                if (itemEvent.getStateChange() != 1) break block5;
                this.v.U = Integer.parseInt((String)((JComboBox)this.v.s).getSelectedItem());
            }
            try {
                this.v.n();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

