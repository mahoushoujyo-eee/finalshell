/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.Serializable;

/*
 * Renamed from com.oo
 */
public class oo_2
implements LayoutManager,
Serializable {
    public static int G;
    protected int D;
    protected int p;
    protected int S;

    public oo_2() {
        this(0, 0, G);
    }

    public oo_2(int n10) {
        this(n10, 0, G);
    }

    public oo_2(int n10, int n11, int n12) {
        block12: {
            int n13;
            block11: {
                int n14;
                block9: {
                    block10: {
                        int n15;
                        block8: {
                            int n16 = T4.b();
                            n14 = n16;
                            n13 = n10;
                            n15 = 1;
                            if (n14 == 0) break block8;
                            if (n13 != n15) {
                                n10 = 0;
                            }
                            n13 = n11;
                            if (n14 == 0) break block9;
                            n15 = 1;
                        }
                        if (n13 == n15) break block10;
                        n13 = n11;
                        if (n14 == 0) break block9;
                        if (n13 == 2) break block10;
                        n13 = n11;
                        if (n14 == 0) break block9;
                        if (n13 != 4) {
                            n11 = 0;
                        }
                    }
                    n13 = n12;
                }
                if (n14 == 0) break block11;
                if (n13 >= 0) break block12;
                n13 = 0;
            }
            n12 = n13;
        }
        this.D = n10;
        this.p = n11;
        this.S = n12;
    }

    @Override
    public void layoutContainer(Container container) {
        block21: {
            Dimension dimension;
            int n10;
            Component[] componentArray;
            int n11;
            int n12;
            int n13;
            Insets insets;
            Dimension dimension2;
            block22: {
                int n14;
                block23: {
                    dimension2 = container.getSize();
                    insets = container.getInsets();
                    n13 = T4.O();
                    n12 = insets.left;
                    n11 = insets.top;
                    componentArray = container.getComponents();
                    n14 = this.D;
                    if (n13 != 0) break block22;
                    if (n14 != 0) break block23;
                    for (n10 = 0; n10 < componentArray.length; ++n10) {
                        dimension = componentArray[n10].getPreferredSize();
                        if (n13 == 0) {
                            int n15 = this.p;
                            if (n13 == 0) {
                                switch (n15) {
                                    case 0: {
                                        n12 = insets.left;
                                        if (n13 == 0) break;
                                    }
                                    case 1: {
                                        n12 = (dimension2.width - dimension.width >> 1) + insets.left - insets.right;
                                        if (n13 == 0) break;
                                    }
                                    case 2: {
                                        n12 = insets.left;
                                        dimension.width = dimension2.width - insets.left - insets.right;
                                        if (n13 == 0) break;
                                    }
                                    case 4: {
                                        n12 = dimension2.width - dimension.width - insets.right;
                                    }
                                }
                                componentArray[n10].setBounds(n12, n11, dimension.width, dimension.height);
                                n15 = n11 + (dimension.height + this.S);
                            }
                            n11 = n15;
                            if (n13 == 0) continue;
                        }
                        break block21;
                    }
                    if (n13 == 0) break block21;
                }
                n14 = n10 = 0;
            }
            while (n10 < componentArray.length) {
                dimension = componentArray[n10].getPreferredSize();
                int n16 = this.p;
                if (n13 == 0) {
                    switch (n16) {
                        case 0: {
                            n11 = insets.top;
                            if (n13 == 0) break;
                        }
                        case 1: {
                            n11 = (dimension2.height - dimension.height >> 1) + insets.top - insets.bottom;
                            if (n13 == 0) break;
                        }
                        case 2: {
                            n11 = insets.top;
                            dimension.height = dimension2.height - insets.top - insets.bottom;
                            if (n13 == 0) break;
                        }
                        case 3: {
                            n11 = dimension2.height - dimension.height - insets.bottom;
                        }
                    }
                    componentArray[n10].setBounds(n12, n11, dimension.width, dimension.height);
                    n16 = n12 + (dimension.width + this.S);
                }
                n12 = n16;
                ++n10;
                if (n13 == 0) continue;
            }
        }
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        block15: {
            int n10;
            int n11;
            int n12;
            block12: {
                Dimension dimension;
                int n13;
                int n14;
                Component[] componentArray;
                int n15;
                block13: {
                    int n16;
                    block14: {
                        int n17;
                        int n18;
                        block11: {
                            n12 = 0;
                            n15 = 0;
                            componentArray = container.getComponents();
                            n14 = T4.O();
                            n16 = this.D;
                            if (n14 != 0) break block13;
                            if (n16 != 0) break block14;
                            for (n13 = 0; n13 < componentArray.length; ++n13) {
                                dimension = componentArray[n13].getPreferredSize();
                                n18 = n12;
                                n17 = dimension.width;
                                if (n14 == 0) {
                                    int n19;
                                    int n20;
                                    if (n14 == 0) {
                                        if (n18 < n17) {
                                            n12 = dimension.width;
                                        }
                                        n20 = n15;
                                        n19 = dimension.height + this.S;
                                    }
                                    n15 = n20 + n19;
                                    if (n14 == 0) continue;
                                }
                                break block11;
                            }
                            n18 = n15;
                            n17 = this.S;
                        }
                        n15 = n18 - n17;
                        if (n14 == 0) break block15;
                    }
                    n16 = n13 = 0;
                }
                while (n13 < componentArray.length) {
                    dimension = componentArray[n13].getPreferredSize();
                    n12 += dimension.width + this.S;
                    if (n14 == 0) {
                        n11 = n15;
                        n10 = dimension.height;
                        if (n14 != 0) break block12;
                        if (n11 < n10) {
                            n15 = dimension.height;
                        }
                        ++n13;
                    }
                    if (n14 == 0) continue;
                }
                n11 = n12;
                n10 = this.S;
            }
            n12 = n11 - n10;
        }
        Insets insets = container.getInsets();
        return new Dimension(n12 += insets.left + insets.right, n15 += insets.top + insets.bottom);
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        block15: {
            int n10;
            int n11;
            block12: {
                Dimension dimension;
                int n12;
                Component[] componentArray;
                int n13;
                int n14;
                block13: {
                    int n15;
                    block14: {
                        int n16;
                        int n17;
                        block11: {
                            n11 = 0;
                            n14 = 0;
                            n13 = T4.b();
                            componentArray = container.getComponents();
                            n15 = this.D;
                            if (n13 == 0) break block13;
                            if (n15 != 0) break block14;
                            for (n12 = 0; n12 < componentArray.length; ++n12) {
                                dimension = componentArray[n12].getMinimumSize();
                                n17 = n11;
                                n16 = dimension.width;
                                if (n13 != 0) {
                                    int n18;
                                    int n19;
                                    if (n13 != 0) {
                                        if (n17 < n16) {
                                            n11 = dimension.width;
                                        }
                                        n19 = n14;
                                        n18 = dimension.height + this.S;
                                    }
                                    n14 = n19 + n18;
                                    if (n13 != 0) continue;
                                }
                                break block11;
                            }
                            n17 = n14;
                            n16 = this.S;
                        }
                        n14 = n17 - n16;
                        if (n13 != 0) break block15;
                    }
                    n15 = n12 = 0;
                }
                while (n12 < componentArray.length) {
                    dimension = componentArray[n12].getMinimumSize();
                    n11 += dimension.width + this.S;
                    if (n13 != 0) {
                        n10 = n14;
                        if (n13 == 0) break block12;
                        if (n10 < dimension.height) {
                            n14 = dimension.height;
                        }
                        ++n12;
                    }
                    if (n13 != 0) continue;
                }
                n10 = -this.S;
            }
            n11 = n10;
        }
        Insets insets = container.getInsets();
        return new Dimension(n11 += insets.left + insets.right, n14 += insets.top + insets.bottom);
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
    }

    @Override
    public void removeLayoutComponent(Component component) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7330293765374988639L;
        long l3 = 0x32C3F3906FD15AL ^ l2;
        G = (int)l3;
    }
}

