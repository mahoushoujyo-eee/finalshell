/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

class W7
implements ItemListener {
    final ol_2 w;

    W7(ol_2 ol_22) {
        this.w = ol_22;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block5: {
            ol_2 ol_22;
            block4: {
                String string = aA.z();
                ol_22 = (ol_2)this.w;
                if (string != null) break block4;
                if (!ol_22.stopCellEditing()) break block5;
                ol_22 = (ol_2)this.w;
            }
            try {
                ol_2.i(ol_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

