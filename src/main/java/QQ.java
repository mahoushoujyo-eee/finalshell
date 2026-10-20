/*
 * Decompiled with CFR 0.152.
 */
import com.FN;
import com.ox_2;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class QQ
extends BasicScrollBarUI {
    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.scrollbar);
        FN.g(this.scrollbar);
        ox_2.B(this.scrollbar);
    }
}

