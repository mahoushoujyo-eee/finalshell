/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.FN;
import com.GA;
import com.KD;
import com.L.B;
import com.L.J;
import com.L.O;
import com.L.Q;
import com.L.V;
import com.L.Y;
import com.L.Z;
import com.L.c;
import com.L.t;
import com.L0;
import com.QH;
import com.W2;
import com.X9;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeListener;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m
extends BasicComboBoxUI
implements W2,
L0 {
    protected static ListCellRenderer U;
    protected ImageIcon r = Z.W;
    protected ImageIcon G = Z.X;
    protected int u = Z.Q;
    protected boolean X = Z.e;
    protected boolean R = Z.i;
    protected Color L = Z.c;
    protected int D = Z.P;
    protected int E = Z.N;
    protected boolean M = Z.F;
    protected Color g = Z.a;
    protected Color a = Z.E;
    protected boolean b = Z.s;
    protected boolean f = Z.L;
    protected boolean m = false;
    protected KD S = null;
    protected MouseWheelListener W = null;
    protected X9 J = null;
    protected PropertyChangeListener z = null;
    protected PropertyChangeListener O = null;
    private static ky_2[] y;
    private static final String[] c;
    private static final String[] d;
    private static final long e;

    public static ComponentUI createUI(JComponent jComponent) {
        return new m();
    }

    @Override
    public void installUI(JComponent jComponent) {
        ky_2[] ky_2Array = com.L.m.X();
        super.installUI(jComponent);
        ky_2[] ky_2Array2 = ky_2Array;
        FN.Y(this.comboBox);
        this.comboBox.setFocusable(true);
        LookAndFeel.installProperty(this.comboBox, com.L.m.a(-1125, 2846), Boolean.FALSE);
        this.h();
        JComboBox jComboBox = this.comboBox;
        if (ky_2Array2 == null) {
            if (!(jComboBox.getRenderer() instanceof Q)) {
                this.comboBox.setRenderer(new Q());
            }
            this.W = new Y(this);
            this.comboBox.addMouseWheelListener(this.W);
            this.J = new B(this);
            this.w(this.comboBox.getRenderer());
            this.z = new J(this);
            this.comboBox.addPropertyChangeListener(com.L.m.a(-1123, 6457), this.z);
            this.O = new V(this);
            jComboBox = this.comboBox;
        }
        jComboBox.addPropertyChangeListener(com.L.m.a(-1133, 29729), this.O);
        if (ky_2.F() != null) {
            com.L.m.Q(new ky_2[2]);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        this.comboBox.removePropertyChangeListener(com.L.m.a(-1124, 1106), this.O);
        this.comboBox.removePropertyChangeListener(com.L.m.a(-1128, -23818), this.z);
        this.m(this.comboBox.getRenderer());
        this.J = null;
        jComponent.removeMouseWheelListener(this.W);
        this.W = null;
        this.S = null;
        super.uninstallUI(jComponent);
    }

    @Override
    public void h() {
        ky_2[] ky_2Array = com.L.m.X();
        if (FN.l(this.comboBox)) {
            return;
        }
        Insets insets = new Insets(0, 0, 0, 0);
        m m10 = this;
        if (ky_2Array == null) {
            if (m10.X) {
                insets.top += this.E + 1;
                insets.left += this.E + 1;
                insets.bottom += this.E + 1;
                insets.right += this.E + 1;
            }
            m10 = this;
        }
        m10.comboBox.setBorder(GA.y(insets));
    }

    protected void w(Object object) {
        block3: {
            Object object2;
            block4: {
                ky_2[] ky_2Array;
                block2: {
                    ky_2Array = com.L.m.X();
                    object2 = object;
                    if (ky_2Array != null) break block2;
                    if (object2 == null) break block3;
                    object2 = object;
                }
                if (ky_2Array != null) break block4;
                if (!(object2 instanceof Q)) break block3;
                object2 = object;
            }
            ((Q)object2).O(this.J);
        }
    }

    protected void m(Object object) {
        block3: {
            Object object2;
            block4: {
                ky_2[] ky_2Array;
                block2: {
                    ky_2Array = com.L.m.X();
                    object2 = object;
                    if (ky_2Array != null) break block2;
                    if (object2 == null) break block3;
                    object2 = object;
                }
                if (ky_2Array != null) break block4;
                if (!(object2 instanceof Q)) break block3;
                object2 = object;
            }
            ((Q)object2).m(this.J);
        }
    }

    @Override
    protected void installComponents() {
        ky_2[] ky_2Array = com.L.m.X();
        this.comboBox.setLayout(this.createLayoutManager());
        ky_2[] ky_2Array2 = ky_2Array;
        this.arrowButton = this.createArrowButton();
        this.comboBox.add((Component)this.arrowButton, com.L.m.a(-1121, -1067));
        m m10 = this;
        if (ky_2Array2 == null) {
            if (m10.arrowButton != null) {
                this.configureArrowButton();
            }
            m10 = this;
        }
        JComboBox jComboBox = m10.comboBox;
        if (ky_2Array2 == null) {
            if (jComboBox.isEditable()) {
                this.addEditor();
            }
            jComboBox = this.comboBox;
        }
        jComboBox.add((Component)this.currentValuePane, com.L.m.a(-1126, -3845));
    }

    @Override
    protected ComboBoxEditor createEditor() {
        ComboBoxEditor comboBoxEditor;
        block6: {
            Component component;
            block5: {
                boolean bl;
                Component component2;
                block4: {
                    comboBoxEditor = super.createEditor();
                    ky_2[] ky_2Array = com.L.m.X();
                    component2 = comboBoxEditor.getEditorComponent();
                    component2.addFocusListener(new O(this));
                    bl = component2 instanceof JComponent;
                    if (ky_2Array != null) break block4;
                    if (bl) {
                        ((JComponent)component2).setOpaque(false);
                    }
                    component = component2;
                    if (ky_2Array != null) break block5;
                    bl = component instanceof JTextField;
                }
                if (!bl) break block6;
                component = component2;
            }
            JTextField jTextField = (JTextField)component;
            QH qH = new QH();
            qH.R(false);
            jTextField.setUI(qH);
            jTextField.setMargin(new Insets(0, 1, 0, 1));
        }
        return comboBoxEditor;
    }

    @Override
    protected JButton createArrowButton() {
        this.S = new KD();
        this.S.G(true);
        this.S.r(false);
        this.S.t(false);
        this.S.setName(com.L.m.a(-1135, 25609));
        this.S.setIcon(this.r);
        this.S.O(this.u);
        return this.S;
    }

    @Override
    public void configureArrowButton() {
        block3: {
            JButton jButton;
            block2: {
                ky_2[] ky_2Array = com.L.m.X();
                super.configureArrowButton();
                ky_2[] ky_2Array2 = ky_2Array;
                jButton = this.arrowButton;
                if (ky_2Array2 != null) break block2;
                if (jButton == null) break block3;
                jButton = this.arrowButton;
            }
            jButton.setFocusable(false);
        }
    }

    @Override
    protected ComboPopup createPopup() {
        return new c(this, this.comboBox);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean M() {
        JComboBox jComboBox;
        ky_2[] ky_2Array = com.L.m.X();
        Object object = this.comboBox;
        if (ky_2Array == null) {
            if (object == null) return false;
            object = this.comboBox.getClientProperty(com.L.m.a(-1122, -4085));
        }
        JComboBox jComboBox2 = jComboBox = object;
        if (ky_2Array == null) {
            if (jComboBox2 == null) return false;
            jComboBox2 = jComboBox;
        }
        boolean bl = (Boolean)((Object)jComboBox2);
        if (ky_2Array != null) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public Shape B() {
        ky_2[] ky_2Array = com.L.m.X();
        m m10 = this;
        if (ky_2Array == null) {
            if (m10.X) {
                return GA.X(this.comboBox, this.E, this.D);
            }
            m10 = this;
        }
        return FN.N(m10.comboBox);
    }

    public void m(int n10) {
        block3: {
            Component component;
            block2: {
                ky_2[] ky_2Array = com.L.m.X();
                component = this.editor;
                if (ky_2Array != null) break block2;
                if (!(component instanceof JTextField)) break block3;
                component = this.editor;
            }
            ((JTextField)component).setColumns(n10);
        }
    }

    public boolean m() {
        return this.m;
    }

    public void G(boolean bl) {
        this.m = bl;
        this.isMinimumSizeDirty = true;
        this.comboBox.revalidate();
    }

    public ImageIcon d() {
        return this.r;
    }

    public void k(ImageIcon imageIcon) {
        block3: {
            m m10;
            block4: {
                ky_2[] ky_2Array;
                block2: {
                    this.r = imageIcon;
                    ky_2Array = com.L.m.X();
                    m10 = this;
                    if (ky_2Array != null) break block2;
                    if (m10.S == null) break block3;
                    m10 = this;
                }
                if (ky_2Array != null) break block4;
                if (m10.isPopupVisible(this.comboBox)) break block3;
                m10 = this;
            }
            m10.S.setIcon(imageIcon);
        }
    }

    public ImageIcon L() {
        return this.G;
    }

    public void h(ImageIcon imageIcon) {
        block3: {
            m m10;
            block4: {
                ky_2[] ky_2Array;
                block2: {
                    this.G = imageIcon;
                    ky_2Array = com.L.m.X();
                    m10 = this;
                    if (ky_2Array != null) break block2;
                    if (m10.S == null) break block3;
                    m10 = this;
                }
                if (ky_2Array != null) break block4;
                if (!m10.isPopupVisible(this.comboBox)) break block3;
                m10 = this;
            }
            m10.S.setIcon(imageIcon);
        }
    }

    public int B() {
        return this.u;
    }

    public void D(int n10) {
        this.u = n10;
        ky_2[] ky_2Array = com.L.m.X();
        KD kD = this.S;
        if (ky_2Array == null && kD != null) {
            kD = this.S.O(n10);
        }
    }

    public boolean k() {
        return this.X;
    }

    public void n(boolean bl) {
        this.X = bl;
        this.h();
    }

    public boolean J() {
        return this.R;
    }

    public void E(boolean bl) {
        this.R = bl;
    }

    public Color U() {
        return this.L;
    }

    public void l(Color color) {
        this.L = color;
    }

    public boolean f() {
        return this.M;
    }

    public void a(boolean bl) {
        this.M = bl;
    }

    public int N() {
        return this.D;
    }

    public void P(int n10) {
        this.D = n10;
    }

    public int J() {
        return this.E;
    }

    public void A(int n10) {
        this.E = n10;
        this.h();
    }

    public boolean G() {
        return this.b;
    }

    public void W(boolean bl) {
        this.b = bl;
    }

    public boolean I() {
        return this.f;
    }

    public void T(boolean bl) {
        this.f = bl;
    }

    public Paint P() {
        return this.g;
    }

    public Paint S() {
        return this.a;
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        block3: {
            m m10;
            Rectangle rectangle;
            block2: {
                this.hasFocus = this.comboBox.hasFocus();
                rectangle = this.rectangleForCurrentValue();
                ky_2[] ky_2Array = com.L.m.X();
                this.paintCurrentValueBackground(graphics, rectangle, this.hasFocus);
                m10 = this;
                if (ky_2Array != null) break block2;
                if (m10.comboBox.isEditable()) break block3;
                m10 = this;
            }
            m10.paintCurrentValue(graphics, rectangle, this.hasFocus);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void paintCurrentValueBackground(Graphics var1_1, Rectangle var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    protected boolean Y() {
        return FN.l((Component)this.comboBox);
    }

    @Override
    public void paintCurrentValue(Graphics graphics, Rectangle rectangle, boolean bl) {
        Component component;
        ky_2[] ky_2Array;
        block13: {
            Component component2;
            block11: {
                block12: {
                    block10: {
                        ListCellRenderer<Object> listCellRenderer;
                        block9: {
                            boolean bl2;
                            block8: {
                                listCellRenderer = this.comboBox.getRenderer();
                                ky_2Array = com.L.m.X();
                                bl2 = bl;
                                if (ky_2Array != null) break block8;
                                if (!bl2) break block9;
                                bl2 = this.isPopupVisible(this.comboBox);
                            }
                            if (bl2) break block9;
                            component = listCellRenderer.getListCellRendererComponent(this.listBox, this.comboBox.getSelectedItem(), -1, true, false);
                            if (ky_2Array == null) break block10;
                            ky_2.K(new String[5]);
                        }
                        component = listCellRenderer.getListCellRendererComponent(this.listBox, this.comboBox.getSelectedItem(), -1, false, false);
                        component.setBackground(UIManager.getColor(com.L.m.a(-1134, 29385)));
                    }
                    component.setFont(this.comboBox.getFont());
                    component2 = this.comboBox;
                    if (ky_2Array != null) break block11;
                    if (!component2.isEnabled()) break block12;
                    component.setForeground(this.comboBox.getForeground());
                    component.setBackground(this.comboBox.getBackground());
                    if (ky_2Array == null) break block13;
                }
                component.setForeground(UIManager.getColor(com.L.m.a(-1136, -25605)));
                component2 = component;
            }
            ((Component)component2).setBackground(UIManager.getColor(com.L.m.a(-1127, 26858)));
        }
        boolean bl3 = false;
        int n10 = component instanceof JPanel;
        if (ky_2Array == null) {
            if (n10 != 0) {
                bl3 = true;
            }
            n10 = rectangle.x;
        }
        int n11 = n10;
        int n12 = rectangle.y;
        int n13 = rectangle.width;
        int n14 = rectangle.height;
        this.currentValuePane.paintComponent(graphics, component, this.comboBox, n11, n12, n13, n14, bl3);
    }

    @Override
    protected LayoutManager createLayoutManager() {
        return new t(this);
    }

    @Override
    public Dimension getMinimumSize(JComponent jComponent) {
        ky_2[] ky_2Array = com.L.m.X();
        m m10 = this;
        if (ky_2Array == null) {
            if (!m10.isMinimumSizeDirty) {
                return new Dimension(this.cachedMinimumSize);
            }
            m10 = this;
        }
        Dimension dimension = m10.getDisplaySize();
        Insets insets = this.getInsets();
        int n10 = this.arrowButton.getPreferredSize().width;
        dimension.height += insets.top + insets.bottom;
        dimension.width += insets.left + insets.right + 1 + n10;
        this.cachedMinimumSize.setSize(dimension.width, dimension.height);
        this.isMinimumSizeDirty = false;
        return new Dimension(dimension);
    }

    @Override
    protected Dimension getDisplaySize() {
        Dimension dimension;
        block18: {
            Component component;
            Object object;
            block17: {
                int n10;
                block16: {
                    ky_2[] ky_2Array;
                    block9: {
                        block12: {
                            block13: {
                                int n11;
                                Dimension dimension2;
                                Object object2;
                                int n12;
                                DefaultListCellRenderer defaultListCellRenderer;
                                block14: {
                                    int n13;
                                    block15: {
                                        block11: {
                                            block10: {
                                                DefaultListCellRenderer defaultListCellRenderer2;
                                                dimension = new Dimension();
                                                ky_2Array = com.L.m.X();
                                                DefaultListCellRenderer defaultListCellRenderer3 = defaultListCellRenderer = this.comboBox.getRenderer();
                                                if (ky_2Array == null) {
                                                    if (defaultListCellRenderer3 == null) {
                                                        defaultListCellRenderer = new DefaultListCellRenderer();
                                                    }
                                                    defaultListCellRenderer3 = defaultListCellRenderer2 = this.comboBox.getPrototypeDisplayValue();
                                                }
                                                if (ky_2Array != null) break block10;
                                                if (defaultListCellRenderer2 == null) break block11;
                                                dimension = this.getSizeForComponent(defaultListCellRenderer.getListCellRendererComponent(this.listBox, defaultListCellRenderer2, -1, false, false));
                                            }
                                            if (ky_2Array == null) break block9;
                                        }
                                        object = this.comboBox.getModel();
                                        n10 = n12 = object.getSize();
                                        if (ky_2Array != null) break block12;
                                        if (n10 <= 0) break block13;
                                        n13 = this.m;
                                        if (ky_2Array != null) break block14;
                                        if (n13 == 0) break block15;
                                        Object e2 = object.getElementAt(0);
                                        object2 = defaultListCellRenderer.getListCellRendererComponent(this.listBox, e2, -1, false, false);
                                        dimension2 = this.getSizeForComponent((Component)object2);
                                        dimension.width = Math.max(dimension.width, dimension2.width);
                                        dimension.height = Math.max(dimension.height, dimension2.height);
                                        if (ky_2Array == null) break block9;
                                    }
                                    n13 = n11 = 0;
                                }
                                while (n11 < n12) {
                                    object2 = object.getElementAt(n11);
                                    Component component2 = defaultListCellRenderer.getListCellRendererComponent(this.listBox, object2, -1, false, false);
                                    dimension2 = this.getSizeForComponent(component2);
                                    dimension.width = Math.max(dimension.width, dimension2.width);
                                    dimension.height = Math.max(dimension.height, dimension2.height);
                                    ++n11;
                                    if (ky_2Array == null) {
                                        if (ky_2Array == null) continue;
                                    }
                                    break block9;
                                }
                                if (ky_2Array == null) break block9;
                            }
                            dimension = this.getDefaultSize();
                            n10 = this.comboBox.isEditable() ? 1 : 0;
                        }
                        if (ky_2Array != null) break block16;
                        if (n10 != 0) {
                            dimension.width = (int)e;
                        }
                    }
                    component = this.comboBox;
                    if (ky_2Array != null) break block17;
                    n10 = component.isEditable();
                }
                if (n10 == 0) break block18;
                component = this.editor;
            }
            object = ((Component)component).getPreferredSize();
            dimension.width = Math.max(dimension.width, ((Dimension)object).width);
            dimension.height = Math.max(dimension.height, ((Dimension)object).height);
        }
        return dimension;
    }

    @Override
    protected Dimension getDefaultSize() {
        return this.getSizeForComponent(com.L.m.L().getListCellRendererComponent(this.listBox, " ", -1, false, false));
    }

    @Override
    protected Rectangle rectangleForCurrentValue() {
        int n10 = this.comboBox.getWidth();
        ky_2[] ky_2Array = com.L.m.X();
        int n11 = this.comboBox.getHeight();
        Insets insets = this.comboBox.getInsets();
        int n12 = n11 - (insets.top + insets.bottom);
        m m10 = this;
        if (ky_2Array == null) {
            if (m10.arrowButton != null) {
                n12 = this.arrowButton.getWidth();
            }
            m10 = this;
        }
        if (m10.comboBox.getComponentOrientation().isLeftToRight()) {
            return new Rectangle(insets.left, insets.top, n10 - (insets.left + insets.right + n12) - 1, n11 - (insets.top + insets.bottom));
        }
        return new Rectangle(insets.left + n12 + 1, insets.top, n10 - (insets.left + insets.right + n12), n11 - (insets.top + insets.bottom));
    }

    protected static ListCellRenderer L() {
        ky_2[] ky_2Array = com.L.m.X();
        ListCellRenderer listCellRenderer = U;
        if (ky_2Array == null) {
            if (listCellRenderer == null) {
                U = new Q();
            }
            listCellRenderer = U;
        }
        return listCellRenderer;
    }

    @Override
    protected Dimension getSizeForComponent(Component component) {
        this.currentValuePane.add(component);
        component.setFont(this.comboBox.getFont());
        Dimension dimension = component.getPreferredSize();
        this.currentValuePane.remove(component);
        return dimension;
    }

    static JComboBox F(m m10) {
        return m10.comboBox;
    }

    static JComboBox B(m m10) {
        return m10.comboBox;
    }

    static JComboBox M(m m10) {
        return m10.comboBox;
    }

    static JComboBox C(m m10) {
        return m10.comboBox;
    }

    static JComboBox a(m m10) {
        return m10.comboBox;
    }

    static JList I(m m10) {
        return m10.listBox;
    }

    static boolean x(m m10, boolean bl) {
        m10.isMinimumSizeDirty = bl;
        return m10.isMinimumSizeDirty;
    }

    static JComboBox o(m m10) {
        return m10.comboBox;
    }

    static JList O(m m10) {
        return m10.listBox;
    }

    static JComboBox h(m m10) {
        return m10.comboBox;
    }

    static JList Z(m m10) {
        return m10.listBox;
    }

    static JComboBox v(m m10) {
        return m10.comboBox;
    }

    static JComboBox R(m m10) {
        return m10.comboBox;
    }

    static JButton v(m m10) {
        return m10.arrowButton;
    }

    static Insets O(m m10) {
        return m10.getInsets();
    }

    static JButton N(m m10) {
        return m10.arrowButton;
    }

    static JButton I(m m10) {
        return m10.arrowButton;
    }

    static JButton D(m m10) {
        return m10.arrowButton;
    }

    static Component i(m m10) {
        return m10.editor;
    }

    static Component W(m m10) {
        return m10.editor;
    }

    public static void Q(ky_2[] ky_2Array) {
        y = ky_2Array;
    }

    public static ky_2[] X() {
        return y;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[12];
                    var5_1 = 0;
                    com.L.m.Q(null);
                    var4_2 = "=I\u00bf\u0006i\u0004\u00d0l\u00ca\u0019\b\u00a4b\u00d8\u00025t\u00f8\u00b2\u001b\u0018\u00df[\u00f8,\u00dd\u009a\u00bbJz(<\u008e\n\u0082\u00bf\u00cb\u009f\u00184\u00d7\u009c;i\u00cd)\u00a8\u001b\u00f8\u00b3m\u00d3\u00a5{*\u00f0\u0082\u00ac\u00ad\u00e5\u000b2\u00af\u00d2\u00a0\u001bP\u008a]\u0087\u009bj\f\u008e\u00a7\u0003\u008c\u008e\u00a8\u0007B\u00fe\u00fe\u00fd\u0016Z\u00b5\b=/\u00eb\u00abSA4\u0014\u0013Y\u00absv)\f:\u0081^;\u00a2\u00c2\u00dc\u00c2\u009d\t\u00e4.\u00cb\u0007N\u0093\u007fP&\u00ef\u00b3";
                    var6_3 = "=I\u00bf\u0006i\u0004\u00d0l\u00ca\u0019\b\u00a4b\u00d8\u00025t\u00f8\u00b2\u001b\u0018\u00df[\u00f8,\u00dd\u009a\u00bbJz(<\u008e\n\u0082\u00bf\u00cb\u009f\u00184\u00d7\u009c;i\u00cd)\u00a8\u001b\u00f8\u00b3m\u00d3\u00a5{*\u00f0\u0082\u00ac\u00ad\u00e5\u000b2\u00af\u00d2\u00a0\u001bP\u008a]\u0087\u009bj\f\u008e\u00a7\u0003\u008c\u008e\u00a8\u0007B\u00fe\u00fe\u00fd\u0016Z\u00b5\b=/\u00eb\u00abSA4\u0014\u0013Y\u00absv)\f:\u0081^;\u00a2\u00c2\u00dc\u00c2\u009d\t\u00e4.\u00cb\u0007N\u0093\u007fP&\u00ef\u00b3".length();
                    var3_4 = 3;
                    var2_5 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = 55;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\u0082\u00ab\u00cb\u00b5\u00fd\u00b7c5\u00b6ht\u00bd\u00c6\u00f9H\u0002Q\u00ef\u0086l\u0006g\r\u00d5\u00c8}\u00cb\u0014\u00e4\u00d0\u0007\u00dadZP\u0088\u00d0\u00da\u00a3OJ\u00938\u00e8\u00a4\u0092*\u00ab";
                        var6_3 = "\u0082\u00ab\u00cb\u00b5\u00fd\u00b7c5\u00b6ht\u00bd\u00c6\u00f9H\u0002Q\u00ef\u0086l\u0006g\r\u00d5\u00c8}\u00cb\u0014\u00e4\u00d0\u0007\u00dadZP\u0088\u00d0\u00da\u00a3OJ\u00938\u00e8\u00a4\u0092*\u00ab".length();
                        var3_4 = 27;
                        var2_5 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v0 = 16;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl86
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 36;
                                break;
                            }
                            case 1: {
                                v15 = 65;
                                break;
                            }
                            case 2: {
                                v15 = 75;
                                break;
                            }
                            case 3: {
                                v15 = 26;
                                break;
                            }
                            case 4: {
                                v15 = 80;
                                break;
                            }
                            case 5: {
                                v15 = 60;
                                break;
                            }
                            default: {
                                v15 = 41;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl86:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var8_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl96:
                    // 1 sources

                    ** continue;
                }
            }
            com.L.m.c = var7;
            com.L.m.d = new String[12];
            break block22;
lbl101:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3224092947114691527L;
        ** while (true)
        com.L.m.e = -5208932006932706397L ^ var0_7;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFFB9A) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 156;
                    break;
                }
                case 1: {
                    n14 = 78;
                    break;
                }
                case 2: {
                    n14 = 16;
                    break;
                }
                case 3: {
                    n14 = 13;
                    break;
                }
                case 4: {
                    n14 = 104;
                    break;
                }
                case 5: {
                    n14 = 68;
                    break;
                }
                case 6: {
                    n14 = 111;
                    break;
                }
                case 7: {
                    n14 = 87;
                    break;
                }
                case 8: {
                    n14 = 51;
                    break;
                }
                case 9: {
                    n14 = 223;
                    break;
                }
                case 10: {
                    n14 = 27;
                    break;
                }
                case 11: {
                    n14 = 162;
                    break;
                }
                case 12: {
                    n14 = 167;
                    break;
                }
                case 13: {
                    n14 = 89;
                    break;
                }
                case 14: {
                    n14 = 161;
                    break;
                }
                case 15: {
                    n14 = 105;
                    break;
                }
                case 16: {
                    n14 = 133;
                    break;
                }
                case 17: {
                    n14 = 251;
                    break;
                }
                case 18: {
                    n14 = 119;
                    break;
                }
                case 19: {
                    n14 = 204;
                    break;
                }
                case 20: {
                    n14 = 160;
                    break;
                }
                case 21: {
                    n14 = 1;
                    break;
                }
                case 22: {
                    n14 = 121;
                    break;
                }
                case 23: {
                    n14 = 137;
                    break;
                }
                case 24: {
                    n14 = 57;
                    break;
                }
                case 25: {
                    n14 = 96;
                    break;
                }
                case 26: {
                    n14 = 128;
                    break;
                }
                case 27: {
                    n14 = 58;
                    break;
                }
                case 28: {
                    n14 = 232;
                    break;
                }
                case 29: {
                    n14 = 178;
                    break;
                }
                case 30: {
                    n14 = 244;
                    break;
                }
                case 31: {
                    n14 = 60;
                    break;
                }
                case 32: {
                    n14 = 126;
                    break;
                }
                case 33: {
                    n14 = 240;
                    break;
                }
                case 34: {
                    n14 = 132;
                    break;
                }
                case 35: {
                    n14 = 185;
                    break;
                }
                case 36: {
                    n14 = 56;
                    break;
                }
                case 37: {
                    n14 = 33;
                    break;
                }
                case 38: {
                    n14 = 188;
                    break;
                }
                case 39: {
                    n14 = 109;
                    break;
                }
                case 40: {
                    n14 = 46;
                    break;
                }
                case 41: {
                    n14 = 52;
                    break;
                }
                case 42: {
                    n14 = 184;
                    break;
                }
                case 43: {
                    n14 = 112;
                    break;
                }
                case 44: {
                    n14 = 93;
                    break;
                }
                case 45: {
                    n14 = 165;
                    break;
                }
                case 46: {
                    n14 = 221;
                    break;
                }
                case 47: {
                    n14 = 3;
                    break;
                }
                case 48: {
                    n14 = 28;
                    break;
                }
                case 49: {
                    n14 = 218;
                    break;
                }
                case 50: {
                    n14 = 158;
                    break;
                }
                case 51: {
                    n14 = 189;
                    break;
                }
                case 52: {
                    n14 = 23;
                    break;
                }
                case 53: {
                    n14 = 140;
                    break;
                }
                case 54: {
                    n14 = 238;
                    break;
                }
                case 55: {
                    n14 = 146;
                    break;
                }
                case 56: {
                    n14 = 54;
                    break;
                }
                case 57: {
                    n14 = 216;
                    break;
                }
                case 58: {
                    n14 = 74;
                    break;
                }
                case 59: {
                    n14 = 108;
                    break;
                }
                case 60: {
                    n14 = 154;
                    break;
                }
                case 61: {
                    n14 = 153;
                    break;
                }
                case 62: {
                    n14 = 159;
                    break;
                }
                case 63: {
                    n14 = 72;
                    break;
                }
                case 64: {
                    n14 = 155;
                    break;
                }
                case 65: {
                    n14 = 141;
                    break;
                }
                case 66: {
                    n14 = 196;
                    break;
                }
                case 67: {
                    n14 = 139;
                    break;
                }
                case 68: {
                    n14 = 176;
                    break;
                }
                case 69: {
                    n14 = 138;
                    break;
                }
                case 70: {
                    n14 = 34;
                    break;
                }
                case 71: {
                    n14 = 245;
                    break;
                }
                case 72: {
                    n14 = 148;
                    break;
                }
                case 73: {
                    n14 = 170;
                    break;
                }
                case 74: {
                    n14 = 192;
                    break;
                }
                case 75: {
                    n14 = 213;
                    break;
                }
                case 76: {
                    n14 = 59;
                    break;
                }
                case 77: {
                    n14 = 11;
                    break;
                }
                case 78: {
                    n14 = 145;
                    break;
                }
                case 79: {
                    n14 = 237;
                    break;
                }
                case 80: {
                    n14 = 76;
                    break;
                }
                case 81: {
                    n14 = 30;
                    break;
                }
                case 82: {
                    n14 = 171;
                    break;
                }
                case 83: {
                    n14 = 107;
                    break;
                }
                case 84: {
                    n14 = 253;
                    break;
                }
                case 85: {
                    n14 = 217;
                    break;
                }
                case 86: {
                    n14 = 110;
                    break;
                }
                case 87: {
                    n14 = 174;
                    break;
                }
                case 88: {
                    n14 = 229;
                    break;
                }
                case 89: {
                    n14 = 254;
                    break;
                }
                case 90: {
                    n14 = 194;
                    break;
                }
                case 91: {
                    n14 = 222;
                    break;
                }
                case 92: {
                    n14 = 202;
                    break;
                }
                case 93: {
                    n14 = 233;
                    break;
                }
                case 94: {
                    n14 = 207;
                    break;
                }
                case 95: {
                    n14 = 63;
                    break;
                }
                case 96: {
                    n14 = 143;
                    break;
                }
                case 97: {
                    n14 = 65;
                    break;
                }
                case 98: {
                    n14 = 31;
                    break;
                }
                case 99: {
                    n14 = 21;
                    break;
                }
                case 100: {
                    n14 = 67;
                    break;
                }
                case 101: {
                    n14 = 179;
                    break;
                }
                case 102: {
                    n14 = 123;
                    break;
                }
                case 103: {
                    n14 = 113;
                    break;
                }
                case 104: {
                    n14 = 226;
                    break;
                }
                case 105: {
                    n14 = 35;
                    break;
                }
                case 106: {
                    n14 = 147;
                    break;
                }
                case 107: {
                    n14 = 210;
                    break;
                }
                case 108: {
                    n14 = 10;
                    break;
                }
                case 109: {
                    n14 = 17;
                    break;
                }
                case 110: {
                    n14 = 120;
                    break;
                }
                case 111: {
                    n14 = 103;
                    break;
                }
                case 112: {
                    n14 = 134;
                    break;
                }
                case 113: {
                    n14 = 190;
                    break;
                }
                case 114: {
                    n14 = 14;
                    break;
                }
                case 115: {
                    n14 = 15;
                    break;
                }
                case 116: {
                    n14 = 206;
                    break;
                }
                case 117: {
                    n14 = 101;
                    break;
                }
                case 118: {
                    n14 = 175;
                    break;
                }
                case 119: {
                    n14 = 177;
                    break;
                }
                case 120: {
                    n14 = 32;
                    break;
                }
                case 121: {
                    n14 = 144;
                    break;
                }
                case 122: {
                    n14 = 9;
                    break;
                }
                case 123: {
                    n14 = 129;
                    break;
                }
                case 124: {
                    n14 = 98;
                    break;
                }
                case 125: {
                    n14 = 205;
                    break;
                }
                case 126: {
                    n14 = 231;
                    break;
                }
                case 127: {
                    n14 = 201;
                    break;
                }
                case 128: {
                    n14 = 8;
                    break;
                }
                case 129: {
                    n14 = 239;
                    break;
                }
                case 130: {
                    n14 = 172;
                    break;
                }
                case 131: {
                    n14 = 211;
                    break;
                }
                case 132: {
                    n14 = 29;
                    break;
                }
                case 133: {
                    n14 = 166;
                    break;
                }
                case 134: {
                    n14 = 53;
                    break;
                }
                case 135: {
                    n14 = 100;
                    break;
                }
                case 136: {
                    n14 = 215;
                    break;
                }
                case 137: {
                    n14 = 18;
                    break;
                }
                case 138: {
                    n14 = 151;
                    break;
                }
                case 139: {
                    n14 = 203;
                    break;
                }
                case 140: {
                    n14 = 227;
                    break;
                }
                case 141: {
                    n14 = 163;
                    break;
                }
                case 142: {
                    n14 = 102;
                    break;
                }
                case 143: {
                    n14 = 198;
                    break;
                }
                case 144: {
                    n14 = 180;
                    break;
                }
                case 145: {
                    n14 = 66;
                    break;
                }
                case 146: {
                    n14 = 85;
                    break;
                }
                case 147: {
                    n14 = 187;
                    break;
                }
                case 148: {
                    n14 = 82;
                    break;
                }
                case 149: {
                    n14 = 40;
                    break;
                }
                case 150: {
                    n14 = 47;
                    break;
                }
                case 151: {
                    n14 = 26;
                    break;
                }
                case 152: {
                    n14 = 37;
                    break;
                }
                case 153: {
                    n14 = 81;
                    break;
                }
                case 154: {
                    n14 = 95;
                    break;
                }
                case 155: {
                    n14 = 88;
                    break;
                }
                case 156: {
                    n14 = 248;
                    break;
                }
                case 157: {
                    n14 = 7;
                    break;
                }
                case 158: {
                    n14 = 24;
                    break;
                }
                case 159: {
                    n14 = 39;
                    break;
                }
                case 160: {
                    n14 = 200;
                    break;
                }
                case 161: {
                    n14 = 12;
                    break;
                }
                case 162: {
                    n14 = 71;
                    break;
                }
                case 163: {
                    n14 = 94;
                    break;
                }
                case 164: {
                    n14 = 234;
                    break;
                }
                case 165: {
                    n14 = 182;
                    break;
                }
                case 166: {
                    n14 = 117;
                    break;
                }
                case 167: {
                    n14 = 208;
                    break;
                }
                case 168: {
                    n14 = 124;
                    break;
                }
                case 169: {
                    n14 = 69;
                    break;
                }
                case 170: {
                    n14 = 135;
                    break;
                }
                case 171: {
                    n14 = 252;
                    break;
                }
                case 172: {
                    n14 = 131;
                    break;
                }
                case 173: {
                    n14 = 197;
                    break;
                }
                case 174: {
                    n14 = 125;
                    break;
                }
                case 175: {
                    n14 = 235;
                    break;
                }
                case 176: {
                    n14 = 36;
                    break;
                }
                case 177: {
                    n14 = 212;
                    break;
                }
                case 178: {
                    n14 = 90;
                    break;
                }
                case 179: {
                    n14 = 48;
                    break;
                }
                case 180: {
                    n14 = 61;
                    break;
                }
                case 181: {
                    n14 = 169;
                    break;
                }
                case 182: {
                    n14 = 6;
                    break;
                }
                case 183: {
                    n14 = 49;
                    break;
                }
                case 184: {
                    n14 = 181;
                    break;
                }
                case 185: {
                    n14 = 44;
                    break;
                }
                case 186: {
                    n14 = 116;
                    break;
                }
                case 187: {
                    n14 = 41;
                    break;
                }
                case 188: {
                    n14 = 195;
                    break;
                }
                case 189: {
                    n14 = 214;
                    break;
                }
                case 190: {
                    n14 = 4;
                    break;
                }
                case 191: {
                    n14 = 168;
                    break;
                }
                case 192: {
                    n14 = 220;
                    break;
                }
                case 193: {
                    n14 = 255;
                    break;
                }
                case 194: {
                    n14 = 99;
                    break;
                }
                case 195: {
                    n14 = 55;
                    break;
                }
                case 196: {
                    n14 = 249;
                    break;
                }
                case 197: {
                    n14 = 157;
                    break;
                }
                case 198: {
                    n14 = 64;
                    break;
                }
                case 199: {
                    n14 = 241;
                    break;
                }
                case 200: {
                    n14 = 228;
                    break;
                }
                case 201: {
                    n14 = 209;
                    break;
                }
                case 202: {
                    n14 = 219;
                    break;
                }
                case 203: {
                    n14 = 97;
                    break;
                }
                case 204: {
                    n14 = 5;
                    break;
                }
                case 205: {
                    n14 = 130;
                    break;
                }
                case 206: {
                    n14 = 183;
                    break;
                }
                case 207: {
                    n14 = 45;
                    break;
                }
                case 208: {
                    n14 = 118;
                    break;
                }
                case 209: {
                    n14 = 42;
                    break;
                }
                case 210: {
                    n14 = 79;
                    break;
                }
                case 211: {
                    n14 = 242;
                    break;
                }
                case 212: {
                    n14 = 225;
                    break;
                }
                case 213: {
                    n14 = 127;
                    break;
                }
                case 214: {
                    n14 = 62;
                    break;
                }
                case 215: {
                    n14 = 114;
                    break;
                }
                case 216: {
                    n14 = 152;
                    break;
                }
                case 217: {
                    n14 = 38;
                    break;
                }
                case 218: {
                    n14 = 20;
                    break;
                }
                case 219: {
                    n14 = 246;
                    break;
                }
                case 220: {
                    n14 = 122;
                    break;
                }
                case 221: {
                    n14 = 70;
                    break;
                }
                case 222: {
                    n14 = 0;
                    break;
                }
                case 223: {
                    n14 = 193;
                    break;
                }
                case 224: {
                    n14 = 43;
                    break;
                }
                case 225: {
                    n14 = 84;
                    break;
                }
                case 226: {
                    n14 = 236;
                    break;
                }
                case 227: {
                    n14 = 73;
                    break;
                }
                case 228: {
                    n14 = 164;
                    break;
                }
                case 229: {
                    n14 = 25;
                    break;
                }
                case 230: {
                    n14 = 136;
                    break;
                }
                case 231: {
                    n14 = 247;
                    break;
                }
                case 232: {
                    n14 = 77;
                    break;
                }
                case 233: {
                    n14 = 80;
                    break;
                }
                case 234: {
                    n14 = 50;
                    break;
                }
                case 235: {
                    n14 = 106;
                    break;
                }
                case 236: {
                    n14 = 83;
                    break;
                }
                case 237: {
                    n14 = 142;
                    break;
                }
                case 238: {
                    n14 = 230;
                    break;
                }
                case 239: {
                    n14 = 149;
                    break;
                }
                case 240: {
                    n14 = 150;
                    break;
                }
                case 241: {
                    n14 = 75;
                    break;
                }
                case 242: {
                    n14 = 22;
                    break;
                }
                case 243: {
                    n14 = 92;
                    break;
                }
                case 244: {
                    n14 = 19;
                    break;
                }
                case 245: {
                    n14 = 199;
                    break;
                }
                case 246: {
                    n14 = 115;
                    break;
                }
                case 247: {
                    n14 = 186;
                    break;
                }
                case 248: {
                    n14 = 91;
                    break;
                }
                case 249: {
                    n14 = 243;
                    break;
                }
                case 250: {
                    n14 = 224;
                    break;
                }
                case 251: {
                    n14 = 86;
                    break;
                }
                case 252: {
                    n14 = 191;
                    break;
                }
                case 253: {
                    n14 = 173;
                    break;
                }
                case 254: {
                    n14 = 250;
                    break;
                }
                default: {
                    n14 = 2;
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
            com.L.m.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

