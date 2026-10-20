/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.WP;
import com.ky_2;
import com.o__0;
import com.oj_0;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.PlainDocument;
import javax.swing.text.Segment;
import javax.swing.text.Utilities;
import javax.swing.text.View;

/*
 * Renamed from com.wv
 */
public class wv_2
extends BasicLabelUI
implements ComponentListener {
    protected static Rectangle o;
    protected static Rectangle E;
    protected static Rectangle J;
    protected static Insets X;
    private static int i;
    private FontMetrics d;
    private boolean V = o__0.U;
    private Color k = o__0.v;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    public static ComponentUI createUI(JComponent jComponent) {
        return new wv_2();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(jComponent);
    }

    @Override
    protected void uninstallDefaults(JLabel jLabel) {
        super.uninstallDefaults(jLabel);
        this.f(jLabel);
    }

    @Override
    protected void installListeners(JLabel jLabel) {
        super.installListeners(jLabel);
        jLabel.addComponentListener(this);
    }

    @Override
    protected void uninstallListeners(JLabel jLabel) {
        super.uninstallListeners(jLabel);
        jLabel.removeComponentListener(this);
    }

    public boolean Z() {
        return this.V;
    }

    public void B(boolean bl) {
        this.V = bl;
    }

    public Color F() {
        return this.k;
    }

    public void l(Color color) {
        this.k = color;
    }

    protected void f(JLabel jLabel) {
        jLabel.putClientProperty(wv_2.a(-6671, 27918), null);
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block4: {
            block3: {
                boolean bl;
                block2: {
                    boolean bl2 = oj_0.V();
                    super.propertyChange(propertyChangeEvent);
                    boolean bl3 = bl2;
                    String string = propertyChangeEvent.getPropertyName();
                    bl = string.equals(wv_2.a(-6667, -25414));
                    if (bl3) break block2;
                    if (bl) break block3;
                    bl = wv_2.a(-6668, -26008).equals(string);
                }
                if (!bl) break block4;
            }
            this.f((JLabel)propertyChangeEvent.getSource());
        }
    }

    protected void e(JLabel jLabel, FontMetrics fontMetrics, int n10, int n11) {
        boolean bl = oj_0.V();
        if (!bl) {
            if (fontMetrics == null) {
                fontMetrics = jLabel.getFontMetrics(jLabel.getFont());
            }
            this.d = fontMetrics;
        }
        String string = jLabel.getText();
        Icon icon = jLabel.getIcon();
        Insets insets = jLabel.getInsets(X);
        wv_2.J.x = insets.left;
        wv_2.J.y = insets.top;
        wv_2.J.width = n10 - (insets.left + insets.right);
        wv_2.J.height = n11 - (insets.top + insets.bottom);
        wv_2.o.height = 0;
        wv_2.o.width = 0;
        wv_2.o.y = 0;
        wv_2.o.x = 0;
        wv_2.E.height = 0;
        wv_2.E.width = 0;
        wv_2.E.y = 0;
        wv_2.E.x = 0;
        this.layoutCL(jLabel, fontMetrics, string, icon, J, o, E);
        if (ky_2.F() != null) {
            oj_0.T(!bl);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
        block12: {
            block14: {
                block13: {
                    block11: {
                        block10: {
                            block9: {
                                var4_3 = FN.B(var1_1);
                                var3_4 = oj_0.g();
                                var5_5 = (JLabel)var2_2;
                                var6_6 = var5_5.getText();
                                v0 = var5_5;
                                if (!var3_4) ** GOTO lbl11
                                if (v0.isEnabled()) {
                                    v1 = var5_5.getIcon();
                                } else {
                                    v0 = var5_5;
lbl11:
                                    // 2 sources

                                    v1 = var7_7 = v0.getDisabledIcon();
                                }
                                if (var7_7 == null && var6_6 == null) {
                                    return;
                                }
                                var8_8 = var1_1.getFontMetrics();
                                this.e(var5_5, var8_8, var2_2.getWidth(), var2_2.getHeight());
                                v2 = var7_7;
                                if (!var3_4) break block9;
                                if (v2 == null) break block10;
                                v2 = var7_7;
                            }
                            v2.paintIcon(var2_2, var1_1, wv_2.o.x, wv_2.o.y);
                        }
                        v3 = var6_6;
                        if (!var3_4) break block11;
                        if (v3 == null) break block12;
                        v3 = var2_2.getClientProperty(wv_2.a(-6665, -28866));
                    }
                    v4 = var9_9 = (View)v3;
                    if (!var3_4) break block13;
                    if (v4 == null) break block14;
                    v4 = var9_9;
                }
                v4.paint(var1_1, wv_2.E);
                if (var3_4) break block12;
            }
            this.b(var1_1, var5_5, var8_8);
        }
        FN.O(var1_1, var4_3);
    }

    protected void b(Graphics graphics, JLabel jLabel, FontMetrics fontMetrics) {
        boolean bl;
        List list;
        block13: {
            int n10;
            list = this.a(jLabel);
            bl = oj_0.g();
            int n11 = this.D(jLabel);
            for (n10 = list.size() * fontMetrics.getHeight(); n10 > n11; n10 -= fontMetrics.getHeight()) {
                if (bl) {
                    if (bl) continue;
                }
                break block13;
            }
            wv_2.E.height = Math.min(n10, n11);
            wv_2.E.y = this.G(jLabel, fontMetrics, E);
        }
        int n12 = wv_2.E.x;
        int n13 = wv_2.E.y;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            block18: {
                int n14;
                String string;
                block17: {
                    block16: {
                        block14: {
                            int n15;
                            block15: {
                                Rectangle rectangle = E;
                                if (bl) {
                                    if (!rectangle.contains(n12, n13 + wv_2.d(fontMetrics))) break;
                                    rectangle = iterator.next();
                                }
                                string = ((String)((Object)rectangle)).trim();
                                n15 = iterator.hasNext();
                                if (!bl) break block14;
                                if (n15 == 0) break block15;
                                n15 = E.contains(n12, n13 + fontMetrics.getHeight() + wv_2.d(fontMetrics)) ? 1 : 0;
                                if (!bl) break block14;
                                if (n15 == 0) {
                                    string = this.F(string);
                                }
                            }
                            n15 = n14 = this.e(jLabel, fontMetrics, string);
                        }
                        if (!bl) break block16;
                        if (!jLabel.isEnabled()) break block17;
                        this.paintEnabledText(jLabel, graphics, string, n14, n13);
                    }
                    if (bl) break block18;
                }
                this.paintDisabledText(jLabel, graphics, string, n14, n13);
            }
            n13 += fontMetrics.getHeight();
            if (bl) continue;
        }
    }

    @Override
    protected void paintEnabledText(JLabel jLabel, Graphics graphics, String string, int n10, int n11) {
        block4: {
            int n12;
            block2: {
                block3: {
                    boolean bl = oj_0.V();
                    n12 = this.V;
                    if (bl) break block2;
                    if (n12 == 0) break block3;
                    graphics.setColor(jLabel.getForeground());
                    this.z(graphics, string, n10, n11);
                    if (!bl) break block4;
                }
                n12 = jLabel.getDisplayedMnemonicIndex();
            }
            int n13 = n12;
            graphics.setColor(jLabel.getForeground());
            FN.W(graphics, string, n13, n10, n11);
        }
    }

    @Override
    protected void paintDisabledText(JLabel jLabel, Graphics graphics, String string, int n10, int n11) {
        block4: {
            int n12;
            block2: {
                block3: {
                    boolean bl = oj_0.g();
                    n12 = this.V;
                    if (!bl) break block2;
                    if (n12 == 0) break block3;
                    graphics.setColor(jLabel.getBackground().darker());
                    this.z(graphics, string, n10, n11);
                    if (bl) break block4;
                }
                n12 = jLabel.getDisplayedMnemonicIndex();
            }
            int n13 = n12;
            graphics.setColor(jLabel.getForeground());
            FN.W(graphics, string, n13, n10, n11);
        }
    }

    private void z(Graphics graphics, String string, int n10, int n11) {
        graphics.translate(n10, n11);
        GA.v((Graphics2D)graphics, string, this.k);
        graphics.translate(-n10, -n11);
    }

    protected int D(JLabel jLabel) {
        jLabel.getInsets(X);
        return jLabel.getHeight() - wv_2.X.top - wv_2.X.bottom;
    }

    protected String F(String string) {
        boolean bl = oj_0.V();
        String string2 = string;
        if (!bl) {
            if (string2.length() < 3) {
                return wv_2.a(-6672, -5641);
            }
            string2 = string.substring(0, string.length() - 3) + wv_2.a(-6666, -19479);
        }
        return string2;
    }

    protected int G(JLabel jLabel, FontMetrics fontMetrics, Rectangle rectangle) {
        int n10;
        int n11 = this.D(jLabel);
        int n12 = rectangle.height;
        boolean bl = oj_0.g();
        int n13 = n10 = jLabel.getVerticalAlignment();
        if (bl) {
            switch (n13) {
                case 1: {
                    return wv_2.d(fontMetrics) + wv_2.X.top;
                }
                case 3: {
                    return wv_2.d(fontMetrics) + n11 - wv_2.X.top + wv_2.X.bottom - n12;
                }
            }
            n13 = wv_2.X.top + (n11 - n12) / 2 + wv_2.d(fontMetrics);
        }
        int n14 = n13;
        return Math.max(n14, wv_2.d(fontMetrics) + wv_2.X.top);
    }

    private static int d(FontMetrics fontMetrics) {
        return fontMetrics.getAscent() + fontMetrics.getLeading();
    }

    protected int e(JLabel jLabel, FontMetrics fontMetrics, String string) {
        int n10;
        boolean bl;
        block10: {
            int n11;
            block11: {
                int n12;
                block9: {
                    int n13;
                    int n14;
                    block5: {
                        block6: {
                            int n15;
                            boolean bl2;
                            block7: {
                                block8: {
                                    bl2 = jLabel.getComponentOrientation().isLeftToRight();
                                    bl = oj_0.V();
                                    n14 = n11 = jLabel.getHorizontalAlignment();
                                    n13 = 4;
                                    if (bl) break block5;
                                    if (n14 == n13) break block6;
                                    n10 = n11;
                                    n15 = wv_2.a(8025, 6594664785071933849L);
                                    if (bl) break block7;
                                    if (n10 != n15) break block8;
                                    n12 = bl2 ? 1 : 0;
                                    if (bl) break block9;
                                    if (n12 != 0) break block6;
                                }
                                n10 = n11;
                                if (bl) break block10;
                                n15 = wv_2.a(2913, 80014396581092768L);
                            }
                            if (n10 != n15) break block11;
                            n10 = bl2 ? 1 : 0;
                            if (bl) break block10;
                            if (n10 != 0) break block11;
                        }
                        n14 = wv_2.J.width;
                        n13 = fontMetrics.stringWidth(string);
                    }
                    n12 = n14 - n13;
                }
                return n12;
            }
            n10 = n11;
        }
        if (!bl) {
            if (n10 == 0) {
                return wv_2.J.width / 2 - fontMetrics.stringWidth(string) / 2;
            }
            n10 = wv_2.J.x;
        }
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean P(String string) {
        boolean bl = oj_0.g();
        String string2 = string;
        if (bl) {
            if (string2 == null) return 0 != 0;
            string2 = string;
        }
        int n10 = string2.length();
        if (!bl) return n10 != 0;
        if (n10 < wv_2.a(27710, 2919881871166012155L)) return 0 != 0;
        n10 = string.charAt(0);
        if (!bl) return n10 != 0;
        if (n10 != wv_2.a(29046, 2144811263449458613L)) return 0 != 0;
        n10 = string.charAt(5);
        if (!bl) return n10 != 0;
        if (n10 != wv_2.a(30262, 2927974294376145138L)) return 0 != 0;
        String string3 = string.substring(1, 5);
        return string3.equalsIgnoreCase(wv_2.a(-6658, -27949));
    }

    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        Dimension dimension;
        block8: {
            JLabel jLabel;
            Dimension dimension2;
            block7: {
                Dimension dimension3;
                Container container;
                boolean bl;
                block6: {
                    dimension2 = super.getPreferredSize(jComponent);
                    bl = oj_0.g();
                    container = jLabel = (JLabel)jComponent;
                    if (bl) {
                        if (wv_2.P(container.getText())) {
                            return dimension2;
                        }
                        container = jComponent.getParent();
                    }
                    if (!bl) break block6;
                    if (container == null) break block7;
                    container = jComponent.getParent();
                }
                Insets insets = ((Container)container).getInsets();
                dimension = dimension3 = jComponent.getParent().getSize();
                if (!bl) break block8;
                if (dimension.width > 0) {
                    dimension2.width = dimension3.width - insets.left - insets.right;
                }
            }
            this.e(jLabel, null, dimension2.width, dimension2.height);
            dimension2.height = Math.max(dimension2.height, this.E(jLabel));
            dimension = dimension2;
        }
        return dimension;
    }

    protected int E(JLabel jLabel) {
        int n10 = this.a(jLabel).size();
        Insets insets = jLabel.getInsets(X);
        return n10 * this.d.getHeight() + insets.top + insets.bottom;
    }

    protected List a(JLabel jLabel) {
        List list = (List)jLabel.getClientProperty(wv_2.a(-6659, 6127));
        boolean bl = oj_0.g();
        List list2 = list;
        if (bl) {
            if (list2 == null) {
                list = this.v(jLabel);
                jLabel.putClientProperty(wv_2.a(-6659, 6127), list);
            }
            list2 = list;
        }
        return list2;
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.f((JLabel)componentEvent.getSource());
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
    }

    protected List v(JLabel jLabel) {
        ArrayList arrayList = new ArrayList(i);
        boolean bl = oj_0.V();
        String string = jLabel.getText();
        try {
            if (string == null) {
                return null;
            }
        }
        catch (BadLocationException badLocationException) {
            throw wv_2.a(badLocationException);
        }
        PlainDocument plainDocument = new PlainDocument();
        try {
            plainDocument.insertString(0, string, null);
        }
        catch (BadLocationException badLocationException) {
            return null;
        }
        Element element = plainDocument.getDefaultRootElement();
        int n10 = element.getElementCount();
        for (int i2 = 0; i2 < n10; ++i2) {
            this.S(arrayList, element.getElement(i2));
            if (!bl) continue;
        }
        return arrayList;
    }

    protected void S(List list, Element element) {
        int n10 = element.getEndOffset();
        Document document = element.getDocument();
        boolean bl = oj_0.V();
        int n11 = element.getStartOffset();
        while (n11 < n10) {
            block7: {
                int n12;
                int n13;
                block8: {
                    n13 = this.z(document, n11, n10);
                    try {
                        list.add(document.getText(n11, n13 - n11));
                    }
                    catch (BadLocationException badLocationException) {
                        throw new Error(wv_2.a(-6657, 20128) + n11 + wv_2.a(-6669, 7061) + n13);
                    }
                    try {
                        try {
                            n12 = n13;
                            if (bl) break block7;
                            if (n12 != n11) break block8;
                        }
                        catch (BadLocationException badLocationException) {
                            throw wv_2.a(badLocationException);
                        }
                        n12 = n10;
                        break block7;
                    }
                    catch (BadLocationException badLocationException) {
                        throw wv_2.a(badLocationException);
                    }
                }
                n12 = n11 = n13;
            }
            if (!bl) continue;
        }
    }

    protected int z(Document document, int n10, int n11) {
        Segment segment = WP.x();
        try {
            document.getText(n10, n11 - n10, segment);
        }
        catch (BadLocationException badLocationException) {
            throw new Error(wv_2.a(-6670, 28258));
        }
        int n12 = wv_2.E.width;
        int n13 = n10 + Utilities.getBreakLocation(segment, this.d, 0, n12, null, n10);
        WP.D(segment);
        return n13;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "m.B[\u0003p2,\u0004\u009f\u00ec\u0096(\u0004\u0013\u00c4Af\u0003\u0097q\f\u0013\u00c3\u00f9\u00da]\u00de\u008b\u00f1To\u0084s\u008f\"g\u00a3\u00ff\u00d2u\u00b5\u000b\u0081\u000b\u000b%\u000e|lv\u00ae\u008f`\u0003^@\u00e9\u0018\u0092\u00ea\u00f0?\u009b\u00c7Y\u00ddz\u00b5\u00d1\u00a9v\u00a3)g\u0083f\u009fV\u009e5i\u0002";
                        var12_3 = "m.B[\u0003p2,\u0004\u009f\u00ec\u0096(\u0004\u0013\u00c4Af\u0003\u0097q\f\u0013\u00c3\u00f9\u00da]\u00de\u008b\u00f1To\u0084s\u008f\"g\u00a3\u00ff\u00d2u\u00b5\u000b\u0081\u000b\u000b%\u000e|lv\u00ae\u008f`\u0003^@\u00e9\u0018\u0092\u00ea\u00f0?\u009b\u00c7Y\u00ddz\u00b5\u00d1\u00a9v\u00a3)g\u0083f\u009fV\u009e5i\u0002".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 14;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "8k\u00b8\u00a3\u000b\u00ba\u00bb<c\u00b8\u00e4\u00ea5.\u00b7 ";
                            var12_3 = "8k\u00b8\u00a3\u000b\u00ba\u00bb<c\u00b8\u00e4\u00ea5.\u00b7 ".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 28;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 34;
                                    break;
                                }
                                case 1: {
                                    v15 = 46;
                                    break;
                                }
                                case 2: {
                                    v15 = 108;
                                    break;
                                }
                                case 3: {
                                    v15 = 2;
                                    break;
                                }
                                case 4: {
                                    v15 = 16;
                                    break;
                                }
                                case 5: {
                                    v15 = 76;
                                    break;
                                }
                                default: {
                                    v15 = 122;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                wv_2.a = var13;
                wv_2.b = new String[11];
                var0_7 = 6726019194712551635L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u00f49,1\u00c3\u00b1yAxk\u00e8\u00a3 n\u00edyy\u00fc\u00f7>>\u0087\u00b5\u00ba\u00ff\u009a\u00caR\u00a9e\u0097Z";
                var5_11 = "\u00f49,1\u00c3\u00b1yAxk\u00e8\u00a3 n\u00edyy\u00fc\u00f7>>\u0087\u00b5\u00ba\u00ff\u009a\u00caR\u00a9e\u0097Z".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "](\u009b\u00f1\u00da\u008f\u0010\u001f!\u0080m\u0005!\u00bf\n.";
                    var5_11 = "](\u009b\u00f1\u00da\u008f\u0010\u001f!\u0080m\u0005!\u00bf\n.".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        wv_2.c = var6_8;
        wv_2.e = new Integer[6];
        wv_2.o = new Rectangle();
        wv_2.E = new Rectangle();
        wv_2.J = new Rectangle();
        wv_2.X = new Insets(0, 0, 0, 0);
        wv_2.i = wv_2.a(21423, 4057009024230180205L);
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE5F7) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 225;
                    break;
                }
                case 1: {
                    n14 = 146;
                    break;
                }
                case 2: {
                    n14 = 83;
                    break;
                }
                case 3: {
                    n14 = 226;
                    break;
                }
                case 4: {
                    n14 = 8;
                    break;
                }
                case 5: {
                    n14 = 238;
                    break;
                }
                case 6: {
                    n14 = 101;
                    break;
                }
                case 7: {
                    n14 = 117;
                    break;
                }
                case 8: {
                    n14 = 247;
                    break;
                }
                case 9: {
                    n14 = 88;
                    break;
                }
                case 10: {
                    n14 = 158;
                    break;
                }
                case 11: {
                    n14 = 69;
                    break;
                }
                case 12: {
                    n14 = 191;
                    break;
                }
                case 13: {
                    n14 = 218;
                    break;
                }
                case 14: {
                    n14 = 200;
                    break;
                }
                case 15: {
                    n14 = 78;
                    break;
                }
                case 16: {
                    n14 = 167;
                    break;
                }
                case 17: {
                    n14 = 209;
                    break;
                }
                case 18: {
                    n14 = 154;
                    break;
                }
                case 19: {
                    n14 = 242;
                    break;
                }
                case 20: {
                    n14 = 10;
                    break;
                }
                case 21: {
                    n14 = 185;
                    break;
                }
                case 22: {
                    n14 = 70;
                    break;
                }
                case 23: {
                    n14 = 31;
                    break;
                }
                case 24: {
                    n14 = 233;
                    break;
                }
                case 25: {
                    n14 = 5;
                    break;
                }
                case 26: {
                    n14 = 82;
                    break;
                }
                case 27: {
                    n14 = 98;
                    break;
                }
                case 28: {
                    n14 = 120;
                    break;
                }
                case 29: {
                    n14 = 230;
                    break;
                }
                case 30: {
                    n14 = 151;
                    break;
                }
                case 31: {
                    n14 = 159;
                    break;
                }
                case 32: {
                    n14 = 59;
                    break;
                }
                case 33: {
                    n14 = 116;
                    break;
                }
                case 34: {
                    n14 = 254;
                    break;
                }
                case 35: {
                    n14 = 241;
                    break;
                }
                case 36: {
                    n14 = 244;
                    break;
                }
                case 37: {
                    n14 = 135;
                    break;
                }
                case 38: {
                    n14 = 229;
                    break;
                }
                case 39: {
                    n14 = 168;
                    break;
                }
                case 40: {
                    n14 = 104;
                    break;
                }
                case 41: {
                    n14 = 77;
                    break;
                }
                case 42: {
                    n14 = 207;
                    break;
                }
                case 43: {
                    n14 = 47;
                    break;
                }
                case 44: {
                    n14 = 195;
                    break;
                }
                case 45: {
                    n14 = 64;
                    break;
                }
                case 46: {
                    n14 = 166;
                    break;
                }
                case 47: {
                    n14 = 107;
                    break;
                }
                case 48: {
                    n14 = 234;
                    break;
                }
                case 49: {
                    n14 = 27;
                    break;
                }
                case 50: {
                    n14 = 114;
                    break;
                }
                case 51: {
                    n14 = 76;
                    break;
                }
                case 52: {
                    n14 = 220;
                    break;
                }
                case 53: {
                    n14 = 6;
                    break;
                }
                case 54: {
                    n14 = 176;
                    break;
                }
                case 55: {
                    n14 = 152;
                    break;
                }
                case 56: {
                    n14 = 253;
                    break;
                }
                case 57: {
                    n14 = 192;
                    break;
                }
                case 58: {
                    n14 = 173;
                    break;
                }
                case 59: {
                    n14 = 213;
                    break;
                }
                case 60: {
                    n14 = 156;
                    break;
                }
                case 61: {
                    n14 = 162;
                    break;
                }
                case 62: {
                    n14 = 29;
                    break;
                }
                case 63: {
                    n14 = 15;
                    break;
                }
                case 64: {
                    n14 = 126;
                    break;
                }
                case 65: {
                    n14 = 21;
                    break;
                }
                case 66: {
                    n14 = 174;
                    break;
                }
                case 67: {
                    n14 = 148;
                    break;
                }
                case 68: {
                    n14 = 7;
                    break;
                }
                case 69: {
                    n14 = 153;
                    break;
                }
                case 70: {
                    n14 = 93;
                    break;
                }
                case 71: {
                    n14 = 14;
                    break;
                }
                case 72: {
                    n14 = 45;
                    break;
                }
                case 73: {
                    n14 = 127;
                    break;
                }
                case 74: {
                    n14 = 199;
                    break;
                }
                case 75: {
                    n14 = 186;
                    break;
                }
                case 76: {
                    n14 = 211;
                    break;
                }
                case 77: {
                    n14 = 42;
                    break;
                }
                case 78: {
                    n14 = 193;
                    break;
                }
                case 79: {
                    n14 = 60;
                    break;
                }
                case 80: {
                    n14 = 255;
                    break;
                }
                case 81: {
                    n14 = 224;
                    break;
                }
                case 82: {
                    n14 = 73;
                    break;
                }
                case 83: {
                    n14 = 133;
                    break;
                }
                case 84: {
                    n14 = 129;
                    break;
                }
                case 85: {
                    n14 = 179;
                    break;
                }
                case 86: {
                    n14 = 249;
                    break;
                }
                case 87: {
                    n14 = 54;
                    break;
                }
                case 88: {
                    n14 = 189;
                    break;
                }
                case 89: {
                    n14 = 63;
                    break;
                }
                case 90: {
                    n14 = 43;
                    break;
                }
                case 91: {
                    n14 = 67;
                    break;
                }
                case 92: {
                    n14 = 119;
                    break;
                }
                case 93: {
                    n14 = 175;
                    break;
                }
                case 94: {
                    n14 = 140;
                    break;
                }
                case 95: {
                    n14 = 246;
                    break;
                }
                case 96: {
                    n14 = 205;
                    break;
                }
                case 97: {
                    n14 = 177;
                    break;
                }
                case 98: {
                    n14 = 222;
                    break;
                }
                case 99: {
                    n14 = 52;
                    break;
                }
                case 100: {
                    n14 = 223;
                    break;
                }
                case 101: {
                    n14 = 215;
                    break;
                }
                case 102: {
                    n14 = 136;
                    break;
                }
                case 103: {
                    n14 = 37;
                    break;
                }
                case 104: {
                    n14 = 188;
                    break;
                }
                case 105: {
                    n14 = 11;
                    break;
                }
                case 106: {
                    n14 = 61;
                    break;
                }
                case 107: {
                    n14 = 172;
                    break;
                }
                case 108: {
                    n14 = 171;
                    break;
                }
                case 109: {
                    n14 = 170;
                    break;
                }
                case 110: {
                    n14 = 51;
                    break;
                }
                case 111: {
                    n14 = 228;
                    break;
                }
                case 112: {
                    n14 = 194;
                    break;
                }
                case 113: {
                    n14 = 30;
                    break;
                }
                case 114: {
                    n14 = 155;
                    break;
                }
                case 115: {
                    n14 = 62;
                    break;
                }
                case 116: {
                    n14 = 102;
                    break;
                }
                case 117: {
                    n14 = 132;
                    break;
                }
                case 118: {
                    n14 = 125;
                    break;
                }
                case 119: {
                    n14 = 245;
                    break;
                }
                case 120: {
                    n14 = 46;
                    break;
                }
                case 121: {
                    n14 = 97;
                    break;
                }
                case 122: {
                    n14 = 72;
                    break;
                }
                case 123: {
                    n14 = 217;
                    break;
                }
                case 124: {
                    n14 = 181;
                    break;
                }
                case 125: {
                    n14 = 75;
                    break;
                }
                case 126: {
                    n14 = 36;
                    break;
                }
                case 127: {
                    n14 = 57;
                    break;
                }
                case 128: {
                    n14 = 231;
                    break;
                }
                case 129: {
                    n14 = 32;
                    break;
                }
                case 130: {
                    n14 = 87;
                    break;
                }
                case 131: {
                    n14 = 210;
                    break;
                }
                case 132: {
                    n14 = 28;
                    break;
                }
                case 133: {
                    n14 = 202;
                    break;
                }
                case 134: {
                    n14 = 128;
                    break;
                }
                case 135: {
                    n14 = 147;
                    break;
                }
                case 136: {
                    n14 = 203;
                    break;
                }
                case 137: {
                    n14 = 187;
                    break;
                }
                case 138: {
                    n14 = 80;
                    break;
                }
                case 139: {
                    n14 = 95;
                    break;
                }
                case 140: {
                    n14 = 84;
                    break;
                }
                case 141: {
                    n14 = 113;
                    break;
                }
                case 142: {
                    n14 = 58;
                    break;
                }
                case 143: {
                    n14 = 123;
                    break;
                }
                case 144: {
                    n14 = 53;
                    break;
                }
                case 145: {
                    n14 = 68;
                    break;
                }
                case 146: {
                    n14 = 106;
                    break;
                }
                case 147: {
                    n14 = 109;
                    break;
                }
                case 148: {
                    n14 = 142;
                    break;
                }
                case 149: {
                    n14 = 86;
                    break;
                }
                case 150: {
                    n14 = 112;
                    break;
                }
                case 151: {
                    n14 = 165;
                    break;
                }
                case 152: {
                    n14 = 17;
                    break;
                }
                case 153: {
                    n14 = 235;
                    break;
                }
                case 154: {
                    n14 = 79;
                    break;
                }
                case 155: {
                    n14 = 150;
                    break;
                }
                case 156: {
                    n14 = 232;
                    break;
                }
                case 157: {
                    n14 = 149;
                    break;
                }
                case 158: {
                    n14 = 50;
                    break;
                }
                case 159: {
                    n14 = 103;
                    break;
                }
                case 160: {
                    n14 = 161;
                    break;
                }
                case 161: {
                    n14 = 221;
                    break;
                }
                case 162: {
                    n14 = 204;
                    break;
                }
                case 163: {
                    n14 = 157;
                    break;
                }
                case 164: {
                    n14 = 16;
                    break;
                }
                case 165: {
                    n14 = 248;
                    break;
                }
                case 166: {
                    n14 = 94;
                    break;
                }
                case 167: {
                    n14 = 216;
                    break;
                }
                case 168: {
                    n14 = 198;
                    break;
                }
                case 169: {
                    n14 = 145;
                    break;
                }
                case 170: {
                    n14 = 180;
                    break;
                }
                case 171: {
                    n14 = 201;
                    break;
                }
                case 172: {
                    n14 = 65;
                    break;
                }
                case 173: {
                    n14 = 20;
                    break;
                }
                case 174: {
                    n14 = 25;
                    break;
                }
                case 175: {
                    n14 = 137;
                    break;
                }
                case 176: {
                    n14 = 90;
                    break;
                }
                case 177: {
                    n14 = 0;
                    break;
                }
                case 178: {
                    n14 = 1;
                    break;
                }
                case 179: {
                    n14 = 243;
                    break;
                }
                case 180: {
                    n14 = 39;
                    break;
                }
                case 181: {
                    n14 = 26;
                    break;
                }
                case 182: {
                    n14 = 48;
                    break;
                }
                case 183: {
                    n14 = 143;
                    break;
                }
                case 184: {
                    n14 = 23;
                    break;
                }
                case 185: {
                    n14 = 41;
                    break;
                }
                case 186: {
                    n14 = 183;
                    break;
                }
                case 187: {
                    n14 = 250;
                    break;
                }
                case 188: {
                    n14 = 212;
                    break;
                }
                case 189: {
                    n14 = 40;
                    break;
                }
                case 190: {
                    n14 = 163;
                    break;
                }
                case 191: {
                    n14 = 71;
                    break;
                }
                case 192: {
                    n14 = 214;
                    break;
                }
                case 193: {
                    n14 = 237;
                    break;
                }
                case 194: {
                    n14 = 38;
                    break;
                }
                case 195: {
                    n14 = 85;
                    break;
                }
                case 196: {
                    n14 = 35;
                    break;
                }
                case 197: {
                    n14 = 178;
                    break;
                }
                case 198: {
                    n14 = 138;
                    break;
                }
                case 199: {
                    n14 = 12;
                    break;
                }
                case 200: {
                    n14 = 89;
                    break;
                }
                case 201: {
                    n14 = 2;
                    break;
                }
                case 202: {
                    n14 = 236;
                    break;
                }
                case 203: {
                    n14 = 131;
                    break;
                }
                case 204: {
                    n14 = 252;
                    break;
                }
                case 205: {
                    n14 = 24;
                    break;
                }
                case 206: {
                    n14 = 9;
                    break;
                }
                case 207: {
                    n14 = 124;
                    break;
                }
                case 208: {
                    n14 = 219;
                    break;
                }
                case 209: {
                    n14 = 141;
                    break;
                }
                case 210: {
                    n14 = 105;
                    break;
                }
                case 211: {
                    n14 = 121;
                    break;
                }
                case 212: {
                    n14 = 111;
                    break;
                }
                case 213: {
                    n14 = 33;
                    break;
                }
                case 214: {
                    n14 = 251;
                    break;
                }
                case 215: {
                    n14 = 22;
                    break;
                }
                case 216: {
                    n14 = 34;
                    break;
                }
                case 217: {
                    n14 = 139;
                    break;
                }
                case 218: {
                    n14 = 122;
                    break;
                }
                case 219: {
                    n14 = 74;
                    break;
                }
                case 220: {
                    n14 = 13;
                    break;
                }
                case 221: {
                    n14 = 4;
                    break;
                }
                case 222: {
                    n14 = 130;
                    break;
                }
                case 223: {
                    n14 = 206;
                    break;
                }
                case 224: {
                    n14 = 96;
                    break;
                }
                case 225: {
                    n14 = 144;
                    break;
                }
                case 226: {
                    n14 = 208;
                    break;
                }
                case 227: {
                    n14 = 99;
                    break;
                }
                case 228: {
                    n14 = 169;
                    break;
                }
                case 229: {
                    n14 = 3;
                    break;
                }
                case 230: {
                    n14 = 190;
                    break;
                }
                case 231: {
                    n14 = 66;
                    break;
                }
                case 232: {
                    n14 = 44;
                    break;
                }
                case 233: {
                    n14 = 55;
                    break;
                }
                case 234: {
                    n14 = 108;
                    break;
                }
                case 235: {
                    n14 = 92;
                    break;
                }
                case 236: {
                    n14 = 19;
                    break;
                }
                case 237: {
                    n14 = 49;
                    break;
                }
                case 238: {
                    n14 = 100;
                    break;
                }
                case 239: {
                    n14 = 182;
                    break;
                }
                case 240: {
                    n14 = 227;
                    break;
                }
                case 241: {
                    n14 = 196;
                    break;
                }
                case 242: {
                    n14 = 18;
                    break;
                }
                case 243: {
                    n14 = 239;
                    break;
                }
                case 244: {
                    n14 = 118;
                    break;
                }
                case 245: {
                    n14 = 240;
                    break;
                }
                case 246: {
                    n14 = 134;
                    break;
                }
                case 247: {
                    n14 = 115;
                    break;
                }
                case 248: {
                    n14 = 81;
                    break;
                }
                case 249: {
                    n14 = 110;
                    break;
                }
                case 250: {
                    n14 = 160;
                    break;
                }
                case 251: {
                    n14 = 91;
                    break;
                }
                case 252: {
                    n14 = 56;
                    break;
                }
                case 253: {
                    n14 = 164;
                    break;
                }
                case 254: {
                    n14 = 184;
                    break;
                }
                default: {
                    n14 = 197;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            wv_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x16C0;
        if (e[n11] == null) {
            wv_2.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

