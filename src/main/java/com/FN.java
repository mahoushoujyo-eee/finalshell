/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.A.d;
import com.FV;
import com.GA;
import com.GE;
import com.GO;
import com.HL;
import com.K8;
import com.KS;
import com.QD;
import com.RV;
import com.WC;
import com.a9;
import com.c;
import com.cs_0;
import com.ii_1;
import com.k3_0;
import com.k4_0;
import com.kl_1;
import com.kv_1;
import com.kz_2;
import com.lk_2;
import com.sa_0;
import com.wc_0;
import com.wh_2;
import com.xg_0;
import com.y2_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.FocusManager;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.JWindow;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.RootPaneUI;
import javax.swing.plaf.UIResource;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.text.JTextComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FN
extends FV {
    private static Integer m;
    private static JLabel y;
    private static String[] s;
    private static Font[] k;
    private static Thread Q;
    private static Thread P;
    private static final GE[] A;
    private static int R;
    private static final Set H;
    private static boolean h;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static boolean l(JComponent jComponent) {
        boolean bl;
        block10: {
            block11: {
                boolean bl2;
                block15: {
                    block13: {
                        String string;
                        block14: {
                            Border border;
                            Border border2;
                            block12: {
                                string = FV.D();
                                try {
                                    bl = FN.e(jComponent);
                                    if (string != null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                border2 = jComponent.getBorder();
                                try {
                                    border = border2;
                                    if (string != null) break block12;
                                    if (border == null) break block13;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                border = border2;
                            }
                            try {
                                try {
                                    bl2 = border instanceof UIResource;
                                    if (string != null) break block14;
                                    if (bl2) break block13;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                bl2 = border2 instanceof KS;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        try {
                            if (string != null) break block15;
                            if (bl2) break block13;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        bl2 = true;
                        break block15;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean e(JComponent jComponent) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    String string = FV.D();
                    try {
                        try {
                            try {
                                bl = Boolean.getBoolean("\u0000ERR:ArrayIndexOutOfBoundsException:Index 43447 out of bounds for length 35");
                                if (string != null) break block6;
                                if (bl) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl = Boolean.TRUE.equals(jComponent.getClientProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 43443 out of bounds for length 35"));
                            if (string != null) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (!bl) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean O(Component component) {
        boolean bl;
        block8: {
            block7: {
                JRootPane jRootPane;
                String string;
                block6: {
                    JRootPane jRootPane2 = FN.a(component);
                    string = FV.D();
                    try {
                        jRootPane = jRootPane2;
                        if (string != null) break block6;
                        if (jRootPane == null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    jRootPane = jRootPane2;
                }
                RootPaneUI rootPaneUI = jRootPane.getUI();
                try {
                    try {
                        bl = rootPaneUI instanceof d;
                        if (string != null) break block8;
                        if (!bl) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    return ((d)rootPaneUI).r();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean B(MouseEvent mouseEvent) {
        boolean bl;
        block2: {
            block3: {
                String string = FV.D();
                try {
                    bl = mouseEvent.getModifiers() & FN.a(953, 4114700576983152474L);
                    if (string != null) break block2;
                    if (!bl) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean N(MouseEvent mouseEvent) {
        int n10;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        n10 = mouseEvent.getModifiers() & FN.a(15049, 5744758837620035116L);
                        if (string != null) break block4;
                        if (n10 != FN.a(10014, 8454854018315867132L)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    n10 = 1;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    public static boolean L(MouseEvent mouseEvent) {
        boolean bl;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        bl = mouseEvent.getModifiers() & 4;
                        if (string != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    bl = true;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static void g(JTable jTable) {
        int n10 = 0;
        String string = FV.D();
        while (n10 < jTable.getRowCount()) {
            block6: {
                int n11 = 0;
                for (int i2 = 0; i2 < jTable.getColumnCount(); ++i2) {
                    int n12;
                    block9: {
                        block8: {
                            Component component;
                            block7: {
                                TableCellRenderer tableCellRenderer = jTable.getCellRenderer(n10, i2);
                                Object object = jTable.getValueAt(n10, i2);
                                Component component2 = tableCellRenderer.getTableCellRendererComponent(jTable, object, false, false, n10, i2);
                                try {
                                    try {
                                        if (string != null) break block6;
                                        component = component2;
                                        if (string != null) break block7;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    if (component == null) break block8;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                component = component2;
                            }
                            n12 = component.getPreferredSize().height;
                            break block9;
                        }
                        n12 = 0;
                    }
                    int n13 = n12;
                    n11 = Math.max(n13, n11);
                    if (string == null) continue;
                }
                jTable.setRowHeight(n10, n11);
                ++n10;
            }
            if (string == null) continue;
        }
    }

    public static void q(JTable jTable) {
        FN.S(jTable, GO.FV);
    }

    public static void S(JTable jTable, int n10) {
        String string = FV.D();
        for (int i2 = 0; i2 < jTable.getColumnCount(); ++i2) {
            FN.q(jTable, i2, n10);
            if (string == null) continue;
        }
    }

    public static void V(JTable jTable, int n10) {
        FN.q(jTable, n10, GO.FV);
    }

    public static void q(JTable jTable, int n10, int n11) {
        block8: {
            TableCellRenderer tableCellRenderer;
            TableCellRenderer tableCellRenderer2;
            String string;
            TableColumn tableColumn;
            block6: {
                block7: {
                    DefaultTableColumnModel defaultTableColumnModel = (DefaultTableColumnModel)jTable.getColumnModel();
                    tableColumn = defaultTableColumnModel.getColumn(n10);
                    string = FV.D();
                    tableCellRenderer2 = tableColumn.getHeaderRenderer();
                    try {
                        tableCellRenderer = tableCellRenderer2;
                        if (string != null) break block6;
                        if (tableCellRenderer != null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    tableCellRenderer2 = jTable.getTableHeader().getDefaultRenderer();
                }
                tableCellRenderer = tableCellRenderer2;
            }
            Component component = tableCellRenderer.getTableCellRendererComponent(jTable, tableColumn.getHeaderValue(), false, false, 0, 0);
            int n12 = component.getPreferredSize().width;
            for (int i2 = 0; i2 < jTable.getRowCount(); ++i2) {
                tableCellRenderer2 = jTable.getCellRenderer(i2, n10);
                component = tableCellRenderer2.getTableCellRendererComponent(jTable, jTable.getValueAt(i2, n10), false, false, i2, n10);
                n12 = Math.max(n12, component.getPreferredSize().width);
                try {
                    if (string == null) {
                        if (string == null) continue;
                        break;
                    }
                    break block8;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            tableColumn.setPreferredWidth(n12 += 2 * n11);
            tableColumn.setWidth(n12);
        }
    }

    public static boolean W(MouseEvent mouseEvent) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    String string = FV.D();
                    try {
                        try {
                            try {
                                bl = mouseEvent.isPopupTrigger();
                                if (string != null) break block6;
                                if (bl) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl = SwingUtilities.isRightMouseButton(mouseEvent);
                            if (string != null) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (!bl) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Could not resolve type clashes
     */
    public static void j(Container container) {
        Iterator iterator = FN.I(container).iterator();
        String string = FV.D();
        block16: while (iterator.hasNext()) {
            block30: {
                Container container2;
                block31: {
                    Container container3 = (Container)iterator.next();
                    container3.removeAll();
                    container3.setLayout(null);
                    for (EventListener eventListener : container3.getMouseListeners()) {
                        try {
                            container3.removeMouseListener((MouseListener)eventListener);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    for (EventListener eventListener : container3.getMouseMotionListeners()) {
                        try {
                            container3.removeMouseMotionListener((MouseMotionListener)eventListener);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    for (EventListener eventListener : container3.getMouseWheelListeners()) {
                        try {
                            container3.removeMouseWheelListener((MouseWheelListener)eventListener);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    for (EventListener eventListener : container3.getKeyListeners()) {
                        try {
                            container3.removeKeyListener((KeyListener)eventListener);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    for (EventListener eventListener : container3.getComponentListeners()) {
                        try {
                            container3.removeComponentListener((ComponentListener)eventListener);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    for (EventListener eventListener : container3.getContainerListeners()) {
                        try {
                            container3.removeContainerListener((ContainerListener)eventListener);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        try {
                            container2 = container3;
                            if (string != null) break block31;
                            if (!(container2 instanceof JComponent)) break block30;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        container2 = container3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                JComponent jComponent = (JComponent)container2;
                for (AncestorListener ancestorListener : jComponent.getAncestorListeners()) {
                    jComponent.removeAncestorListener(ancestorListener);
                    if (string != null) continue block16;
                    if (string == null) continue;
                }
            }
            if (string == null) continue;
        }
    }

    public static List I(Container container) {
        return FN.A(container, new ArrayList());
    }

    public static List A(Container container, List list) {
        list.add(container);
        Component[] componentArray = container.getComponents();
        String string = FV.D();
        int n10 = componentArray.length;
        int n11 = 0;
        while (n11 < n10) {
            block5: {
                block6: {
                    Component component = componentArray[n11];
                    try {
                        try {
                            if (string != null) break block5;
                            if (!(component instanceof Container)) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        FN.A((Container)component, list);
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                ++n11;
            }
            if (string == null) continue;
        }
        return list;
    }

    public static Component L(Component component, int n10, int n11) {
        Component component2;
        Component component3;
        block10: {
            block11: {
                Component component4;
                block8: {
                    component3 = component.getComponentAt(n10, n11);
                    String string = FV.D();
                    try {
                        block9: {
                            try {
                                try {
                                    try {
                                        component4 = component3;
                                        if (string != null) break block8;
                                        if (component4 == component) break block9;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    component2 = component3;
                                    if (string != null) break block10;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                if (component2 instanceof Container) break block11;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        component4 = component;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                return component4;
            }
            component2 = component3;
        }
        Rectangle rectangle = component2.getBounds();
        return FN.L(component3, n10 - rectangle.x, n11 - rectangle.y);
    }

    public static void g(Frame frame, Frame frame2) {
        frame.addWindowListener(new HL(frame2, frame));
        frame2.addWindowListener(new K8(frame, frame2));
        frame.setVisible(true);
        try {
            new y2_0(frame).z();
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static ButtonGroup n(Container container) {
        return FN.G(container, false);
    }

    public static ButtonGroup G(Container container, boolean bl) {
        ButtonGroup buttonGroup = new ButtonGroup();
        FN.F(container, bl, buttonGroup);
        return buttonGroup;
    }

    public static void F(Container container, boolean bl, ButtonGroup buttonGroup) {
        Component[] componentArray = container.getComponents();
        int n10 = componentArray.length;
        String string = FV.D();
        for (int i2 = 0; i2 < n10; ++i2) {
            boolean bl2;
            block13: {
                Component component;
                block11: {
                    block12: {
                        component = componentArray[i2];
                        try {
                            try {
                                bl2 = component instanceof AbstractButton;
                                if (string != null) break block11;
                                if (!bl2) break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            buttonGroup.add((AbstractButton)component);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    bl2 = bl;
                }
                try {
                    try {
                        if (string != null) break block13;
                        if (!bl2) continue;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    bl2 = component instanceof Container;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            try {
                if (!bl2) continue;
                FN.G(container, true);
                continue;
            }
            catch (RuntimeException runtimeException) {
                throw FN.a(runtimeException);
            }
        }
    }

    public static ButtonGroup n(AbstractButton[] abstractButtonArray) {
        ButtonGroup buttonGroup = new ButtonGroup();
        FN.O(buttonGroup, abstractButtonArray);
        return buttonGroup;
    }

    public static void O(ButtonGroup buttonGroup, AbstractButton[] abstractButtonArray) {
        AbstractButton[] abstractButtonArray2 = abstractButtonArray;
        int n10 = abstractButtonArray2.length;
        String string = FV.D();
        for (int i2 = 0; i2 < n10; ++i2) {
            AbstractButton abstractButton = abstractButtonArray2[i2];
            buttonGroup.add(abstractButton);
            if (string == null) continue;
        }
    }

    public static void y(Component component, Component component2) {
        ComponentOrientation componentOrientation = component.getComponentOrientation();
        try {
            if (componentOrientation.isLeftToRight() != component2.getComponentOrientation().isLeftToRight()) {
                component2.applyComponentOrientation(componentOrientation);
            }
        }
        catch (RuntimeException runtimeException) {
            throw FN.a(runtimeException);
        }
    }

    public static void D() {
        FN.T(a9.t());
    }

    public static void T(ComponentOrientation componentOrientation) {
        Window[] windowArray = Window.getWindows();
        int n10 = windowArray.length;
        String string = FV.D();
        for (int i2 = 0; i2 < n10; ++i2) {
            Window window;
            block7: {
                window = windowArray[i2];
                window.applyComponentOrientation(componentOrientation);
                JRootPane jRootPane = FN.a(window);
                try {
                    block8: {
                        try {
                            try {
                                if (string != null) break block7;
                                if (jRootPane == null) break block8;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            jRootPane.revalidate();
                            jRootPane.repaint();
                            if (string == null) continue;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    window.invalidate();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            window.repaint();
            if (string == null) continue;
        }
    }

    public static void Y(Component component) {
        FN.U(component, false);
    }

    /*
     * Unable to fully structure code
     */
    public static void U(Component var0, boolean var1_1) {
        block9: {
            block8: {
                var3_2 = a9.t();
                var2_3 = FV.D();
                try {
                    try {
                        v0 = var1_1;
                        if (var2_3 != null) break block8;
                        if (!v0) {
                        }
                        ** GOTO lbl19
                    }
                    catch (RuntimeException v1) {
                        throw FN.a(v1);
                    }
                    v0 = var3_2.isLeftToRight();
                }
                catch (RuntimeException v2) {
                    throw FN.a(v2);
                }
            }
            try {
                if (v0 == var0.getComponentOrientation().isLeftToRight()) break block9;
lbl19:
                // 2 sources

                var0.setComponentOrientation(var3_2);
            }
            catch (RuntimeException v3) {
                throw FN.a(v3);
            }
        }
    }

    public static void M(Component component) {
        FN.Q(component, false);
    }

    /*
     * Unable to fully structure code
     */
    public static void Q(Component var0, boolean var1_1) {
        block9: {
            block8: {
                var3_2 = a9.t();
                var2_3 = FV.D();
                try {
                    try {
                        v0 = var1_1;
                        if (var2_3 != null) break block8;
                        if (!v0) {
                        }
                        ** GOTO lbl19
                    }
                    catch (RuntimeException v1) {
                        throw FN.a(v1);
                    }
                    v0 = var3_2.isLeftToRight();
                }
                catch (RuntimeException v2) {
                    throw FN.a(v2);
                }
            }
            try {
                if (v0 == var0.getComponentOrientation().isLeftToRight()) break block9;
lbl19:
                // 2 sources

                var0.applyComponentOrientation(var3_2);
            }
            catch (RuntimeException v3) {
                throw FN.a(v3);
            }
        }
    }

    public static int f(Component[] componentArray) {
        int n10;
        block2: {
            int n11 = 0;
            Component[] componentArray2 = componentArray;
            String string = FV.D();
            for (Component component : componentArray2) {
                n10 = Math.max(n11, component.getPreferredSize().width);
                if (string == null) {
                    n11 = n10;
                    if (string == null) continue;
                }
                break block2;
            }
            n10 = n11;
        }
        return n10;
    }

    public static int T(Component[] componentArray) {
        int n10;
        block2: {
            int n11 = 0;
            String string = FV.D();
            for (Component component : componentArray) {
                n10 = Math.max(n11, component.getPreferredSize().height);
                if (string == null) {
                    n11 = n10;
                    if (string == null) continue;
                }
                break block2;
            }
            n10 = n11;
        }
        return n10;
    }

    public static boolean u(Window window) {
        boolean bl;
        block12: {
            block11: {
                String string;
                String string2;
                block10: {
                    Window window2;
                    block8: {
                        block9: {
                            string2 = FV.D();
                            try {
                                try {
                                    window2 = window;
                                    if (string2 != null) break block8;
                                    if (window2 != null) break block9;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                return false;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        window2 = window;
                    }
                    String string3 = window2.getClass().getCanonicalName();
                    try {
                        string = string3;
                        if (string2 != null) break block10;
                        if (string == null) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    string = string3;
                }
                try {
                    bl = string.endsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 43446 out of bounds for length 35");
                    if (string2 != null) break block12;
                    if (!bl) break block11;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }

    public static Container B(Component component, Class clazz) {
        Container container;
        block5: {
            Container container2 = component.getParent();
            String string = FV.D();
            while (!clazz.isInstance(container2)) {
                try {
                    try {
                        container = container2;
                        if (string != null || string != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    if (container == null) break;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                container2 = container2.getParent();
                if (string == null) continue;
            }
            container = container2;
        }
        return container;
    }

    public static Component C(Container container, Class clazz) {
        return FN.q(container, clazz, false);
    }

    public static Component q(Container container, Class clazz, boolean bl) {
        int n10 = 0;
        String string = FV.D();
        while (n10 < container.getComponentCount()) {
            block22: {
                block20: {
                    Component component;
                    block21: {
                        boolean bl2;
                        Component component2;
                        block19: {
                            block17: {
                                block18: {
                                    component2 = container.getComponent(n10);
                                    try {
                                        try {
                                            bl2 = clazz.isInstance(component2);
                                            if (string != null) break block17;
                                            if (!bl2) break block18;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        return component2;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                }
                                bl2 = bl;
                            }
                            try {
                                try {
                                    try {
                                        if (string != null) break block19;
                                        if (!bl2) break block20;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    component = component2;
                                    if (string != null) break block21;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                bl2 = component instanceof Container;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        try {
                            if (!bl2) break block20;
                            component = FN.q((Container)component2, clazz, bl);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    Component component3 = component;
                    try {
                        try {
                            if (string != null) break block22;
                            if (component3 == null) break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        return component3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                ++n10;
            }
            if (string == null) continue;
        }
        return null;
    }

    public static JComponent V(Component component) {
        JComponent jComponent;
        block8: {
            Container container;
            block6: {
                Container container2;
                block7: {
                    container2 = component.getParent();
                    String string = FV.D();
                    try {
                        container = container2;
                        if (string != null) break block6;
                        if (!(container instanceof JComponent)) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    JComponent jComponent2 = (JComponent)container2;
                    try {
                        try {
                            jComponent = jComponent2;
                            if (string != null) break block8;
                            if (jComponent.getTransferHandler() == null) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        return jComponent2;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                container = container2;
            }
            jComponent = FN.V(container);
        }
        return jComponent;
    }

    public static JRootPane a(Component component) {
        Component component2;
        block35: {
            boolean bl;
            block33: {
                String string;
                block34: {
                    block31: {
                        block32: {
                            block29: {
                                block30: {
                                    block27: {
                                        block28: {
                                            Component component3;
                                            block25: {
                                                block26: {
                                                    string = FV.D();
                                                    try {
                                                        try {
                                                            component3 = component;
                                                            if (string != null) break block25;
                                                            if (component3 != null) break block26;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw FN.a(runtimeException);
                                                        }
                                                        return null;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw FN.a(runtimeException);
                                                    }
                                                }
                                                component3 = component;
                                            }
                                            try {
                                                try {
                                                    bl = component3 instanceof JFrame;
                                                    if (string != null) break block27;
                                                    if (!bl) break block28;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw FN.a(runtimeException);
                                                }
                                                return ((JFrame)component).getRootPane();
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                        }
                                        bl = component instanceof JDialog;
                                    }
                                    try {
                                        try {
                                            if (string != null) break block29;
                                            if (!bl) break block30;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        return ((JDialog)component).getRootPane();
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                }
                                bl = component instanceof JWindow;
                            }
                            try {
                                try {
                                    if (string != null) break block31;
                                    if (!bl) break block32;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                return ((JWindow)component).getRootPane();
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        bl = component instanceof JApplet;
                    }
                    try {
                        try {
                            if (string != null) break block33;
                            if (!bl) break block34;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        return ((JApplet)component).getRootPane();
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                try {
                    component2 = component;
                    if (string != null) break block35;
                    bl = component2 instanceof JRootPane;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            try {
                if (bl) {
                    return (JRootPane)component;
                }
            }
            catch (RuntimeException runtimeException) {
                throw FN.a(runtimeException);
            }
            component2 = component;
        }
        return FN.a(component2.getParent());
    }

    public static Window N() {
        block42: {
            Window[] windowArray;
            String string;
            block43: {
                Window[] windowArray2;
                block41: {
                    block38: {
                        Window window;
                        block39: {
                            Window window2;
                            block37: {
                                window2 = FN.q();
                                string = FV.D();
                                try {
                                    window = window2;
                                    if (string != null) break block37;
                                    if (window == null) break block38;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                window = window2;
                            }
                            try {
                                block40: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (string != null) break block39;
                                                        if (window instanceof JFrame) break block40;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw FN.a(runtimeException);
                                                    }
                                                    window = window2;
                                                    if (string != null) break block39;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw FN.a(runtimeException);
                                                }
                                                if (window instanceof JDialog) break block40;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            window = window2;
                                            if (string != null) break block39;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (!(window instanceof JWindow)) break block38;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                }
                                window = window2;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        return window;
                    }
                    windowArray2 = Window.getWindows();
                    try {
                        windowArray = windowArray2;
                        if (string != null) break block41;
                        if (windowArray == null) break block42;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    windowArray = windowArray2;
                }
                try {
                    try {
                        if (string != null) break block43;
                        if (windowArray.length <= 0) break block42;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    windowArray = windowArray2;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            Window[] windowArray3 = windowArray;
            int n10 = windowArray3.length;
            int n11 = 0;
            while (n11 < n10) {
                block44: {
                    block45: {
                        Window window;
                        block46: {
                            Window window3 = windowArray3[n11];
                            try {
                                block47: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (string != null) break block44;
                                                                if (!window3.isShowing()) break block45;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw FN.a(runtimeException);
                                                            }
                                                            window = window3;
                                                            if (string != null) break block46;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw FN.a(runtimeException);
                                                        }
                                                        if (window instanceof JFrame) break block47;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw FN.a(runtimeException);
                                                    }
                                                    window = window3;
                                                    if (string != null) break block46;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw FN.a(runtimeException);
                                                }
                                                if (window instanceof JDialog) break block47;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            window = window3;
                                            if (string != null) break block46;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (!(window instanceof JWindow)) break block45;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                }
                                window = window3;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        return window;
                    }
                    ++n11;
                }
                if (string == null) continue;
            }
        }
        return null;
    }

    public static Container r(Component component) {
        Container container;
        block4: {
            block5: {
                JRootPane jRootPane = FN.a(component);
                String string = FV.D();
                try {
                    try {
                        container = jRootPane;
                        if (string != null) break block4;
                        if (container == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    container = jRootPane.getContentPane();
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            container = null;
        }
        return container;
    }

    public static JLayeredPane b(Component component) {
        JLayeredPane jLayeredPane;
        block4: {
            block3: {
                JRootPane jRootPane;
                block2: {
                    JRootPane jRootPane2 = FN.a(component);
                    String string = FV.D();
                    try {
                        jRootPane = jRootPane2;
                        if (string != null) break block2;
                        if (jRootPane == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    jRootPane = jRootPane2;
                }
                jLayeredPane = jRootPane.getLayeredPane();
                break block4;
            }
            jLayeredPane = null;
        }
        return jLayeredPane;
    }

    public static Component w(Component component) {
        Component component2;
        block4: {
            block5: {
                JRootPane jRootPane = FN.a(component);
                String string = FV.D();
                try {
                    try {
                        component2 = jRootPane;
                        if (string != null) break block4;
                        if (component2 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component2 = jRootPane.getGlassPane();
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component2 = null;
        }
        return component2;
    }

    public static JComponent A(JComponent jComponent, int n10) {
        return FN.t(jComponent, GA.V(n10));
    }

    public static JComponent g(JComponent jComponent, int n10, int n11, int n12, int n13) {
        return FN.t(jComponent, GA.C(n10, n11, n12, n13));
    }

    public static JComponent t(JComponent jComponent, Border border) {
        jComponent.setBorder(border);
        return jComponent;
    }

    public static boolean k(Component component) {
        boolean bl;
        block11: {
            block12: {
                block9: {
                    Font font;
                    String string;
                    block10: {
                        Component component2;
                        block8: {
                            string = FV.D();
                            try {
                                component2 = component;
                                if (string != null) break block8;
                                if (component2 == null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component2 = component;
                        }
                        try {
                            try {
                                font = component2.getFont();
                                if (string != null) break block10;
                                if (font == null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            font = component.getFont();
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        bl = font.isPlain();
                        if (string != null) break block11;
                        if (!bl) break block12;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                bl = true;
                break block11;
            }
            bl = false;
        }
        return bl;
    }

    public static Component A(Component component) {
        return FN.O(component, true);
    }

    public static Component O(Component component, boolean bl) {
        Component component2;
        block11: {
            block10: {
                String string = FV.D();
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!bl) break block10;
                                    component2 = component;
                                    if (string != null) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                if (component2 == null) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component2 = component;
                            if (string != null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (component2.getFont() == null) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component.setFont(component.getFont().deriveFont(0));
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component2 = component;
        }
        return component2;
    }

    public static boolean U(Component component) {
        boolean bl;
        block11: {
            block9: {
                Font font;
                String string;
                block10: {
                    Component component2;
                    block8: {
                        string = FV.D();
                        try {
                            component2 = component;
                            if (string != null) break block8;
                            if (component2 == null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        component2 = component;
                    }
                    try {
                        try {
                            font = component2.getFont();
                            if (string != null) break block10;
                            if (font == null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        font = component.getFont();
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                try {
                    bl = font.isBold();
                    if (string != null) break block11;
                    if (!bl) break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block11;
            }
            bl = false;
        }
        return bl;
    }

    public static Component u(Component component) {
        return FN.D(component, true);
    }

    public static Component D(Component component, boolean bl) {
        Component component2;
        block11: {
            block10: {
                String string = FV.D();
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!bl) break block10;
                                    component2 = component;
                                    if (string != null) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                if (component2 == null) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component2 = component;
                            if (string != null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (component2.getFont() == null) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component.setFont(component.getFont().deriveFont(1));
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component2 = component;
        }
        return component2;
    }

    public static boolean G(Component component) {
        boolean bl;
        block11: {
            block9: {
                Font font;
                String string;
                block10: {
                    Component component2;
                    block8: {
                        string = FV.D();
                        try {
                            component2 = component;
                            if (string != null) break block8;
                            if (component2 == null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        component2 = component;
                    }
                    try {
                        try {
                            font = component2.getFont();
                            if (string != null) break block10;
                            if (font == null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        font = component.getFont();
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                try {
                    bl = font.isItalic();
                    if (string != null) break block11;
                    if (!bl) break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block11;
            }
            bl = false;
        }
        return bl;
    }

    public static Component C(Component component) {
        return FN.q(component, true);
    }

    public static Component q(Component component, boolean bl) {
        Component component2;
        block11: {
            block10: {
                String string = FV.D();
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!bl) break block10;
                                    component2 = component;
                                    if (string != null) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                if (component2 == null) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component2 = component;
                            if (string != null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (component2.getFont() == null) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component.setFont(component.getFont().deriveFont(2));
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component2 = component;
        }
        return component2;
    }

    public static Component O(Component component, int n10) {
        Component component2;
        block8: {
            block9: {
                String string = FV.D();
                try {
                    try {
                        try {
                            try {
                                component2 = component;
                                if (string != null) break block8;
                                if (component2 == null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component2 = component;
                            if (string != null) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (component2.getFont() == null) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component.setFont(component.getFont().deriveFont((float)n10));
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component2 = component;
        }
        return component2;
    }

    public static Component K(Component component, int n10) {
        Component component2;
        block6: {
            block7: {
                String string = FV.D();
                try {
                    try {
                        try {
                            component2 = component;
                            if (string != null) break block6;
                            if (component2 == null) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        component2 = component;
                        if (string != null) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    if (component2.getFont() == null) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                Font font = component.getFont();
                component.setFont(font.deriveFont((float)font.getSize() + (float)n10));
            }
            component2 = component;
        }
        return component2;
    }

    public static int r(Component component) {
        block7: {
            Font font;
            block8: {
                Component component2;
                String string;
                block6: {
                    string = FV.D();
                    try {
                        component2 = component;
                        if (string != null) break block6;
                        if (component2 == null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component2 = component;
                }
                try {
                    try {
                        font = component2.getFont();
                        if (string != null) break block8;
                        if (font == null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    font = component.getFont();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            return font.getSize();
        }
        return -1;
    }

    public static Component K(Component component, boolean n10, boolean bl) {
        int n11;
        block16: {
            block19: {
                String string;
                block17: {
                    block18: {
                        block14: {
                            block15: {
                                string = FV.D();
                                try {
                                    try {
                                        try {
                                            try {
                                                n11 = n10;
                                                if (string != null) break block14;
                                                if (n11 == 0) break block15;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            n11 = bl ? 1 : 0;
                                            if (string != null) break block14;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (n11 == 0) break block15;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    n11 = 3;
                                    break block16;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            n11 = n10;
                        }
                        try {
                            try {
                                if (string != null) break block17;
                                if (n11 == 0) break block18;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            n11 = 1;
                            break block16;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    n11 = bl ? 1 : 0;
                }
                try {
                    if (string != null) break block16;
                    if (n11 == 0) break block19;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                n11 = 2;
                break block16;
            }
            n11 = 0;
        }
        int n12 = n11;
        return FN.p(component, n12);
    }

    public static Component p(Component component, int n10) {
        Component component2;
        block8: {
            block9: {
                String string = FV.D();
                try {
                    try {
                        try {
                            try {
                                component2 = component;
                                if (string != null) break block8;
                                if (component2 == null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component2 = component;
                            if (string != null) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (component2.getFont() == null) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component.setFont(component.getFont().deriveFont(n10));
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component2 = component;
        }
        return component2;
    }

    public static Component d(Component component, int n10, boolean n11, boolean bl) {
        int n12;
        block16: {
            block19: {
                String string;
                block17: {
                    block18: {
                        block14: {
                            block15: {
                                string = FV.D();
                                try {
                                    try {
                                        try {
                                            try {
                                                n12 = n11;
                                                if (string != null) break block14;
                                                if (n12 == 0) break block15;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            n12 = bl ? 1 : 0;
                                            if (string != null) break block14;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (n12 == 0) break block15;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    n12 = 3;
                                    break block16;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            n12 = n11;
                        }
                        try {
                            try {
                                if (string != null) break block17;
                                if (n12 == 0) break block18;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            n12 = 1;
                            break block16;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    n12 = bl ? 1 : 0;
                }
                try {
                    if (string != null) break block16;
                    if (n12 == 0) break block19;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                n12 = 2;
                break block16;
            }
            n12 = 0;
        }
        int n13 = n12;
        return FN.m(component, n10, n13);
    }

    public static Component m(Component component, int n10, int n11) {
        Component component2;
        block8: {
            block9: {
                String string = FV.D();
                try {
                    try {
                        try {
                            try {
                                component2 = component;
                                if (string != null) break block8;
                                if (component2 == null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component2 = component;
                            if (string != null) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (component2.getFont() == null) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component.setFont(component.getFont().deriveFont(n11, n10));
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component2 = component;
        }
        return component2;
    }

    public static Component s(Component component, String string) {
        Component component2;
        block6: {
            block7: {
                String string2 = FV.D();
                try {
                    try {
                        try {
                            component2 = component;
                            if (string2 != null) break block6;
                            if (component2 == null) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        component2 = component;
                        if (string2 != null) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    if (component2.getFont() == null) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                Font font = component.getFont();
                component.setFont(new Font(string, font.getStyle(), font.getSize()));
            }
            component2 = component;
        }
        return component2;
    }

    public static String b(Component component) {
        block7: {
            Font font;
            block8: {
                Component component2;
                String string;
                block6: {
                    string = FV.D();
                    try {
                        component2 = component;
                        if (string != null) break block6;
                        if (component2 == null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    component2 = component;
                }
                try {
                    try {
                        font = component2.getFont();
                        if (string != null) break block8;
                        if (font == null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    font = component.getFont();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            return font.getFontName();
        }
        return null;
    }

    public static Dimension R(Dimension dimension) {
        return new Dimension(dimension);
    }

    public static Point B(Point point) {
        return new Point(point);
    }

    public static Rectangle l(Rectangle rectangle) {
        return new Rectangle(rectangle);
    }

    public static Insets K(Insets insets) {
        return new Insets(insets.top, insets.left, insets.bottom, insets.right);
    }

    public static Color q(Color color) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static Rectangle N(Component component) {
        return new Rectangle(0, 0, component.getWidth(), component.getHeight());
    }

    public static Rectangle I(Component component) {
        Component component2;
        block2: {
            block3: {
                String string = FV.D();
                try {
                    component2 = component;
                    if (string != null) break block2;
                    if (!(component2 instanceof JComponent)) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                Insets insets = ((JComponent)component).getInsets();
                return new Rectangle(insets.left, insets.top, component.getWidth() - insets.left - insets.right, component.getHeight() - insets.top - insets.bottom);
            }
            component2 = component;
        }
        return FN.N(component2);
    }

    public static Insets Z(Insets insets, Insets insets2) {
        block19: {
            Insets insets3;
            block18: {
                String string;
                block16: {
                    block17: {
                        block14: {
                            block15: {
                                string = FV.D();
                                try {
                                    try {
                                        try {
                                            try {
                                                insets3 = insets;
                                                if (string != null) break block14;
                                                if (insets3 == null) break block15;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            insets3 = insets2;
                                            if (string != null) break block14;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (insets3 == null) break block15;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    return new Insets(Math.max(insets.top, insets2.top), Math.max(insets.left, insets2.left), Math.max(insets.bottom, insets2.bottom), Math.max(insets.right, insets2.right));
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            insets3 = insets;
                        }
                        try {
                            try {
                                if (string != null) break block16;
                                if (insets3 == null) break block17;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            return insets;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    insets3 = insets2;
                }
                try {
                    if (string != null) break block18;
                    if (insets3 == null) break block19;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                insets3 = insets2;
            }
            return insets3;
        }
        return null;
    }

    public static Insets Y(Insets insets, Insets insets2) {
        block19: {
            Insets insets3;
            block18: {
                String string;
                block16: {
                    block17: {
                        block14: {
                            block15: {
                                string = FV.D();
                                try {
                                    try {
                                        try {
                                            try {
                                                insets3 = insets;
                                                if (string != null) break block14;
                                                if (insets3 == null) break block15;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            insets3 = insets2;
                                            if (string != null) break block14;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (insets3 == null) break block15;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    return new Insets(Math.min(insets.top, insets2.top), Math.min(insets.left, insets2.left), Math.min(insets.bottom, insets2.bottom), Math.min(insets.right, insets2.right));
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            insets3 = insets;
                        }
                        try {
                            try {
                                if (string != null) break block16;
                                if (insets3 == null) break block17;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            return insets;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    insets3 = insets2;
                }
                try {
                    if (string != null) break block18;
                    if (insets3 == null) break block19;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                insets3 = insets2;
            }
            return insets3;
        }
        return null;
    }

    public static Dimension V(Component component, Component component2) {
        return FN.h(component.getPreferredSize(), component2.getPreferredSize());
    }

    public static Dimension P(Component[] componentArray) {
        Dimension dimension;
        block8: {
            Dimension dimension2;
            String string;
            block9: {
                block7: {
                    Component[] componentArray2;
                    block6: {
                        string = FV.D();
                        try {
                            try {
                                componentArray2 = componentArray;
                                if (string != null) break block6;
                                if (componentArray2.length <= 0) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            componentArray2 = componentArray;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    dimension2 = componentArray2[0].getPreferredSize();
                    break block9;
                }
                dimension2 = new Dimension(0, 0);
            }
            Dimension dimension3 = dimension2;
            for (int i2 = 1; i2 < componentArray.length; ++i2) {
                dimension = FN.h(dimension3, componentArray[i2].getPreferredSize());
                if (string == null) {
                    dimension3 = dimension;
                    if (string == null) continue;
                }
                break block8;
            }
            dimension = dimension3;
        }
        return dimension;
    }

    public static Dimension h(Dimension dimension, Dimension dimension2) {
        Dimension dimension3;
        block20: {
            block21: {
                String string;
                block18: {
                    block19: {
                        block16: {
                            block17: {
                                string = FV.D();
                                try {
                                    try {
                                        try {
                                            try {
                                                dimension3 = dimension;
                                                if (string != null) break block16;
                                                if (dimension3 != null) break block17;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            dimension3 = dimension2;
                                            if (string != null) break block16;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (dimension3 != null) break block17;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    return null;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            dimension3 = dimension;
                        }
                        try {
                            try {
                                if (string != null) break block18;
                                if (dimension3 != null) break block19;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            return dimension2;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    dimension3 = dimension2;
                }
                try {
                    try {
                        if (string != null) break block20;
                        if (dimension3 != null) break block21;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    return dimension;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            dimension3 = new Dimension(Math.max(dimension.width, dimension2.width), Math.max(dimension.height, dimension2.height));
        }
        return dimension3;
    }

    public static Dimension R(Component component, Component component2) {
        return FN.p(component.getPreferredSize(), component2.getPreferredSize());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Dimension p(Dimension dimension, Dimension dimension2) {
        Dimension dimension3;
        block7: {
            String string;
            block6: {
                string = FV.D();
                try {
                    dimension3 = dimension;
                    if (string != null) break block6;
                    if (dimension3 == null) return null;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                dimension3 = dimension2;
            }
            try {
                try {
                    if (string != null) return dimension3;
                    if (dimension3 != null) break block7;
                    return null;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            catch (RuntimeException runtimeException) {
                throw FN.a(runtimeException);
            }
        }
        dimension3 = new Dimension(Math.min(dimension.width, dimension2.width), Math.min(dimension.height, dimension2.height));
        return dimension3;
    }

    public static void F(Component component, boolean bl) {
        FN.s(component, bl, false);
    }

    public static void s(Component component, boolean bl, boolean bl2) {
        block14: {
            Component component2;
            String string;
            block13: {
                boolean bl3;
                block11: {
                    block12: {
                        string = FV.D();
                        try {
                            bl3 = component instanceof JComponent;
                            if (string != null) break block11;
                            if (!bl3) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        Component[] componentArray = (Component[])component;
                        try {
                            try {
                                bl3 = bl2;
                                if (string != null) break block11;
                                if (bl3) break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            componentArray.setOpaque(bl);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        component2 = component;
                        if (string != null) break block13;
                        bl3 = component2 instanceof Container;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                if (!bl3) break block14;
                component2 = component;
            }
            for (Component component3 : ((Container)component2).getComponents()) {
                FN.s(component3, bl, false);
                if (string == null) continue;
            }
        }
    }

    public static void S(Component component, boolean bl) {
        FN.X(component, bl, false);
    }

    public static void X(Component component, boolean bl, boolean bl2) {
        block14: {
            Component component2;
            String string;
            block13: {
                boolean bl3;
                block11: {
                    block12: {
                        string = FV.D();
                        try {
                            bl3 = component instanceof JComponent;
                            if (string != null) break block11;
                            if (!bl3) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        Component[] componentArray = (Component[])component;
                        try {
                            try {
                                bl3 = bl2;
                                if (string != null) break block11;
                                if (bl3) break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            componentArray.setDoubleBuffered(bl);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        component2 = component;
                        if (string != null) break block13;
                        bl3 = component2 instanceof Container;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                if (!bl3) break block14;
                component2 = component;
            }
            for (Component component3 : ((Container)component2).getComponents()) {
                FN.X(component3, bl, false);
                if (string == null) continue;
            }
        }
    }

    public static void g(JComponent jComponent) {
        jComponent.putClientProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 43444 out of bounds for length 35", Boolean.TRUE);
    }

    public static void I(JComponent jComponent) {
        jComponent.putClientProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 43442 out of bounds for length 35", Boolean.FALSE);
    }

    public static boolean z(Component component) {
        boolean bl;
        block12: {
            block13: {
                Object object;
                Object object2;
                String string;
                block14: {
                    string = FV.D();
                    try {
                        bl = component instanceof JComponent;
                        if (string != null) break block12;
                        if (!bl) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    object2 = ((JComponent)component).getClientProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 43442 out of bounds for length 35");
                    try {
                        object = object2;
                        if (string != null) break block14;
                        if (object == null) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    object = object2;
                }
                try {
                    try {
                        try {
                            try {
                                bl = object instanceof Boolean;
                                if (string != null) break block12;
                                if (!bl) break block13;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl = (Boolean)object2;
                            if (string != null) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (!bl) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static void o(Component component, boolean bl) {
        FN.o(component, bl, false);
    }

    public static void o(Component component, boolean bl, boolean bl2) {
        block20: {
            Component component2;
            String string;
            block23: {
                block22: {
                    boolean bl3;
                    block21: {
                        block19: {
                            block17: {
                                block18: {
                                    string = FV.D();
                                    try {
                                        if (component == null) {
                                            return;
                                        }
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    try {
                                        try {
                                            bl3 = bl2;
                                            if (string != null) break block17;
                                            if (bl3) break block18;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        component.setEnabled(bl);
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                }
                                bl3 = component instanceof Container;
                            }
                            try {
                                if (string != null) break block19;
                                if (!bl3) break block20;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl3 = bl2;
                        }
                        try {
                            try {
                                try {
                                    if (string != null) break block21;
                                    if (bl3) break block22;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                component2 = component;
                                if (string != null) break block23;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl3 = FN.z(component2);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    if (bl3) {
                        return;
                    }
                }
                component2 = component;
            }
            for (Component component3 : ((Container)component2).getComponents()) {
                FN.o(component3, bl, false);
                if (string == null) continue;
            }
        }
    }

    public static List Y(Component component, boolean bl, boolean bl2, Component[] componentArray) {
        return FN.r(component, bl, bl2, Arrays.asList(componentArray));
    }

    public static List r(Component component, boolean bl, boolean bl2, List list) {
        ArrayList arrayList = new ArrayList();
        FN.f(component, bl, bl2, list, arrayList);
        return arrayList;
    }

    private static void f(Component component, boolean bl, boolean bl2, List list, List list2) {
        block40: {
            Component component2;
            String string;
            block43: {
                block42: {
                    boolean bl3;
                    block41: {
                        block39: {
                            boolean bl4;
                            block37: {
                                block38: {
                                    boolean bl5;
                                    block35: {
                                        block33: {
                                            block36: {
                                                block34: {
                                                    block32: {
                                                        string = FV.D();
                                                        try {
                                                            try {
                                                                bl5 = bl;
                                                                if (string != null) break block32;
                                                                if (bl5) break block33;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw FN.a(runtimeException);
                                                            }
                                                            bl5 = list.contains(component);
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw FN.a(runtimeException);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (string != null) break block34;
                                                            if (bl5) break block33;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw FN.a(runtimeException);
                                                        }
                                                        bl5 = component instanceof JPanel;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw FN.a(runtimeException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (string != null) break block35;
                                                            if (!bl5) break block36;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw FN.a(runtimeException);
                                                        }
                                                        bl5 = bl2;
                                                        if (string != null) break block35;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw FN.a(runtimeException);
                                                    }
                                                    if (bl5) break block33;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw FN.a(runtimeException);
                                                }
                                            }
                                            bl5 = true;
                                            break block35;
                                        }
                                        bl5 = false;
                                    }
                                    bl4 = bl5;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    bl3 = bl4;
                                                    if (string != null) break block37;
                                                    if (!bl3) break block38;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw FN.a(runtimeException);
                                                }
                                                bl3 = component.isEnabled();
                                                if (string != null) break block37;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            if (!bl3) break block38;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        component.setEnabled(false);
                                        list2.add(component);
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                }
                                bl3 = component instanceof Container;
                            }
                            try {
                                if (string != null) break block39;
                                if (!bl3) break block40;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl3 = bl4;
                        }
                        try {
                            try {
                                try {
                                    if (string != null) break block41;
                                    if (!bl3) break block42;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                component2 = component;
                                if (string != null) break block43;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl3 = FN.z(component2);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    if (bl3) {
                        return;
                    }
                }
                component2 = component;
            }
            Container container = (Container)component2;
            for (Component component3 : container.getComponents()) {
                FN.f(component3, false, bl2, list, list2);
                if (string == null) continue;
            }
        }
    }

    public static void Q(List list) {
        Iterator iterator = list.iterator();
        String string = FV.D();
        while (iterator.hasNext()) {
            Component component = (Component)iterator.next();
            component.setEnabled(true);
            if (string == null) continue;
        }
    }

    public static void a(JComponent jComponent, boolean bl) {
        FN.w(jComponent, bl, false);
    }

    public static void w(JComponent jComponent, boolean bl, boolean n10) {
        int n11;
        String string;
        block9: {
            int n12;
            block10: {
                string = FV.D();
                try {
                    try {
                        n12 = n10;
                        if (string != null) break block9;
                        if (n12 != 0) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    jComponent.setFocusable(bl);
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            n12 = n11 = 0;
        }
        while (n11 < jComponent.getComponentCount()) {
            block12: {
                Component component;
                block11: {
                    try {
                        try {
                            component = jComponent.getComponent(n11);
                            if (string != null) break block11;
                            if (!(component instanceof JComponent)) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        component = jComponent.getComponent(n11);
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                FN.w((JComponent)component, bl, false);
            }
            ++n11;
            if (string == null) continue;
        }
    }

    public static void P(Component component, Color color) {
        FN.l(component, color, false);
    }

    public static void l(Component component, Color color, boolean bl) {
        block12: {
            Component component2;
            String string;
            block11: {
                boolean bl2;
                block9: {
                    block10: {
                        string = FV.D();
                        try {
                            try {
                                bl2 = bl;
                                if (string != null) break block9;
                                if (bl2) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component.setBackground(color);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        component2 = component;
                        if (string != null) break block11;
                        bl2 = component2 instanceof Container;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                if (!bl2) break block12;
                component2 = component;
            }
            for (Component component3 : ((Container)component2).getComponents()) {
                FN.l(component3, color, false);
                if (string == null) continue;
            }
        }
    }

    public static void v(JComponent jComponent, Color color) {
        FN.z(jComponent, color, false);
    }

    public static void z(JComponent jComponent, Color color, boolean n10) {
        int n11;
        String string;
        block9: {
            int n12;
            block10: {
                string = FV.D();
                try {
                    try {
                        n12 = n10;
                        if (string != null) break block9;
                        if (n12 != 0) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    jComponent.setForeground(color);
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            n12 = n11 = 0;
        }
        while (n11 < jComponent.getComponentCount()) {
            block12: {
                Component component;
                block11: {
                    try {
                        try {
                            component = jComponent.getComponent(n11);
                            if (string != null) break block11;
                            if (!(component instanceof JComponent)) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        component = jComponent.getComponent(n11);
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                FN.z((JComponent)component, color, false);
            }
            ++n11;
            if (string == null) continue;
        }
    }

    public static void j(JComponent jComponent, Font font) {
        FN.M(jComponent, font, false);
    }

    public static void M(JComponent jComponent, Font font, boolean n10) {
        int n11;
        String string;
        block9: {
            int n12;
            block10: {
                string = FV.D();
                try {
                    try {
                        n12 = n10;
                        if (string != null) break block9;
                        if (n12 != 0) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    jComponent.setFont(font);
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            n12 = n11 = 0;
        }
        while (n11 < jComponent.getComponentCount()) {
            block12: {
                Component component;
                block11: {
                    try {
                        try {
                            component = jComponent.getComponent(n11);
                            if (string != null) break block11;
                            if (!(component instanceof JComponent)) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        component = jComponent.getComponent(n11);
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                FN.M((JComponent)component, font, false);
            }
            ++n11;
            if (string == null) continue;
        }
    }

    public static BufferedImage J(Component component) {
        return FN.O(component, component.getWidth(), component.getHeight());
    }

    public static BufferedImage p(Component component, float f10) {
        return FN.s(component, component.getWidth(), component.getHeight(), f10);
    }

    public static BufferedImage O(Component component, int n10, int n11) {
        return FN.s(component, n10, n11, 1.0f);
    }

    public static BufferedImage s(Component component, int n10, int n11, float f10) {
        BufferedImage bufferedImage;
        block4: {
            float f11;
            Object object;
            block3: {
                bufferedImage = xg_0.g(n10, n11, 3);
                String string = FV.D();
                if (component != null) {
                    object = bufferedImage.createGraphics();
                    component.setSize(n10, n11);
                    component.paintAll((Graphics)object);
                    ((Graphics)object).dispose();
                }
                try {
                    float f12 = f10 - 1.0f;
                    f11 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (string != null) break block3;
                    if (f11 >= 0) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                f11 = n10;
            }
            object = xg_0.g((int)f11, n11, 3);
            Graphics2D graphics2D = ((BufferedImage)object).createGraphics();
            RV.p(graphics2D, Float.valueOf(f10));
            graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
            graphics2D.dispose();
            return object;
        }
        return bufferedImage;
    }

    public static void H(JMenuItem jMenuItem, cs_0 cs_02) {
        block13: {
            int n10;
            int n11;
            int n12;
            block19: {
                block20: {
                    int n13;
                    String string;
                    block17: {
                        block18: {
                            int n14;
                            block15: {
                                block16: {
                                    block14: {
                                        cs_0 cs_03;
                                        block12: {
                                            string = FV.D();
                                            try {
                                                cs_03 = cs_02;
                                                if (string != null) break block12;
                                                if (cs_03 == null) break block13;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            cs_03 = cs_02;
                                        }
                                        try {
                                            try {
                                                n14 = cs_03.g();
                                                if (string != null) break block14;
                                                if (n14 == 0) break block13;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw FN.a(runtimeException);
                                            }
                                            n14 = cs_02.I();
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                    }
                                    try {
                                        if (string != null) break block15;
                                        if (n14 == 0) break block16;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    n14 = FN.I();
                                    break block15;
                                }
                                n14 = 0;
                            }
                            n12 = n14;
                            try {
                                n13 = cs_02.p();
                                if (string != null) break block17;
                                if (n13 == 0) break block18;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            n13 = FN.a(10014, 8454854018315867132L);
                            break block17;
                        }
                        n13 = 0;
                    }
                    n11 = n13;
                    try {
                        n10 = cs_02.w();
                        if (string != null) break block19;
                        if (n10 == 0) break block20;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    n10 = 1;
                    break block19;
                }
                n10 = 0;
            }
            int n15 = n10;
            jMenuItem.setAccelerator(KeyStroke.getKeyStroke(cs_02.c(), n12 | n11 | n15));
        }
    }

    public static Window q() {
        Window[] windowArray = Window.getWindows();
        Window window = null;
        String string = FV.D();
        Window[] windowArray2 = windowArray;
        int n10 = windowArray2.length;
        int n11 = 0;
        while (n11 < n10) {
            block13: {
                Window window2;
                block15: {
                    boolean bl;
                    Window window3;
                    block14: {
                        window3 = windowArray2[n11];
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (string != null) continue;
                                            if (!window3.isShowing()) break block13;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        bl = window3.isActive();
                                        if (string != null) break block14;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    if (!bl) break block13;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                window2 = window3;
                                if (string != null) break block15;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl = window2.isFocused();
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    if (!bl) break block13;
                    window2 = window3;
                }
                window = window2;
                break;
            }
            ++n11;
        }
        return window;
    }

    public static boolean i(InputEvent inputEvent) {
        boolean bl;
        block2: {
            block3: {
                String string = FV.D();
                try {
                    bl = inputEvent.getModifiers() & FN.I();
                    if (string != null) break block2;
                    if (!bl) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public static int I() {
        Integer n10;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        n10 = m;
                        if (string != null) break block4;
                        if (n10 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    m = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            n10 = m;
        }
        return n10;
    }

    public static String k(KeyEvent keyEvent) {
        return FN.N(FN.m(keyEvent), FN.O(keyEvent), FN.y(keyEvent), keyEvent.getKeyCode());
    }

    public static String r(cs_0 cs_02) {
        return FN.N(cs_02.I(), cs_02.p(), cs_02.w(), cs_02.c());
    }

    public static String Y(KeyStroke keyStroke) {
        String string;
        try {
            string = (String)xK.w(keyStroke);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return string;
    }

    public static String N(boolean bl, boolean bl2, boolean bl3, Integer n10) {
        String string;
        StringBuilder stringBuilder;
        block34: {
            block30: {
                Integer n11;
                block29: {
                    String string2;
                    StringBuilder stringBuilder2;
                    String string3;
                    block33: {
                        block27: {
                            String string4;
                            StringBuilder stringBuilder3;
                            block28: {
                                String string5;
                                StringBuilder stringBuilder4;
                                block32: {
                                    block24: {
                                        String string6;
                                        StringBuilder stringBuilder5;
                                        block25: {
                                            block26: {
                                                String string7;
                                                StringBuilder stringBuilder6;
                                                block31: {
                                                    block20: {
                                                        String string8;
                                                        StringBuilder stringBuilder7;
                                                        block21: {
                                                            block23: {
                                                                string3 = FV.D();
                                                                try {
                                                                    stringBuilder6 = new StringBuilder().append("");
                                                                    if (!bl) break block20;
                                                                    stringBuilder7 = new StringBuilder();
                                                                    string8 = KeyEvent.getKeyModifiersText(FN.I());
                                                                    if (string3 != null) break block21;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw FN.a(runtimeException);
                                                                }
                                                                try {
                                                                    block22: {
                                                                        try {
                                                                            try {
                                                                                stringBuilder7 = stringBuilder7.append(string8);
                                                                                if (bl2 || bl3) break block22;
                                                                            }
                                                                            catch (RuntimeException runtimeException) {
                                                                                throw FN.a(runtimeException);
                                                                            }
                                                                            if (n10 == null) break block23;
                                                                        }
                                                                        catch (RuntimeException runtimeException) {
                                                                            throw FN.a(runtimeException);
                                                                        }
                                                                    }
                                                                    string8 = "+";
                                                                    break block21;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw FN.a(runtimeException);
                                                                }
                                                            }
                                                            string8 = "";
                                                        }
                                                        string7 = stringBuilder7.append(string8).toString();
                                                        break block31;
                                                    }
                                                    string7 = "";
                                                }
                                                try {
                                                    stringBuilder4 = stringBuilder6.append(string7);
                                                    if (!bl2) break block24;
                                                    stringBuilder5 = new StringBuilder();
                                                    string6 = KeyEvent.getKeyModifiersText(FN.a(10014, 8454854018315867132L));
                                                    if (string3 != null) break block25;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw FN.a(runtimeException);
                                                }
                                                try {
                                                    try {
                                                        stringBuilder5 = stringBuilder5.append(string6);
                                                        if (!bl3 && n10 == null) break block26;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw FN.a(runtimeException);
                                                    }
                                                    string6 = "+";
                                                    break block25;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw FN.a(runtimeException);
                                                }
                                            }
                                            string6 = "";
                                        }
                                        string5 = stringBuilder5.append(string6).toString();
                                        break block32;
                                    }
                                    string5 = "";
                                }
                                try {
                                    stringBuilder2 = stringBuilder4.append(string5);
                                    if (!bl3) break block27;
                                    stringBuilder3 = new StringBuilder();
                                    string4 = KeyEvent.getKeyModifiersText(1);
                                    if (string3 != null) break block28;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                try {
                                    stringBuilder3 = stringBuilder3.append(string4);
                                    string4 = n10 != null ? "+" : "";
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            string2 = stringBuilder3.append(string4).toString();
                            break block33;
                        }
                        string2 = "";
                    }
                    try {
                        stringBuilder = stringBuilder2.append(string2);
                        n11 = n10;
                        if (string3 != null) break block29;
                        if (n11 == null) break block30;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    n11 = n10;
                }
                string = KeyEvent.getKeyText(n11);
                break block34;
            }
            string = "";
        }
        return stringBuilder.append(string).toString();
    }

    public static boolean m(InputEvent inputEvent) {
        return FN.k(inputEvent.getModifiers());
    }

    public static boolean k(int n10) {
        boolean bl;
        block2: {
            block3: {
                String string = FV.D();
                try {
                    bl = n10 & 2;
                    if (string != null) break block2;
                    if (!bl) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean O(InputEvent inputEvent) {
        return FN.g(inputEvent.getModifiers());
    }

    public static boolean g(int n10) {
        boolean bl;
        block2: {
            block3: {
                String string = FV.D();
                try {
                    bl = n10 & FN.a(10014, 8454854018315867132L);
                    if (string != null) break block2;
                    if (!bl) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean y(InputEvent inputEvent) {
        return FN.J(inputEvent.getModifiers());
    }

    public static boolean J(int n10) {
        boolean bl;
        block2: {
            block3: {
                String string = FV.D();
                try {
                    bl = n10 & 1;
                    if (string != null) break block2;
                    if (!bl) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public static cs_0 h(KeyStroke keyStroke) {
        int n10 = keyStroke.getModifiers();
        return new cs_0(FN.k(n10), FN.g(n10), FN.J(n10), keyStroke.getKeyCode());
    }

    public static Font V() {
        JLabel jLabel;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        jLabel = y;
                        if (string != null) break block4;
                        if (jLabel != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    y = new JLabel();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            jLabel = y;
        }
        return jLabel.getFont();
    }

    public static FontMetrics E() {
        JLabel jLabel;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        jLabel = y;
                        if (string != null) break block4;
                        if (jLabel != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    y = new JLabel();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            jLabel = y;
        }
        return jLabel.getFontMetrics(y.getFont());
    }

    public static JScrollPane a(Component component) {
        block19: {
            Container container;
            block23: {
                String string;
                block22: {
                    block21: {
                        block20: {
                            Component component2;
                            block18: {
                                string = FV.D();
                                try {
                                    component2 = component;
                                    if (string != null) break block18;
                                    if (component2 == null) break block19;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                component2 = component;
                            }
                            try {
                                try {
                                    container = component2.getParent();
                                    if (string != null) break block20;
                                    if (container == null) break block19;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                container = component.getParent();
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        try {
                            try {
                                if (string != null) break block21;
                                if (!(container instanceof JViewport)) break block19;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            container = component.getParent().getParent();
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        try {
                            if (string != null) break block22;
                            if (container == null) break block19;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        container = component.getParent().getParent();
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                try {
                    try {
                        if (string != null) break block23;
                        if (!(container instanceof JScrollPane)) break block19;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    container = component.getParent().getParent();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            return (JScrollPane)container;
        }
        return null;
    }

    public static Component R(Container container) {
        String string;
        block16: {
            FocusTraversalPolicy focusTraversalPolicy;
            block15: {
                FocusTraversalPolicy focusTraversalPolicy2 = container.getFocusTraversalPolicy();
                string = FV.D();
                try {
                    focusTraversalPolicy = focusTraversalPolicy2;
                    if (string != null) break block15;
                    if (focusTraversalPolicy == null) break block16;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                focusTraversalPolicy = focusTraversalPolicy2;
            }
            return focusTraversalPolicy.getFirstComponent(container);
        }
        Component[] componentArray = container.getComponents();
        int n10 = componentArray.length;
        int n11 = 0;
        while (n11 < n10) {
            block21: {
                block20: {
                    Component component;
                    block19: {
                        boolean bl;
                        Component component2;
                        block17: {
                            block18: {
                                component2 = componentArray[n11];
                                try {
                                    try {
                                        bl = component2.isFocusable();
                                        if (string != null) break block17;
                                        if (!bl) break block18;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    return component2;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            try {
                                component = component2;
                                if (string != null) break block19;
                                bl = component instanceof Container;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        try {
                            if (!bl) break block20;
                            component = FN.R((Container)component2);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    Component component3 = component;
                    try {
                        try {
                            if (string != null) break block21;
                            if (component3 == null) break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        return component3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                ++n11;
            }
            if (string == null) continue;
        }
        return null;
    }

    public static List C(String string, Component component) {
        return FN.C(string, component, new ArrayList());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List C(String var0, Component var1_1, List var2_2) {
        block141: {
            block142: {
                var3_3 = FV.D();
                try {
                    block161: {
                        block156: {
                            block160: {
                                block194: {
                                    block159: {
                                        block158: {
                                            block157: {
                                                block190: {
                                                    block189: {
                                                        block154: {
                                                            block155: {
                                                                block187: {
                                                                    block186: {
                                                                        block152: {
                                                                            block153: {
                                                                                block184: {
                                                                                    block183: {
                                                                                        block150: {
                                                                                            block151: {
                                                                                                block181: {
                                                                                                    block180: {
                                                                                                        block145: {
                                                                                                            block147: {
                                                                                                                block148: {
                                                                                                                    block149: {
                                                                                                                        block177: {
                                                                                                                            block176: {
                                                                                                                                block146: {
                                                                                                                                    block174: {
                                                                                                                                        block143: {
                                                                                                                                            block144: {
                                                                                                                                                block172: {
                                                                                                                                                    block171: {
                                                                                                                                                        block140: {
                                                                                                                                                            block138: {
                                                                                                                                                                block139: {
                                                                                                                                                                    block165: {
                                                                                                                                                                        block164: {
                                                                                                                                                                            block163: {
                                                                                                                                                                                block162: {
                                                                                                                                                                                    block136: {
                                                                                                                                                                                        block137: {
                                                                                                                                                                                            block135: {
                                                                                                                                                                                                block134: {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        v0 = var0;
                                                                                                                                                                                                        if (var3_3 != null) break block134;
                                                                                                                                                                                                        if (v0 == null) break block135;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (Throwable v1) {
                                                                                                                                                                                                        throw FN.a(v1);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v0 = var0;
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v2 = v0.equals("");
                                                                                                                                                                                                    if (var3_3 != null) break block136;
                                                                                                                                                                                                    if (!v2) break block137;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (Throwable v3) {
                                                                                                                                                                                                    throw FN.a(v3);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            return var2_2;
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            v4 = var1_1;
                                                                                                                                                                                            if (var3_3 != null) break block138;
                                                                                                                                                                                            v2 = v4 instanceof kz_2;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (Throwable v5) {
                                                                                                                                                                                            throw FN.a(v5);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v2) break block139;
                                                                                                                                                                                    v4 = var1_1;
                                                                                                                                                                                    if (var3_3 != null) break block138;
                                                                                                                                                                                    break block162;
                                                                                                                                                                                    catch (Throwable v6) {
                                                                                                                                                                                        throw FN.a(v6);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                if (v4 instanceof k4_0) break block139;
                                                                                                                                                                                break block163;
                                                                                                                                                                                catch (Throwable v7) {
                                                                                                                                                                                    throw FN.a(v7);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            v4 = var1_1;
                                                                                                                                                                            if (var3_3 != null) break block138;
                                                                                                                                                                            break block164;
                                                                                                                                                                            catch (Throwable v8) {
                                                                                                                                                                                throw FN.a(v8);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (v4 instanceof lk_2) break block139;
                                                                                                                                                                        break block165;
                                                                                                                                                                        catch (Throwable v9) {
                                                                                                                                                                            throw FN.a(v9);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        block166: {
                                                                                                                                                                            v10 = var1_1 instanceof kv_1;
                                                                                                                                                                            if (var3_3 != null) break block140;
                                                                                                                                                                            break block166;
                                                                                                                                                                            catch (Throwable v11) {
                                                                                                                                                                                throw FN.a(v11);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (v10) {
                                                                                                                                                                        }
                                                                                                                                                                        ** GOTO lbl109
                                                                                                                                                                    }
                                                                                                                                                                    catch (Throwable v12) {
                                                                                                                                                                        throw FN.a(v12);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v4 = var1_1;
                                                                                                                                                            }
                                                                                                                                                            var4_4 = ((Container)v4).getComponents();
                                                                                                                                                            var5_6 = ((Component[])var4_4).length;
                                                                                                                                                            var6_7 = 0;
                                                                                                                                                            while (var6_7 < var5_6) {
                                                                                                                                                                block167: {
                                                                                                                                                                    block169: {
                                                                                                                                                                        block168: {
                                                                                                                                                                            var7_8 = var4_4[var6_7];
                                                                                                                                                                            if (var3_3 != null) break block167;
                                                                                                                                                                            v13 = FN.C(var0, var7_8);
                                                                                                                                                                            if (var3_3 != null) break block141;
                                                                                                                                                                            break block168;
                                                                                                                                                                            catch (Throwable v14) {
                                                                                                                                                                                throw FN.a(v14);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (v13.size() <= 0) ** GOTO lbl100
                                                                                                                                                                        break block169;
                                                                                                                                                                        catch (Throwable v15) {
                                                                                                                                                                            throw FN.a(v15);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        block170: {
                                                                                                                                                                            var2_2.add(var1_1);
                                                                                                                                                                            if (var3_3 == null) break;
                                                                                                                                                                            break block170;
                                                                                                                                                                            catch (Throwable v16) {
                                                                                                                                                                                throw FN.a(v16);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        ++var6_7;
                                                                                                                                                                    }
                                                                                                                                                                    catch (Throwable v17) {
                                                                                                                                                                        throw FN.a(v17);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (var3_3 == null) continue;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                if (var3_3 == null) break block142;
lbl109:
                                                                                                                                                                // 2 sources

                                                                                                                                                                v10 = var1_1 instanceof k3_0;
                                                                                                                                                            }
                                                                                                                                                            catch (Throwable v18) {
                                                                                                                                                                throw FN.a(v18);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (var3_3 != null) break block143;
                                                                                                                                                        if (!v10) ** GOTO lbl142
                                                                                                                                                        break block171;
                                                                                                                                                        catch (Throwable v19) {
                                                                                                                                                            throw FN.a(v19);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v20 = FN.C(var0, ((k3_0)var1_1).g()).size();
                                                                                                                                                    if (var3_3 != null) break block144;
                                                                                                                                                    break block172;
                                                                                                                                                    catch (Throwable v21) {
                                                                                                                                                        throw FN.a(v21);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    block173: {
                                                                                                                                                        if (v20 <= 0) break block142;
                                                                                                                                                        break block173;
                                                                                                                                                        catch (Throwable v22) {
                                                                                                                                                            throw FN.a(v22);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v20 = (int)var2_2.add(var1_1);
                                                                                                                                                }
                                                                                                                                                catch (Throwable v23) {
                                                                                                                                                    throw FN.a(v23);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (var3_3 == null) break block142;
lbl142:
                                                                                                                                                // 2 sources

                                                                                                                                                v10 = var1_1 instanceof JComboBox;
                                                                                                                                            }
                                                                                                                                            catch (Throwable v24) {
                                                                                                                                                throw FN.a(v24);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (var3_3 != null) break block145;
                                                                                                                                            if (v10) {
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl225
                                                                                                                                        }
                                                                                                                                        catch (Throwable v25) {
                                                                                                                                            throw FN.a(v25);
                                                                                                                                        }
                                                                                                                                        var4_4 = (JComboBox)var1_1;
                                                                                                                                        v26 = var4_4.getSelectedItem().toString().toLowerCase().contains(var0.toLowerCase());
                                                                                                                                        if (var3_3 != null) break block146;
                                                                                                                                        if (v26 == 0) ** GOTO lbl171
                                                                                                                                        break block174;
                                                                                                                                        catch (Throwable v27) {
                                                                                                                                            throw FN.a(v27);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        block175: {
                                                                                                                                            var2_2.add(var1_1);
                                                                                                                                            if (var3_3 == null) break block147;
                                                                                                                                            break block175;
                                                                                                                                            catch (Throwable v28) {
                                                                                                                                                throw FN.a(v28);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v26 = var4_4.isEditable();
                                                                                                                                    }
                                                                                                                                    catch (Throwable v29) {
                                                                                                                                        throw FN.a(v29);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var3_3 != null) break block148;
                                                                                                                                if (v26 == 0) ** GOTO lbl205
                                                                                                                                break block176;
                                                                                                                                catch (Throwable v30) {
                                                                                                                                    throw FN.a(v30);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v31 = FN.C(var0, var4_4.getEditor().getEditorComponent()).size();
                                                                                                                            if (var3_3 != null) break block149;
                                                                                                                            break block177;
                                                                                                                            catch (Throwable v32) {
                                                                                                                                throw FN.a(v32);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block178: {
                                                                                                                                if (v31 <= 0) break block147;
                                                                                                                                break block178;
                                                                                                                                catch (Throwable v33) {
                                                                                                                                    throw FN.a(v33);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v31 = (int)var2_2.add(var1_1);
                                                                                                                        }
                                                                                                                        catch (Throwable v34) {
                                                                                                                            throw FN.a(v34);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var3_3 == null) break block147;
lbl205:
                                                                                                                        // 2 sources

                                                                                                                        v26 = FN.C(var0, var4_4.getRenderer().getListCellRendererComponent(null, var4_4.getSelectedItem(), -1, true, true)).size();
                                                                                                                    }
                                                                                                                    catch (Throwable v35) {
                                                                                                                        throw FN.a(v35);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (var3_3 != null) break block147;
                                                                                                                try {
                                                                                                                    block179: {
                                                                                                                        if (v26 <= 0) break block147;
                                                                                                                        break block179;
                                                                                                                        catch (Throwable v36) {
                                                                                                                            throw FN.a(v36);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v26 = (int)var2_2.add(var1_1);
                                                                                                                }
                                                                                                                catch (Throwable v37) {
                                                                                                                    throw FN.a(v37);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var3_3 == null) break block142;
lbl225:
                                                                                                                // 2 sources

                                                                                                                v10 = var1_1 instanceof JSpinner;
                                                                                                            }
                                                                                                            catch (Throwable v38) {
                                                                                                                throw FN.a(v38);
                                                                                                            }
                                                                                                        }
                                                                                                        if (var3_3 != null) break block150;
                                                                                                        if (!v10) ** GOTO lbl258
                                                                                                        break block180;
                                                                                                        catch (Throwable v39) {
                                                                                                            throw FN.a(v39);
                                                                                                        }
                                                                                                    }
                                                                                                    v40 = ((JSpinner)var1_1).getValue().toString().toLowerCase().contains(var0.toLowerCase());
                                                                                                    if (var3_3 != null) break block151;
                                                                                                    break block181;
                                                                                                    catch (Throwable v41) {
                                                                                                        throw FN.a(v41);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    block182: {
                                                                                                        if (!v40) break block142;
                                                                                                        break block182;
                                                                                                        catch (Throwable v42) {
                                                                                                            throw FN.a(v42);
                                                                                                        }
                                                                                                    }
                                                                                                    v40 = var2_2.add(var1_1);
                                                                                                }
                                                                                                catch (Throwable v43) {
                                                                                                    throw FN.a(v43);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var3_3 == null) break block142;
lbl258:
                                                                                                // 2 sources

                                                                                                v10 = var1_1 instanceof JLabel;
                                                                                            }
                                                                                            catch (Throwable v44) {
                                                                                                throw FN.a(v44);
                                                                                            }
                                                                                        }
                                                                                        if (var3_3 != null) break block152;
                                                                                        if (!v10) ** GOTO lbl291
                                                                                        break block183;
                                                                                        catch (Throwable v45) {
                                                                                            throw FN.a(v45);
                                                                                        }
                                                                                    }
                                                                                    v46 = ((JLabel)var1_1).getText().toLowerCase().contains(var0.toLowerCase());
                                                                                    if (var3_3 != null) break block153;
                                                                                    break block184;
                                                                                    catch (Throwable v47) {
                                                                                        throw FN.a(v47);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block185: {
                                                                                        if (!v46) break block142;
                                                                                        break block185;
                                                                                        catch (Throwable v48) {
                                                                                            throw FN.a(v48);
                                                                                        }
                                                                                    }
                                                                                    v46 = var2_2.add(var1_1);
                                                                                }
                                                                                catch (Throwable v49) {
                                                                                    throw FN.a(v49);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var3_3 == null) break block142;
lbl291:
                                                                                // 2 sources

                                                                                v10 = var1_1 instanceof AbstractButton;
                                                                            }
                                                                            catch (Throwable v50) {
                                                                                throw FN.a(v50);
                                                                            }
                                                                        }
                                                                        if (var3_3 != null) break block154;
                                                                        if (!v10) ** GOTO lbl324
                                                                        break block186;
                                                                        catch (Throwable v51) {
                                                                            throw FN.a(v51);
                                                                        }
                                                                    }
                                                                    v52 = ((AbstractButton)var1_1).getText().toLowerCase().contains(var0.toLowerCase());
                                                                    if (var3_3 != null) break block155;
                                                                    break block187;
                                                                    catch (Throwable v53) {
                                                                        throw FN.a(v53);
                                                                    }
                                                                }
                                                                try {
                                                                    block188: {
                                                                        if (!v52) break block142;
                                                                        break block188;
                                                                        catch (Throwable v54) {
                                                                            throw FN.a(v54);
                                                                        }
                                                                    }
                                                                    v52 = var2_2.add(var1_1);
                                                                }
                                                                catch (Throwable v55) {
                                                                    throw FN.a(v55);
                                                                }
                                                            }
                                                            try {
                                                                if (var3_3 == null) break block142;
lbl324:
                                                                // 2 sources

                                                                v10 = var1_1 instanceof JTextComponent;
                                                            }
                                                            catch (Throwable v56) {
                                                                throw FN.a(v56);
                                                            }
                                                        }
                                                        if (var3_3 != null) break block156;
                                                        if (!v10) ** GOTO lbl405
                                                        break block189;
                                                        catch (Throwable v57) {
                                                            throw FN.a(v57);
                                                        }
                                                    }
                                                    v58 /* !! */  = (JTextComponent)var1_1;
                                                    if (var3_3 != null) break block157;
                                                    break block190;
                                                    catch (Throwable v59) {
                                                        throw FN.a(v59);
                                                    }
                                                }
                                                try {
                                                    block191: {
                                                        if (!v58 /* !! */ .getText().toLowerCase().contains(var0.toLowerCase())) break block142;
                                                        break block191;
                                                        catch (Throwable v60) {
                                                            throw FN.a(v60);
                                                        }
                                                    }
                                                    v58 /* !! */  = var1_1.getParent();
                                                }
                                                catch (Throwable v61) {
                                                    throw FN.a(v61);
                                                }
                                            }
                                            if (var3_3 != null) break block158;
                                            try {
                                                block192: {
                                                    if (v58 /* !! */  == null) ** GOTO lbl397
                                                    break block192;
                                                    catch (Throwable v62) {
                                                        throw FN.a(v62);
                                                    }
                                                }
                                                v58 /* !! */  = var1_1.getParent().getParent();
                                            }
                                            catch (Throwable v63) {
                                                throw FN.a(v63);
                                            }
                                        }
                                        if (var3_3 != null) break block159;
                                        try {
                                            block193: {
                                                if (v58 /* !! */  == null) ** GOTO lbl397
                                                break block193;
                                                catch (Throwable v64) {
                                                    throw FN.a(v64);
                                                }
                                            }
                                            v58 /* !! */  = var1_1.getParent().getParent();
                                        }
                                        catch (Throwable v65) {
                                            throw FN.a(v65);
                                        }
                                    }
                                    v66 = v58 /* !! */  instanceof JScrollPane;
                                    if (var3_3 != null) break block160;
                                    if (!v66) ** GOTO lbl397
                                    break block194;
                                    catch (Throwable v67) {
                                        throw FN.a(v67);
                                    }
                                }
                                try {
                                    block195: {
                                        var2_2.add(var1_1.getParent().getParent());
                                        if (var3_3 == null) break block142;
                                        break block195;
                                        catch (Throwable v68) {
                                            throw FN.a(v68);
                                        }
                                    }
                                    v66 = var2_2.add(var1_1);
                                }
                                catch (Throwable v69) {
                                    throw FN.a(v69);
                                }
                            }
                            try {
                                if (var3_3 == null) break block142;
lbl405:
                                // 2 sources

                                v10 = var1_1 instanceof JTabbedPane;
                            }
                            catch (Throwable v70) {
                                throw FN.a(v70);
                            }
                        }
                        try {
                            if (var3_3 != null) break block161;
                            if (v10) {
                            }
                            ** GOTO lbl433
                        }
                        catch (Throwable v71) {
                            throw FN.a(v71);
                        }
                        var4_4 = (JTabbedPane)var1_1;
                        for (var5_6 = 0; var5_6 < var4_4.getTabCount(); ++var5_6) {
                            if (var3_3 != null) break block142;
                            try {
                                block196: {
                                    if (!(var4_4.getComponentAt(var5_6) instanceof Container)) continue;
                                    break block196;
                                    catch (Throwable v72) {
                                        throw FN.a(v72);
                                    }
                                }
                                FN.i(var0, (Container)var4_4.getComponentAt(var5_6), var2_2);
                                continue;
                            }
                            catch (Throwable v73) {
                                throw FN.a(v73);
                            }
                        }
                        try {
                            if (var3_3 == null) break block142;
lbl433:
                            // 2 sources

                            v10 = var1_1 instanceof Container;
                        }
                        catch (Throwable v74) {
                            throw FN.a(v74);
                        }
                    }
                    try {
                        if (v10) {
                            FN.i(var0, (Container)var1_1, var2_2);
                        }
                    }
                    catch (Throwable v75) {
                        throw FN.a(v75);
                    }
                }
                catch (Throwable var4_5) {
                    // empty catch block
                }
            }
            v13 = var2_2;
        }
        return v13;
    }

    private static void i(String string, Container container, List list) {
        Component[] componentArray = container.getComponents();
        int n10 = componentArray.length;
        String string2 = FV.D();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component = componentArray[i2];
            FN.C(string, component, list);
            if (string2 == null) continue;
        }
    }

    public static Rectangle f(Component component) {
        return new Rectangle(component.getLocationOnScreen(), component.getSize());
    }

    public static Rectangle O(Component component) {
        Rectangle rectangle;
        block12: {
            Component component2;
            block10: {
                block11: {
                    Component component3;
                    block8: {
                        String string = FV.D();
                        try {
                            block9: {
                                try {
                                    try {
                                        try {
                                            component3 = component;
                                            if (string != null) break block8;
                                            if (component3 instanceof Window) break block9;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        component2 = component;
                                        if (string != null) break block10;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    if (!(component2 instanceof JApplet)) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            component3 = component;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    rectangle = FN.a(component3).getBounds();
                    break block12;
                }
                component2 = component;
            }
            rectangle = FN.J(component2, FN.a(component));
        }
        return rectangle;
    }

    public static Rectangle J(Component component, Component component2) {
        return new Rectangle(FN.n(component, component2), component.getSize());
    }

    public static Point n(Component component, Component component2) {
        Point point = component.getLocationOnScreen();
        Point point2 = component2.getLocationOnScreen();
        return new Point(point.x - point2.x, point.y - point2.y);
    }

    public static boolean q(Component component, Component component2) {
        boolean bl;
        try {
            bl = FN.L(component) == FN.L(component2);
        }
        catch (RuntimeException runtimeException) {
            throw FN.a(runtimeException);
        }
        return bl;
    }

    public static Map B(Container container) {
        HashMap<Component, Dimension> hashMap;
        block4: {
            int n10 = container.getComponentCount();
            HashMap<Component, Dimension> hashMap2 = new HashMap<Component, Dimension>(n10);
            String string = FV.D();
            for (int i2 = 0; i2 < n10; ++i2) {
                Component component = container.getComponent(i2);
                try {
                    hashMap = hashMap2;
                    if (string == null) {
                        hashMap.put(component, component.getPreferredSize());
                        if (string == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }

    /*
     * Unable to fully structure code
     */
    public static void b(Component[] var0) {
        var2_1 = new Dimension(0, 0);
        var3_2 = var0;
        var4_3 = var3_2.length;
        var1_4 = FV.D();
        var5_5 = 0;
        while (var5_5 < var4_3) {
            block12: {
                block13: {
                    var6_6 = var3_2[var5_5];
                    try {
                        try {
                            if (var1_4 != null) break block12;
                            v0 = var6_6;
                            if (var1_4 == null) {
                            }
                            ** GOTO lbl39
                        }
                        catch (RuntimeException v1) {
                            throw FN.a(v1);
                        }
                        if (v0 == null) break block13;
                    }
                    catch (RuntimeException v2) {
                        throw FN.a(v2);
                    }
                    var7_7 = var6_6.getPreferredSize();
                    var2_1.width = Math.max(var2_1.width, var7_7.width);
                    var2_1.height = Math.max(var2_1.height, var7_7.height);
                }
                ++var5_5;
            }
            if (var1_4 == null) continue;
        }
        var3_2 = var0;
        var4_3 = var3_2.length;
        var5_5 = 0;
        while (var5_5 < var4_3) {
            block14: {
                var6_6 = var3_2[var5_5];
                try {
                    if (var1_4 != null) break block14;
                    v0 = var6_6;
                }
                catch (RuntimeException v3) {
                    throw FN.a(v3);
                }
lbl39:
                // 2 sources

                try {
                    if (v0 != null) {
                        var6_6.setPreferredSize(var2_1);
                    }
                }
                catch (RuntimeException v4) {
                    throw FN.a(v4);
                }
                ++var5_5;
            }
            if (var1_4 == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void z(Component[] var0) {
        var2_1 = 0;
        var1_2 = FV.D();
        var3_3 = var0;
        var4_4 = var3_3.length;
        var5_5 = 0;
        while (var5_5 < var4_4) {
            block17: {
                block18: {
                    var6_6 = var3_3[var5_5];
                    try {
                        try {
                            if (var1_2 != null) break block17;
                            v0 = var6_6;
                            if (var1_2 == null) {
                            }
                            ** GOTO lbl37
                        }
                        catch (RuntimeException v1) {
                            throw FN.a(v1);
                        }
                        if (v0 == null) break block18;
                    }
                    catch (RuntimeException v2) {
                        throw FN.a(v2);
                    }
                    var2_1 = Math.max(var2_1, var6_6.getPreferredSize().width);
                }
                ++var5_5;
            }
            if (var1_2 == null) continue;
        }
        var3_3 = var0;
        var4_4 = var3_3.length;
        var5_5 = 0;
        while (var5_5 < var4_4) {
            block19: {
                block20: {
                    block21: {
                        var6_6 = var3_3[var5_5];
                        try {
                            if (var1_2 != null) break block19;
                            v0 = var6_6;
                        }
                        catch (RuntimeException v3) {
                            throw FN.a(v3);
                        }
lbl37:
                        // 2 sources

                        try {
                            block22: {
                                try {
                                    try {
                                        try {
                                            if (v0 == null) break block20;
                                            v4 = var6_6;
                                            if (var1_2 != null) break block21;
                                        }
                                        catch (RuntimeException v5) {
                                            throw FN.a(v5);
                                        }
                                        if (!(v4 instanceof sa_0)) break block22;
                                    }
                                    catch (RuntimeException v6) {
                                        throw FN.a(v6);
                                    }
                                    ((sa_0)var6_6).O(var2_1);
                                    if (var1_2 == null) break block20;
                                }
                                catch (RuntimeException v7) {
                                    throw FN.a(v7);
                                }
                            }
                            v4 = var6_6;
                        }
                        catch (RuntimeException v8) {
                            throw FN.a(v8);
                        }
                    }
                    v4.setPreferredSize(new Dimension(var2_1, var6_6.getPreferredSize().height));
                }
                ++var5_5;
            }
            if (var1_2 == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void n(Component[] var0) {
        var2_1 = 0;
        var1_2 = FV.D();
        var3_3 = var0;
        var4_4 = var3_3.length;
        var5_5 = 0;
        while (var5_5 < var4_4) {
            block17: {
                block18: {
                    var6_6 = var3_3[var5_5];
                    try {
                        try {
                            if (var1_2 != null) break block17;
                            v0 = var6_6;
                            if (var1_2 == null) {
                            }
                            ** GOTO lbl37
                        }
                        catch (RuntimeException v1) {
                            throw FN.a(v1);
                        }
                        if (v0 == null) break block18;
                    }
                    catch (RuntimeException v2) {
                        throw FN.a(v2);
                    }
                    var2_1 = Math.max(var2_1, var6_6.getPreferredSize().height);
                }
                ++var5_5;
            }
            if (var1_2 == null) continue;
        }
        var3_3 = var0;
        var4_4 = var3_3.length;
        var5_5 = 0;
        while (var5_5 < var4_4) {
            block19: {
                block20: {
                    block21: {
                        var6_6 = var3_3[var5_5];
                        try {
                            if (var1_2 != null) break block19;
                            v0 = var6_6;
                        }
                        catch (RuntimeException v3) {
                            throw FN.a(v3);
                        }
lbl37:
                        // 2 sources

                        try {
                            block22: {
                                try {
                                    try {
                                        try {
                                            if (v0 == null) break block20;
                                            v4 = var6_6;
                                            if (var1_2 != null) break block21;
                                        }
                                        catch (RuntimeException v5) {
                                            throw FN.a(v5);
                                        }
                                        if (!(v4 instanceof sa_0)) break block22;
                                    }
                                    catch (RuntimeException v6) {
                                        throw FN.a(v6);
                                    }
                                    ((sa_0)var6_6).x(var2_1);
                                    if (var1_2 == null) break block20;
                                }
                                catch (RuntimeException v7) {
                                    throw FN.a(v7);
                                }
                            }
                            v4 = var6_6;
                        }
                        catch (RuntimeException v8) {
                            throw FN.a(v8);
                        }
                    }
                    v4.setPreferredSize(new Dimension(var6_6.getPreferredSize().width, var2_1));
                }
                ++var5_5;
            }
            if (var1_2 == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Component component, Component component2) {
        Component component3;
        String string;
        block31: {
            block32: {
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                string = FV.D();
                                try {
                                    try {
                                        component3 = component;
                                        if (string != null) break block27;
                                        if (component3 != component2) break block28;
                                        return true;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            component3 = component;
                        }
                        try {
                            try {
                                try {
                                    if (string != null) break block29;
                                    if (component3 != null) break block30;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                component3 = component2;
                                if (string != null) break block29;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            if (component3 != null) return false;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    component3 = component;
                }
                try {
                    try {
                        try {
                            try {
                                if (string != null) break block31;
                                if (component3 == null) break block32;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            component3 = component2;
                            if (string != null) break block31;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (component3 != null) break block32;
                        return false;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            component3 = component;
        }
        try {
            boolean bl = component3 instanceof Container;
            if (string != null) return bl;
            if (!bl) return false;
        }
        catch (RuntimeException runtimeException) {
            throw FN.a(runtimeException);
        }
        Component[] componentArray = ((Container)component).getComponents();
        int n10 = componentArray.length;
        int n11 = 0;
        do {
            block33: {
                if (n11 >= n10) return false;
                Component component4 = componentArray[n11];
                try {
                    try {
                        boolean bl;
                        try {
                            if (string != null) continue;
                            bl = FN.a(component4, component2);
                            if (string != null) return bl;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                        if (!bl) break block33;
                        return true;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            ++n11;
        } while (string == null);
        return false;
    }

    public static boolean l(Component component) {
        boolean bl;
        block14: {
            block13: {
                block11: {
                    String string;
                    block12: {
                        Component component2;
                        Component component3;
                        block10: {
                            component3 = FocusManager.getCurrentManager().getFocusOwner();
                            string = FV.D();
                            try {
                                try {
                                    component2 = component;
                                    if (string != null) break block10;
                                    if (component2 == component3) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                component2 = component;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                        }
                        try {
                            try {
                                bl = component2 instanceof Container;
                                if (string != null) break block12;
                                if (!bl) break block13;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl = ((Container)component).isAncestorOf(component3);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        if (string != null) break block14;
                        if (!bl) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                }
                bl = true;
                break block14;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean v(Container container) {
        boolean bl;
        block13: {
            Component[] componentArray = container.getComponents();
            String string = FV.D();
            for (Component component : componentArray) {
                boolean bl2;
                block17: {
                    block16: {
                        block14: {
                            block15: {
                                try {
                                    try {
                                        try {
                                            bl = component.isFocusable();
                                            if (string != null) break block13;
                                            if (string != null) break block14;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        if (!bl) break block15;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw FN.a(runtimeException);
                                    }
                                    return true;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                            }
                            bl2 = component instanceof Container;
                        }
                        try {
                            try {
                                if (string != null) break block16;
                                if (!bl2) continue;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            bl2 = FN.v((Container)component);
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    try {
                        if (string != null) break block17;
                        if (!bl2) continue;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public static String[] o() {
        String[] stringArray;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        stringArray = s;
                        if (string != null) break block4;
                        if (stringArray != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    s = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            stringArray = s;
        }
        return stringArray;
    }

    public static Font[] K() {
        Font[] fontArray;
        block4: {
            block5: {
                String string = FV.D();
                try {
                    try {
                        fontArray = k;
                        if (string != null) break block4;
                        if (fontArray != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    k = FN.P(FN.o());
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            fontArray = k;
        }
        return fontArray;
    }

    public static Font[] P(String[] stringArray) {
        Font[] fontArray;
        block4: {
            Font[] fontArray2 = new Font[stringArray.length];
            String string = FV.D();
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                try {
                    fontArray = fontArray2;
                    if (string == null) {
                        fontArray[i2] = new Font(stringArray[i2], 0, FN.a(718, 7370037866362861103L));
                        if (string == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            fontArray = fontArray2;
        }
        return fontArray;
    }

    public static void u(long l2, Runnable runnable) {
        WC.n("\u0000ERR:ArrayIndexOutOfBoundsException:Index 43445 out of bounds for length 35", l2, false, new wh_2(runnable));
    }

    /*
     * Unable to fully structure code
     */
    public static void J(wc_0 var0, KeyEvent var1_1) {
        block9: {
            block8: {
                var2_2 = FV.D();
                try {
                    try {
                        if (var2_2 != null) break block8;
                        if (SwingUtilities.isEventDispatchThread()) {
                        }
                        ** GOTO lbl17
                    }
                    catch (RuntimeException v0) {
                        throw FN.a(v0);
                    }
                    var0.j(var1_1);
                }
                catch (RuntimeException v1) {
                    throw FN.a(v1);
                }
            }
            try {
                if (var2_2 == null) break block9;
lbl17:
                // 2 sources

                SwingUtilities.invokeLater(new kl_1(var0, var1_1));
            }
            catch (RuntimeException v2) {
                throw FN.a(v2);
            }
        }
    }

    public static Insets p(Insets insets) {
        return new Insets(insets.top, insets.right, insets.bottom, insets.left);
    }

    public static Point f(Component component) {
        Point point = MouseInfo.getPointerInfo().getLocation();
        Point point2 = component.getLocationOnScreen();
        return new Point(point.x - point2.x, point.y - point2.y);
    }

    public static void g(JScrollPane jScrollPane, int n10, int n11) {
        int n12;
        int n13;
        int n14;
        int n15;
        JScrollBar jScrollBar;
        JScrollBar jScrollBar2;
        block30: {
            block31: {
                int n16;
                String string;
                block28: {
                    block29: {
                        int n17;
                        block26: {
                            block27: {
                                int n18;
                                block24: {
                                    block25: {
                                        int n19;
                                        block33: {
                                            block23: {
                                                int n20;
                                                int n21;
                                                block22: {
                                                    int n22;
                                                    Dimension dimension;
                                                    block32: {
                                                        block21: {
                                                            int n23;
                                                            int n24;
                                                            block20: {
                                                                jScrollBar2 = jScrollPane.getHorizontalScrollBar();
                                                                jScrollBar = jScrollPane.getVerticalScrollBar();
                                                                string = FV.D();
                                                                dimension = jScrollPane.getViewport().getSize();
                                                                try {
                                                                    try {
                                                                        n24 = n10;
                                                                        n23 = jScrollBar2.getMaximum() - dimension.width;
                                                                        if (string != null) break block20;
                                                                        if (n24 <= n23) break block21;
                                                                    }
                                                                    catch (RuntimeException runtimeException) {
                                                                        throw FN.a(runtimeException);
                                                                    }
                                                                    n24 = jScrollBar2.getMaximum();
                                                                    n23 = dimension.width;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw FN.a(runtimeException);
                                                                }
                                                            }
                                                            n22 = n24 - n23;
                                                            break block32;
                                                        }
                                                        n22 = n10;
                                                    }
                                                    n10 = n22;
                                                    try {
                                                        try {
                                                            n21 = n11;
                                                            n20 = jScrollBar.getMaximum() - dimension.height;
                                                            if (string != null) break block22;
                                                            if (n21 <= n20) break block23;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw FN.a(runtimeException);
                                                        }
                                                        n21 = jScrollBar.getMaximum();
                                                        n20 = dimension.height;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw FN.a(runtimeException);
                                                    }
                                                }
                                                n19 = n21 - n20;
                                                break block33;
                                            }
                                            n19 = n11;
                                        }
                                        n11 = n19;
                                        try {
                                            n18 = n10;
                                            if (string != null) break block24;
                                            if (n18 >= 0) break block25;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw FN.a(runtimeException);
                                        }
                                        n18 = 0;
                                        break block24;
                                    }
                                    n18 = n10;
                                }
                                n15 = n18;
                                try {
                                    n17 = n11;
                                    if (string != null) break block26;
                                    if (n17 >= 0) break block27;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw FN.a(runtimeException);
                                }
                                n17 = 0;
                                break block26;
                            }
                            n17 = n11;
                        }
                        n14 = n17;
                        try {
                            try {
                                n16 = jScrollBar2.getValue();
                                if (string != null) break block28;
                                if (n16 <= n15) break block29;
                            }
                            catch (RuntimeException runtimeException) {
                                throw FN.a(runtimeException);
                            }
                            n16 = -1;
                            break block28;
                        }
                        catch (RuntimeException runtimeException) {
                            throw FN.a(runtimeException);
                        }
                    }
                    n16 = 1;
                }
                n13 = n16;
                try {
                    try {
                        n12 = jScrollBar.getValue();
                        if (string != null) break block30;
                        if (n12 <= n14) break block31;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    n12 = -1;
                    break block30;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            n12 = 1;
        }
        int n25 = n12;
        Thread thread = new Thread(new ii_1(jScrollBar2, n15, n13));
        thread.setDaemon(true);
        Thread thread2 = new Thread(new QD(jScrollBar, n14, n25));
        thread2.setDaemon(true);
        thread.start();
        thread2.start();
    }

    public static void W(Graphics graphics, String string, int n10, int n11, int n12) {
        block4: {
            int n13;
            block3: {
                String string2 = FV.D();
                FN.Q(graphics, string, n11, n12);
                String string3 = string2;
                try {
                    n13 = n10;
                    if (string3 != null) break block3;
                    if (n13 < 0) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                n13 = n10;
            }
            if (n13 < string.length()) {
                FontMetrics fontMetrics = graphics.getFontMetrics();
                graphics.fillRect(n11 + fontMetrics.stringWidth(string.substring(0, n10)), n12 + fontMetrics.getDescent() - 1, fontMetrics.charWidth(string.charAt(n10)), 1);
            }
        }
    }

    public static void Q(Graphics graphics, String string, int n10, int n11) {
        graphics.drawString(string, n10, n11);
    }

    public static Map B(Graphics graphics) {
        return FN.Y((Graphics2D)graphics);
    }

    public static Map Y(Graphics2D graphics2D) {
        return FN.d(graphics2D, GO.e);
    }

    public static Map R(Graphics graphics, Map map) {
        return FN.d((Graphics2D)graphics, map);
    }

    public static Map d(Graphics2D graphics2D, Map map) {
        block5: {
            Map map2;
            block4: {
                String string = FV.D();
                try {
                    try {
                        map2 = map;
                        if (string != null) break block4;
                        if (map2 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    map2 = FN.R(graphics2D, map, null);
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            Map map3 = map2;
            graphics2D.addRenderingHints(map);
            return map3;
        }
        return null;
    }

    public static void O(Graphics graphics, Map map) {
        FN.k((Graphics2D)graphics, map);
    }

    public static void k(Graphics2D graphics2D, Map map) {
        try {
            if (map != null) {
                graphics2D.addRenderingHints(map);
            }
        }
        catch (RuntimeException runtimeException) {
            throw FN.a(runtimeException);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static Map R(Graphics2D var0, Map var1_1, Map var2_2) {
        block22: {
            block23: {
                block20: {
                    block19: {
                        block18: {
                            var3_3 = FV.D();
                            try {
                                v0 = var2_2;
                                if (var3_3 != null) break block18;
                                if (v0 == null) {
                                }
                                ** GOTO lbl13
                            }
                            catch (RuntimeException v1) {
                                throw FN.a(v1);
                            }
                            var2_2 = new RenderingHints(null);
                            try {
                                if (var3_3 == null) break block19;
lbl13:
                                // 2 sources

                                v0 = var2_2;
                            }
                            catch (RuntimeException v2) {
                                throw FN.a(v2);
                            }
                        }
                        v0.clear();
                    }
                    try {
                        block21: {
                            try {
                                try {
                                    try {
                                        v3 = var1_1;
                                        if (var3_3 != null) break block20;
                                        if (v3 == null) break block21;
                                    }
                                    catch (RuntimeException v4) {
                                        throw FN.a(v4);
                                    }
                                    v5 = var1_1;
                                    if (var3_3 != null) break block22;
                                }
                                catch (RuntimeException v6) {
                                    throw FN.a(v6);
                                }
                                if (v5.size() != 0) break block23;
                            }
                            catch (RuntimeException v7) {
                                throw FN.a(v7);
                            }
                        }
                        v3 = var2_2;
                    }
                    catch (RuntimeException v8) {
                        throw FN.a(v8);
                    }
                }
                return v3;
            }
            v5 = var1_1;
        }
        var4_4 = v5.keySet();
        for (K var6_6 : var4_4) {
            block24: {
                var7_7 = (RenderingHints.Key)var6_6;
                var8_8 = var0.getRenderingHint(var7_7);
                try {
                    try {
                        v9 = var8_8;
                        if (var3_3 != null || v9 == null) break block24;
                    }
                    catch (RuntimeException v10) {
                        throw FN.a(v10);
                    }
                    v9 = var2_2.put(var7_7, var8_8);
                }
                catch (RuntimeException v11) {
                    throw FN.a(v11);
                }
            }
            if (var3_3 == null) continue;
        }
        return var2_2;
    }

    public static FontMetrics L(JComponent jComponent, Graphics graphics) {
        return FN.P(jComponent, graphics, graphics.getFont());
    }

    public static FontMetrics P(JComponent jComponent, Graphics graphics, Font font) {
        block3: {
            JComponent jComponent2;
            block2: {
                String string = FV.D();
                try {
                    jComponent2 = jComponent;
                    if (string != null) break block2;
                    if (jComponent2 == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                jComponent2 = jComponent;
            }
            return jComponent2.getFontMetrics(font);
        }
        return graphics.getFontMetrics(font);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int y(FontMetrics fontMetrics, String string) {
        int n10;
        block7: {
            String string2;
            String string3;
            block6: {
                string3 = FV.D();
                try {
                    string2 = string;
                    if (string3 != null) break block6;
                    if (string2 == null) return 0;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                string2 = string;
            }
            try {
                try {
                    n10 = string2.equals("");
                    if (string3 != null) return n10;
                    if (n10 == 0) break block7;
                    return 0;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            catch (RuntimeException runtimeException) {
                throw FN.a(runtimeException);
            }
        }
        n10 = fontMetrics.stringWidth(string);
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int S(JComponent jComponent, FontMetrics fontMetrics, String string) {
        int n10;
        block7: {
            String string2;
            String string3;
            block6: {
                string3 = FV.D();
                try {
                    string2 = string;
                    if (string3 != null) break block6;
                    if (string2 == null) return 0;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                string2 = string;
            }
            try {
                try {
                    n10 = string2.length();
                    if (string3 != null) return n10;
                    if (n10 != 0) break block7;
                    return 0;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            catch (RuntimeException runtimeException) {
                throw FN.a(runtimeException);
            }
        }
        n10 = FN.v(jComponent, fontMetrics, string.charAt(0));
        return n10;
    }

    public static int v(JComponent jComponent, FontMetrics fontMetrics, char c2) {
        return FN.o(jComponent, fontMetrics, c2, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int c(JComponent jComponent, FontMetrics fontMetrics, String string) {
        int n10;
        block7: {
            String string2;
            String string3;
            block6: {
                string3 = FV.D();
                try {
                    string2 = string;
                    if (string3 != null) break block6;
                    if (string2 == null) return 0;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
                string2 = string;
            }
            try {
                try {
                    n10 = string2.length();
                    if (string3 != null) return n10;
                    if (n10 != 0) break block7;
                    return 0;
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            catch (RuntimeException runtimeException) {
                throw FN.a(runtimeException);
            }
        }
        n10 = FN.H(jComponent, fontMetrics, string.charAt(string.length() - 1));
        return n10;
    }

    public static int H(JComponent jComponent, FontMetrics fontMetrics, char c2) {
        return FN.o(jComponent, fontMetrics, c2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int o(JComponent var0, FontMetrics var1_1, char var2_2, boolean var3_3) {
        block32: {
            block33: {
                block34: {
                    block45: {
                        var4_4 = FV.D();
                        if (var1_1 != null) break block32;
                        v0 = var0;
                        if (var4_4 != null) break block33;
                        break block45;
                        catch (RuntimeException v1) {
                            throw FN.a(v1);
                        }
                    }
                    try {
                        block46: {
                            if (v0 != null) break block34;
                            break block46;
                            catch (RuntimeException v2) {
                                throw FN.a(v2);
                            }
                        }
                        return 0;
                    }
                    catch (RuntimeException v3) {
                        throw FN.a(v3);
                    }
                }
                v0 = var0;
            }
            var1_1 = v0.getFontMetrics(var0.getFont());
        }
        var5_5 = FN.class;
        synchronized (FN.class) {
            block43: {
                block44: {
                    block42: {
                        block41: {
                            block36: {
                                block37: {
                                    var6_6 = new GE(var1_1);
                                    var7_7 = null;
                                    var8_8 = FN.A;
                                    var9_9 = ((GE[])var8_8).length;
                                    var10_11 = 0;
                                    while (var10_11 < var9_9) {
                                        block35: {
                                            var11_12 = var8_8[var10_11];
                                            try {
                                                if (var4_4 != null) continue;
                                                if (!var6_6.equals(var11_12)) break block35;
                                            }
                                            catch (RuntimeException v4) {
                                                throw FN.a(v4);
                                            }
                                            var7_7 = var11_12;
                                            break;
                                        }
                                        ++var10_11;
                                    }
                                    try {
                                        v5 = var7_7;
                                        if (var4_4 != null) break block36;
                                        if (v5 != null) break block37;
                                    }
                                    catch (RuntimeException v6) {
                                        throw FN.a(v6);
                                    }
                                    var8_8 = FN.H.iterator();
                                    while (var8_8.hasNext()) {
                                        block40: {
                                            block38: {
                                                block39: {
                                                    block47: {
                                                        var9_10 = (GE)((SoftReference)var8_8.next()).get();
                                                        v5 = var9_10;
                                                        if (var4_4 != null) break block36;
                                                        if (var4_4 != null) break block38;
                                                        break block47;
                                                        catch (RuntimeException v7) {
                                                            throw FN.a(v7);
                                                        }
                                                    }
                                                    try {
                                                        block48: {
                                                            if (v5 != null) break block39;
                                                            break block48;
                                                            catch (RuntimeException v8) {
                                                                throw FN.a(v8);
                                                            }
                                                        }
                                                        var8_8.remove();
                                                        if (var4_4 == null) continue;
                                                    }
                                                    catch (RuntimeException v9) {
                                                        throw FN.a(v9);
                                                    }
                                                }
                                                v10 = var6_6;
                                            }
                                            try {
                                                if (var4_4 != null) break block40;
                                                if (v10.equals(var9_10)) {
                                                }
                                                ** GOTO lbl91
                                            }
                                            catch (RuntimeException v11) {
                                                throw FN.a(v11);
                                            }
                                            v10 = var7_7 = var9_10;
                                        }
                                        try {
                                            FN.h(v10);
                                            if (var4_4 == null) break;
lbl91:
                                            // 2 sources

                                            if (var4_4 == null) continue;
                                            break;
                                        }
                                        catch (RuntimeException v12) {
                                            throw FN.a(v12);
                                        }
                                    }
                                }
                                v5 = var7_7;
                            }
                            try {
                                if (var4_4 != null) break block41;
                                if (v5 != null) break block42;
                            }
                            catch (RuntimeException v13) {
                                throw FN.a(v13);
                            }
                            v5 = var7_7 = var6_6;
                        }
                        FN.a(v5);
                    }
                    v14 = var3_3;
                    if (var4_4 != null) break block43;
                    try {
                        block49: {
                            if (v14 == 0) break block44;
                            break block49;
                            catch (RuntimeException v15) {
                                throw FN.a(v15);
                            }
                        }
                        v14 = var7_7.G(var2_2);
                        break block43;
                    }
                    catch (RuntimeException v16) {
                        throw FN.a(v16);
                    }
                }
                v14 = var7_7.g(var2_2);
            }
            // ** MonitorExit[var5_5] (shouldn't be in output)
            return v14;
        }
    }

    private static synchronized void a(GE gE2) {
        GE gE3;
        block4: {
            block5: {
                GE gE4 = A[R];
                String string = FV.D();
                try {
                    try {
                        gE3 = gE4;
                        if (string != null) break block4;
                        if (gE3 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw FN.a(runtimeException);
                    }
                    H.add(new SoftReference<GE>(gE4));
                }
                catch (RuntimeException runtimeException) {
                    throw FN.a(runtimeException);
                }
            }
            gE3 = gE2;
        }
        FN.h(gE3);
    }

    private static synchronized void h(GE gE2) {
        FN.A[FN.R] = gE2;
        R = (R + 1) % FN.a(19445, 5594446782800183061L);
    }

    static Thread B(Thread thread) {
        Q = thread;
        return Q;
    }

    static Thread Z() {
        return Q;
    }

    static Thread M(Thread thread) {
        P = thread;
        return P;
    }

    static Thread E() {
        return P;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[6];
                        var11_1 = 0;
                        var10_2 = "\b\u0016djy\u00d0\u0085\u0096\u008f\u00bb\u0019\u0084\u00c2\u00da \u0006\u00de\u001f1J\u00bc\u00db\u0017\u00a3\u0092\u00ef\u00ab\u00b5\u0087\u00faic\u0092t\u0093\u0092^\u00f1\u0085)\u00bb\u000f\u00ebsw\u0011\u00ef)\u0002\u0014@\u0097B\u00c8B\u00e2G\u00b6\u0005i\u001b)4\u00f3DQ-E\u00ee\u00f6\u0010\u0080\u0099\u00d1\u008cc\u00e7\u00cd\u00b2\u00e4\u00c0l\u0093WZ\u009aR";
                        var12_3 = "\b\u0016djy\u00d0\u0085\u0096\u008f\u00bb\u0019\u0084\u00c2\u00da \u0006\u00de\u001f1J\u00bc\u00db\u0017\u00a3\u0092\u00ef\u00ab\u00b5\u0087\u00faic\u0092t\u0093\u0092^\u00f1\u0085)\u00bb\u000f\u00ebsw\u0011\u00ef)\u0002\u0014@\u0097B\u00c8B\u00e2G\u00b6\u0005i\u001b)4\u00f3DQ-E\u00ee\u00f6\u0010\u0080\u0099\u00d1\u008cc\u00e7\u00cd\u00b2\u00e4\u00c0l\u0093WZ\u009aR".length();
                        FN.g(false);
                        var9_4 = 17;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 113;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u000e0\t\u00be\u00a9\u00ae\u00b8\u00bdx\u008a6\u00d7\u0013\u00ae\"xc\u00e2\u00a5\u0080\u001e\u00f7\u0003\u00e6p\u00deT)\u0093^\u00b8\u00bb\u00d9l\u0085\u00b0*U\u00db\u0004ZL\u00de\u0000s\u001e~K2\u00ea\u00cf";
                            var12_3 = "\u000e0\t\u00be\u00a9\u00ae\u00b8\u00bdx\u008a6\u00d7\u0013\u00ae\"xc\u00e2\u00a5\u0080\u001e\u00f7\u0003\u00e6p\u00deT)\u0093^\u00b8\u00bb\u00d9l\u0085\u00b0*U\u00db\u0004ZL\u00de\u0000s\u001e~K2\u00ea\u00cf".length();
                            var9_4 = 20;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 30;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
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
                                    v15 = 67;
                                    break;
                                }
                                case 2: {
                                    v15 = 94;
                                    break;
                                }
                                case 3: {
                                    v15 = 32;
                                    break;
                                }
                                case 4: {
                                    v15 = 85;
                                    break;
                                }
                                case 5: {
                                    v15 = 41;
                                    break;
                                }
                                default: {
                                    v15 = 108;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                FN.a = var13;
                FN.b = new String[6];
                var0_7 = 7240975162100753556L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u00c8tsH\u00ff\u00d0\u009b\u008b\u00ea`y\u00b9\u0081\u00cdR\u00b6E\u0083/\u00bb\u00b9\u00f1w`\u0083\u00f4\u00a2\nd]\u00d3\u00de";
                var5_11 = "\u00c8tsH\u00ff\u00d0\u009b\u008b\u00ea`y\u00b9\u0081\u00cdR\u00b6E\u0083/\u00bb\u00b9\u00f1w`\u0083\u00f4\u00a2\nd]\u00d3\u00de".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00b4E\u00e3\u001b\"\u00f7\u00a5hYG\u0099\u00b0`\u00d1\u00ea\u00b0";
                    var5_11 = "\u00b4E\u00e3\u001b\"\u00f7\u00a5hYG\u0099\u00b0`\u00d1\u00ea\u00b0".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        FN.c = var6_8;
        FN.d = new Integer[6];
        FN.m = null;
        FN.y = null;
        FN.A = new GE[FN.a(29970, 7666754210457092598L)];
        FN.R = 0;
        FN.H = new HashSet<E>();
    }

    public static void g(boolean bl) {
        h = bl;
    }

    public static boolean W() {
        return h;
    }

    public static boolean n() {
        boolean bl = FN.W();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw FN.a(runtimeException);
        }
        return false;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x2C0F) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 37;
                    break;
                }
                case 1: {
                    n14 = 4;
                    break;
                }
                case 2: {
                    n14 = 205;
                    break;
                }
                case 3: {
                    n14 = 157;
                    break;
                }
                case 4: {
                    n14 = 247;
                    break;
                }
                case 5: {
                    n14 = 112;
                    break;
                }
                case 6: {
                    n14 = 48;
                    break;
                }
                case 7: {
                    n14 = 162;
                    break;
                }
                case 8: {
                    n14 = 215;
                    break;
                }
                case 9: {
                    n14 = 198;
                    break;
                }
                case 10: {
                    n14 = 196;
                    break;
                }
                case 11: {
                    n14 = 75;
                    break;
                }
                case 12: {
                    n14 = 177;
                    break;
                }
                case 13: {
                    n14 = 62;
                    break;
                }
                case 14: {
                    n14 = 57;
                    break;
                }
                case 15: {
                    n14 = 200;
                    break;
                }
                case 16: {
                    n14 = 94;
                    break;
                }
                case 17: {
                    n14 = 55;
                    break;
                }
                case 18: {
                    n14 = 250;
                    break;
                }
                case 19: {
                    n14 = 240;
                    break;
                }
                case 20: {
                    n14 = 193;
                    break;
                }
                case 21: {
                    n14 = 86;
                    break;
                }
                case 22: {
                    n14 = 234;
                    break;
                }
                case 23: {
                    n14 = 214;
                    break;
                }
                case 24: {
                    n14 = 98;
                    break;
                }
                case 25: {
                    n14 = 102;
                    break;
                }
                case 26: {
                    n14 = 116;
                    break;
                }
                case 27: {
                    n14 = 24;
                    break;
                }
                case 28: {
                    n14 = 179;
                    break;
                }
                case 29: {
                    n14 = 199;
                    break;
                }
                case 30: {
                    n14 = 95;
                    break;
                }
                case 31: {
                    n14 = 202;
                    break;
                }
                case 32: {
                    n14 = 132;
                    break;
                }
                case 33: {
                    n14 = 20;
                    break;
                }
                case 34: {
                    n14 = 249;
                    break;
                }
                case 35: {
                    n14 = 194;
                    break;
                }
                case 36: {
                    n14 = 88;
                    break;
                }
                case 37: {
                    n14 = 103;
                    break;
                }
                case 38: {
                    n14 = 233;
                    break;
                }
                case 39: {
                    n14 = 41;
                    break;
                }
                case 40: {
                    n14 = 23;
                    break;
                }
                case 41: {
                    n14 = 227;
                    break;
                }
                case 42: {
                    n14 = 53;
                    break;
                }
                case 43: {
                    n14 = 71;
                    break;
                }
                case 44: {
                    n14 = 93;
                    break;
                }
                case 45: {
                    n14 = 135;
                    break;
                }
                case 46: {
                    n14 = 208;
                    break;
                }
                case 47: {
                    n14 = 255;
                    break;
                }
                case 48: {
                    n14 = 89;
                    break;
                }
                case 49: {
                    n14 = 149;
                    break;
                }
                case 50: {
                    n14 = 36;
                    break;
                }
                case 51: {
                    n14 = 120;
                    break;
                }
                case 52: {
                    n14 = 40;
                    break;
                }
                case 53: {
                    n14 = 195;
                    break;
                }
                case 54: {
                    n14 = 11;
                    break;
                }
                case 55: {
                    n14 = 15;
                    break;
                }
                case 56: {
                    n14 = 76;
                    break;
                }
                case 57: {
                    n14 = 231;
                    break;
                }
                case 58: {
                    n14 = 90;
                    break;
                }
                case 59: {
                    n14 = 91;
                    break;
                }
                case 60: {
                    n14 = 43;
                    break;
                }
                case 61: {
                    n14 = 96;
                    break;
                }
                case 62: {
                    n14 = 140;
                    break;
                }
                case 63: {
                    n14 = 87;
                    break;
                }
                case 64: {
                    n14 = 79;
                    break;
                }
                case 65: {
                    n14 = 134;
                    break;
                }
                case 66: {
                    n14 = 122;
                    break;
                }
                case 67: {
                    n14 = 49;
                    break;
                }
                case 68: {
                    n14 = 152;
                    break;
                }
                case 69: {
                    n14 = 0;
                    break;
                }
                case 70: {
                    n14 = 228;
                    break;
                }
                case 71: {
                    n14 = 164;
                    break;
                }
                case 72: {
                    n14 = 104;
                    break;
                }
                case 73: {
                    n14 = 192;
                    break;
                }
                case 74: {
                    n14 = 252;
                    break;
                }
                case 75: {
                    n14 = 184;
                    break;
                }
                case 76: {
                    n14 = 18;
                    break;
                }
                case 77: {
                    n14 = 165;
                    break;
                }
                case 78: {
                    n14 = 1;
                    break;
                }
                case 79: {
                    n14 = 70;
                    break;
                }
                case 80: {
                    n14 = 160;
                    break;
                }
                case 81: {
                    n14 = 77;
                    break;
                }
                case 82: {
                    n14 = 34;
                    break;
                }
                case 83: {
                    n14 = 220;
                    break;
                }
                case 84: {
                    n14 = 3;
                    break;
                }
                case 85: {
                    n14 = 111;
                    break;
                }
                case 86: {
                    n14 = 166;
                    break;
                }
                case 87: {
                    n14 = 185;
                    break;
                }
                case 88: {
                    n14 = 5;
                    break;
                }
                case 89: {
                    n14 = 183;
                    break;
                }
                case 90: {
                    n14 = 248;
                    break;
                }
                case 91: {
                    n14 = 163;
                    break;
                }
                case 92: {
                    n14 = 159;
                    break;
                }
                case 93: {
                    n14 = 81;
                    break;
                }
                case 94: {
                    n14 = 59;
                    break;
                }
                case 95: {
                    n14 = 131;
                    break;
                }
                case 96: {
                    n14 = 67;
                    break;
                }
                case 97: {
                    n14 = 66;
                    break;
                }
                case 98: {
                    n14 = 84;
                    break;
                }
                case 99: {
                    n14 = 207;
                    break;
                }
                case 100: {
                    n14 = 209;
                    break;
                }
                case 101: {
                    n14 = 14;
                    break;
                }
                case 102: {
                    n14 = 167;
                    break;
                }
                case 103: {
                    n14 = 254;
                    break;
                }
                case 104: {
                    n14 = 97;
                    break;
                }
                case 105: {
                    n14 = 216;
                    break;
                }
                case 106: {
                    n14 = 141;
                    break;
                }
                case 107: {
                    n14 = 51;
                    break;
                }
                case 108: {
                    n14 = 213;
                    break;
                }
                case 109: {
                    n14 = 45;
                    break;
                }
                case 110: {
                    n14 = 39;
                    break;
                }
                case 111: {
                    n14 = 65;
                    break;
                }
                case 112: {
                    n14 = 236;
                    break;
                }
                case 113: {
                    n14 = 99;
                    break;
                }
                case 114: {
                    n14 = 47;
                    break;
                }
                case 115: {
                    n14 = 161;
                    break;
                }
                case 116: {
                    n14 = 191;
                    break;
                }
                case 117: {
                    n14 = 210;
                    break;
                }
                case 118: {
                    n14 = 136;
                    break;
                }
                case 119: {
                    n14 = 2;
                    break;
                }
                case 120: {
                    n14 = 42;
                    break;
                }
                case 121: {
                    n14 = 92;
                    break;
                }
                case 122: {
                    n14 = 219;
                    break;
                }
                case 123: {
                    n14 = 176;
                    break;
                }
                case 124: {
                    n14 = 241;
                    break;
                }
                case 125: {
                    n14 = 61;
                    break;
                }
                case 126: {
                    n14 = 21;
                    break;
                }
                case 127: {
                    n14 = 251;
                    break;
                }
                case 128: {
                    n14 = 105;
                    break;
                }
                case 129: {
                    n14 = 68;
                    break;
                }
                case 130: {
                    n14 = 203;
                    break;
                }
                case 131: {
                    n14 = 225;
                    break;
                }
                case 132: {
                    n14 = 187;
                    break;
                }
                case 133: {
                    n14 = 224;
                    break;
                }
                case 134: {
                    n14 = 180;
                    break;
                }
                case 135: {
                    n14 = 121;
                    break;
                }
                case 136: {
                    n14 = 238;
                    break;
                }
                case 137: {
                    n14 = 172;
                    break;
                }
                case 138: {
                    n14 = 72;
                    break;
                }
                case 139: {
                    n14 = 27;
                    break;
                }
                case 140: {
                    n14 = 83;
                    break;
                }
                case 141: {
                    n14 = 128;
                    break;
                }
                case 142: {
                    n14 = 139;
                    break;
                }
                case 143: {
                    n14 = 19;
                    break;
                }
                case 144: {
                    n14 = 106;
                    break;
                }
                case 145: {
                    n14 = 211;
                    break;
                }
                case 146: {
                    n14 = 113;
                    break;
                }
                case 147: {
                    n14 = 168;
                    break;
                }
                case 148: {
                    n14 = 29;
                    break;
                }
                case 149: {
                    n14 = 154;
                    break;
                }
                case 150: {
                    n14 = 142;
                    break;
                }
                case 151: {
                    n14 = 129;
                    break;
                }
                case 152: {
                    n14 = 181;
                    break;
                }
                case 153: {
                    n14 = 25;
                    break;
                }
                case 154: {
                    n14 = 28;
                    break;
                }
                case 155: {
                    n14 = 30;
                    break;
                }
                case 156: {
                    n14 = 138;
                    break;
                }
                case 157: {
                    n14 = 114;
                    break;
                }
                case 158: {
                    n14 = 150;
                    break;
                }
                case 159: {
                    n14 = 13;
                    break;
                }
                case 160: {
                    n14 = 9;
                    break;
                }
                case 161: {
                    n14 = 232;
                    break;
                }
                case 162: {
                    n14 = 147;
                    break;
                }
                case 163: {
                    n14 = 137;
                    break;
                }
                case 164: {
                    n14 = 226;
                    break;
                }
                case 165: {
                    n14 = 148;
                    break;
                }
                case 166: {
                    n14 = 109;
                    break;
                }
                case 167: {
                    n14 = 145;
                    break;
                }
                case 168: {
                    n14 = 146;
                    break;
                }
                case 169: {
                    n14 = 101;
                    break;
                }
                case 170: {
                    n14 = 169;
                    break;
                }
                case 171: {
                    n14 = 8;
                    break;
                }
                case 172: {
                    n14 = 204;
                    break;
                }
                case 173: {
                    n14 = 54;
                    break;
                }
                case 174: {
                    n14 = 123;
                    break;
                }
                case 175: {
                    n14 = 171;
                    break;
                }
                case 176: {
                    n14 = 217;
                    break;
                }
                case 177: {
                    n14 = 58;
                    break;
                }
                case 178: {
                    n14 = 173;
                    break;
                }
                case 179: {
                    n14 = 69;
                    break;
                }
                case 180: {
                    n14 = 242;
                    break;
                }
                case 181: {
                    n14 = 229;
                    break;
                }
                case 182: {
                    n14 = 38;
                    break;
                }
                case 183: {
                    n14 = 124;
                    break;
                }
                case 184: {
                    n14 = 117;
                    break;
                }
                case 185: {
                    n14 = 221;
                    break;
                }
                case 186: {
                    n14 = 190;
                    break;
                }
                case 187: {
                    n14 = 100;
                    break;
                }
                case 188: {
                    n14 = 32;
                    break;
                }
                case 189: {
                    n14 = 35;
                    break;
                }
                case 190: {
                    n14 = 63;
                    break;
                }
                case 191: {
                    n14 = 119;
                    break;
                }
                case 192: {
                    n14 = 235;
                    break;
                }
                case 193: {
                    n14 = 85;
                    break;
                }
                case 194: {
                    n14 = 50;
                    break;
                }
                case 195: {
                    n14 = 174;
                    break;
                }
                case 196: {
                    n14 = 56;
                    break;
                }
                case 197: {
                    n14 = 74;
                    break;
                }
                case 198: {
                    n14 = 118;
                    break;
                }
                case 199: {
                    n14 = 82;
                    break;
                }
                case 200: {
                    n14 = 115;
                    break;
                }
                case 201: {
                    n14 = 108;
                    break;
                }
                case 202: {
                    n14 = 16;
                    break;
                }
                case 203: {
                    n14 = 222;
                    break;
                }
                case 204: {
                    n14 = 44;
                    break;
                }
                case 205: {
                    n14 = 60;
                    break;
                }
                case 206: {
                    n14 = 126;
                    break;
                }
                case 207: {
                    n14 = 46;
                    break;
                }
                case 208: {
                    n14 = 80;
                    break;
                }
                case 209: {
                    n14 = 7;
                    break;
                }
                case 210: {
                    n14 = 130;
                    break;
                }
                case 211: {
                    n14 = 151;
                    break;
                }
                case 212: {
                    n14 = 237;
                    break;
                }
                case 213: {
                    n14 = 197;
                    break;
                }
                case 214: {
                    n14 = 243;
                    break;
                }
                case 215: {
                    n14 = 170;
                    break;
                }
                case 216: {
                    n14 = 155;
                    break;
                }
                case 217: {
                    n14 = 31;
                    break;
                }
                case 218: {
                    n14 = 26;
                    break;
                }
                case 219: {
                    n14 = 186;
                    break;
                }
                case 220: {
                    n14 = 127;
                    break;
                }
                case 221: {
                    n14 = 253;
                    break;
                }
                case 222: {
                    n14 = 245;
                    break;
                }
                case 223: {
                    n14 = 143;
                    break;
                }
                case 224: {
                    n14 = 52;
                    break;
                }
                case 225: {
                    n14 = 230;
                    break;
                }
                case 226: {
                    n14 = 175;
                    break;
                }
                case 227: {
                    n14 = 64;
                    break;
                }
                case 228: {
                    n14 = 178;
                    break;
                }
                case 229: {
                    n14 = 246;
                    break;
                }
                case 230: {
                    n14 = 6;
                    break;
                }
                case 231: {
                    n14 = 223;
                    break;
                }
                case 232: {
                    n14 = 107;
                    break;
                }
                case 233: {
                    n14 = 110;
                    break;
                }
                case 234: {
                    n14 = 239;
                    break;
                }
                case 235: {
                    n14 = 244;
                    break;
                }
                case 236: {
                    n14 = 78;
                    break;
                }
                case 237: {
                    n14 = 218;
                    break;
                }
                case 238: {
                    n14 = 188;
                    break;
                }
                case 239: {
                    n14 = 153;
                    break;
                }
                case 240: {
                    n14 = 12;
                    break;
                }
                case 241: {
                    n14 = 33;
                    break;
                }
                case 242: {
                    n14 = 156;
                    break;
                }
                case 243: {
                    n14 = 22;
                    break;
                }
                case 244: {
                    n14 = 189;
                    break;
                }
                case 245: {
                    n14 = 201;
                    break;
                }
                case 246: {
                    n14 = 73;
                    break;
                }
                case 247: {
                    n14 = 182;
                    break;
                }
                case 248: {
                    n14 = 144;
                    break;
                }
                case 249: {
                    n14 = 125;
                    break;
                }
                case 250: {
                    n14 = 206;
                    break;
                }
                case 251: {
                    n14 = 133;
                    break;
                }
                case 252: {
                    n14 = 212;
                    break;
                }
                case 253: {
                    n14 = 17;
                    break;
                }
                case 254: {
                    n14 = 10;
                    break;
                }
                default: {
                    n14 = 158;
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
            FN.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x74E0;
        if (d[n11] == null) {
            FN.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

