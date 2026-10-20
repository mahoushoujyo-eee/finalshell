/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.O_;
import com._y_0;
import com.c;
import com.fv_0;
import com.ky_2;
import com.xf_1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Window;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from Bq
 */
public class bq_0
extends O_ {
    t3_0 B;
    aM T;
    bq_0 J;
    int a;
    Color w;
    Color k;
    Color j;
    Color L;
    Color i;
    Color y;
    Color h;
    Color W;
    Border x;
    Border N;
    Border f;
    Border s;
    boolean C;
    boolean m;
    boolean z;
    int E;
    boolean v;
    JLabel O;
    long M;
    boolean S;
    boolean G;
    JPanel l;
    long b;
    boolean I;
    t_0 e;
    long g;
    yg_0 F;
    aM X;
    th_1 A;
    JLabel r;
    Window Q;
    Point o;
    Point d;
    Point n;
    C_ K;
    C_ p;
    boolean u;
    boolean Z;
    boolean U;
    private static final String[] c;
    private static final String[] q;
    private static final long[] t;
    private static final Integer[] D;

    bq_0(t3_0 t3_02, aM aM2, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        block74: {
            bq_0 bq_02;
            block77: {
                block75: {
                    boolean bl5;
                    block76: {
                        boolean bl6;
                        String[] stringArray;
                        block73: {
                            Object object;
                            block67: {
                                block68: {
                                    t_0 t_02;
                                    block72: {
                                        block71: {
                                            block69: {
                                                block70: {
                                                    t_0 t_03;
                                                    block64: {
                                                        block65: {
                                                            block66: {
                                                                boolean bl7;
                                                                block59: {
                                                                    block60: {
                                                                        block63: {
                                                                            bq_0 bq_03;
                                                                            block61: {
                                                                                block62: {
                                                                                    Object object2;
                                                                                    block58: {
                                                                                        int n11;
                                                                                        Color color;
                                                                                        block56: {
                                                                                            block57: {
                                                                                                Object object3;
                                                                                                this.w = new Color(bq_0.b(14744, 2579293605355848411L), bq_0.b(16177, 5399903379597100135L), bq_0.b(16177, 5399903379597100135L));
                                                                                                this.k = new Color(bq_0.b(16716, 6335565339365931579L));
                                                                                                this.i = this.w;
                                                                                                this.y = new Color(bq_0.b(25897, 7205134109817560673L), bq_0.b(8318, 4143026322521529124L), bq_0.b(8318, 4143026322521529124L));
                                                                                                this.h = this.y;
                                                                                                this.W = new Color(bq_0.b(17638, 8362263678876450742L), bq_0.b(18974, 4429970689808920908L), bq_0.b(18974, 4429970689808920908L));
                                                                                                this.C = false;
                                                                                                this.m = false;
                                                                                                this.z = false;
                                                                                                this.v = false;
                                                                                                this.M = 0L;
                                                                                                this.S = false;
                                                                                                String[] stringArray2 = aM.s();
                                                                                                this.G = false;
                                                                                                this.u = true;
                                                                                                this.Z = true;
                                                                                                this.U = false;
                                                                                                this.Z = bl4;
                                                                                                this.I = bl3;
                                                                                                this.X = aM2;
                                                                                                stringArray = stringArray2;
                                                                                                this.S = bl;
                                                                                                this.G = bl2;
                                                                                                this.T = aM2;
                                                                                                this.B = t3_02;
                                                                                                try {
                                                                                                    object3 = aM2.L();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                this.A = object3;
                                                                                                this.J = this;
                                                                                                this.setOpaque(true);
                                                                                                this.setFocusable(false);
                                                                                                this.setFont((Font)fx_2.j);
                                                                                                this.setForeground((Color)this.y);
                                                                                                this.setBackground((Color)this.w);
                                                                                                int n12 = bq_0.b(24411, 4957250566891136005L);
                                                                                                color = new Color(n12, n12, n12);
                                                                                                CompoundBorder compoundBorder = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(bq_0.b(9395, 4617997373717946353L), bq_0.b(7482, 4915632447285896829L), bq_0.b(14248, 5602972193452002545L))), BorderFactory.createEmptyBorder(0, 0, 0, 0));
                                                                                                CompoundBorder compoundBorder2 = BorderFactory.createCompoundBorder(compoundBorder, BorderFactory.createEmptyBorder(0, 1, 4, 4));
                                                                                                n11 = bl;
                                                                                                if (stringArray != null) break block56;
                                                                                                if (n11 != 0) break block57;
                                                                                                this.j = new Color(bq_0.b(420, 3750912443984067298L), bq_0.b(1070, 6792388483839180662L), bq_0.b(1070, 6792388483839180662L));
                                                                                                this.L = new Color(bq_0.b(8124, 3502411527172564199L), bq_0.b(32468, 1866864467146622352L), bq_0.b(32468, 1866864467146622352L));
                                                                                                this.x = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, color), BorderFactory.createEmptyBorder(0, 1, 2, 4));
                                                                                                this.N = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, color), compoundBorder2);
                                                                                                this.f = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, color), compoundBorder2);
                                                                                                this.setBorder((Border)this.x);
                                                                                                this.m(n10);
                                                                                                this.a(bq_0.b(32468, 1866864467146622352L));
                                                                                                if (stringArray == null) break block58;
                                                                                                ky_2.K(new String[5]);
                                                                                            }
                                                                                            this.j = new Color(bq_0.b(21892, 822893476570984151L), bq_0.b(15624, 6693053654224078456L), bq_0.b(15624, 6693053654224078456L));
                                                                                            this.L = new Color(0, 0, 0);
                                                                                            this.w = new Color(bq_0.b(269, 75068276785527422L), bq_0.b(315, 3040994367110298215L), bq_0.b(315, 3040994367110298215L));
                                                                                            this.k = new Color(bq_0.b(10822, 75000017991602459L), bq_0.b(10282, 586643745592972131L), bq_0.b(23568, 8350837898814351198L));
                                                                                            this.W = new Color(bq_0.b(27823, 5997479627151857636L), bq_0.b(27823, 5997479627151857636L), bq_0.b(27823, 5997479627151857636L));
                                                                                            n11 = bl2 ? 1 : 0;
                                                                                        }
                                                                                        if (stringArray == null) {
                                                                                            if (n11 != 0) {
                                                                                                this.k = new Color(bq_0.b(21297, 8102616426695846011L), bq_0.b(21211, 1732522469089700239L), bq_0.b(21211, 1732522469089700239L));
                                                                                            }
                                                                                            color = new Color(bq_0.b(6408, 8131986073360114247L), bq_0.b(6408, 8131986073360114247L), bq_0.b(6408, 8131986073360114247L), 0);
                                                                                            this.x = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, color), BorderFactory.createEmptyBorder(0, 0, 1, 0));
                                                                                            this.N = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, (Color)this.k), BorderFactory.createEmptyBorder(1, 0, 2, 0));
                                                                                            this.f = this.N;
                                                                                            n11 = 0;
                                                                                        }
                                                                                        CompoundBorder compoundBorder = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(n11, 0, 0, 0, (Color)this.k), BorderFactory.createEmptyBorder(1, 0, 1, 0));
                                                                                        this.s = BorderFactory.createCompoundBorder(compoundBorder, BorderFactory.createEmptyBorder(1, 0, 0, 0));
                                                                                        this.setBorder((Border)this.x);
                                                                                        this.m(0);
                                                                                        this.a(0);
                                                                                    }
                                                                                    this.addMouseListener(new yn_1(this, aM2, t3_02, bl));
                                                                                    this.addMouseMotionListener(new gK(this, aM2));
                                                                                    this.r = new JLabel();
                                                                                    ((JLabel)this.r).setOpaque(false);
                                                                                    ((JLabel)this.r).setForeground(Color.black);
                                                                                    ((JLabel)this.r).setFont(((Font)fx_2.j).deriveFont(1));
                                                                                    ((JLabel)this.r).setForeground((Color)this.j);
                                                                                    int n13 = 5;
                                                                                    bl7 = bl;
                                                                                    if (stringArray != null) break block59;
                                                                                    if (bl7) break block60;
                                                                                    if (bl3) {
                                                                                        // empty if block
                                                                                    }
                                                                                    this.setLayout(new MigLayout("alignx left,aligny center,insets 2 7 0 5", "[]5[grow]10[]0[]", ""));
                                                                                    this.l = new JPanel();
                                                                                    ((JPanel)this.l).setOpaque(false);
                                                                                    ((JPanel)this.l).setLayout(new MigLayout("insets 0 0 0 0,aligny center"));
                                                                                    bq_03 = this;
                                                                                    if (stringArray != null) break block61;
                                                                                    bq_03.add((JPanel)this.l);
                                                                                    if (!bl3) break block62;
                                                                                    ((JPanel)this.l).setLayout(new MigLayout("insets 0 0 0 0", "[]5[]", "[]0[]"));
                                                                                    try {
                                                                                        object2 = lk_0.s("\uf111");
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    this.e = object2;
                                                                                    ((t_0)this.e).setFont((Font)fx_2.N);
                                                                                    ((t_0)this.e).setForeground(new Color(0, bq_0.b(28264, 7667561913138861353L), 0));
                                                                                    object = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                                                                                    try {
                                                                                        this.e.C(object);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    ((JPanel)this.l).add((t_0)this.e);
                                                                                    if (stringArray == null) break block63;
                                                                                }
                                                                                bq_03 = this;
                                                                            }
                                                                            ((JPanel)bq_03.l).setLayout(new MigLayout("insets 0 0 0 0", "[]0[]", "[]0[]"));
                                                                        }
                                                                        bl6 = bl4;
                                                                        if (stringArray != null) break block64;
                                                                        if (!bl6) break block65;
                                                                        try {
                                                                            bl6 = (Boolean)aM2.O();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        if (stringArray != null) break block64;
                                                                        if (!bl6) break block65;
                                                                        ((JPanel)this.l).add((JLabel)this.r);
                                                                        if (stringArray == null) break block65;
                                                                    }
                                                                    bl7 = bl2;
                                                                }
                                                                if (!bl7) break block66;
                                                                this.setLayout(new MigLayout("alignx left,aligny center,insets 0 3 0 3", "[]2[]", ""));
                                                                if (stringArray == null) break block65;
                                                            }
                                                            this.setLayout(new MigLayout("alignx left,aligny center,insets 2 5 0 5", "[]2[]", ""));
                                                        }
                                                        bl6 = bl;
                                                    }
                                                    if (stringArray != null) break block67;
                                                    if (!bl6) break block68;
                                                    object = "\uf114";
                                                    if (bl2) {
                                                        object = "";
                                                    }
                                                    try {
                                                        t_03 = (t_0)lk_0.s(object);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    t_02 = t_03;
                                                    if (stringArray != null) break block69;
                                                    if (!bl2) break block70;
                                                    t_02.setForeground(new Color(bq_0.b(10218, 7432331215134661813L), bq_0.b(26383, 5748563541720259651L), bq_0.b(26383, 5748563541720259651L), bq_0.b(27212, 5423888949988970814L)));
                                                    t_02.setFont((Font)fx_2.b);
                                                    if (stringArray == null) break block71;
                                                }
                                                t_02.setForeground(new Color(bq_0.b(32468, 1866864467146622352L), bq_0.b(32468, 1866864467146622352L), bq_0.b(32468, 1866864467146622352L)));
                                            }
                                            t_02.setFont((Font)fx_2.r);
                                        }
                                        if (!bl2) break block72;
                                        t_02.setForeground(new Color(bq_0.b(26383, 5748563541720259651L), bq_0.b(26383, 5748563541720259651L), bq_0.b(26383, 5748563541720259651L), bq_0.b(29679, 1973385342572120234L)));
                                        t_02.setFont((Font)fx_2.b);
                                        this.add((Component)t_02, "width ::");
                                        if (stringArray == null) break block68;
                                    }
                                    this.add((Component)t_02, "width 15::");
                                }
                                this.O = new JLabel();
                                this.add((Component)((JLabel)this.O), "width ::1000,growx");
                                bl6 = bl2;
                            }
                            if (stringArray == null) {
                                if (bl6) {
                                    Object object4;
                                    Object object5;
                                    try {
                                        object5 = lk_0.U("\uf013");
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    this.p = object5;
                                    object = new Color(bq_0.b(26383, 5748563541720259651L), bq_0.b(26593, 2311198898304015521L), bq_0.b(5209, 444215567343955726L), bq_0.b(31027, 8257738072422302274L));
                                    ((C_)this.p).setForeground((Color)object);
                                    ((C_)this.p).addMouseMotionListener(new x_(this));
                                    ((C_)this.p).addActionListener(new kp_0(this, aM2, t3_02));
                                    this.add((C_)this.p);
                                    ((C_)this.p).addMouseListener(new o6_0(this, t3_02, aM2));
                                    try {
                                        object4 = lk_0.U("\uf040");
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    this.K = object4;
                                    ((C_)this.K).setForeground(new Color(0, 0, 0, bq_0.b(29679, 1973385342572120234L)));
                                    ((C_)this.K).addMouseMotionListener(new JQ(this));
                                }
                                bl6 = bl;
                            }
                            if (stringArray != null) break block73;
                            if (!bl6) {
                                ((JLabel)this.O).setFont(((Font)fx_2.j).deriveFont(1));
                            }
                            this.F = new yg_0();
                            if (stringArray != null) break block74;
                            bl6 = bl;
                        }
                        if (bl6) break block75;
                        try {
                            bl5 = (Boolean)aM2.q();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray != null) break block76;
                        if (!bl5) break block75;
                        bq_02 = this;
                        if (stringArray == null) {
                            try {
                                bl5 = (Boolean)bq_02.T();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        break block77;
                    }
                    if (bl5) {
                        this.add((Component)((yg_0)this.F), "width 10::");
                    }
                }
                ((yg_0)this.F).addMouseListener(new bc_1(this, aM2, t3_02));
                ((yg_0)this.F).addMouseMotionListener(new YX(this));
                try {
                    this.Q(t3_02);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bq_02 = this;
            }
            try {
                bq_02.I();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    void r() {
        try {
            this.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.W((Object)new ff_2(this), bq_0.b(5209, 444215567343955726L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private void d() {
        bq_0 bq_02;
        boolean bl;
        block23: {
            block20: {
                String[] stringArray;
                block22: {
                    block21: {
                        boolean bl2;
                        block19: {
                            block18: {
                                C_ c_;
                                block17: {
                                    bl = false;
                                    stringArray = aM.s();
                                    bq_0 bq_03 = this;
                                    if (stringArray == null) {
                                        if (bq_03.getMousePosition() != null) {
                                            bl = true;
                                        }
                                        bq_03 = this;
                                    }
                                    c_ = (C_)bq_03.K;
                                    if (stringArray != null) break block17;
                                    if (c_ == null) break block18;
                                    c_ = (C_)this.K;
                                }
                                if (c_.getMousePosition() != null) {
                                    bl = true;
                                }
                            }
                            bl2 = bl;
                            if (stringArray != null) break block19;
                            if (bl2 == this.U) break block20;
                            bl2 = bl;
                        }
                        if (!bl2) break block21;
                        try {
                            this.c();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray == null) break block22;
                    }
                    try {
                        this.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                bq_02 = this;
                if (stringArray != null) break block23;
                if ((C_)bq_02.K != null) {
                    ((C_)this.K).setVisible(bl);
                }
            }
            try {
                this.z(bl);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            bq_02 = this;
        }
        bq_02.U = bl;
    }

    void z(boolean bl) {
        this.m = bl;
    }

    void G() {
        Object object;
        int n10;
        block75: {
            Object object2;
            block76: {
                String[] stringArray;
                block77: {
                    int n11;
                    block78: {
                        Object object3;
                        Object object4;
                        Object object5;
                        Object object6;
                        Point point;
                        int n12;
                        block72: {
                            Window window;
                            block70: {
                                Object object7;
                                Object object8;
                                block71: {
                                    block73: {
                                        int n13;
                                        block74: {
                                            Object object9;
                                            Object object10;
                                            Object object11;
                                            Object object12;
                                            Object object13;
                                            Object object14;
                                            Object object15;
                                            block69: {
                                                block66: {
                                                    block68: {
                                                        aM aM2;
                                                        block67: {
                                                            aM aM3;
                                                            aM aM4;
                                                            block65: {
                                                                n12 = 0;
                                                                stringArray = aM.s();
                                                                aM4 = (aM)this.X;
                                                                if (stringArray != null) break block65;
                                                                if (aM4.getMousePosition() == null) {
                                                                    Object object16;
                                                                    this.X;
                                                                    try {
                                                                        object16 = aM.a();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    try {
                                                                        aM4 = (aM)object16.c();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                }
                                                                break block66;
                                                            }
                                                            aM2 = aM3 = aM4;
                                                            if (stringArray != null) break block67;
                                                            if (aM2 == null) break block68;
                                                            aM2 = aM3;
                                                        }
                                                        if (aM2.getMousePosition() != null) {
                                                            n12 = 1;
                                                        }
                                                    }
                                                    if (stringArray == null) break block69;
                                                }
                                                n12 = 1;
                                            }
                                            n10 = -1;
                                            this.X;
                                            try {
                                                object15 = aM.a();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object15.v(this.Q);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object14 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object13 = object14.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                window = (Window)object13.z();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (stringArray != null) break block70;
                                            if (!window.equals((Window)this.Q)) break block71;
                                            point = ((Window)this.Q).getMousePosition();
                                            if (stringArray != null) break block72;
                                            if (point == null) break block71;
                                            this.X;
                                            try {
                                                object12 = aM.a();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object11 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object10 = object11.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object9 = object10.z();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object12.G(object9);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            n13 = n12;
                                            if (stringArray != null) break block73;
                                            if (n13 == 0) break block74;
                                            n10 = jc_0.g;
                                            if (stringArray == null) break block75;
                                        }
                                        n13 = n10 = jc_0.S;
                                    }
                                    if (stringArray == null) break block75;
                                }
                                try {
                                    object8 = yt_1.i();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    object7 = object8.O();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    window = (Window)object7.z();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            point = window.getMousePosition();
                        }
                        if (point == null) break block76;
                        this.X;
                        try {
                            object6 = aM.a();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object5 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object4 = object5.O();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object3 = object4.z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object6.G(object3);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n11 = n12;
                        if (stringArray != null) break block77;
                        if (n11 == 0) break block78;
                        n10 = jc_0.w;
                        if (stringArray == null) break block75;
                    }
                    n11 = n10 = jc_0.p;
                }
                if (stringArray == null) break block75;
            }
            this.X;
            try {
                object2 = aM.a();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2.G(null);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            n10 = jc_0.e;
        }
        this.X;
        try {
            object = aM.a();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.u(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    void y() {
        block23: {
            block22: {
                block20: {
                    block21: {
                        try {
                            v0 = (bq_0)this.X.a();
                        }
                        catch (InvocationTargetException v1) {
                            throw v1.getTargetException();
                        }
                        var2_1 = v0;
                        var1_2 = aM.s();
                        v2 = var2_1;
                        if (var1_2 != null) break block20;
                        if (v2 == null) break block21;
                        v3 = ((bq_0)this.J).equals(var2_1);
                        if (var1_2 == null) {
                            if (!v3) {
                                try {
                                    var2_1.h();
                                }
                                catch (InvocationTargetException v4) {
                                    throw v4.getTargetException();
                                }
                                try {
                                    this.J.c();
                                }
                                catch (InvocationTargetException v5) {
                                    throw v5.getTargetException();
                                }
                            } else {
                                ** GOTO lbl29
                            }
                        }
                        break block22;
                    }
                    try {
                        this.X.J(null);
                    }
                    catch (InvocationTargetException v6) {
                        throw v6.getTargetException();
                    }
                    v2 = this;
                }
                if (var1_2 != null) break block23;
                v3 = ((th_1)v2.A).isVisible();
            }
            if (!v3) {
                v2 = this;
                if (var1_2 == null) {
                    try {
                        v7 = (Boolean)v2.X.p();
                    }
                    catch (InvocationTargetException v8) {
                        throw v8.getTargetException();
                    }
                    if (!v7) {
                        try {
                            yt_1.F.J(new di_0(this));
                        }
                        catch (InvocationTargetException v9) {
                            throw v9.getTargetException();
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                v2 = this;
            }
        }
        v2.g = System.currentTimeMillis();
    }

    public void N() {
    }

    public void I() {
        String[] stringArray = aM.s();
        bq_0 bq_02 = this;
        if (stringArray == null) {
            if (!bq_02.S) {
                xf_1 xf_12;
                Object object;
                Object object2;
                Object object3;
                try {
                    object3 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object2 = object3.Z();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object2.F();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    xf_12 = (xf_1)object.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.k = new Color(xf_12.p());
                this.k = cy_1.j;
            }
            bq_02 = this;
        }
        try {
            bq_02.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Exception decompiling
     */
    public void h() {
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

    public void c() {
        block22: {
            JLabel jLabel;
            block21: {
                Color color;
                Serializable serializable;
                String[] stringArray;
                block20: {
                    bq_0 bq_02;
                    block18: {
                        block19: {
                            boolean bl;
                            bq_0 bq_03;
                            Border border;
                            block13: {
                                block14: {
                                    int n10;
                                    block17: {
                                        int n11;
                                        block16: {
                                            int n12;
                                            Serializable serializable2;
                                            block15: {
                                                n11 = 0;
                                                border = (Border)this.N;
                                                stringArray = aM.s();
                                                bq_03 = this;
                                                if (stringArray != null) break block13;
                                                if (bq_03.G) break block14;
                                                serializable2 = serializable = (JComponent)this.getParent();
                                                if (stringArray != null) break block15;
                                                if (serializable2 == null) break block16;
                                                serializable2 = serializable;
                                            }
                                            n10 = n12 = ((JComponent)serializable2).getHeight() - (this.getY() + this.getHeight());
                                            if (stringArray != null) break block17;
                                            if (n10 < 5) {
                                                n11 = 1;
                                            }
                                        }
                                        n10 = n11;
                                    }
                                    if (n10 != 0) {
                                        border = (Border)this.f;
                                    }
                                }
                                this.setOpaque(true);
                                this.v = true;
                                bq_03 = this;
                            }
                            serializable = (Color)bq_03.W;
                            color = (Color)this.h;
                            bq_02 = this;
                            if (stringArray != null) break block18;
                            try {
                                bl = (Boolean)bq_02.B.t();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl) break block19;
                            serializable = (Color)this.k;
                            this.setBorder(border);
                            if (stringArray == null) break block20;
                        }
                        color = (Color)this.j;
                        bq_02 = this;
                    }
                    bq_02.setBorder((Border)this.x);
                }
                this.setBackground((Color)serializable);
                ((JLabel)this.O).setForeground(color);
                jLabel = (JLabel)this.r;
                if (stringArray != null) break block21;
                if (jLabel == null) break block22;
                jLabel = (JLabel)this.r;
            }
            jLabel.setForeground(((JLabel)this.O).getForeground());
        }
    }

    public void Q(t3_0 t3_02) {
        block12: {
            int n10;
            JLabel jLabel;
            block14: {
                block13: {
                    block19: {
                        String[] stringArray;
                        block22: {
                            boolean bl;
                            block20: {
                                DI dI;
                                block21: {
                                    DI dI2;
                                    block18: {
                                        block17: {
                                            fv_0 fv_02;
                                            block16: {
                                                fv_0 fv_03;
                                                lv_2 lv_22;
                                                block15: {
                                                    _y_0 _y_02;
                                                    String string;
                                                    String string2;
                                                    this.B = t3_02;
                                                    String[] stringArray2 = aM.s();
                                                    try {
                                                        string2 = (String)t3_02.r();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    String string3 = string2;
                                                    int n11 = t3_02.hashCode();
                                                    try {
                                                        string = (String)t3_02.r();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    ((JLabel)this.O).setText(string);
                                                    this.doLayout();
                                                    this.validate();
                                                    try {
                                                        _y_02 = (_y_0)t3_02.S();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    _y_0 _y_03 = _y_02;
                                                    stringArray = stringArray2;
                                                    if (stringArray != null) break block12;
                                                    if (_y_03 == null) break block13;
                                                    jLabel = (t_0)this.e;
                                                    if (stringArray != null) break block14;
                                                    if (jLabel == null) break block13;
                                                    dI = null;
                                                    lv_22 = null;
                                                    fv_03 = fv_02 = _y_03.s();
                                                    if (stringArray != null) break block15;
                                                    if (fv_03 == null) break block16;
                                                    fv_03 = fv_02;
                                                }
                                                dI = fv_03.e();
                                                lv_22 = fv_02.E();
                                            }
                                            if (fv_02 != null) break block17;
                                            ((t_0)this.e).setEnabled(false);
                                            if (stringArray == null) break block13;
                                        }
                                        dI2 = dI;
                                        if (stringArray != null) break block18;
                                        if (dI2 == null) break block19;
                                        dI2 = dI;
                                    }
                                    bl = dI2.t();
                                    if (stringArray != null) break block20;
                                    if (!bl) break block21;
                                    ((t_0)this.e).setEnabled(true);
                                    ((t_0)this.e).setForeground(new Color(0, bq_0.b(5209, 444215567343955726L), 0, bq_0.b(8865, 3538897718776076780L)));
                                    if (stringArray == null) break block13;
                                }
                                bl = dI.i();
                            }
                            if (!bl) break block22;
                            ((t_0)this.e).setEnabled(false);
                            ((t_0)this.e).setForeground(new Color(bq_0.b(29373, 3419710809736071656L), bq_0.b(6408, 8131986073360114247L), bq_0.b(30621, 6860886057269546188L), bq_0.b(8865, 3538897718776076780L)));
                            if (stringArray == null) break block13;
                        }
                        ((t_0)this.e).setEnabled(true);
                        ((t_0)this.e).setForeground(new Color(bq_0.b(31027, 8257738072422302274L), bq_0.b(32468, 1866864467146622352L), bq_0.b(32468, 1866864467146622352L), bq_0.b(8865, 3538897718776076780L)));
                        if (stringArray == null) break block13;
                    }
                    ((t_0)this.e).setEnabled(true);
                }
                jLabel = (JLabel)this.r;
            }
            try {
                n10 = (Integer)t3_02.w();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            jLabel.setText(n10 + "");
        }
    }

    public t3_0 Q() {
        return (t3_0)this.B;
    }

    public void M(t3_0 t3_02) {
        this.B = t3_02;
    }

    public long D() {
        return this.b;
    }

    public void u(long l2) {
        this.b = l2;
    }

    public boolean S() {
        return this.I;
    }

    public void T(boolean bl) {
        this.I = bl;
    }

    public boolean g() {
        return this.u;
    }

    public void x(boolean bl) {
        this.u = bl;
    }

    public boolean T() {
        return this.Z;
    }

    public void h(boolean bl) {
        this.Z = bl;
    }

    static void H(bq_0 bq_02) {
        try {
            bq_02.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[16];
                        var11_1 = 0;
                        var10_2 = "\u00f9\u00a0\u00cc\u0099\u00b5\nHd\u00d4\u00d2|\u00ce\u009f\u00c30\u0011\nB!C40'H\u009e&)(\u0099\u00af\u00e1S\u00ce\u00e2@)KT\u00f4\u00d4~E\u0085,lW\u00d6\u00a4\u0081\u009b\u008fCYU\u0005w\u00f9*\u00a0\u00df\u0016\u00af\u00dc\u00da\u009d\u000e\u0097\u001a\u0005:S\u00b1\u00e7\u0085\u0005\u00a4z`\u00c2\u00fd\u0005\u000b=\u0092*D(x\u000b\u00dd\u00c7Ip\u00b0{U\u001e7\u009d\u0006l\u008a\t\u008d\u00f3\u00ea0\u0006\t\u007f\u0011G\u001f\u00c6>\u0081\u0003\u00af\u00fa\u00f7\t\u00e0J\u001a\u00dag\u0086\u0005;j\u0093\u00c0\u0083\u0012\u00b1\u00d7=\u00ea\u00ff\u00fc\u00ba\u00ef\u0019F$\u0016\u00e5\u0089\t\u00d7\u009c ({>\u00bdaE\u00a41\u00e1eM1\u00f7\u00c6!\u0092\u00a0\u008e\u00c6\u008a\u0096\n\u00dd\u00fe\u008bwL\u00c0TAN\u00b7S\u00f4>\u0080\u00ea\u0016J\u00e6\u0092\n\u00f8n\u0014\u00dd\u00da\u001a\u0015<\u008d\u00d8\u000e}\u00dan\u00bd|vO\u008d\u00efA\u00d9\u00f6D\u00c2\u001cQu\u00ebH\u00cc\u00c8YZ-\u00bb\u0081\u00a9O)\u008fp\u00c2\n\u0006\u0010(\u00ef2J\u0007,]\u0017\u0005Ue\\!8";
                        var12_3 = "\u00f9\u00a0\u00cc\u0099\u00b5\nHd\u00d4\u00d2|\u00ce\u009f\u00c30\u0011\nB!C40'H\u009e&)(\u0099\u00af\u00e1S\u00ce\u00e2@)KT\u00f4\u00d4~E\u0085,lW\u00d6\u00a4\u0081\u009b\u008fCYU\u0005w\u00f9*\u00a0\u00df\u0016\u00af\u00dc\u00da\u009d\u000e\u0097\u001a\u0005:S\u00b1\u00e7\u0085\u0005\u00a4z`\u00c2\u00fd\u0005\u000b=\u0092*D(x\u000b\u00dd\u00c7Ip\u00b0{U\u001e7\u009d\u0006l\u008a\t\u008d\u00f3\u00ea0\u0006\t\u007f\u0011G\u001f\u00c6>\u0081\u0003\u00af\u00fa\u00f7\t\u00e0J\u001a\u00dag\u0086\u0005;j\u0093\u00c0\u0083\u0012\u00b1\u00d7=\u00ea\u00ff\u00fc\u00ba\u00ef\u0019F$\u0016\u00e5\u0089\t\u00d7\u009c ({>\u00bdaE\u00a41\u00e1eM1\u00f7\u00c6!\u0092\u00a0\u008e\u00c6\u008a\u0096\n\u00dd\u00fe\u008bwL\u00c0TAN\u00b7S\u00f4>\u0080\u00ea\u0016J\u00e6\u0092\n\u00f8n\u0014\u00dd\u00da\u001a\u0015<\u008d\u00d8\u000e}\u00dan\u00bd|vO\u008d\u00efA\u00d9\u00f6D\u00c2\u001cQu\u00ebH\u00cc\u00c8YZ-\u00bb\u0081\u00a9O)\u008fp\u00c2\n\u0006\u0010(\u00ef2J\u0007,]\u0017\u0005Ue\\!8".length();
                        var9_4 = 16;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 7;
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
                            var10_2 = "\u00a5\u00f1\u0083.7\u00f2\u00d0\u00eb\u00ea{\u008fGx\u0002\b\u00bf\u00d9\n\u00dd\u00ef\u00ecN\u001b";
                            var12_3 = "\u00a5\u00f1\u0083.7\u00f2\u00d0\u00eb\u00ea{\u008fGx\u0002\b\u00bf\u00d9\n\u00dd\u00ef\u00ecN\u001b".length();
                            var9_4 = 14;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 90;
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
                                    v15 = 2;
                                    break;
                                }
                                case 1: {
                                    v15 = 14;
                                    break;
                                }
                                case 2: {
                                    v15 = 81;
                                    break;
                                }
                                case 3: {
                                    v15 = 6;
                                    break;
                                }
                                case 4: {
                                    v15 = 21;
                                    break;
                                }
                                case 5: {
                                    v15 = 92;
                                    break;
                                }
                                default: {
                                    v15 = 95;
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
                bq_0.c = var13;
                bq_0.q = new String[16];
                var0_7 = 1951566969205254751L;
                var6_8 = new long[37];
                var3_9 = 0;
                var4_10 = "|i\u00be\u008d\\\"\u0084\u0096\u00a95\u001c\u0089\u0081\u00ae\u009b\u00e3q\u009d?\u00b0-&&\u0087l]p_SI\u0095\u0019\u00d7u\u0003K\u00e5\u00e1E\u0099C9\u000fY\u0018\u008cn\u00c2\u00ed\u00b6\u00bc\rb<\u00a3\u00d3\u009b\u0088D\u0016\r\u00a4\u00038\u00b3 $\u00c0\u00a4\u0087\u00ce\u008a\u00dc\r\u00e0o\u00ca q=\u001f\u00d2\u0002|\u00bf\u00c4fQ\u0010\u00a4\u0016\u00d11mUs\u00c2X\u0082\u00059\u00fbv\u0092\u00efE\r\u00e2\u00ac\u00fb\u000e\u00ee\u001d\u00f7\u00c2\u00b1\u00e4T\u00fb\u0098w\u00fd-\u0095EO\u00d0\u00d3#Pq\u008c\u00dcqh~\u0004\u0003D\u00ffx\u00f8u\u00a4'\u00b11e\u00ef)\u00bf\u00be1T]F\u0088r6^\fP\u00b2\u00138\u0001L\u00a6\u0084ZG\u00f6\r\u009eP\u00e7\u00efXB\u00f2\u00ee$\"cU\u00ef\t5\u0012\u00cf\u00af\u00fd.}F\u00fbv\u00da=Z(\u00a8\u001e\u0090z\u00ae\u0002\u00cc\u0090w'ks\u001by\u00ddP\u00a7/\u00f3\u00f4d\u00b4x\u00dc\u00e6.\u00fe7\u00d0\u00c8\u00c4\u00f1R\u00a7M\u0095o\u008d\u00e7=\u0090\u009b\u00b4\"\u00cb\u00f3U\u00fa\u0000x7\u0012\"6d`%\u0013;\u00a1n\u00d0\u00ca\u0099k\u0091\r\u00c7\u009f;\u00f70S\u009a\u00c6\u0014.(\u00e2";
                var5_11 = "|i\u00be\u008d\\\"\u0084\u0096\u00a95\u001c\u0089\u0081\u00ae\u009b\u00e3q\u009d?\u00b0-&&\u0087l]p_SI\u0095\u0019\u00d7u\u0003K\u00e5\u00e1E\u0099C9\u000fY\u0018\u008cn\u00c2\u00ed\u00b6\u00bc\rb<\u00a3\u00d3\u009b\u0088D\u0016\r\u00a4\u00038\u00b3 $\u00c0\u00a4\u0087\u00ce\u008a\u00dc\r\u00e0o\u00ca q=\u001f\u00d2\u0002|\u00bf\u00c4fQ\u0010\u00a4\u0016\u00d11mUs\u00c2X\u0082\u00059\u00fbv\u0092\u00efE\r\u00e2\u00ac\u00fb\u000e\u00ee\u001d\u00f7\u00c2\u00b1\u00e4T\u00fb\u0098w\u00fd-\u0095EO\u00d0\u00d3#Pq\u008c\u00dcqh~\u0004\u0003D\u00ffx\u00f8u\u00a4'\u00b11e\u00ef)\u00bf\u00be1T]F\u0088r6^\fP\u00b2\u00138\u0001L\u00a6\u0084ZG\u00f6\r\u009eP\u00e7\u00efXB\u00f2\u00ee$\"cU\u00ef\t5\u0012\u00cf\u00af\u00fd.}F\u00fbv\u00da=Z(\u00a8\u001e\u0090z\u00ae\u0002\u00cc\u0090w'ks\u001by\u00ddP\u00a7/\u00f3\u00f4d\u00b4x\u00dc\u00e6.\u00fe7\u00d0\u00c8\u00c4\u00f1R\u00a7M\u0095o\u008d\u00e7=\u0090\u009b\u00b4\"\u00cb\u00f3U\u00fa\u0000x7\u0012\"6d`%\u0013;\u00a1n\u00d0\u00ca\u0099k\u0091\r\u00c7\u009f;\u00f70S\u009a\u00c6\u0014.(\u00e2".length();
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
                    var4_10 = "\u00ed`kN\u00c0ul9\u0016\u00ad\u0015Wr\u00e3\u00de\u00ef";
                    var5_11 = "\u00ed`kN\u00c0ul9\u0016\u00ad\u0015Wr\u00e3\u00de\u00ef".length();
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
        bq_0.t = var6_8;
        bq_0.D = new Integer[37];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF89D6) & 0xFFFF;
        if (q[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 71;
                    break;
                }
                case 1: {
                    n14 = 210;
                    break;
                }
                case 2: {
                    n14 = 131;
                    break;
                }
                case 3: {
                    n14 = 31;
                    break;
                }
                case 4: {
                    n14 = 81;
                    break;
                }
                case 5: {
                    n14 = 201;
                    break;
                }
                case 6: {
                    n14 = 118;
                    break;
                }
                case 7: {
                    n14 = 184;
                    break;
                }
                case 8: {
                    n14 = 214;
                    break;
                }
                case 9: {
                    n14 = 120;
                    break;
                }
                case 10: {
                    n14 = 43;
                    break;
                }
                case 11: {
                    n14 = 3;
                    break;
                }
                case 12: {
                    n14 = 233;
                    break;
                }
                case 13: {
                    n14 = 74;
                    break;
                }
                case 14: {
                    n14 = 30;
                    break;
                }
                case 15: {
                    n14 = 153;
                    break;
                }
                case 16: {
                    n14 = 64;
                    break;
                }
                case 17: {
                    n14 = 94;
                    break;
                }
                case 18: {
                    n14 = 255;
                    break;
                }
                case 19: {
                    n14 = 157;
                    break;
                }
                case 20: {
                    n14 = 84;
                    break;
                }
                case 21: {
                    n14 = 168;
                    break;
                }
                case 22: {
                    n14 = 177;
                    break;
                }
                case 23: {
                    n14 = 198;
                    break;
                }
                case 24: {
                    n14 = 53;
                    break;
                }
                case 25: {
                    n14 = 151;
                    break;
                }
                case 26: {
                    n14 = 208;
                    break;
                }
                case 27: {
                    n14 = 100;
                    break;
                }
                case 28: {
                    n14 = 247;
                    break;
                }
                case 29: {
                    n14 = 7;
                    break;
                }
                case 30: {
                    n14 = 156;
                    break;
                }
                case 31: {
                    n14 = 202;
                    break;
                }
                case 32: {
                    n14 = 67;
                    break;
                }
                case 33: {
                    n14 = 181;
                    break;
                }
                case 34: {
                    n14 = 144;
                    break;
                }
                case 35: {
                    n14 = 52;
                    break;
                }
                case 36: {
                    n14 = 80;
                    break;
                }
                case 37: {
                    n14 = 24;
                    break;
                }
                case 38: {
                    n14 = 175;
                    break;
                }
                case 39: {
                    n14 = 41;
                    break;
                }
                case 40: {
                    n14 = 119;
                    break;
                }
                case 41: {
                    n14 = 95;
                    break;
                }
                case 42: {
                    n14 = 97;
                    break;
                }
                case 43: {
                    n14 = 85;
                    break;
                }
                case 44: {
                    n14 = 58;
                    break;
                }
                case 45: {
                    n14 = 169;
                    break;
                }
                case 46: {
                    n14 = 204;
                    break;
                }
                case 47: {
                    n14 = 46;
                    break;
                }
                case 48: {
                    n14 = 32;
                    break;
                }
                case 49: {
                    n14 = 35;
                    break;
                }
                case 50: {
                    n14 = 224;
                    break;
                }
                case 51: {
                    n14 = 235;
                    break;
                }
                case 52: {
                    n14 = 188;
                    break;
                }
                case 53: {
                    n14 = 221;
                    break;
                }
                case 54: {
                    n14 = 182;
                    break;
                }
                case 55: {
                    n14 = 161;
                    break;
                }
                case 56: {
                    n14 = 93;
                    break;
                }
                case 57: {
                    n14 = 4;
                    break;
                }
                case 58: {
                    n14 = 117;
                    break;
                }
                case 59: {
                    n14 = 105;
                    break;
                }
                case 60: {
                    n14 = 130;
                    break;
                }
                case 61: {
                    n14 = 88;
                    break;
                }
                case 62: {
                    n14 = 26;
                    break;
                }
                case 63: {
                    n14 = 27;
                    break;
                }
                case 64: {
                    n14 = 223;
                    break;
                }
                case 65: {
                    n14 = 15;
                    break;
                }
                case 66: {
                    n14 = 13;
                    break;
                }
                case 67: {
                    n14 = 16;
                    break;
                }
                case 68: {
                    n14 = 246;
                    break;
                }
                case 69: {
                    n14 = 148;
                    break;
                }
                case 70: {
                    n14 = 162;
                    break;
                }
                case 71: {
                    n14 = 18;
                    break;
                }
                case 72: {
                    n14 = 159;
                    break;
                }
                case 73: {
                    n14 = 114;
                    break;
                }
                case 74: {
                    n14 = 160;
                    break;
                }
                case 75: {
                    n14 = 61;
                    break;
                }
                case 76: {
                    n14 = 244;
                    break;
                }
                case 77: {
                    n14 = 38;
                    break;
                }
                case 78: {
                    n14 = 203;
                    break;
                }
                case 79: {
                    n14 = 248;
                    break;
                }
                case 80: {
                    n14 = 101;
                    break;
                }
                case 81: {
                    n14 = 136;
                    break;
                }
                case 82: {
                    n14 = 211;
                    break;
                }
                case 83: {
                    n14 = 132;
                    break;
                }
                case 84: {
                    n14 = 254;
                    break;
                }
                case 85: {
                    n14 = 122;
                    break;
                }
                case 86: {
                    n14 = 228;
                    break;
                }
                case 87: {
                    n14 = 152;
                    break;
                }
                case 88: {
                    n14 = 66;
                    break;
                }
                case 89: {
                    n14 = 245;
                    break;
                }
                case 90: {
                    n14 = 142;
                    break;
                }
                case 91: {
                    n14 = 200;
                    break;
                }
                case 92: {
                    n14 = 158;
                    break;
                }
                case 93: {
                    n14 = 191;
                    break;
                }
                case 94: {
                    n14 = 113;
                    break;
                }
                case 95: {
                    n14 = 219;
                    break;
                }
                case 96: {
                    n14 = 45;
                    break;
                }
                case 97: {
                    n14 = 40;
                    break;
                }
                case 98: {
                    n14 = 133;
                    break;
                }
                case 99: {
                    n14 = 14;
                    break;
                }
                case 100: {
                    n14 = 28;
                    break;
                }
                case 101: {
                    n14 = 116;
                    break;
                }
                case 102: {
                    n14 = 234;
                    break;
                }
                case 103: {
                    n14 = 170;
                    break;
                }
                case 104: {
                    n14 = 186;
                    break;
                }
                case 105: {
                    n14 = 253;
                    break;
                }
                case 106: {
                    n14 = 225;
                    break;
                }
                case 107: {
                    n14 = 183;
                    break;
                }
                case 108: {
                    n14 = 78;
                    break;
                }
                case 109: {
                    n14 = 83;
                    break;
                }
                case 110: {
                    n14 = 44;
                    break;
                }
                case 111: {
                    n14 = 207;
                    break;
                }
                case 112: {
                    n14 = 232;
                    break;
                }
                case 113: {
                    n14 = 10;
                    break;
                }
                case 114: {
                    n14 = 79;
                    break;
                }
                case 115: {
                    n14 = 36;
                    break;
                }
                case 116: {
                    n14 = 17;
                    break;
                }
                case 117: {
                    n14 = 185;
                    break;
                }
                case 118: {
                    n14 = 25;
                    break;
                }
                case 119: {
                    n14 = 134;
                    break;
                }
                case 120: {
                    n14 = 63;
                    break;
                }
                case 121: {
                    n14 = 154;
                    break;
                }
                case 122: {
                    n14 = 205;
                    break;
                }
                case 123: {
                    n14 = 174;
                    break;
                }
                case 124: {
                    n14 = 68;
                    break;
                }
                case 125: {
                    n14 = 199;
                    break;
                }
                case 126: {
                    n14 = 171;
                    break;
                }
                case 127: {
                    n14 = 73;
                    break;
                }
                case 128: {
                    n14 = 90;
                    break;
                }
                case 129: {
                    n14 = 34;
                    break;
                }
                case 130: {
                    n14 = 209;
                    break;
                }
                case 131: {
                    n14 = 220;
                    break;
                }
                case 132: {
                    n14 = 103;
                    break;
                }
                case 133: {
                    n14 = 135;
                    break;
                }
                case 134: {
                    n14 = 123;
                    break;
                }
                case 135: {
                    n14 = 87;
                    break;
                }
                case 136: {
                    n14 = 128;
                    break;
                }
                case 137: {
                    n14 = 197;
                    break;
                }
                case 138: {
                    n14 = 190;
                    break;
                }
                case 139: {
                    n14 = 180;
                    break;
                }
                case 140: {
                    n14 = 218;
                    break;
                }
                case 141: {
                    n14 = 51;
                    break;
                }
                case 142: {
                    n14 = 77;
                    break;
                }
                case 143: {
                    n14 = 217;
                    break;
                }
                case 144: {
                    n14 = 166;
                    break;
                }
                case 145: {
                    n14 = 237;
                    break;
                }
                case 146: {
                    n14 = 155;
                    break;
                }
                case 147: {
                    n14 = 11;
                    break;
                }
                case 148: {
                    n14 = 138;
                    break;
                }
                case 149: {
                    n14 = 82;
                    break;
                }
                case 150: {
                    n14 = 139;
                    break;
                }
                case 151: {
                    n14 = 146;
                    break;
                }
                case 152: {
                    n14 = 6;
                    break;
                }
                case 153: {
                    n14 = 23;
                    break;
                }
                case 154: {
                    n14 = 49;
                    break;
                }
                case 155: {
                    n14 = 250;
                    break;
                }
                case 156: {
                    n14 = 89;
                    break;
                }
                case 157: {
                    n14 = 178;
                    break;
                }
                case 158: {
                    n14 = 33;
                    break;
                }
                case 159: {
                    n14 = 20;
                    break;
                }
                case 160: {
                    n14 = 229;
                    break;
                }
                case 161: {
                    n14 = 226;
                    break;
                }
                case 162: {
                    n14 = 96;
                    break;
                }
                case 163: {
                    n14 = 124;
                    break;
                }
                case 164: {
                    n14 = 47;
                    break;
                }
                case 165: {
                    n14 = 9;
                    break;
                }
                case 166: {
                    n14 = 243;
                    break;
                }
                case 167: {
                    n14 = 70;
                    break;
                }
                case 168: {
                    n14 = 149;
                    break;
                }
                case 169: {
                    n14 = 127;
                    break;
                }
                case 170: {
                    n14 = 231;
                    break;
                }
                case 171: {
                    n14 = 227;
                    break;
                }
                case 172: {
                    n14 = 112;
                    break;
                }
                case 173: {
                    n14 = 239;
                    break;
                }
                case 174: {
                    n14 = 106;
                    break;
                }
                case 175: {
                    n14 = 240;
                    break;
                }
                case 176: {
                    n14 = 206;
                    break;
                }
                case 177: {
                    n14 = 242;
                    break;
                }
                case 178: {
                    n14 = 129;
                    break;
                }
                case 179: {
                    n14 = 2;
                    break;
                }
                case 180: {
                    n14 = 140;
                    break;
                }
                case 181: {
                    n14 = 252;
                    break;
                }
                case 182: {
                    n14 = 213;
                    break;
                }
                case 183: {
                    n14 = 39;
                    break;
                }
                case 184: {
                    n14 = 145;
                    break;
                }
                case 185: {
                    n14 = 121;
                    break;
                }
                case 186: {
                    n14 = 50;
                    break;
                }
                case 187: {
                    n14 = 176;
                    break;
                }
                case 188: {
                    n14 = 72;
                    break;
                }
                case 189: {
                    n14 = 98;
                    break;
                }
                case 190: {
                    n14 = 192;
                    break;
                }
                case 191: {
                    n14 = 69;
                    break;
                }
                case 192: {
                    n14 = 91;
                    break;
                }
                case 193: {
                    n14 = 212;
                    break;
                }
                case 194: {
                    n14 = 76;
                    break;
                }
                case 195: {
                    n14 = 55;
                    break;
                }
                case 196: {
                    n14 = 187;
                    break;
                }
                case 197: {
                    n14 = 167;
                    break;
                }
                case 198: {
                    n14 = 147;
                    break;
                }
                case 199: {
                    n14 = 48;
                    break;
                }
                case 200: {
                    n14 = 194;
                    break;
                }
                case 201: {
                    n14 = 163;
                    break;
                }
                case 202: {
                    n14 = 37;
                    break;
                }
                case 203: {
                    n14 = 104;
                    break;
                }
                case 204: {
                    n14 = 164;
                    break;
                }
                case 205: {
                    n14 = 29;
                    break;
                }
                case 206: {
                    n14 = 216;
                    break;
                }
                case 207: {
                    n14 = 0;
                    break;
                }
                case 208: {
                    n14 = 173;
                    break;
                }
                case 209: {
                    n14 = 92;
                    break;
                }
                case 210: {
                    n14 = 196;
                    break;
                }
                case 211: {
                    n14 = 99;
                    break;
                }
                case 212: {
                    n14 = 241;
                    break;
                }
                case 213: {
                    n14 = 236;
                    break;
                }
                case 214: {
                    n14 = 172;
                    break;
                }
                case 215: {
                    n14 = 115;
                    break;
                }
                case 216: {
                    n14 = 75;
                    break;
                }
                case 217: {
                    n14 = 215;
                    break;
                }
                case 218: {
                    n14 = 86;
                    break;
                }
                case 219: {
                    n14 = 111;
                    break;
                }
                case 220: {
                    n14 = 60;
                    break;
                }
                case 221: {
                    n14 = 108;
                    break;
                }
                case 222: {
                    n14 = 65;
                    break;
                }
                case 223: {
                    n14 = 21;
                    break;
                }
                case 224: {
                    n14 = 249;
                    break;
                }
                case 225: {
                    n14 = 5;
                    break;
                }
                case 226: {
                    n14 = 222;
                    break;
                }
                case 227: {
                    n14 = 150;
                    break;
                }
                case 228: {
                    n14 = 137;
                    break;
                }
                case 229: {
                    n14 = 126;
                    break;
                }
                case 230: {
                    n14 = 110;
                    break;
                }
                case 231: {
                    n14 = 179;
                    break;
                }
                case 232: {
                    n14 = 8;
                    break;
                }
                case 233: {
                    n14 = 62;
                    break;
                }
                case 234: {
                    n14 = 57;
                    break;
                }
                case 235: {
                    n14 = 22;
                    break;
                }
                case 236: {
                    n14 = 102;
                    break;
                }
                case 237: {
                    n14 = 12;
                    break;
                }
                case 238: {
                    n14 = 189;
                    break;
                }
                case 239: {
                    n14 = 54;
                    break;
                }
                case 240: {
                    n14 = 165;
                    break;
                }
                case 241: {
                    n14 = 251;
                    break;
                }
                case 242: {
                    n14 = 1;
                    break;
                }
                case 243: {
                    n14 = 56;
                    break;
                }
                case 244: {
                    n14 = 59;
                    break;
                }
                case 245: {
                    n14 = 109;
                    break;
                }
                case 246: {
                    n14 = 143;
                    break;
                }
                case 247: {
                    n14 = 238;
                    break;
                }
                case 248: {
                    n14 = 125;
                    break;
                }
                case 249: {
                    n14 = 141;
                    break;
                }
                case 250: {
                    n14 = 42;
                    break;
                }
                case 251: {
                    n14 = 19;
                    break;
                }
                case 252: {
                    n14 = 107;
                    break;
                }
                case 253: {
                    n14 = 230;
                    break;
                }
                case 254: {
                    n14 = 195;
                    break;
                }
                default: {
                    n14 = 193;
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
            bq_0.q[n12] = new String(cArray).intern();
        }
        return q[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3B53;
        if (D[n11] == null) {
            bq_0.D[n11] = (int)(t[n11] ^ l2);
        }
        return D[n11];
    }
}

