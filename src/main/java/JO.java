/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Graphics;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class JO
extends JLabel
implements D2 {
    lt_2 D;
    private static int[] p;

    public JO() {
        int[] nArray = JO.z();
        this.D = new lt_2(this, this);
        this.setOpaque(false);
        int[] nArray2 = nArray;
        if (ky_2.F() != null) {
            JO.X(new int[4]);
        }
    }

    public JO(String string) {
        int[] nArray = JO.z();
        super(string);
        int[] nArray2 = nArray;
        this.D = new lt_2(this, this);
        this.setOpaque(false);
        if (nArray2 == null) {
            ky_2.K(new String[4]);
        }
    }

    @Override
    public void paintComponent(Graphics graphics) {
        block11: {
            block10: {
                int[] nArray;
                block9: {
                    nArray = JO.z();
                    if (nArray == null) break block9;
                    if (dd_1.x) {
                        try {
                            this.D.a(graphics);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block10;
                }
                if (nArray != null) break block11;
            }
            try {
                this.h(graphics);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void h(Graphics graphics) {
        super.paintComponent(graphics);
    }

    public static void X(int[] nArray) {
        p = nArray;
    }

    public static int[] z() {
        return p;
    }

    static {
        if (JO.z() == null) {
            JO.X(new int[2]);
        }
    }
}

