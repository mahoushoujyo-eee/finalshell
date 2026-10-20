/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.rv_2;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

public class KK
extends JTable {
    public void V(int n10) {
        Rectangle rectangle;
        Rectangle rectangle2 = this.getCellRect(n10, 0, true);
        Rectangle rectangle3 = rv_2.B(rectangle2, rectangle = this.getCellRect(n10, this.getColumnCount() - 1, true));
        if (rectangle3 != null) {
            this.scrollRectToVisible(rectangle3);
        }
    }

    public void C(int n10) {
        Rectangle rectangle;
        Rectangle rectangle2 = this.getCellRect(0, n10, true);
        Rectangle rectangle3 = rv_2.B(rectangle2, rectangle = this.getCellRect(this.getRowCount() - 1, n10, true));
        if (rectangle3 != null) {
            this.scrollRectToVisible(rectangle3);
        }
    }

    public void c(int n10) {
        try {
            this.g(n10, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void X(int n10) {
        block3: {
            block2: {
                String[] stringArray = F8.y();
                if (stringArray != null) break block2;
                if (n10 == -1) break block3;
                this.addColumnSelectionInterval(0, this.getColumnCount() - 1);
            }
            this.addRowSelectionInterval(n10, n10);
        }
    }

    public void g(int n10, boolean bl) {
        block9: {
            int n11;
            block8: {
                String[] stringArray = F8.y();
                this.clearSelection();
                String[] stringArray2 = stringArray;
                try {
                    this.X(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                n11 = n10;
                if (stringArray2 != null) break block8;
                if (n11 == -1) break block9;
                n11 = bl ? 1 : 0;
            }
            if (n11 != 0) {
                try {
                    this.V(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    public void K(int n10, int n11) {
        this.clearSelection();
        try {
            this.D(n10, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void D(int n10, int n11) {
        block5: {
            int n12;
            int n13;
            block4: {
                String[] stringArray = F8.y();
                n13 = n10;
                n12 = -1;
                if (stringArray != null) break block4;
                if (n13 == n12) break block5;
                n13 = n11;
                n12 = -1;
            }
            if (n13 != n12) {
                this.addColumnSelectionInterval(0, this.getColumnCount() - 1);
                this.addRowSelectionInterval(n10, n11);
            }
        }
    }
}

