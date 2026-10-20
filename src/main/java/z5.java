/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.tree.DefaultMutableTreeNode;

public class z5
implements LayoutManager {
    km_0 C;
    ca_0 K;
    private static final long[] a;
    private static final Integer[] b;

    z5() {
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
    }

    @Override
    public void removeLayoutComponent(Component component) {
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Dimension dimension = new Dimension();
        String string = km_0.U();
        if (string == null) {
            if ((km_0)this.C != null) {
                dimension = ((km_0)this.C).getPreferredSize();
            }
            dimension = new Dimension(z5.a(5741, 4923632099740319726L), z5.a(28537, 4422274238168401656L));
        }
        return dimension;
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return new Dimension(z5.a(19778, 1977415988761601218L), z5.a(4436, 7299215602918226134L));
    }

    @Override
    public void layoutContainer(Container container) {
        Component[] componentArray;
        Component[] componentArray2 = componentArray = container.getComponents();
        int n10 = componentArray2.length;
        String string = km_0.U();
        for (int i2 = 0; i2 < n10; ++i2) {
            block8: {
                boolean bl;
                Component component;
                block6: {
                    block7: {
                        component = componentArray2[i2];
                        bl = component.getClass().equals(aJ.class);
                        if (string != null) break block6;
                        if (!bl) break block7;
                        this.C = (km_0)component;
                        if (string == null) break block8;
                    }
                    bl = component.getClass().equals(tv_0.class);
                }
                if (bl) {
                    this.K = (ca_0)component;
                }
            }
            km_0 km_02 = (km_0)this.C;
            if (string == null) {
                if (km_02 == null) continue;
                km_02 = (km_0)this.C;
            }
            km_02.setBounds(0, 0, container.getWidth(), container.getHeight());
            if (string == null) continue;
        }
    }

    public void K(Rectangle rectangle, DefaultMutableTreeNode defaultMutableTreeNode) {
        block3: {
            ca_0 ca_02;
            block2: {
                String string = km_0.U();
                ca_02 = (ca_0)this.K;
                if (string != null) break block2;
                if (ca_02 == null) break block3;
                ca_02 = (ca_0)this.K;
            }
            ca_02.setBounds(rectangle);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3280677383495894744L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "c\u00ea\u0019\u00c9\u0098\u008d\u00c1\f\u00be\u00fap\u00c7\u00be\u00beb~";
                var5_4 = "c\u00ea\u0019\u00c9\u0098\u008d\u00c1\f\u00be\u00fap\u00c7\u00be\u00beb~".length();
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
                    var4_3 = "H\u00f5m\u00014U8\u001a\f\u00a1\u00e8q/\u0003\u00bej";
                    var5_4 = "H\u00f5m\u00014U8\u001a\f\u00a1\u00e8q/\u0003\u00bej".length();
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
        z5.a = var6_1;
        z5.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6981;
        if (b[n11] == null) {
            z5.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

