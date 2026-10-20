/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.KD;
import com._y_0;
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.JXList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class FK
extends JDialog
implements kn_0 {
    protected FT H;
    protected tq_2 s;
    JScrollPane lC;
    JScrollPane W;
    String l9;
    int lV;
    boolean T;
    boolean N;
    String lU;
    boolean a;
    Dimension q;
    _y_0 o;
    boolean u;
    String h;
    boolean L;
    boolean b;
    boolean i;
    int ll;
    int Y;
    protected dv_0 lD;
    protected dv_0 Z;
    protected KD j;
    long V;
    long g;
    boolean d;
    static JDialog C;
    static JFrame S;
    boolean lx;
    boolean lF;
    boolean B;
    long l_;
    boolean lQ;
    boolean l;
    F_ x;
    protected JPanel I;
    boolean O;
    boolean m;
    boolean p;
    ws_0 X;
    int k;
    long f;
    boolean P;
    boolean n;
    Window c;
    JPanel U;
    boolean t;
    boolean F;
    protected KD A;
    protected du_0 v;
    public long R;
    protected JXList l1;
    boolean w;
    boolean lz;
    us_1 z;
    int l2;
    int J;
    int lI;
    fg_2 r;
    protected boolean E;
    int e;
    protected boolean M;
    protected MouseListener y;
    int Q;
    int lT;
    int lj;
    boolean K;
    AWTEventListener D;
    private static String[] G;
    private static final String[] ab;
    private static final String[] bb;
    private static final long[] eb;
    private static final Integer[] fb;
    private static final long[] ib;
    private static final Long[] jb;

    public int R() {
        return this.Q;
    }

    public int b() {
        return this.l2;
    }

    public void c(int n10) {
        this.l2 = n10;
    }

    public void S(int n10) {
        this.Q = n10;
    }

    public void e(int n10, int n11) {
        this.Y = n10;
        this.ll = n11;
        this.setSize(this.Y, n11);
    }

    public FK(dv_0 dv_02, boolean bl, boolean bl2) {
        this(dv_02, true, false, bl, bl2, false, true);
        try {
            this.r.e(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public FK(dv_0 dv_02, boolean bl) {
        this(dv_02, true, false, bl, false, false, false);
    }

    public FK(dv_0 dv_02, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.l9 = FK.a(16020, -21725);
        this.lV = 0;
        this.T = false;
        String[] stringArray = FK.i();
        this.N = false;
        this.lU = FK.a(16031, 11145);
        this.a = false;
        this.q = null;
        String[] stringArray2 = stringArray;
        this.u = false;
        this.h = "";
        this.L = true;
        this.b = false;
        this.i = false;
        this.ll = FK.a(6992, 4475965135867929457L);
        this.Y = FK.a(18718, 5887525620647211316L);
        this.V = FK.c(14216, 5971579523824780468L);
        this.d = false;
        this.lx = true;
        this.lF = true;
        this.B = true;
        this.lQ = true;
        this.l = false;
        this.m = false;
        this.p = true;
        this.P = true;
        this.n = false;
        this.t = true;
        this.w = false;
        this.lz = false;
        this.E = false;
        this.e = -1;
        this.M = false;
        this.lT = 0;
        this.lj = 0;
        this.K = false;
        this.lz = bl6;
        this.w = bl5;
        this.F = bl4;
        this.t = bl3;
        this.lQ = bl;
        this.l = bl2;
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.lD = dv_02;
        this.I = new JPanel();
        ((JPanel)this.I).setOpaque(false);
        ((JPanel)this.I).setLayout(new MigLayout(FK.a(16003, 26023), FK.a(16006, 13141), FK.a(16006, 13141)));
        boolean bl7 = bl4;
        if (stringArray2 == null) {
            if (bl7) {
                this.A = new KD(FK.a(16018, -2541));
                ((JPanel)this.I).add((KD)this.A);
            }
            bl7 = bl2;
        }
        if (stringArray2 == null) {
            if (!bl7) {
                this.j = new KD(FK.a(16026, -2173));
                try {
                    this.E();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JPanel)this.I).add((KD)this.j);
                ((KD)this.j).setFocusable(false);
                ((dv_0)this.lD).z((JPanel)this.I);
                ((KD)this.j).addActionListener(new Y2(this));
            }
            this.Z = new dv_0();
            ((dv_0)this.Z).setFocusTraversalKeysEnabled(false);
            ((dv_0)this.Z).P(FK.a(16004, 16257));
            ((dv_0)this.Z).setBackground(new Color(FK.a(1943, 7724657239105241015L), FK.a(20834, 7837820692826401092L), FK.a(20834, 7837820692826401092L)));
            try {
                bl7 = (Boolean)YJ.o(this.Z);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        ((dv_0)this.Z).getDocument().addDocumentListener(new dh_1(this));
        this.addWindowFocusListener(new tp_1(this));
        this.setFocusable(true);
        this.setAlwaysOnTop(true);
        ((dv_0)this.Z).addKeyListener(new xS(this, bl5));
        ((dv_0)this.lD).addKeyListener(new B7(this, bl2));
        this.setSize(new Dimension(this.Y, this.ll));
        try {
            this.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.lV = ((dv_0)this.lD).getCaretPosition();
        if (ky_2.F() != null) {
            FK.J(new String[4]);
        }
    }

    public void M() {
    }

    public boolean A() {
        long l2 = System.currentTimeMillis() - this.R;
        String[] stringArray = FK.i();
        long l3 = l2 - FK.c(27856, 3916665113666379759L);
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (stringArray == null) {
            if (l4 > 0) {
                return false;
            }
            l4 = 1;
        }
        return (boolean)l4;
    }

    void k() {
        String string = ((dv_0)this.Z).getText().trim();
        if (string.length() == 0) {
            ((dv_0)this.Z).z((JComponent)null);
        }
    }

    public void E() {
        block3: {
            KD kD;
            block2: {
                String[] stringArray = FK.i();
                ((KD)this.j).setBorder(BorderFactory.createEmptyBorder(3, FK.a(3236, 442276457065936006L), 3, FK.a(19468, 6577395818337842219L)));
                String[] stringArray2 = stringArray;
                kD = (KD)this.A;
                if (stringArray2 != null) break block2;
                if (kD == null) break block3;
                kD = (KD)this.A;
            }
            kD.setBorder(BorderFactory.createEmptyBorder(3, FK.a(19468, 6577395818337842219L), 3, FK.a(19468, 6577395818337842219L)));
        }
    }

    public abstract boolean p(L1 var1);

    protected abstract dx_2 k();

    protected abstract dx_2 n();

    protected abstract void L(String var1);

    protected abstract void k(L1 var1);

    protected abstract void i(L1 var1, int var2);

    protected abstract void u(KeyEvent var1);

    protected abstract String c();

    void v() {
        String[] stringArray = FK.i();
        this.lT = 0;
        String[] stringArray2 = stringArray;
        this.lj = 0;
        if ((us_1)this.z != null) {
            int n10 = 0;
            do {
                Component component;
                L1 l1;
                int n11;
                try {
                    n11 = (Integer)this.v.getSize();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (n10 >= n11) break;
                try {
                    l1 = (L1)this.v.Z(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                L1 l12 = l1;
                try {
                    component = (Component)this.z.getListCellRendererComponent(this.l1, (Object)l12, n10, false, false);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                Component component2 = component;
                Dimension dimension = component2.getPreferredSize();
                this.lT = Math.max(dimension.width, this.lT);
                this.lj = dimension.height;
                ++n10;
            } while (stringArray2 == null);
        }
    }

    public void a(int n10) {
        block5: {
            us_1 us_12;
            block4: {
                String[] stringArray = FK.i();
                us_12 = (us_1)this.z;
                if (stringArray != null) break block4;
                if (us_12 == null) break block5;
                us_12 = (us_1)this.z;
            }
            try {
                us_12.n(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public Rectangle S() {
        Rectangle rectangle;
        int n10;
        String[] stringArray;
        int n11;
        block59: {
            int n12;
            block57: {
                Rectangle rectangle2;
                Point point;
                block58: {
                    boolean bl;
                    block47: {
                        int n13;
                        int n14;
                        block56: {
                            int n15;
                            block55: {
                                int n16;
                                block40: {
                                    int n17;
                                    block54: {
                                        int n18;
                                        block52: {
                                            int n19;
                                            block53: {
                                                float f10;
                                                int n20;
                                                block51: {
                                                    block50: {
                                                        int n21;
                                                        block48: {
                                                            block49: {
                                                                int n22;
                                                                int n23;
                                                                block41: {
                                                                    block42: {
                                                                        block46: {
                                                                            int n24;
                                                                            block45: {
                                                                                int n25;
                                                                                block43: {
                                                                                    block44: {
                                                                                        String[] stringArray2 = FK.i();
                                                                                        try {
                                                                                            this.v();
                                                                                        }
                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                            throw invocationTargetException.getTargetException();
                                                                                        }
                                                                                        n11 = 0;
                                                                                        stringArray = stringArray2;
                                                                                        n10 = 0;
                                                                                        n23 = this.w;
                                                                                        if (stringArray != null) break block41;
                                                                                        if (n23 != 0) break block42;
                                                                                        n19 = ((tq_2)this.s).getRowHeight() * ((tq_2)this.s).getRowCount();
                                                                                        n19 = ((tq_2)com.c.c((long)618427502576624312L).get((Object)this)).getPreferredSize().height;
                                                                                        n17 = FK.a(19468, 6577395818337842219L);
                                                                                        n20 = ((tq_2)this.s).getRowHeight();
                                                                                        n24 = n11 = n19 + ((JPanel)com.c.c((long)529887570589696401L).get((Object)this)).getPreferredSize().height + 2;
                                                                                        n25 = this.ll;
                                                                                        if (stringArray != null) break block43;
                                                                                        if (n24 <= n25) break block44;
                                                                                        n11 = this.ll;
                                                                                        if (stringArray == null) break block45;
                                                                                    }
                                                                                    n24 = n11;
                                                                                    if (stringArray != null) break block46;
                                                                                    n25 = n20;
                                                                                }
                                                                                if (n24 < n25) {
                                                                                    n11 = n20;
                                                                                }
                                                                            }
                                                                            n24 = n10 = this.getWidth();
                                                                        }
                                                                        if (stringArray == null) break block47;
                                                                    }
                                                                    n10 = 0;
                                                                    n23 = 3;
                                                                }
                                                                n19 = n23;
                                                                n17 = 1;
                                                                try {
                                                                    n22 = (Integer)this.v.getSize();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                n20 = n22;
                                                                this.J = 1;
                                                                n21 = n20;
                                                                if (stringArray != null) break block48;
                                                                if (n21 >= this.l2) break block49;
                                                                this.lI = n20;
                                                                if (stringArray == null) break block50;
                                                            }
                                                            this.lI = this.l2;
                                                            this.J = n20 / this.l2;
                                                            n21 = n20;
                                                        }
                                                        float f11 = (float)n21 % (float)this.l2;
                                                        float f12 = f11 - 0.0f;
                                                        f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                                        if (stringArray != null) break block51;
                                                        if (f10 > 0) {
                                                            FK fK2 = this;
                                                            fK2.J = fK2.J + 1;
                                                        }
                                                    }
                                                    f10 = this.lj;
                                                }
                                                float f13 = f10;
                                                int n26 = this.lI * f13;
                                                n11 = n26 + ((JPanel)com.c.c((long)529887570589696401L).get((Object)this)).getPreferredSize().height + 5;
                                                n18 = n20;
                                                if (stringArray == null) {
                                                    if (n18 == 0) {
                                                        n11 = ((JPanel)com.c.c((long)529887570589696401L).get((Object)this)).getPreferredSize().height;
                                                    }
                                                    n18 = this.J;
                                                }
                                                if (stringArray != null) break block52;
                                                if (n18 > n19) break block53;
                                                n17 = this.J;
                                                if (stringArray == null) break block54;
                                            }
                                            n18 = n19;
                                        }
                                        n17 = n18;
                                    }
                                    int n27 = 5;
                                    int n28 = n17 * this.lT + n27;
                                    int n29 = 0;
                                    n16 = 0;
                                    while (n16 < this.J) {
                                        n14 = (n16 + 1) * this.lT;
                                        if (stringArray == null) {
                                            n13 = n14;
                                            n15 = this.Q;
                                            if (stringArray != null) break block40;
                                            if (n13 < n15) {
                                                n29 = (n16 + 1) * this.lT + n27;
                                            }
                                            ++n16;
                                        }
                                        if (stringArray == null) continue;
                                    }
                                    n10 = Math.max(n28, n29);
                                    n16 = FK.a(5099, 1851954059984038851L);
                                    n13 = n10;
                                    n15 = n16;
                                }
                                if (stringArray == null) {
                                    if (n13 < n15) {
                                        n10 = n16;
                                    }
                                    n13 = this.J * this.lT;
                                    n15 = n10;
                                }
                                if (stringArray != null) break block55;
                                if (n13 > n15) {
                                    n11 += 10;
                                }
                                n13 = n10;
                                if (stringArray != null) break block56;
                                n15 = ((JPanel)com.c.c((long)529887570589696401L).get((Object)this)).getPreferredSize().width;
                            }
                            if (n13 < n15) {
                                n10 = ((JPanel)com.c.c((long)529887570589696401L).get((Object)this)).getPreferredSize().width;
                            }
                            n13 = 0;
                        }
                        n14 = n13;
                        int n30 = this.lT;
                        ((JScrollPane)this.W).getHorizontalScrollBar().setUnitIncrement(FK.a(6756, 5967544358542991949L));
                    }
                    point = ((dv_0)this.lD).getLocationOnScreen();
                    rectangle2 = rectangle = new Rectangle();
                    n12 = point.x;
                    if (stringArray != null) break block57;
                    rectangle2.x = n12;
                    try {
                        bl = (Boolean)this.x();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block58;
                    rectangle.y = point.y + ((dv_0)this.lD).getHeight();
                    if (stringArray == null) break block59;
                }
                rectangle2 = rectangle;
                n12 = point.y - n11;
            }
            rectangle2.y = n12;
        }
        rectangle.width = n10;
        Rectangle rectangle3 = rectangle;
        if (stringArray == null) {
            rectangle3.height = n11;
            if (this.p) {
                rectangle.x += ((dv_0)this.lD).getWidth() - this.getWidth();
            }
            rectangle3 = rectangle;
        }
        return rectangle3;
    }

    /*
     * Unable to fully structure code
     */
    public void l() {
        block35: {
            block34: {
                block33: {
                    var1_1 = FK.i();
                    try {
                        v0 = ((Boolean)this.x()).booleanValue();
                    }
                    catch (InvocationTargetException v1) {
                        throw v1.getTargetException();
                    }
                    if (var1_1 != null) ** GOTO lbl41
                    if (v0 != 0) ** GOTO lbl-1000
                    v0 = ((tq_2)this.s).getRowCount();
                    if (var1_1 != null) break block33;
                    if (v0 > 0) {
                        var2_2 = ((tq_2)this.s).getRowCount() - 1;
                        try {
                            v2 = (dx_2)this.n();
                        }
                        catch (InvocationTargetException v3) {
                            throw v3.getTargetException();
                        }
                        var3_3 = v2;
                        if (var1_1 == null) {
                            if (var3_3 != null) {
                                try {
                                    v4 = (ArrayList)var3_3.V();
                                }
                                catch (InvocationTargetException v5) {
                                    throw v5.getTargetException();
                                }
                                var2_2 -= v4.size();
                            }
                            ((tq_2)this.s).getSelectionModel().setSelectionInterval(var2_2, var2_2);
                            try {
                                this.s.scrollRectToVisible(new Rectangle(((tq_2)this.s).getCellRect(var2_2, 0, true)));
                            }
                            catch (InvocationTargetException v6) {
                                throw v6.getTargetException();
                            }
                        }
                        ** if (var1_1 == null) goto lbl-1000
                    }
                    ** GOTO lbl-1000
lbl-1000:
                    // 2 sources

                    {
                        v0 = ((tq_2)this.s).getRowCount();
lbl41:
                        // 2 sources

                        if (var1_1 == null) {
                            if (v0 > 0) {
                                var2_2 = 0;
                                try {
                                    v7 = (dx_2)this.n();
                                }
                                catch (InvocationTargetException v8) {
                                    throw v8.getTargetException();
                                }
                                var3_3 = v7;
                                if (var1_1 == null) {
                                    if (var3_3 != null) {
                                        try {
                                            v9 = (ArrayList)var3_3.V();
                                        }
                                        catch (InvocationTargetException v10) {
                                            throw v10.getTargetException();
                                        }
                                        var2_2 += v9.size();
                                    }
                                    ((tq_2)this.s).getSelectionModel().setSelectionInterval(var2_2, var2_2);
                                }
                                try {
                                    this.s.scrollRectToVisible(new Rectangle(((tq_2)this.s).getCellRect(var2_2, 0, true)));
                                }
                                catch (InvocationTargetException v11) {
                                    throw v11.getTargetException();
                                }
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                        ** GOTO lbl70
                    }
lbl-1000:
                    // 5 sources

                    {
                        v0 = 0;
                    }
                }
                var2_2 = v0;
                v12 = this;
                if (var1_1 == null) {
                    try {
                        v13 = (Integer)v12.v.getSize();
                    }
                    catch (InvocationTargetException v14) {
                        throw v14.getTargetException();
                    }
                    if (v13 > 0) {
                        ((JXList)this.l1).setSelectedIndex(var2_2);
                    }
                    v12 = this;
                }
                v15 = (JXList)v12.l1;
                if (var1_1 != null) break block34;
                if (v15.getCellBounds(var2_2, var2_2) == null) break block35;
                v15 = (JXList)this.l1;
            }
            v15.scrollRectToVisible(((JXList)this.l1).getCellBounds(var2_2, var2_2));
        }
    }

    public void f() {
        block25: {
            Rectangle rectangle;
            FK fK2;
            int n10;
            block26: {
                block27: {
                    block30: {
                        int n11;
                        block31: {
                            int n12;
                            String[] stringArray;
                            block28: {
                                block29: {
                                    int n13;
                                    int n14;
                                    block21: {
                                        block22: {
                                            int n15;
                                            block23: {
                                                block24: {
                                                    stringArray = FK.i();
                                                    n14 = this.w;
                                                    if (stringArray != null) break block21;
                                                    if (n14 != 0) break block22;
                                                    try {
                                                        n15 = ((Boolean)this.x()).booleanValue();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (stringArray != null) break block23;
                                                    if (n15 != 0) break block24;
                                                    n10 = ((tq_2)this.s).getSelectedRow();
                                                    --n10;
                                                    if (stringArray == null) {
                                                        if (n10 < 0) {
                                                            n10 = ((tq_2)this.s).getRowCount() - 1;
                                                        }
                                                        ((tq_2)this.s).getSelectionModel().setSelectionInterval(n10, n10);
                                                        try {
                                                            this.s.scrollRectToVisible(new Rectangle(((tq_2)this.s).getCellRect(n10, 0, true)));
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                    if (stringArray == null) break block25;
                                                }
                                                n15 = ((tq_2)this.s).getSelectedRow();
                                            }
                                            n10 = n15;
                                            int n16 = --n10;
                                            if (stringArray == null) {
                                                if (n16 < 0) {
                                                    try {
                                                        this.o();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    return;
                                                }
                                                n16 = n10;
                                            }
                                            if (stringArray == null) {
                                                if (n16 < 0) {
                                                    n10 = ((tq_2)this.s).getRowCount() - 1;
                                                }
                                                ((tq_2)this.s).getSelectionModel().setSelectionInterval(n10, n10);
                                                n16 = n10;
                                            }
                                            int n17 = n16;
                                            ((JComponent)((tq_2)this.s).getParent().getParent()).scrollRectToVisible(new Rectangle(0, 0, 0, 0));
                                            ((JComponent)((tq_2)this.s).getParent()).scrollRectToVisible(new Rectangle(0, 0, 0, 0));
                                            try {
                                                this.s.scrollRectToVisible(new Rectangle(0, 0, 0, 0));
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (stringArray == null) break block25;
                                        }
                                        n14 = 0;
                                    }
                                    n10 = n14;
                                    fK2 = this;
                                    if (stringArray != null) break block26;
                                    try {
                                        n13 = (Integer)fK2.v.getSize();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (n13 <= 0) break block27;
                                    n11 = n10 = ((JXList)this.l1).getSelectedIndex();
                                    if (stringArray != null) break block28;
                                    if (n11 != -1) break block29;
                                    n10 = 0;
                                    if (stringArray == null) break block30;
                                }
                                n11 = --n10;
                            }
                            if (stringArray != null) break block31;
                            if (n11 >= 0) break block30;
                            try {
                                n12 = (Integer)this.v.getSize();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            n11 = n12 - 1;
                        }
                        n10 = n11;
                    }
                    ((JXList)this.l1).setSelectedIndex(n10);
                }
                fK2 = this;
            }
            if ((rectangle = ((JXList)fK2.l1).getCellBounds(n10, n10)) != null) {
                ((JXList)this.l1).scrollRectToVisible(rectangle);
            }
        }
    }

    public void Y() {
        block15: {
            int n10;
            block19: {
                block18: {
                    int n11;
                    int n12;
                    block16: {
                        int n13;
                        String[] stringArray;
                        block17: {
                            int n14;
                            block11: {
                                block12: {
                                    int n15;
                                    block13: {
                                        block14: {
                                            stringArray = FK.i();
                                            n14 = this.w;
                                            if (stringArray != null) break block11;
                                            if (n14 != 0) break block12;
                                            try {
                                                n15 = ((Boolean)this.x()).booleanValue();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (stringArray != null) break block13;
                                            if (n15 != 0) break block14;
                                            n10 = ((tq_2)this.s).getSelectedRow();
                                            if (++n10 <= ((tq_2)this.s).getRowCount() - 1) {
                                                ((tq_2)this.s).getSelectionModel().setSelectionInterval(n10, n10);
                                            }
                                            try {
                                                this.s.scrollRectToVisible(new Rectangle(((tq_2)this.s).getCellRect(n10, 0, true)));
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (stringArray == null) break block15;
                                        }
                                        n15 = ((tq_2)this.s).getSelectedRow();
                                    }
                                    n10 = n15;
                                    ((tq_2)this.s).getSelectionModel().setSelectionInterval(++n10, n10);
                                    try {
                                        this.s.scrollRectToVisible(new Rectangle(((tq_2)this.s).getCellRect(n10, 0, true)));
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (stringArray == null) break block15;
                                }
                                n14 = ((JXList)this.l1).getSelectedIndex();
                            }
                            n12 = n10 = n14;
                            n11 = -1;
                            if (stringArray != null) break block16;
                            if (n12 != n11) break block17;
                            n10 = 0;
                            if (stringArray == null) break block18;
                        }
                        ++n10;
                        if (stringArray != null) break block19;
                        n12 = n10;
                        try {
                            n13 = (Integer)this.v.getSize();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n11 = n13 - 1;
                    }
                    if (n12 > n11) {
                        n10 = 0;
                    }
                }
                ((JXList)this.l1).setSelectedIndex(n10);
            }
            ((JXList)this.l1).scrollRectToVisible(((JXList)this.l1).getCellBounds(n10, n10));
        }
    }

    public boolean v() {
        boolean bl;
        block13: {
            boolean bl2;
            block12: {
                FK fK2;
                String[] stringArray;
                block11: {
                    bl2 = false;
                    stringArray = FK.i();
                    try {
                        fK2 = (FK)this.lD.u();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray != null) break block11;
                    if (fK2 != null) {
                        try {
                            fK2 = (FK)this.lD.u();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block12;
                }
                bl = fK2.equals(this);
                if (stringArray != null) break block13;
                if (!bl) {
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public void Q() {
        SwingUtilities.invokeLater(new a5(this));
    }

    protected void z() {
        FK fK2;
        block44: {
            boolean bl;
            block43: {
                String[] stringArray;
                block39: {
                    block42: {
                        FK fK3;
                        block40: {
                            block41: {
                                int n10;
                                block35: {
                                    block36: {
                                        FK fK4;
                                        block37: {
                                            block38: {
                                                Rectangle rectangle;
                                                String[] stringArray2 = FK.i();
                                                this.e = ((dv_0)this.lD).getCaretPosition();
                                                stringArray = stringArray2;
                                                FK fK5 = this;
                                                if (stringArray == null) {
                                                    if (fK5.V <= 0L || System.currentTimeMillis() - this.V < FK.c(16215, 8781237576104741993L)) {
                                                        // empty if block
                                                    }
                                                    this.f = System.currentTimeMillis();
                                                    this.g = System.currentTimeMillis();
                                                    try {
                                                        this.t();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    fK5 = this;
                                                }
                                                try {
                                                    rectangle = (Rectangle)fK5.S();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                Rectangle rectangle2 = rectangle;
                                                this.setBounds(rectangle2);
                                                n10 = this.isVisible();
                                                if (stringArray == null) {
                                                    if (n10 == 0) {
                                                        ((tq_2)this.s).clearSelection();
                                                        try {
                                                            this.setVisible(true);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        FK fK6 = this;
                                                        if (stringArray == null) {
                                                            if (!fK6.w) {
                                                                try {
                                                                    this.l();
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                            }
                                                            fK6 = this;
                                                        }
                                                        try {
                                                            lk_0.F(fK6);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                    try {
                                                        this.lD.A(this);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    n10 = this.w ? 1 : 0;
                                                }
                                                if (stringArray != null) break block35;
                                                if (n10 != 0) break block36;
                                                fK4 = this;
                                                if (stringArray != null) break block37;
                                                if (((tq_2)fK4.s).getRowCount() <= 0) break block38;
                                                ((ws_0)this.X).add((JScrollPane)this.lC, (String)this.l9, 0);
                                                if (stringArray == null) break block39;
                                            }
                                            fK4 = this;
                                        }
                                        ((ws_0)fK4.X).remove((JScrollPane)this.lC);
                                        if (stringArray == null) break block39;
                                    }
                                    fK3 = this;
                                    if (stringArray == null) {
                                        try {
                                            n10 = (Integer)fK3.v.getSize();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                    }
                                    break block40;
                                }
                                if (n10 <= 0) break block41;
                                ((ws_0)this.X).add((JScrollPane)this.W, (String)this.l9, 0);
                                if (stringArray == null) break block42;
                            }
                            fK3 = this;
                        }
                        ((ws_0)fK3.X).remove((JScrollPane)this.W);
                    }
                    try {
                        bl = (Boolean)lk_0.Y(((dv_0)this.Z).getText());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray != null) break block43;
                    if (bl) {
                        ((JXList)this.l1).clearSelection();
                    }
                }
                this.validate();
                this.doLayout();
                fK2 = this;
                if (stringArray != null) break block44;
                bl = fK2.K;
            }
            if (!bl) {
                ((dv_0)this.Z).setText("");
            }
            fK2 = this;
        }
        fK2.K = false;
        Rectangle rectangle = new Rectangle();
        ((JXList)this.l1).scrollRectToVisible(rectangle);
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
    }

    public void t() {
        block11: {
            JScrollBar jScrollBar;
            int n10;
            block9: {
                int n11;
                block10: {
                    n11 = ((tq_2)this.s).getRowCount() - 1;
                    String[] stringArray = FK.i();
                    try {
                        n10 = ((Boolean)this.x()).booleanValue();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray != null) break block9;
                    if (n10 != 0) break block10;
                    if (n11 > -1) {
                        try {
                            this.s.scrollRectToVisible(new Rectangle(((tq_2)this.s).getCellRect(n11, 0, true)));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    jScrollBar = ((JScrollPane)this.lC).getVerticalScrollBar();
                    jScrollBar.setValue(jScrollBar.getMaximum());
                    if (stringArray == null) break block11;
                }
                n10 = n11;
            }
            if (n10 > -1) {
                try {
                    this.s.scrollRectToVisible(new Rectangle(0, 0));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            jScrollBar = ((JScrollPane)this.lC).getVerticalScrollBar();
            jScrollBar.setValue(0);
        }
    }

    public void o() {
        SwingUtilities.invokeLater(new V0(this));
    }

    public void q() {
        String[] stringArray = FK.i();
        this.i = false;
        String[] stringArray2 = stringArray;
        FK fK2 = this;
        if (stringArray2 == null) {
            if (fK2.isVisible()) {
                SwingUtilities.invokeLater(new O9(this));
                this.u = false;
            }
            fK2 = this;
        }
        try {
            fK2.lD.A(null);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void b(KeyEvent keyEvent, byte[] byArray) {
        DI dI = ((_y_0)this.o).s().e();
        if (dI.t()) {
            ((_y_0)this.o).O().processKeyEvent(keyEvent);
        }
    }

    void N() {
        FK fK2;
        String[] stringArray;
        block27: {
            boolean bl;
            block26: {
                Object object;
                Object object2;
                Object object3;
                boolean bl2;
                stringArray = FK.i();
                try {
                    bl2 = (Boolean)vk_0.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (bl2) {
                    // empty if block
                }
                this.X = new ws_0();
                ((ws_0)this.X).setLayout(new MigLayout(FK.a(16025, -9666), FK.a(16028, -8861), FK.a(16021, -5547)));
                this.setContentPane((ws_0)this.X);
                ((ws_0)this.X).setBorder(BorderFactory.createLineBorder(new Color(FK.a(27725, 8010486425011491944L), FK.a(19523, 7945128525104854120L), FK.a(19523, 7945128525104854120L))));
                this.H = new FT();
                this.s = new tq_2((FT)this.H, this.t);
                ((tq_2)this.s).setOpaque(false);
                try {
                    this.s.R(this);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.r = new fg_2();
                try {
                    this.r.h(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((tq_2)this.s).setDefaultRenderer(Object.class, (fg_2)this.r);
                ((tq_2)this.s).addMouseListener(new lk_2(this));
                ((tq_2)this.s).getSelectionModel().addListSelectionListener(new gW(this));
                og_1 og_12 = new og_1();
                try {
                    object3 = this.s.K();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    og_12.n(this.s, object3);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object2 = lk_0.D(og_12);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.lC = object2;
                ((JScrollPane)this.lC).setOpaque(false);
                ((JScrollPane)this.lC).getViewport().setOpaque(false);
                ((JScrollPane)this.lC).setAutoscrolls(true);
                this.l1 = new JXList();
                ((JXList)this.l1).setFocusable(false);
                ((JXList)this.l1).setSelectionMode(0);
                ((JXList)this.l1).addComponentListener(new UF(this));
                this.z = new us_1();
                ((JXList)this.l1).setCellRenderer((ListCellRenderer)((us_1)this.z));
                ((JXList)this.l1).setAutoscrolls(true);
                ((JXList)this.l1).setLayoutOrientation(1);
                this.v = new du_0();
                ((JXList)this.l1).setModel((ListModel)((du_0)this.v));
                try {
                    this.v.k(new L1(FK.a(16030, 22656), FK.a(16029, 18042)));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.y = new QH(this);
                ((JXList)this.l1).addMouseListener(new a8(this));
                ((JXList)this.l1).addMouseListener((MouseListener)this.y);
                try {
                    object = lk_0.r(this.l1);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.W = object;
                ((JScrollPane)this.W).setOpaque(false);
                ((JScrollPane)this.W).getViewport().setOpaque(false);
                ((JScrollPane)this.W).setAutoscrolls(true);
                ((JScrollPane)this.W).getVerticalScrollBar().addAdjustmentListener(new n2(this, og_12));
                this.U = new JPanel();
                ((JPanel)this.U).setLayout(new MigLayout(FK.a(16003, 26023), FK.a(16024, -31418), FK.a(16022, 22913)));
                ((ws_0)this.X).add((Component)((JPanel)this.U), FK.a(16023, 5504));
                JPanel jPanel = new JPanel();
                jPanel.setLayout(new MigLayout(FK.a(16005, -8978), FK.a(16006, 13141), FK.a(16016, 29455)));
                JButton jButton = new JButton(FK.a(16027, 26779));
                bl = this.t;
                if (stringArray != null) break block26;
                if (bl) {
                    JPanel jPanel2 = (JPanel)this.U;
                    if (stringArray == null) {
                        jPanel2.add((Component)jPanel, FK.a(16002, 9238));
                        if (this.lz) {
                            JLabel jLabel = new JLabel(FK.a(16001, -10314));
                            jLabel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                            jPanel.add(jLabel);
                        }
                        jPanel2 = jPanel;
                    }
                    jPanel2.add((Component)jButton, FK.a(16017, -27024));
                }
                jButton.addActionListener(new ol_0(this));
                jPanel.add((Component)new JLabel(), FK.a(16019, 17404));
                fK2 = this;
                if (stringArray != null) break block27;
                bl = fK2.lQ;
            }
            if (bl) {
                ((JPanel)this.U).add((Component)((dv_0)this.Z), FK.a(16000, -18337));
            }
            try {
                this.Z();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((dv_0)this.lD).setFocusTraversalKeys(0, Collections.EMPTY_SET);
            ((dv_0)this.Z).getDocument().addDocumentListener(new xa_0(this));
            fK2 = this;
        }
        fK2.D = new kt_1(this);
        if (stringArray != null) {
            ky_2.K(new String[4]);
        }
    }

    @Override
    public void c(L1 l1, int n10) {
        Object object;
        try {
            object = this.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.C(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.i((Object)l1, n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void D() {
        Toolkit.getDefaultToolkit().removeAWTEventListener((AWTEventListener)this.D);
        try {
            this.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.dispose();
    }

    void C() {
        block6: {
            int n10;
            block5: {
                String[] stringArray = FK.i();
                n10 = this.isVisible();
                if (stringArray != null) break block5;
                if (n10 == 0) break block6;
                try {
                    this.o();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                n10 = ((tq_2)this.s).getSelectedRow();
            }
            if (n10 > -1) {
                // empty if block
            }
            this.L = false;
        }
    }

    int b(String string, ArrayList arrayList) {
        int n10;
        block9: {
            int n11;
            String[] stringArray;
            ArrayList<String> arrayList2;
            block8: {
                arrayList2 = new ArrayList<String>();
                Pattern pattern = Pattern.compile((String)this.lU);
                stringArray = FK.i();
                Matcher matcher = pattern.matcher(string);
                while (matcher.find()) {
                    String string2 = matcher.group();
                    n11 = arrayList2.add(string2);
                    if (stringArray == null) {
                        if (stringArray == null) continue;
                    }
                    break block8;
                }
                n11 = 0;
            }
            int n12 = n11;
            HashSet<String> hashSet = new HashSet<String>();
            HashSet<String> hashSet2 = new HashSet<String>();
            for (String string3 : arrayList) {
                block10: {
                    boolean bl;
                    boolean bl2 = false;
                    n10 = hashSet.contains(string3) ? 1 : 0;
                    if (stringArray != null) break block9;
                    if (n10 != 0) break block10;
                    for (String string4 : arrayList2) {
                        block12: {
                            block13: {
                                boolean bl3;
                                block11: {
                                    bl = string4.contains(string3);
                                    if (stringArray != null) break block10;
                                    if (stringArray != null) break block11;
                                    if (!bl) break block12;
                                    bl2 = true;
                                    bl3 = hashSet2.contains(string4);
                                }
                                if (stringArray != null) break block13;
                                if (bl3) break block12;
                                ++n12;
                                bl3 = hashSet2.add(string4);
                            }
                            if (stringArray == null) break;
                        }
                        if (stringArray == null) continue;
                    }
                    bl = hashSet.add(string3);
                }
                if (stringArray == null) continue;
            }
            n10 = n12;
        }
        return n10;
    }

    protected void u() {
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public synchronized void Z() {
        block127: {
            block115: {
                block126: {
                    block114: {
                        block117: {
                            block116: {
                                block112: {
                                    block111: {
                                        block110: {
                                            try {
                                                this.H.g();
                                            }
                                            catch (InvocationTargetException v0) {
                                                throw v0.getTargetException();
                                            }
                                            try {
                                                v1 = (dx_2)this.k();
                                            }
                                            catch (InvocationTargetException v2) {
                                                throw v2.getTargetException();
                                            }
                                            var2_1 = v1;
                                            try {
                                                v3 = (ArrayList)var2_1.V();
                                            }
                                            catch (InvocationTargetException v4) {
                                                throw v4.getTargetException();
                                            }
                                            var3_2 = v3;
                                            var1_3 = FK.i();
                                            try {
                                                v5 = (String)this.c();
                                            }
                                            catch (InvocationTargetException v6) {
                                                throw v6.getTargetException();
                                            }
                                            var4_4 = v5.toLowerCase();
                                            if (!this.lF) {
                                                var4_4 = "";
                                            }
                                            var5_5 = new ArrayList<String>();
                                            var6_6 = Pattern.compile((String)this.lU);
                                            var7_7 = var6_6.matcher(var4_4);
                                            while (var7_7.find()) {
                                                var8_8 = var7_7.group();
                                                var5_5.add(var8_8);
                                                if (var1_3 == null) {
                                                    if (var1_3 == null) continue;
                                                }
                                                break block110;
                                            }
                                            var8_8 = var4_4;
                                        }
                                        if ((var9_9 = var4_4.indexOf(" ")) > -1) {
                                            var8_8 = var4_4.substring(0, var9_9);
                                        }
                                        var10_10 = new HashSet<E>();
                                        for (Object var12_13 : var3_2) {
                                            try {
                                                v7 = (String)var12_13.A();
                                            }
                                            catch (InvocationTargetException v8) {
                                                throw v8.getTargetException();
                                            }
                                            try {
                                                v9 = (Integer)this.b((Object)v7.toLowerCase(), var5_5);
                                            }
                                            catch (InvocationTargetException v10) {
                                                throw v10.getTargetException();
                                            }
                                            var13_17 = v9;
                                            v11 = var12_13;
                                            if (var1_3 != null) break block111;
                                            try {
                                                v11.x(var13_17);
                                            }
                                            catch (InvocationTargetException v12) {
                                                throw v12.getTargetException();
                                            }
                                            if (var1_3 == null) continue;
                                        }
                                        v11 = var3_2.clone();
                                    }
                                    var11_12 = (ArrayList)v11;
                                    try {
                                        this.s(var11_12);
                                    }
                                    catch (InvocationTargetException v13) {
                                        throw v13.getTargetException();
                                    }
                                    var12_13 = new ArrayList<E>();
                                    var13_18 = var11_12.iterator();
                                    while (var13_18.hasNext()) {
                                        var14_19 = (L1)var13_18.next();
                                        try {
                                            v14 = (String)var14_19.A();
                                        }
                                        catch (InvocationTargetException v15) {
                                            throw v15.getTargetException();
                                        }
                                        v16 = v14.toLowerCase().startsWith(var8_8);
                                        if (var1_3 == null) {
                                            if (v16) {
                                                var12_13.add(0, var14_19);
                                            }
                                            if (var1_3 == null) continue;
                                        }
                                        ** GOTO lbl98
                                    }
                                    var13_18 = var12_13.iterator();
                                    do {
                                        v16 = var13_18.hasNext();
lbl98:
                                        // 2 sources

                                        if (!v16) break;
                                        var14_19 = (L1)var13_18.next();
                                        var11_12.remove(var14_19);
                                        var11_12.add(0, var14_19);
                                        if (var1_3 != null) break block112;
                                    } while (var1_3 == null);
                                    var3_2 = var11_12;
                                }
                                v17 = var4_4.equals("");
                                if (var1_3 == null) {
                                    v17 = v17 == 0 ? 1 : 0;
                                }
                                var10_11 = v17;
                                v18 = this;
                                if (var1_3 == null) {
                                    block113: {
                                        try {
                                            v19 = (Boolean)v18.x();
                                        }
                                        catch (InvocationTargetException v20) {
                                            throw v20.getTargetException();
                                        }
                                        if (v19) {
                                            var11_12 = new ArrayList<L1>();
                                            for (var12_14 = 0; var12_14 < var3_2.size(); ++var12_14) {
                                                var11_12.add((L1)var3_2.get(var3_2.size() - 1 - var12_14));
                                                if (var1_3 == null) {
                                                    if (var1_3 == null) continue;
                                                }
                                                break block113;
                                            }
                                            var3_2 = var11_12;
                                        }
                                    }
                                    v18 = this;
                                }
                                try {
                                    v21 = (dx_2)v18.n();
                                }
                                catch (InvocationTargetException v22) {
                                    throw v22.getTargetException();
                                }
                                v23 = var11_12 = v21;
                                if (var1_3 != null) break block116;
                                if (v23 == null) break block117;
                                v23 = var11_12;
                            }
                            try {
                                v24 = (ArrayList)v23.V();
                            }
                            catch (InvocationTargetException v25) {
                                throw v25.getTargetException();
                            }
                            var12_15 = v24;
                            for (L1 var14_19 : var12_15) {
                                var3_2.add(0, var14_19);
                                if (var1_3 == null) continue;
                            }
                        }
                        for (var12_16 = 0; var12_16 < var3_2.size(); ++var12_16) {
                            block125: {
                                block124: {
                                    block123: {
                                        block122: {
                                            block121: {
                                                block120: {
                                                    block118: {
                                                        block119: {
                                                            var13_18 = (L1)var3_2.get(var3_2.size() - var12_16 - 1);
                                                            var14_20 = true;
                                                            v26 = var10_11;
                                                            if (var1_3 != null) break block114;
                                                            if (var1_3 != null) break block118;
                                                            if (v26 == 0) break block119;
                                                            v27 = this.m;
                                                            if (var1_3 != null) break block118;
                                                            if (v27 != 0) break block119;
                                                            try {
                                                                v27 = (Integer)var13_18.w();
                                                            }
                                                            catch (InvocationTargetException v28) {
                                                                throw v28.getTargetException();
                                                            }
                                                            if (var1_3 != null) break block118;
                                                            if (v27 == 0) {
                                                                var14_20 = false;
                                                            }
                                                        }
                                                        v27 = this.O;
                                                    }
                                                    if (var1_3 != null) break block120;
                                                    if (v27 == false) break block121;
                                                    v29 = var13_18;
                                                    if (var1_3 == null) {
                                                        try {
                                                            v27 = (Integer)v29.w();
                                                        }
                                                        catch (InvocationTargetException v30) {
                                                            throw v30.getTargetException();
                                                        }
                                                    }
                                                    break block122;
                                                }
                                                if (v27 <= 0) break block121;
                                                try {
                                                    var13_18.r(true);
                                                }
                                                catch (InvocationTargetException v31) {
                                                    throw v31.getTargetException();
                                                }
                                                if (var1_3 == null) break block123;
                                            }
                                            v29 = var13_18;
                                        }
                                        try {
                                            v29.r(false);
                                        }
                                        catch (InvocationTargetException v32) {
                                            throw v32.getTargetException();
                                        }
                                    }
                                    v33 = var14_20;
                                    if (var1_3 == null) {
                                        if (!v33) continue;
                                        try {
                                            v33 = (Boolean)this.p(var13_18);
                                        }
                                        catch (InvocationTargetException v34) {
                                            throw v34.getTargetException();
                                        }
                                    }
                                    if (var1_3 != null) break block124;
                                    if (!v33) continue;
                                    v35 = this;
                                    if (var1_3 != null) break block125;
                                    v33 = v35.w;
                                }
                                if (v33) continue;
                                v35 = this;
                            }
                            try {
                                v35.H.R(var13_18);
                                continue;
                            }
                            catch (InvocationTargetException v36) {
                                throw v36.getTargetException();
                            }
                        }
                        v26 = this.w;
                    }
                    if (var1_3 != null) break block126;
                    if (v26 == 0) break block127;
                    try {
                        this.v.b();
                    }
                    catch (InvocationTargetException v37) {
                        throw v37.getTargetException();
                    }
                    v26 = 0;
                }
                for (var12_16 = (int)(v440159); var12_16 < var3_2.size(); ++var12_16) {
                    block133: {
                        block132: {
                            block131: {
                                block130: {
                                    block128: {
                                        block129: {
                                            var13_18 = (L1)var3_2.get(var12_16);
                                            var14_21 = true;
                                            if (var1_3 != null) break block115;
                                            v38 = var10_11;
                                            if (var1_3 != null) break block128;
                                            if (v38 == 0) break block129;
                                            v38 = (int)this.m;
                                            if (var1_3 != null) break block128;
                                            if (v38 != 0) break block129;
                                            try {
                                                v38 = (Integer)var13_18.w();
                                            }
                                            catch (InvocationTargetException v39) {
                                                throw v39.getTargetException();
                                            }
                                            if (var1_3 != null) break block128;
                                            if (v38 == 0) {
                                                var14_21 = false;
                                            }
                                        }
                                        v38 = (int)this.O;
                                    }
                                    if (var1_3 != null) break block130;
                                    if (v38 == 0) break block131;
                                    v40 = var13_18;
                                    if (var1_3 == null) {
                                        try {
                                            v38 = (Integer)v40.w();
                                        }
                                        catch (InvocationTargetException v41) {
                                            throw v41.getTargetException();
                                        }
                                    }
                                    break block132;
                                }
                                if (v38 <= 0) break block131;
                                try {
                                    var13_18.r(true);
                                }
                                catch (InvocationTargetException v42) {
                                    throw v42.getTargetException();
                                }
                                if (var1_3 == null) break block133;
                            }
                            v40 = var13_18;
                        }
                        try {
                            v40.r(false);
                        }
                        catch (InvocationTargetException v43) {
                            throw v43.getTargetException();
                        }
                    }
                    v44 = var14_21;
                    if (var1_3 == null) {
                        if (!v44) continue;
                        v45 = this;
                        if (var1_3 == null) {
                            try {
                                v44 = (Boolean)v45.p(var13_18);
                            }
                            catch (InvocationTargetException v46) {
                                throw v46.getTargetException();
                            }
                        }
                    } else {
                        if (!v44) continue;
                        v45 = this;
                    }
                    try {
                        v45.v.k(var13_18);
                        continue;
                    }
                    catch (InvocationTargetException v47) {
                        throw v47.getTargetException();
                    }
                }
                try {
                    this.v.R();
                }
                catch (InvocationTargetException v48) {
                    throw v48.getTargetException();
                }
            }
            ((JXList)this.l1).clearSelection();
        }
    }

    void s(ArrayList arrayList) {
        Collections.sort(arrayList, new cc_2(this));
    }

    void N(ArrayList arrayList) {
        Collections.sort(arrayList, new ub_2(this));
    }

    void I(ArrayList arrayList, ArrayList arrayList2) {
        String[] stringArray = FK.i();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            L1 l1 = (L1)arrayList.get(arrayList.size() - i2 - 1);
            arrayList2.add(l1);
            if (stringArray == null) continue;
        }
    }

    public boolean K() {
        return this.w;
    }

    public void i(boolean bl) {
        this.w = bl;
    }

    public Dimension f() {
        return (Dimension)this.q;
    }

    public void f(Dimension dimension) {
        this.q = dimension;
    }

    public boolean e() {
        return this.u;
    }

    public void S(boolean bl) {
        this.u = bl;
    }

    public boolean F() {
        return this.L;
    }

    public void s(boolean bl) {
        this.L = bl;
    }

    public String u() {
        return (String)this.h;
    }

    public void s(String string) {
        this.h = string;
    }

    public boolean m() {
        return this.b;
    }

    public void k(boolean bl) {
        this.b = bl;
    }

    public tq_2 R() {
        return (tq_2)this.s;
    }

    public void u(tq_2 tq_22) {
        this.s = tq_22;
    }

    public boolean R() {
        return this.i;
    }

    public boolean x() {
        return this.d;
    }

    public void R(boolean bl) {
        this.d = bl;
    }

    public boolean y() {
        return this.lx;
    }

    public void G(boolean bl) {
        this.lx = bl;
    }

    public boolean o() {
        return this.lF;
    }

    public void K(boolean bl) {
        this.lF = bl;
    }

    public boolean w() {
        return this.B;
    }

    public void A(boolean bl) {
        this.B = bl;
    }

    public long a() {
        return this.l_;
    }

    public void A(long l2) {
        this.l_ = l2;
    }

    public boolean T() {
        return this.lQ;
    }

    public F_ f() {
        return (F_)this.x;
    }

    public void F(F_ f_2) {
        this.x = f_2;
    }

    public boolean t() {
        return this.O;
    }

    public void Y(boolean bl) {
        this.O = bl;
    }

    public boolean g() {
        return this.m;
    }

    public void z(boolean bl) {
        this.m = bl;
    }

    public boolean i() {
        return this.p;
    }

    public void f(boolean bl) {
        this.p = bl;
    }

    public dv_0 r() {
        return (dv_0)this.lD;
    }

    public void Y(dv_0 dv_02) {
        this.lD = dv_02;
    }

    public boolean L() {
        return this.P;
    }

    public void t(boolean bl) {
        this.P = bl;
    }

    public boolean r() {
        return this.n;
    }

    public void e(boolean bl) {
        this.n = bl;
    }

    public boolean f() {
        return this.t;
    }

    public void y(boolean bl) {
        this.t = bl;
    }

    public JButton j() {
        return (KD)this.A;
    }

    public void Z(KD kD) {
        this.A = kD;
    }

    public JPanel H() {
        return (JPanel)this.U;
    }

    public void h() {
        this.H = null;
        this.s = null;
        this.lC = null;
        this.W = null;
        this.l9 = null;
        this.lU = null;
        this.q = null;
        this.o = null;
        this.h = null;
        this.lD = null;
        this.Z = null;
        this.j = null;
        this.x = null;
        this.I = null;
        this.X = null;
        this.c = null;
        this.U = null;
        this.A = null;
        this.v = null;
        this.l1 = null;
        this.z = null;
        this.r = null;
        this.D = null;
    }

    public void K() {
        try {
            yt_1.F.W((Object)new yw_2(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                var21 = new String[23];
                                var19_1 = 0;
                                var18_2 = "[\u00dc\u0013\u00be\u00dc\u0092\u0006i\u00121`\u00a3\u00b4!\tKo\u0007\u0080\u00a4\u00c9\u007f%@\u00de\u00b0M\u0002\u9097\u98fd\u0016\u00b3\u00c7\u00f3@+\u0097\n\u00b73\u00a9\u00e8\u00ecB\u00b8\u00d4$L \u00a3\u0004\u0084\u00ce+\u00e7Ty2z\u00d9 }v\u0093@\u00abWPv9\u0018\u0083)p\u00d5K\u00c86\u0097\u001f\u00ad\u00c9>\u00e2\u00f4.\u00fe\u00904\u00a6\u00f2Wc\u001e\u00f2\u000bB\u000ek\u00dd\u0015\u009e\u001c\u0096\u001e\u00e9\u00fc\u00e8|\u00c8gB\b\u00de\u00c5\u00a3\u009d\u00ca\u00f6\u00c4\u00e5\u001d%\u008b!\u00c9q\u00a6A\u009aF>\u008c\u001ez\u00df\u00e0\u0081\u00a4\u00a6\u0010\u008b\u00e9\u00c5I:\u0014\u0092\u001c\u009a\u009f\u000bs\u009f\u0016\u00d6|\u009f\u0012\u00c8}\u00ccL\u000e]\u00db\u00e45 Y\u00eeV\u00e6\u00b4PEK\u009e\u0002\u53a0\u536d\u0004\u6e98\u7a95\u52d9\u8867\u000e\u00f4Q\u00e6\u000fb\u00a4\u00d1\u00af\u0005 C\u00d1\u0080a\t\u0093`\u0095K\u0098\u0082\u00ec\u00f9\f\u0004\u0093Q\u00c4\u008a\u0010T(\u00b5v\u00d7\u000el\u0014\u0005y\u00d3\u00eb\u00ba\u00d1\u00f3\u00a6\u001b\fX\u0004\u00b3\u00d5\u00e9\u00d5{\u00c8S\u009d\u00a5\u00e3H \u0098Pd\u009a\t} \u008a\u00a7=j\u0018\n\u6340\u5de9\u53ab\u6536\u543c\u9523\u908d\u6236\u5bf1\u6bdf\u0017r\u00bf\u00cbO,v\u00ea\u00803}\"v\u00af\u00d2Z \u00f3\u0092\u00fa\u001d\u00b4\u000b\u00e5\u000e8\u00e4H\u00d2\u00b5\u00a5\\\u00c9\u00b0G\u009a;\u0012Q\u0002\u6484\u7dd1";
                                var20_3 = "[\u00dc\u0013\u00be\u00dc\u0092\u0006i\u00121`\u00a3\u00b4!\tKo\u0007\u0080\u00a4\u00c9\u007f%@\u00de\u00b0M\u0002\u9097\u98fd\u0016\u00b3\u00c7\u00f3@+\u0097\n\u00b73\u00a9\u00e8\u00ecB\u00b8\u00d4$L \u00a3\u0004\u0084\u00ce+\u00e7Ty2z\u00d9 }v\u0093@\u00abWPv9\u0018\u0083)p\u00d5K\u00c86\u0097\u001f\u00ad\u00c9>\u00e2\u00f4.\u00fe\u00904\u00a6\u00f2Wc\u001e\u00f2\u000bB\u000ek\u00dd\u0015\u009e\u001c\u0096\u001e\u00e9\u00fc\u00e8|\u00c8gB\b\u00de\u00c5\u00a3\u009d\u00ca\u00f6\u00c4\u00e5\u001d%\u008b!\u00c9q\u00a6A\u009aF>\u008c\u001ez\u00df\u00e0\u0081\u00a4\u00a6\u0010\u008b\u00e9\u00c5I:\u0014\u0092\u001c\u009a\u009f\u000bs\u009f\u0016\u00d6|\u009f\u0012\u00c8}\u00ccL\u000e]\u00db\u00e45 Y\u00eeV\u00e6\u00b4PEK\u009e\u0002\u53a0\u536d\u0004\u6e98\u7a95\u52d9\u8867\u000e\u00f4Q\u00e6\u000fb\u00a4\u00d1\u00af\u0005 C\u00d1\u0080a\t\u0093`\u0095K\u0098\u0082\u00ec\u00f9\f\u0004\u0093Q\u00c4\u008a\u0010T(\u00b5v\u00d7\u000el\u0014\u0005y\u00d3\u00eb\u00ba\u00d1\u00f3\u00a6\u001b\fX\u0004\u00b3\u00d5\u00e9\u00d5{\u00c8S\u009d\u00a5\u00e3H \u0098Pd\u009a\t} \u008a\u00a7=j\u0018\n\u6340\u5de9\u53ab\u6536\u543c\u9523\u908d\u6236\u5bf1\u6bdf\u0017r\u00bf\u00cbO,v\u00ea\u00803}\"v\u00af\u00d2Z \u00f3\u0092\u00fa\u001d\u00b4\u000b\u00e5\u000e8\u00e4H\u00d2\u00b5\u00a5\\\u00c9\u00b0G\u009a;\u0012Q\u0002\u6484\u7dd1".length();
                                FK.J(null);
                                var17_4 = 8;
                                var16_5 = -1;
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 92;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00ca\u0016\u0007\u009dM]R\u00c5`\u0097\u0091rbh\u0019\u000b1LO\u00bdF\u00e3DV\u00a6\u000e&";
                                    var20_3 = "\u00ca\u0016\u0007\u009dM]R\u00c5`\u0097\u0091rbh\u0019\u000b1LO\u00bdF\u00e3DV\u00a6\u000e&".length();
                                    var17_4 = 15;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 6;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl86
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 44;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 9;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 42;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 126;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 71;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 93;
                                            break;
                                        }
                                        default: {
                                            v15 = 15;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        FK.ab = var21;
                        FK.bb = new String[23];
                        var8_7 = 1450781983818565127L;
                        var14_8 = new long[12];
                        var11_9 = 0;
                        var12_10 = "+\u00d1lW3\u00e42\u008b\u0001I\u008c\u00d2\u0087#\u00fd\u00c2x\u00f4\u00fa\u00b7\u00e4\u008e\u00b9O\u0004j\u008bY\u0096z$\u00e61pzM\u00d9\u0015o\u00bc\u0095\u00e7\u001cF\u00eb r&\u0092\u00b0\u00ff\u00e3\u0010\u00bc\u0090\u00efM]'&H\u00ec\u00d2\u00c5)m\u00b2\u00e9\u00d0\u00ba\u00f6\u00f1\u00d9\u0087\u00bcqq\u00b8r\u00c5";
                        var13_11 = "+\u00d1lW3\u00e42\u008b\u0001I\u008c\u00d2\u0087#\u00fd\u00c2x\u00f4\u00fa\u00b7\u00e4\u008e\u00b9O\u0004j\u008bY\u0096z$\u00e61pzM\u00d9\u0015o\u00bc\u0095\u00e7\u001cF\u00eb r&\u0092\u00b0\u00ff\u00e3\u0010\u00bc\u0090\u00efM]'&H\u00ec\u00d2\u00c5)m\u00b2\u00e9\u00d0\u00ba\u00f6\u00f1\u00d9\u0087\u00bcqq\u00b8r\u00c5".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl113:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00ae\u00b4\u0094\u00b8\u00d5\u00ba-\f\u000e\u00f6*7\u0010]\u00a4^";
                            var13_11 = "\u00ae\u00b4\u0094\u00b8\u00d5\u00ba-\f\u000e\u00f6*7\u0010]\u00a4^".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl126:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                FK.eb = var14_8;
                FK.fb = new Integer[12];
                var0_14 = 4364929194099190692L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "ENn\u00f5(\n\u00a7\u0005\n\u00c9\u009d\u00d2\u00a0<u\u00bf\u0091\u00b3\u00e7\u00f6\u0012n\u00d0\u00ef";
                var5_18 = "ENn\u00f5(\n\u00a7\u0005\n\u00c9\u009d\u00d2\u00a0<u\u00bf\u0091\u00b3\u00e7\u00f6\u0012n\u00d0\u00ef".length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl149:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v22 = var3_16++;
            ** while (true)
        }
        FK.ib = var6_15;
        FK.jb = new Long[3];
        FK.S = new JFrame();
        ((JFrame)FK.S).setBounds(FK.a(17282, 8378640599052008353L), FK.a(11944, 8409189693881996940L), FK.a(11944, 8409189693881996940L), FK.a(11944, 8409189693881996940L));
        FK.C = new JDialog();
        ((JDialog)FK.C).setSize(0, 0);
    }

    public static void J(String[] stringArray) {
        G = stringArray;
    }

    public static String[] i() {
        return G;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x3E90) & 0xFFFF;
        if (bb[n12] == null) {
            int n13;
            int n14;
            char[] cArray = ab[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 92;
                    break;
                }
                case 1: {
                    n14 = 24;
                    break;
                }
                case 2: {
                    n14 = 161;
                    break;
                }
                case 3: {
                    n14 = 238;
                    break;
                }
                case 4: {
                    n14 = 123;
                    break;
                }
                case 5: {
                    n14 = 9;
                    break;
                }
                case 6: {
                    n14 = 61;
                    break;
                }
                case 7: {
                    n14 = 181;
                    break;
                }
                case 8: {
                    n14 = 190;
                    break;
                }
                case 9: {
                    n14 = 28;
                    break;
                }
                case 10: {
                    n14 = 19;
                    break;
                }
                case 11: {
                    n14 = 86;
                    break;
                }
                case 12: {
                    n14 = 36;
                    break;
                }
                case 13: {
                    n14 = 194;
                    break;
                }
                case 14: {
                    n14 = 209;
                    break;
                }
                case 15: {
                    n14 = 136;
                    break;
                }
                case 16: {
                    n14 = 189;
                    break;
                }
                case 17: {
                    n14 = 79;
                    break;
                }
                case 18: {
                    n14 = 141;
                    break;
                }
                case 19: {
                    n14 = 44;
                    break;
                }
                case 20: {
                    n14 = 200;
                    break;
                }
                case 21: {
                    n14 = 139;
                    break;
                }
                case 22: {
                    n14 = 226;
                    break;
                }
                case 23: {
                    n14 = 247;
                    break;
                }
                case 24: {
                    n14 = 227;
                    break;
                }
                case 25: {
                    n14 = 155;
                    break;
                }
                case 26: {
                    n14 = 22;
                    break;
                }
                case 27: {
                    n14 = 21;
                    break;
                }
                case 28: {
                    n14 = 25;
                    break;
                }
                case 29: {
                    n14 = 135;
                    break;
                }
                case 30: {
                    n14 = 93;
                    break;
                }
                case 31: {
                    n14 = 63;
                    break;
                }
                case 32: {
                    n14 = 11;
                    break;
                }
                case 33: {
                    n14 = 146;
                    break;
                }
                case 34: {
                    n14 = 212;
                    break;
                }
                case 35: {
                    n14 = 35;
                    break;
                }
                case 36: {
                    n14 = 10;
                    break;
                }
                case 37: {
                    n14 = 4;
                    break;
                }
                case 38: {
                    n14 = 151;
                    break;
                }
                case 39: {
                    n14 = 248;
                    break;
                }
                case 40: {
                    n14 = 165;
                    break;
                }
                case 41: {
                    n14 = 156;
                    break;
                }
                case 42: {
                    n14 = 33;
                    break;
                }
                case 43: {
                    n14 = 159;
                    break;
                }
                case 44: {
                    n14 = 223;
                    break;
                }
                case 45: {
                    n14 = 250;
                    break;
                }
                case 46: {
                    n14 = 88;
                    break;
                }
                case 47: {
                    n14 = 68;
                    break;
                }
                case 48: {
                    n14 = 125;
                    break;
                }
                case 49: {
                    n14 = 241;
                    break;
                }
                case 50: {
                    n14 = 99;
                    break;
                }
                case 51: {
                    n14 = 83;
                    break;
                }
                case 52: {
                    n14 = 244;
                    break;
                }
                case 53: {
                    n14 = 160;
                    break;
                }
                case 54: {
                    n14 = 173;
                    break;
                }
                case 55: {
                    n14 = 179;
                    break;
                }
                case 56: {
                    n14 = 97;
                    break;
                }
                case 57: {
                    n14 = 96;
                    break;
                }
                case 58: {
                    n14 = 199;
                    break;
                }
                case 59: {
                    n14 = 233;
                    break;
                }
                case 60: {
                    n14 = 82;
                    break;
                }
                case 61: {
                    n14 = 105;
                    break;
                }
                case 62: {
                    n14 = 29;
                    break;
                }
                case 63: {
                    n14 = 180;
                    break;
                }
                case 64: {
                    n14 = 118;
                    break;
                }
                case 65: {
                    n14 = 58;
                    break;
                }
                case 66: {
                    n14 = 78;
                    break;
                }
                case 67: {
                    n14 = 183;
                    break;
                }
                case 68: {
                    n14 = 222;
                    break;
                }
                case 69: {
                    n14 = 186;
                    break;
                }
                case 70: {
                    n14 = 12;
                    break;
                }
                case 71: {
                    n14 = 6;
                    break;
                }
                case 72: {
                    n14 = 134;
                    break;
                }
                case 73: {
                    n14 = 3;
                    break;
                }
                case 74: {
                    n14 = 211;
                    break;
                }
                case 75: {
                    n14 = 234;
                    break;
                }
                case 76: {
                    n14 = 197;
                    break;
                }
                case 77: {
                    n14 = 175;
                    break;
                }
                case 78: {
                    n14 = 7;
                    break;
                }
                case 79: {
                    n14 = 203;
                    break;
                }
                case 80: {
                    n14 = 217;
                    break;
                }
                case 81: {
                    n14 = 219;
                    break;
                }
                case 82: {
                    n14 = 16;
                    break;
                }
                case 83: {
                    n14 = 126;
                    break;
                }
                case 84: {
                    n14 = 254;
                    break;
                }
                case 85: {
                    n14 = 94;
                    break;
                }
                case 86: {
                    n14 = 47;
                    break;
                }
                case 87: {
                    n14 = 69;
                    break;
                }
                case 88: {
                    n14 = 253;
                    break;
                }
                case 89: {
                    n14 = 230;
                    break;
                }
                case 90: {
                    n14 = 38;
                    break;
                }
                case 91: {
                    n14 = 210;
                    break;
                }
                case 92: {
                    n14 = 48;
                    break;
                }
                case 93: {
                    n14 = 133;
                    break;
                }
                case 94: {
                    n14 = 31;
                    break;
                }
                case 95: {
                    n14 = 216;
                    break;
                }
                case 96: {
                    n14 = 191;
                    break;
                }
                case 97: {
                    n14 = 228;
                    break;
                }
                case 98: {
                    n14 = 100;
                    break;
                }
                case 99: {
                    n14 = 124;
                    break;
                }
                case 100: {
                    n14 = 2;
                    break;
                }
                case 101: {
                    n14 = 187;
                    break;
                }
                case 102: {
                    n14 = 39;
                    break;
                }
                case 103: {
                    n14 = 115;
                    break;
                }
                case 104: {
                    n14 = 208;
                    break;
                }
                case 105: {
                    n14 = 232;
                    break;
                }
                case 106: {
                    n14 = 157;
                    break;
                }
                case 107: {
                    n14 = 138;
                    break;
                }
                case 108: {
                    n14 = 176;
                    break;
                }
                case 109: {
                    n14 = 122;
                    break;
                }
                case 110: {
                    n14 = 172;
                    break;
                }
                case 111: {
                    n14 = 26;
                    break;
                }
                case 112: {
                    n14 = 152;
                    break;
                }
                case 113: {
                    n14 = 249;
                    break;
                }
                case 114: {
                    n14 = 144;
                    break;
                }
                case 115: {
                    n14 = 236;
                    break;
                }
                case 116: {
                    n14 = 168;
                    break;
                }
                case 117: {
                    n14 = 52;
                    break;
                }
                case 118: {
                    n14 = 27;
                    break;
                }
                case 119: {
                    n14 = 204;
                    break;
                }
                case 120: {
                    n14 = 218;
                    break;
                }
                case 121: {
                    n14 = 150;
                    break;
                }
                case 122: {
                    n14 = 130;
                    break;
                }
                case 123: {
                    n14 = 225;
                    break;
                }
                case 124: {
                    n14 = 84;
                    break;
                }
                case 125: {
                    n14 = 112;
                    break;
                }
                case 126: {
                    n14 = 113;
                    break;
                }
                case 127: {
                    n14 = 221;
                    break;
                }
                case 128: {
                    n14 = 30;
                    break;
                }
                case 129: {
                    n14 = 103;
                    break;
                }
                case 130: {
                    n14 = 184;
                    break;
                }
                case 131: {
                    n14 = 41;
                    break;
                }
                case 132: {
                    n14 = 132;
                    break;
                }
                case 133: {
                    n14 = 171;
                    break;
                }
                case 134: {
                    n14 = 14;
                    break;
                }
                case 135: {
                    n14 = 59;
                    break;
                }
                case 136: {
                    n14 = 54;
                    break;
                }
                case 137: {
                    n14 = 5;
                    break;
                }
                case 138: {
                    n14 = 220;
                    break;
                }
                case 139: {
                    n14 = 73;
                    break;
                }
                case 140: {
                    n14 = 142;
                    break;
                }
                case 141: {
                    n14 = 185;
                    break;
                }
                case 142: {
                    n14 = 127;
                    break;
                }
                case 143: {
                    n14 = 170;
                    break;
                }
                case 144: {
                    n14 = 182;
                    break;
                }
                case 145: {
                    n14 = 80;
                    break;
                }
                case 146: {
                    n14 = 98;
                    break;
                }
                case 147: {
                    n14 = 74;
                    break;
                }
                case 148: {
                    n14 = 166;
                    break;
                }
                case 149: {
                    n14 = 95;
                    break;
                }
                case 150: {
                    n14 = 23;
                    break;
                }
                case 151: {
                    n14 = 67;
                    break;
                }
                case 152: {
                    n14 = 237;
                    break;
                }
                case 153: {
                    n14 = 137;
                    break;
                }
                case 154: {
                    n14 = 246;
                    break;
                }
                case 155: {
                    n14 = 177;
                    break;
                }
                case 156: {
                    n14 = 53;
                    break;
                }
                case 157: {
                    n14 = 8;
                    break;
                }
                case 158: {
                    n14 = 224;
                    break;
                }
                case 159: {
                    n14 = 120;
                    break;
                }
                case 160: {
                    n14 = 71;
                    break;
                }
                case 161: {
                    n14 = 56;
                    break;
                }
                case 162: {
                    n14 = 64;
                    break;
                }
                case 163: {
                    n14 = 117;
                    break;
                }
                case 164: {
                    n14 = 251;
                    break;
                }
                case 165: {
                    n14 = 188;
                    break;
                }
                case 166: {
                    n14 = 162;
                    break;
                }
                case 167: {
                    n14 = 195;
                    break;
                }
                case 168: {
                    n14 = 77;
                    break;
                }
                case 169: {
                    n14 = 62;
                    break;
                }
                case 170: {
                    n14 = 154;
                    break;
                }
                case 171: {
                    n14 = 202;
                    break;
                }
                case 172: {
                    n14 = 252;
                    break;
                }
                case 173: {
                    n14 = 215;
                    break;
                }
                case 174: {
                    n14 = 140;
                    break;
                }
                case 175: {
                    n14 = 20;
                    break;
                }
                case 176: {
                    n14 = 104;
                    break;
                }
                case 177: {
                    n14 = 34;
                    break;
                }
                case 178: {
                    n14 = 148;
                    break;
                }
                case 179: {
                    n14 = 242;
                    break;
                }
                case 180: {
                    n14 = 66;
                    break;
                }
                case 181: {
                    n14 = 106;
                    break;
                }
                case 182: {
                    n14 = 214;
                    break;
                }
                case 183: {
                    n14 = 90;
                    break;
                }
                case 184: {
                    n14 = 178;
                    break;
                }
                case 185: {
                    n14 = 42;
                    break;
                }
                case 186: {
                    n14 = 240;
                    break;
                }
                case 187: {
                    n14 = 119;
                    break;
                }
                case 188: {
                    n14 = 158;
                    break;
                }
                case 189: {
                    n14 = 235;
                    break;
                }
                case 190: {
                    n14 = 145;
                    break;
                }
                case 191: {
                    n14 = 0;
                    break;
                }
                case 192: {
                    n14 = 85;
                    break;
                }
                case 193: {
                    n14 = 205;
                    break;
                }
                case 194: {
                    n14 = 213;
                    break;
                }
                case 195: {
                    n14 = 72;
                    break;
                }
                case 196: {
                    n14 = 206;
                    break;
                }
                case 197: {
                    n14 = 149;
                    break;
                }
                case 198: {
                    n14 = 207;
                    break;
                }
                case 199: {
                    n14 = 107;
                    break;
                }
                case 200: {
                    n14 = 198;
                    break;
                }
                case 201: {
                    n14 = 40;
                    break;
                }
                case 202: {
                    n14 = 87;
                    break;
                }
                case 203: {
                    n14 = 229;
                    break;
                }
                case 204: {
                    n14 = 245;
                    break;
                }
                case 205: {
                    n14 = 17;
                    break;
                }
                case 206: {
                    n14 = 128;
                    break;
                }
                case 207: {
                    n14 = 13;
                    break;
                }
                case 208: {
                    n14 = 45;
                    break;
                }
                case 209: {
                    n14 = 55;
                    break;
                }
                case 210: {
                    n14 = 15;
                    break;
                }
                case 211: {
                    n14 = 201;
                    break;
                }
                case 212: {
                    n14 = 143;
                    break;
                }
                case 213: {
                    n14 = 60;
                    break;
                }
                case 214: {
                    n14 = 65;
                    break;
                }
                case 215: {
                    n14 = 18;
                    break;
                }
                case 216: {
                    n14 = 255;
                    break;
                }
                case 217: {
                    n14 = 70;
                    break;
                }
                case 218: {
                    n14 = 196;
                    break;
                }
                case 219: {
                    n14 = 169;
                    break;
                }
                case 220: {
                    n14 = 193;
                    break;
                }
                case 221: {
                    n14 = 76;
                    break;
                }
                case 222: {
                    n14 = 51;
                    break;
                }
                case 223: {
                    n14 = 129;
                    break;
                }
                case 224: {
                    n14 = 101;
                    break;
                }
                case 225: {
                    n14 = 116;
                    break;
                }
                case 226: {
                    n14 = 108;
                    break;
                }
                case 227: {
                    n14 = 243;
                    break;
                }
                case 228: {
                    n14 = 1;
                    break;
                }
                case 229: {
                    n14 = 163;
                    break;
                }
                case 230: {
                    n14 = 167;
                    break;
                }
                case 231: {
                    n14 = 37;
                    break;
                }
                case 232: {
                    n14 = 174;
                    break;
                }
                case 233: {
                    n14 = 50;
                    break;
                }
                case 234: {
                    n14 = 192;
                    break;
                }
                case 235: {
                    n14 = 147;
                    break;
                }
                case 236: {
                    n14 = 111;
                    break;
                }
                case 237: {
                    n14 = 91;
                    break;
                }
                case 238: {
                    n14 = 109;
                    break;
                }
                case 239: {
                    n14 = 164;
                    break;
                }
                case 240: {
                    n14 = 131;
                    break;
                }
                case 241: {
                    n14 = 32;
                    break;
                }
                case 242: {
                    n14 = 89;
                    break;
                }
                case 243: {
                    n14 = 49;
                    break;
                }
                case 244: {
                    n14 = 153;
                    break;
                }
                case 245: {
                    n14 = 43;
                    break;
                }
                case 246: {
                    n14 = 110;
                    break;
                }
                case 247: {
                    n14 = 102;
                    break;
                }
                case 248: {
                    n14 = 75;
                    break;
                }
                case 249: {
                    n14 = 114;
                    break;
                }
                case 250: {
                    n14 = 231;
                    break;
                }
                case 251: {
                    n14 = 46;
                    break;
                }
                case 252: {
                    n14 = 239;
                    break;
                }
                case 253: {
                    n14 = 121;
                    break;
                }
                case 254: {
                    n14 = 81;
                    break;
                }
                default: {
                    n14 = 57;
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
            FK.bb[n12] = new String(cArray).intern();
        }
        return bb[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7822;
        if (fb[n11] == null) {
            FK.fb[n11] = (int)(eb[n11] ^ l2);
        }
        return fb[n11];
    }

    private static long c(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x333E) & Short.MAX_VALUE;
        if (jb[n11] == null) {
            FK.jb[n11] = ib[n11] ^ l2;
        }
        return jb[n11];
    }
}

