/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class F3
extends DefaultTableCellRenderer {
    JLabel p;
    private static final long a;

    public F3() {
        this.p = new JLabel();
        ((JLabel)this.p).setBorder(BorderFactory.createEmptyBorder(0, (int)a, 0, 0));
        ((JLabel)this.p).setOpaque(false);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        ((JLabel)this.p).setText(object.toString());
        return (JLabel)this.p;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3611884370304039577L;
        a = 0x64C1E9BCBDC1FA9EL ^ l2;
    }
}

