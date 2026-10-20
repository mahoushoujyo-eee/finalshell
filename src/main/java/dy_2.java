/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from dy
 */
public class dy_2
implements LayoutManager {
    aJ P;
    tv_0 n;
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public void addLayoutComponent(String string, Component component) {
    }

    @Override
    public void removeLayoutComponent(Component component) {
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Dimension dimension = new Dimension();
        int[] nArray = og_1.T();
        if (nArray != null) {
            if ((aJ)this.P != null) {
                dimension = ((aJ)this.P).getPreferredSize();
            }
            dimension = new Dimension(dy_2.a(27817, 2722024917501821351L), dy_2.a(25644, 2484060400015690017L));
        }
        return dimension;
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return new Dimension(dy_2.a(17772, 8026740851858139235L), dy_2.a(2659, 8320299013893760879L));
    }

    @Override
    public void layoutContainer(Container container) {
        Component[] componentArray;
        Component[] componentArray2 = componentArray = container.getComponents();
        int[] nArray = og_1.T();
        for (Component component : componentArray2) {
            block8: {
                boolean bl;
                block6: {
                    block7: {
                        bl = component.getClass().equals(aJ.class);
                        if (nArray == null) break block6;
                        if (!bl) break block7;
                        this.P = (aJ)component;
                        if (nArray != null) break block8;
                    }
                    bl = component.getClass().equals(tv_0.class);
                }
                if (bl) {
                    this.n = (tv_0)component;
                }
            }
            aJ aJ2 = (aJ)this.P;
            if (nArray != null) {
                if (aJ2 == null) continue;
                aJ2 = (aJ)this.P;
            }
            aJ2.setBounds(0, 0, container.getWidth(), container.getHeight());
            if (nArray != null) continue;
        }
    }

    public void v(Rectangle rectangle, DefaultMutableTreeNode defaultMutableTreeNode) {
        block5: {
            tv_0 tv_02;
            block4: {
                int[] nArray = og_1.T();
                tv_02 = (tv_0)this.n;
                if (nArray == null) break block4;
                if (tv_02 == null) break block5;
                ((tv_0)this.n).setBounds(rectangle);
                tv_02 = (tv_0)this.n;
            }
            try {
                tv_02.r(defaultMutableTreeNode);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1243245480819868915L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "Z\u0006%sH\u00cbc\u00f8\u00e6\u000e\u00e3\u001aKl\f\u00fe";
                var5_4 = "Z\u0006%sH\u00cbc\u00f8\u00e6\u000e\u00e3\u001aKl\f\u00fe".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = ">\u0092\u00fe\u000e\u0011\u0095\u0084x\u00ce)\u0019\u00d4\u007f\u00fe,\u00f4";
                    var5_4 = ">\u0092\u00fe\u000e\u0011\u0095\u0084x\u00ce)\u0019\u00d4\u007f\u00fe,\u00f4".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        dy_2.a = var6_1;
        dy_2.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2D0C;
        if (b[n11] == null) {
            dy_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

