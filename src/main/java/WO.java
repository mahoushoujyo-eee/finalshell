/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

class WO
implements ActionListener {
    final U H;

    WO(U u10) {
        this.H = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            _y_0 _y_02;
            block2: {
                String[] stringArray = F8.y();
                _y_02 = (_y_0)this.H.hr;
                if (stringArray != null) break block2;
                if (_y_02 == null) break block3;
                _y_02 = (_y_0)this.H.hr;
            }
            _y_02.h(((JToggleButton)this.H.hi).isSelected());
        }
    }
}

