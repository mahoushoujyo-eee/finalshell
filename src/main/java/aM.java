/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aM
extends JPanel {
    aM v;
    ge_0 W;
    static th_1 g;
    static DP t;
    JScrollPane F;
    bq_0 i;
    ArrayList c;
    int a;
    t3_0 E;
    JPanel h;
    ArrayList M;
    int X;
    int I;
    FlowLayout p;
    nY V;
    Thread q;
    boolean Y;
    boolean k;
    boolean b;
    boolean G;
    boolean S;
    boolean R;
    boolean l;
    int K;
    boolean f;
    JComponent m;
    JComponent n;
    HashMap A;
    static jc_0 T;
    int y;
    U j;
    boolean s;
    CW B;
    boolean U;
    boolean C;
    boolean O;
    boolean P;
    Color u;
    Color Q;
    private static String[] N;
    private static final long[] d;
    private static final Integer[] e;

    public aM() {
        this(false);
    }

    public aM(boolean bl) {
        String[] stringArray;
        block17: {
            DP dP;
            block16: {
                JFrame jFrame;
                block15: {
                    th_1 th_12;
                    block14: {
                        this.i = null;
                        this.c = new ArrayList();
                        this.M = new ArrayList();
                        this.X = aM.a(4109, 216013914738614013L);
                        String[] stringArray2 = aM.s();
                        this.I = aM.a(488, 4670093833738407706L);
                        this.Y = false;
                        this.k = false;
                        this.b = false;
                        this.G = true;
                        this.S = true;
                        this.R = true;
                        this.l = false;
                        this.K = aM.a(31172, 2406642350534604587L);
                        this.f = true;
                        this.A = new HashMap();
                        stringArray = stringArray2;
                        this.y = -1;
                        this.s = false;
                        this.U = false;
                        this.C = false;
                        this.O = true;
                        this.P = false;
                        this.u = new Color(aM.a(25872, 7805825191738321899L), aM.a(440, 2468831384235626309L), aM.a(440, 2468831384235626309L));
                        this.Q = new Color(aM.a(9271, 5417176631180782275L), aM.a(5293, 5772053881979132507L), aM.a(5293, 5772053881979132507L), aM.a(6180, 8806695532090414792L));
                        this.U = bl;
                        this.v = this;
                        jFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
                        th_12 = (th_1)aM.g;
                        if (stringArray != null) break block14;
                        if (th_12 != null) break block15;
                        th_12 = new th_1((Window)jFrame);
                    }
                    aM.g = th_12;
                }
                dP = (DP)aM.t;
                if (stringArray != null) break block16;
                if (dP != null) break block17;
                dP = new DP((Window)jFrame);
            }
            aM.t = dP;
        }
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.p = new FlowLayout(0);
        ((FlowLayout)this.p).setVgap(this.X);
        ((FlowLayout)this.p).setHgap(this.I);
        this.setLayout((FlowLayout)this.p);
        this.W = new ge_0();
        this.addComponentListener(new vv_0(this));
        if (stringArray == null) {
            if ((jc_0)aM.T == null) {
                aM.T = new jc_0();
            }
            this.addMouseListener(new ft_2(this));
        }
        if (bl) {
            C_ c_;
            try {
                c_ = (C_)lk_0.U("\uf067");
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            C_ c_2 = c_;
            c_2.setFont((Font)fx_2.B);
            c_2.setMargin(new Insets(0, 2, 1, aM.a(1068, 4921128532049382098L)));
            this.n = c_2;
            this.add((JComponent)this.n);
            c_2.addActionListener(new TW(this));
            c_2.addMouseListener(new uz_0(this, c_2));
        }
        if (ky_2.F() != null) {
            aM.F(new String[5]);
        }
    }

    public void y() {
        block8: {
            Iterator iterator = ((HashMap)this.A).keySet().iterator();
            String[] stringArray = aM.s();
            while (iterator.hasNext()) {
                t3_0 t3_02 = (t3_0)((HashMap)this.A).get(iterator.next());
                try {
                    t3_02.c();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block8;
            }
            ((HashMap)this.A).clear();
            try {
                lk_0.C(this);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.L();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public t3_0 x(int n10) {
        if (n10 <= ((ArrayList)this.c).size()) {
            return (t3_0)((ArrayList)this.c).get(n10 - 1);
        }
        return null;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        int n10;
        String[] stringArray;
        block11: {
            block9: {
                Color color;
                block10: {
                    ArrayList arrayList;
                    super.paintComponent(graphics);
                    Graphics2D graphics2D = (Graphics2D)graphics;
                    stringArray = aM.s();
                    color = (Color)this.u;
                    if (stringArray != null) break block9;
                    if ((aM)this.v == null) break block10;
                    try {
                        arrayList = (ArrayList)this.v.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n10 = arrayList.size();
                    if (stringArray != null) break block11;
                    if (n10 > 0) {
                        color = (Color)this.Q;
                    }
                }
                graphics.setColor(color);
            }
            n10 = 1;
        }
        int n11 = n10;
        boolean bl = this.Y;
        if (stringArray == null) {
            if (bl) {
                n11 = 0;
            }
            bl = this.O;
        }
        if (bl) {
            graphics.drawLine(0, this.getHeight() - n11, this.getWidth(), this.getHeight() - n11);
        }
    }

    public JComponent o() {
        return (JComponent)this.m;
    }

    public void q(JComponent jComponent) {
        this.m = jComponent;
        this.add((Component)jComponent, 0);
    }

    public void i() {
        block14: {
            Object object;
            Object object2;
            Object object3;
            String[] stringArray = aM.s();
            try {
                aM.g.z();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String[] stringArray2 = stringArray;
            try {
                aM.t.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            for (t3_0 t3_02 : (ArrayList)this.c) {
                try {
                    t3_02.n();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (stringArray2 == null) {
                    if (stringArray2 == null) continue;
                }
                break block14;
            }
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
            this.V = object;
            this.repaint();
        }
    }

    protected void P(Graphics graphics) {
        if ((nY)this.V != null) {
            Color color;
            Color color2;
            Color color3;
            Graphics2D graphics2D = (Graphics2D)graphics;
            try {
                color3 = (Color)this.V.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Color color4 = color3;
            try {
                color2 = (Color)lk_0.j(color4);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            color4 = color2;
            try {
                color = (Color)this.V.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            GradientPaint gradientPaint = new GradientPaint(0.0f, 0.0f, new Color(aM.a(7991, 5906071494280139200L), aM.a(29038, 9053128655859859351L), aM.a(29038, 9053128655859859351L)), 0.0f, this.getHeight() * 5, color);
            graphics2D.setPaint(gradientPaint);
            graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
    }

    public void h(Y9 y9) {
        Iterator iterator = ((ArrayList)this.M).iterator();
        String[] stringArray = aM.s();
        while (iterator.hasNext()) {
            block19: {
                int n10;
                int n11;
                aL aL2;
                block24: {
                    int n12;
                    block25: {
                        block22: {
                            block23: {
                                block20: {
                                    block21: {
                                        block17: {
                                            block18: {
                                                int n13;
                                                aL2 = (aL)iterator.next();
                                                try {
                                                    n13 = (Integer)y9.Z();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                n11 = n12 = n13;
                                                n10 = Y9.D;
                                                if (stringArray != null) break block17;
                                                if (n11 != n10) break block18;
                                                try {
                                                    aL2.U(y9);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (stringArray == null) break block19;
                                            }
                                            n11 = n12;
                                            n10 = Y9.C;
                                        }
                                        if (stringArray != null) break block20;
                                        if (n11 != n10) break block21;
                                        try {
                                            aL2.P(y9);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (stringArray == null) break block19;
                                    }
                                    n11 = n12;
                                    n10 = Y9.u;
                                }
                                if (stringArray != null) break block22;
                                if (n11 != n10) break block23;
                                try {
                                    aL2.v(y9);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (stringArray == null) break block19;
                            }
                            n11 = n12;
                            n10 = Y9.f;
                        }
                        if (stringArray != null) break block24;
                        if (n11 != n10) break block25;
                        try {
                            aL2.K(y9);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray == null) break block19;
                    }
                    n11 = n12;
                    n10 = Y9.n;
                }
                if (n11 == n10) {
                    try {
                        aL2.D(y9);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            }
            if (stringArray == null) continue;
        }
    }

    public void c(aL aL2) {
        ((ArrayList)this.M).add(aL2);
    }

    public void n(t3_0 t3_02) {
        ArrayList arrayList = (ArrayList)((ArrayList)this.c).clone();
        Iterator iterator = arrayList.iterator();
        String[] stringArray = aM.s();
        while (iterator.hasNext()) {
            t3_0 t3_03 = (t3_0)iterator.next();
            boolean bl = t3_03.equals(t3_02);
            if (stringArray == null) {
                if (!bl) {
                    Object object;
                    try {
                        object = t3_03.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)object.T();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else if (bl) {
                try {
                    this.r(t3_03);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            if (stringArray == null) continue;
        }
    }

    public void n(boolean bl) {
        int n10 = 0;
        String[] stringArray = aM.s();
        if (this.U) {
            // empty if block
        }
        while (((ArrayList)this.c).size() > n10) {
            boolean bl2;
            Object object;
            t3_0 t3_02 = (t3_0)((ArrayList)this.c).get(((ArrayList)this.c).size() - 1 - n10);
            try {
                object = t3_02.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                bl2 = (Boolean)object.T();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl2) {
                boolean bl3 = bl;
                if (stringArray == null) {
                    bl3 = !bl3;
                }
                try {
                    this.X((Object)t3_02, false, bl3);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            if (stringArray == null) continue;
        }
    }

    public void j() {
        try {
            this.n(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void a(t3_0 t3_02) {
        try {
            this.n((Object)t3_02, false, false, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void r(t3_0 t3_02) {
        try {
            this.X((Object)t3_02, false, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void l() {
        try {
            this.l(((ArrayList)this.c).size() - 1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void v(t3_0 t3_02, boolean bl) {
        try {
            this.X((Object)t3_02, false, bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void N(t3_0 t3_02) {
        int n10;
        String[] stringArray = aM.s();
        try {
            this.r(t3_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray2 = stringArray;
        try {
            n10 = ((Boolean)this.m()).booleanValue();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (stringArray2 == null) {
            if (n10 != 0) {
                try {
                    n10 = (Integer)t3_02.C();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        } else {
            int n11 = n10;
            SwingUtilities.invokeLater(new kf_2(this, n11));
        }
    }

    public void X(t3_0 t3_02, boolean bl, boolean bl2) {
        try {
            this.n((Object)t3_02, bl, bl2, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void n(t3_0 t3_02, boolean bl, boolean bl2, boolean n10) {
        int n11;
        int n12;
        String[] stringArray;
        int n13;
        t3_0 t3_03;
        block48: {
            bq_0 bq_02;
            block49: {
                int n14;
                block50: {
                    int n15;
                    block51: {
                        int n16;
                        t3_03 = null;
                        n13 = -1;
                        stringArray = aM.s();
                        t3_0 t3_04 = t3_02;
                        if (stringArray == null) {
                            if (t3_04 == null) {
                                return;
                            }
                            t3_04 = t3_02;
                        }
                        try {
                            n16 = (Integer)t3_04.C();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n15 = n16;
                        try {
                            n12 = ((Boolean)t3_02.t()).booleanValue();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray != null) break block48;
                        if (n12 == 0) break block49;
                        n12 = ((ArrayList)this.c).size();
                        if (stringArray != null) break block48;
                        if (n12 <= 1) break block49;
                        n14 = n15;
                        if (stringArray != null) break block50;
                        if (n14 != ((ArrayList)this.c).size() - 1) break block51;
                        n13 = n15 - 1;
                        if (stringArray == null) break block49;
                    }
                    n14 = n15;
                }
                n13 = n14;
            }
            ((ArrayList)this.c).remove(t3_02);
            try {
                bq_02 = (bq_0)t3_02.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.remove(bq_02);
            try {
                n12 = ((Boolean)t3_02.t()).booleanValue() ? 1 : 0;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        if (stringArray == null) {
            if (n12 != 0) {
                try {
                    this.W.S();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            n12 = n13;
        }
        if (n12 > -1) {
            Object object;
            t3_03 = (t3_0)((ArrayList)this.c).get(n13);
            try {
                t3_03.b(true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                t3_03.e();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.E = t3_03;
            try {
                object = t3_03.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.W.f(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        try {
            n11 = (Integer)t3_02.w();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.A).remove(n11);
        try {
            this.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Y9 y9 = new Y9(t3_02, Y9.C);
        try {
            y9.a(bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n17 = n10;
        if (stringArray == null) {
            int n18;
            if (n17 != 0) {
                try {
                    this.h(y9);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            n17 = n18 = ((ArrayList)this.c).size();
        }
        if (t3_03 != null && !bl2) {
            try {
                this.h(t3_03);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Y9 y92 = new Y9(t3_03, Y9.u);
            try {
                y92.I(true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                y92.a(bl);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.h(y92);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public t3_0 U(t3_0 t3_02, int n10) {
        t3_0 t3_03;
        try {
            t3_03 = (t3_0)this.L((Object)t3_02, n10, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return t3_03;
    }

    public t3_0 L(t3_0 t3_02, int n10, boolean bl) {
        t3_0 t3_03;
        try {
            t3_03 = (t3_0)this.P((Object)t3_02, null, null, n10, false, bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return t3_03;
    }

    public t3_0 l(F8 f82, String string, int n10, boolean bl, boolean bl2) {
        t3_0 t3_02;
        try {
            t3_02 = (t3_0)this.P(null, (Object)f82, (Object)string, n10, bl, bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return t3_02;
    }

    public t3_0 P(t3_0 t3_02, F8 f82, String string, int n10, boolean bl, boolean bl2) {
        Object object;
        int n11;
        bq_0 bq_02;
        F8 f83;
        t3_0 t3_03;
        String[] stringArray;
        block61: {
            t3_0 t3_04;
            block59: {
                block60: {
                    boolean bl3;
                    Object object2;
                    Object object3;
                    Object object4;
                    Object object5;
                    String[] stringArray2 = aM.s();
                    this.a = n10;
                    stringArray = stringArray2;
                    t3_03 = new t3_0(string);
                    t3_04 = t3_02;
                    if (stringArray != null) break block59;
                    if (t3_04 == null) break block60;
                    try {
                        object5 = t3_02.r();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        t3_03.I(object5);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4 = t3_02.S();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        t3_03.D(object4);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object3 = t3_02.P();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        t3_03.h(object3);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2 = t3_02.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl3 = (Boolean)object2.S();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    bl = bl3;
                    if (stringArray == null) break block61;
                }
                t3_04 = t3_03;
            }
            try {
                t3_04.h(f82);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        try {
            t3_03.p(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            f83 = (F8)t3_03.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        f82 = f83;
        try {
            f82.U(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            f82.C(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            bq_02 = (bq_0)this.y((Object)t3_03, (Object)this, bl, bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        bq_0 bq_03 = bq_02;
        ((ArrayList)this.c).add(n10, t3_03);
        aM aM2 = this;
        if (stringArray == null) {
            if ((JComponent)aM2.m != null) {
                ++n10;
            }
            aM2 = this;
        }
        try {
            n11 = (Integer)aM2.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n12 = n11;
        try {
            t3_03.b(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_03.E(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_03.C(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.A).put(n12, t3_03);
        this.E = t3_03;
        try {
            t3_03.g(bq_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.add((Component)bq_03, n10);
        try {
            bq_03.Q(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.h(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            t3_03.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = t3_03.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.W.f(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.doLayout();
        this.repaint();
        try {
            this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Y9 y9 = new Y9(t3_03, Y9.u);
        try {
            y9.Y(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.h(y9);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return t3_03;
    }

    int N() {
        int n10;
        block3: {
            int n11;
            int n12 = 0;
            String[] stringArray = aM.s();
            for (int i2 = n11 = 1; i2 < aM.a(6883, 8562121222573937677L); ++i2) {
                n10 = ((HashMap)this.A).containsKey(i2) ? 1 : 0;
                if (stringArray == null) {
                    if (stringArray == null) {
                        if (n10 != 0) continue;
                        int n13 = n12 = i2;
                    }
                    if (stringArray == null) break;
                    if (stringArray == null) continue;
                }
                break block3;
            }
            n10 = n12;
        }
        return n10;
    }

    public void N(JComponent jComponent) {
        try {
            this.W.f(jComponent);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.doLayout();
        this.repaint();
    }

    public t3_0 T(F8 f82, String string, boolean bl, boolean bl2) {
        t3_0 t3_02;
        int n10 = ((ArrayList)this.c).size();
        try {
            t3_02 = (t3_0)this.l((Object)f82, (Object)string, n10, bl, bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return t3_02;
    }

    public t3_0 m(F8 f82, String string) {
        t3_0 t3_02;
        int n10 = ((ArrayList)this.c).size();
        try {
            t3_02 = (t3_0)this.l((Object)f82, (Object)string, n10, false, this.R);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return t3_02;
    }

    public t3_0 N(F8 f82, String string) {
        t3_0 t3_02;
        try {
            t3_02 = (t3_0)this.T((Object)f82, (Object)string, false, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return t3_02;
    }

    public t3_0 w(String string) {
        t3_0 t3_02 = null;
        Iterator iterator = ((ArrayList)this.c).iterator();
        String[] stringArray = aM.s();
        while (iterator.hasNext()) {
            boolean bl;
            F8 f82;
            F8 f83;
            t3_0 t3_03 = (t3_0)iterator.next();
            try {
                f83 = (F8)t3_03.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            F8 f84 = f82 = f83;
            if (stringArray == null) {
                if (!f84.getClass().equals(CT.class)) continue;
                f84 = f82;
            }
            CT cT = (CT)f84;
            try {
                bl = (Boolean)cT.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (stringArray == null) {
                String string2;
                if (bl) continue;
                try {
                    string2 = (String)cT.T();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bl = string2.equals(string);
            }
            if (!bl) continue;
            t3_02 = t3_03;
            break;
        }
        return t3_02;
    }

    public t3_0 B(String string) {
        t3_0 t3_02 = null;
        String[] stringArray = aM.s();
        for (t3_0 t3_03 : (ArrayList)this.c) {
            String string2;
            F8 f82;
            F8 f83;
            try {
                f83 = (F8)t3_03.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            F8 f84 = f82 = f83;
            if (stringArray == null) {
                if (!f84.getClass().equals(C4.class)) continue;
                f84 = f82;
            }
            C4 c4 = (C4)f84;
            try {
                string2 = (String)c4.T();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!string2.equals(string)) continue;
            t3_02 = t3_03;
            break;
        }
        return t3_02;
    }

    public t3_0 q(String string) {
        t3_0 t3_02 = null;
        Iterator iterator = ((ArrayList)this.c).iterator();
        String[] stringArray = aM.s();
        while (iterator.hasNext()) {
            boolean bl;
            F8 f82;
            F8 f83;
            t3_0 t3_03 = (t3_0)iterator.next();
            try {
                f83 = (F8)t3_03.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            F8 f84 = f82 = f83;
            if (stringArray == null) {
                if (!f84.getClass().equals(CE.class)) continue;
                f84 = f82;
            }
            CE cE = (CE)f84;
            try {
                bl = (Boolean)cE.O();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (stringArray == null) {
                String string2;
                if (!bl) continue;
                try {
                    string2 = (String)cE.T();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bl = string2.equals(string);
            }
            if (!bl) continue;
            t3_02 = t3_03;
            break;
        }
        return t3_02;
    }

    public t3_0 l(String string) {
        t3_0 t3_02 = null;
        Iterator iterator = ((ArrayList)this.c).iterator();
        String[] stringArray = aM.s();
        while (iterator.hasNext()) {
            String string2;
            F8 f82;
            F8 f83;
            t3_0 t3_03 = (t3_0)iterator.next();
            try {
                f83 = (F8)t3_03.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            F8 f84 = f82 = f83;
            if (stringArray == null) {
                if (!f84.getClass().equals(F5.class)) continue;
                f84 = f82;
            }
            F5 f52 = (F5)f84;
            try {
                string2 = (String)f52.R();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!string2.equals(string)) continue;
            t3_02 = t3_03;
            break;
        }
        return t3_02;
    }

    public t3_0 Y(JComponent jComponent) {
        t3_0 t3_02 = null;
        for (t3_0 t3_03 : (ArrayList)this.c) {
            F8 f82;
            try {
                f82 = (F8)t3_03.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            F8 f83 = f82;
            if (!f83.equals(jComponent)) continue;
            t3_02 = t3_03;
            break;
        }
        return t3_02;
    }

    public void m() {
        String[] stringArray = aM.s();
        int n10 = ((ArrayList)this.c).size();
        int n11 = 1;
        if (stringArray == null) {
            if (n10 <= n11) {
                return;
            }
            n10 = this.a;
            n11 = 1;
        }
        int n12 = n10 - n11;
        if (stringArray == null) {
            if (n12 < 0) {
                n12 = ((ArrayList)this.c).size() - 1;
            }
            try {
                this.X((t3_0)((ArrayList)this.c).get(n12));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void s() {
        String[] stringArray = aM.s();
        int n10 = ((ArrayList)this.c).size();
        int n11 = 1;
        if (stringArray == null) {
            if (n10 <= n11) {
                return;
            }
            n10 = this.a;
            n11 = 1;
        }
        int n12 = n10 + n11;
        if (stringArray == null) {
            if (n12 > ((ArrayList)this.c).size() - 1) {
                n12 = 0;
            }
            try {
                this.X((t3_0)((ArrayList)this.c).get(n12));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void l(int n10) {
        block8: {
            int n11;
            block7: {
                int n12;
                block6: {
                    String[] stringArray = aM.s();
                    n11 = ((ArrayList)this.c).size();
                    n12 = 1;
                    if (stringArray != null) break block6;
                    if (n11 <= n12) {
                        return;
                    }
                    n11 = n10;
                    if (stringArray != null) break block7;
                    n12 = ((ArrayList)this.c).size() - 1;
                }
                if (n11 <= n12) break block8;
                n11 = 0;
            }
            n10 = n11;
        }
        try {
            this.X((t3_0)((ArrayList)this.c).get(n10));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void X(t3_0 t3_02) {
        block17: {
            t3_0 t3_03;
            String[] stringArray;
            block18: {
                block16: {
                    stringArray = aM.s();
                    t3_03 = t3_02;
                    if (stringArray != null) break block16;
                    if (t3_03 == null) break block17;
                    t3_03 = (t3_0)this.E;
                }
                if (stringArray != null) break block18;
                if (t3_03 == null) break block17;
                t3_03 = (t3_0)this.E;
            }
            int n10 = t3_03.equals(t3_02);
            if (stringArray == null) {
                if (n10 == 0) {
                    this.b = true;
                    try {
                        n10 = (Integer)t3_02.C();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                int n11;
                if ((n11 = n10) == this.a) {
                    // empty if block
                }
                this.a = n11;
                try {
                    t3_02.b(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    t3_02.e();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.E = t3_02;
                try {
                    this.h(t3_02);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.validate();
                this.repaint();
                try {
                    this.T(t3_02);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    public void T(t3_0 t3_02) {
        Y9 y9 = new Y9(t3_02, Y9.u);
        try {
            this.h(y9);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void h(t3_0 t3_02) {
        Iterator iterator = ((ArrayList)this.c).iterator();
        String[] stringArray = aM.s();
        while (iterator.hasNext()) {
            block20: {
                Object object;
                Object object2;
                t3_0 t3_03;
                block18: {
                    t3_0 t3_04;
                    block19: {
                        Object object3;
                        t3_03 = t3_04 = (t3_0)iterator.next();
                        if (stringArray != null) break block18;
                        if (t3_03.equals(t3_02)) break block19;
                        try {
                            t3_04.b(false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object3 = t3_04.k();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object3.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray == null) break block20;
                    }
                    try {
                        t3_04.b(true);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    t3_03 = t3_04;
                }
                try {
                    object2 = t3_03.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object2.h();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = t3_02.P();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.W.f(object);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            if (stringArray == null) continue;
        }
    }

    public void u() {
        Iterator iterator = ((ArrayList)this.c).iterator();
        String[] stringArray = aM.s();
        while (iterator.hasNext()) {
            Object object;
            t3_0 t3_02 = (t3_0)iterator.next();
            try {
                t3_02.b(false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = t3_02.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                t3_02.e();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (stringArray == null) continue;
        }
    }

    void e(t3_0 t3_02, int n10, int n11) {
        int n12;
        String[] stringArray;
        block27: {
            Component[] componentArray;
            Object object;
            String[] stringArray2 = aM.s();
            try {
                object = t3_02.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.i = object;
            this.add((Component)((bq_0)this.i), n11);
            stringArray = stringArray2;
            try {
                this.i.c();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Component[] componentArray2 = componentArray = this.getComponents();
            int n13 = componentArray2.length;
            int n14 = 0;
            while (n14 < n13) {
                block28: {
                    block29: {
                        Component component;
                        block30: {
                            Component component2 = componentArray2[n14];
                            if (stringArray != null) break block28;
                            n12 = component2.equals((bq_0)this.i) ? 1 : 0;
                            if (stringArray != null) break block27;
                            if (n12 != 0) break block29;
                            component = component2;
                            if (stringArray != null) break block30;
                            if (!component.getClass().equals(bq_0.class)) break block29;
                            component = component2;
                        }
                        bq_0 bq_02 = (bq_0)component;
                        try {
                            bq_02.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    ++n14;
                }
                if (stringArray == null) continue;
            }
            n12 = n11;
        }
        int n15 = n12;
        JComponent jComponent = (JComponent)this.m;
        if (stringArray == null) {
            int n16;
            if (jComponent != null) {
                --n15;
            }
            try {
                n16 = (Integer)t3_02.C();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            jComponent = ((ArrayList)this.c).remove(n16);
        }
        ((ArrayList)this.c).add(n15, t3_02);
        this.a = n15;
        this.E = t3_02;
        try {
            this.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Y9 y9 = new Y9(t3_02, Y9.n);
        try {
            y9.P(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            y9.j(n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            y9.m(n15);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.h(y9);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void B() {
        this.doLayout();
        try {
            yt_1.F.J(new gE(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void U() {
        String[] stringArray = aM.s();
        for (int i2 = 0; i2 < ((ArrayList)this.c).size(); ++i2) {
            Object object;
            try {
                object = (t3_0)((ArrayList)this.c).get(i2).k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.h();
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    void R() {
        String[] stringArray = aM.s();
        for (int i2 = 0; i2 < ((ArrayList)this.c).size(); ++i2) {
            Object object;
            t3_0 t3_02 = (t3_0)((ArrayList)this.c).get(i2);
            try {
                t3_02.E(i2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                t3_02.C(i2 + 1);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = t3_02.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.Q(t3_02);
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    int X(Component component) {
        int n10;
        block3: {
            Component[] componentArray;
            int n11 = 0;
            Component[] componentArray2 = componentArray = this.getComponents();
            String[] stringArray = aM.s();
            int n12 = componentArray2.length;
            int n13 = 0;
            while (n13 < n12) {
                Component component2 = componentArray2[n13];
                if (stringArray == null) {
                    n10 = component2.equals(component) ? 1 : 0;
                    if (stringArray != null) break block3;
                    if (n10 != 0 && stringArray == null) break;
                    ++n11;
                    ++n13;
                }
                if (stringArray == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public void K(t3_0 t3_02) {
        bq_0 bq_02;
        try {
            bq_02 = (bq_0)t3_02.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.remove(bq_02);
        this.doLayout();
        this.repaint();
    }

    public void Q(t3_0 t3_02) {
        Object object;
        try {
            object = t3_02.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.Q(t3_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.doLayout();
        this.repaint();
    }

    public static void P(bq_0 bq_02, Point point, aM aM2) {
        boolean bl;
        block5: {
            boolean bl2;
            block4: {
                String[] stringArray = aM.s();
                Point point2 = new Point();
                SwingUtilities.convertPointFromScreen(point, aM2);
                String[] stringArray2 = stringArray;
                bl = true;
                try {
                    bl2 = (Boolean)aM.T.s();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (stringArray2 != null) break block4;
                if (!bl2) break block5;
                bl2 = true;
            }
            bl = bl2;
        }
        Point point3 = MouseInfo.getPointerInfo().getLocation();
        point3.x += aM.a(19303, 7176326699541038488L);
        point3.y += aM.a(19303, 7176326699541038488L);
        ((DP)aM.t).setLocation(point3);
        ((DP)aM.t).setVisible(bl);
        ((th_1)aM.g).setVisible(false);
    }

    public static int X(bq_0 bq_02, Point point, aM aM2, boolean bl) {
        int n10;
        int n11;
        String[] stringArray;
        block86: {
            block87: {
                Point point2;
                block85: {
                    double d2;
                    block84: {
                        block82: {
                            int n12;
                            block83: {
                                int n13;
                                int n14;
                                block81: {
                                    block80: {
                                        int n15;
                                        aM aM3;
                                        Serializable serializable;
                                        Serializable serializable2;
                                        block79: {
                                            JScrollPane jScrollPane;
                                            block77: {
                                                block70: {
                                                    Component component;
                                                    block78: {
                                                        boolean bl2;
                                                        Component component2;
                                                        block71: {
                                                            block72: {
                                                                int n16;
                                                                block76: {
                                                                    block75: {
                                                                        int n17;
                                                                        block73: {
                                                                            Point point3;
                                                                            block74: {
                                                                                int n18;
                                                                                Component component3;
                                                                                Point point4;
                                                                                block69: {
                                                                                    boolean bl3;
                                                                                    block63: {
                                                                                        boolean bl4;
                                                                                        block67: {
                                                                                            Component component4;
                                                                                            block68: {
                                                                                                block62: {
                                                                                                    Component component5;
                                                                                                    block66: {
                                                                                                        block64: {
                                                                                                            block65: {
                                                                                                                boolean bl5;
                                                                                                                block61: {
                                                                                                                    int n19;
                                                                                                                    String[] stringArray2 = aM.s();
                                                                                                                    point2 = new Point();
                                                                                                                    SwingUtilities.convertPointFromScreen(point, aM2);
                                                                                                                    component2 = aM2.getComponentAt(point);
                                                                                                                    try {
                                                                                                                        n19 = (Integer)aM2.X(bq_02);
                                                                                                                    }
                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                    }
                                                                                                                    n12 = n19;
                                                                                                                    stringArray = stringArray2;
                                                                                                                    n17 = 4;
                                                                                                                    n14 = 1;
                                                                                                                    n11 = -1;
                                                                                                                    point4 = null;
                                                                                                                    bl4 = false;
                                                                                                                    component5 = component2;
                                                                                                                    if (stringArray != null) break block64;
                                                                                                                    if (component5 == null) break block65;
                                                                                                                    component5 = component2;
                                                                                                                    if (stringArray != null) break block64;
                                                                                                                    if (component5.getClass().equals(bq_0.class)) break block65;
                                                                                                                    serializable2 = new Point();
                                                                                                                    ((Point)serializable2).y = (int)point.getY();
                                                                                                                    ((Point)serializable2).x = (int)point.getX();
                                                                                                                    serializable = component2;
                                                                                                                    while (((Point)serializable2).getX() > 0.0) {
                                                                                                                        bl5 = serializable.getClass().equals(bq_0.class);
                                                                                                                        if (stringArray == null && stringArray == null) {
                                                                                                                            if (bl5) break;
                                                                                                                            --((Point)serializable2).x;
                                                                                                                            serializable = aM2.getComponentAt((Point)serializable2);
                                                                                                                            if (stringArray == null) continue;
                                                                                                                        }
                                                                                                                        break block61;
                                                                                                                    }
                                                                                                                    component5 = serializable;
                                                                                                                    if (stringArray != null) break block64;
                                                                                                                    bl5 = component5.getClass().equals(bq_0.class);
                                                                                                                }
                                                                                                                if (bl5) {
                                                                                                                    bl4 = true;
                                                                                                                    component2 = serializable;
                                                                                                                }
                                                                                                            }
                                                                                                            component5 = component2;
                                                                                                        }
                                                                                                        if (stringArray != null) break block66;
                                                                                                        if (component5 == null) break block67;
                                                                                                        component5 = component2;
                                                                                                    }
                                                                                                    bl3 = component5.getClass().equals(bq_0.class);
                                                                                                    if (stringArray != null) break block63;
                                                                                                    if (bl3) break block67;
                                                                                                    serializable2 = new Point();
                                                                                                    ((Point)serializable2).y = (int)point.getY();
                                                                                                    ((Point)serializable2).x = (int)point.getX();
                                                                                                    serializable = component2;
                                                                                                    while (((Point)serializable2).getX() < (double)aM2.getWidth()) {
                                                                                                        component4 = serializable;
                                                                                                        if (stringArray != null) break block62;
                                                                                                        bl3 = component4.getClass().equals(bq_0.class);
                                                                                                        if (stringArray == null) {
                                                                                                            if (bl3) break;
                                                                                                            ++((Point)serializable2).x;
                                                                                                            serializable = aM2.getComponentAt((Point)serializable2);
                                                                                                            if (stringArray == null) continue;
                                                                                                        }
                                                                                                        break block63;
                                                                                                    }
                                                                                                    component4 = serializable;
                                                                                                }
                                                                                                if (stringArray != null) break block68;
                                                                                                if (component4 == null) break block67;
                                                                                                component4 = serializable;
                                                                                            }
                                                                                            bl3 = component4.getClass().equals(bq_0.class);
                                                                                            if (stringArray != null) break block63;
                                                                                            if (bl3) {
                                                                                                bl4 = true;
                                                                                                component2 = serializable;
                                                                                            }
                                                                                        }
                                                                                        bl3 = bl4;
                                                                                    }
                                                                                    if (!bl3) {
                                                                                        // empty if block
                                                                                    }
                                                                                    component3 = component2;
                                                                                    if (stringArray != null) break block69;
                                                                                    if (component3 == null) break block70;
                                                                                    component3 = component2;
                                                                                }
                                                                                bl2 = component3.getClass().equals(bq_0.class);
                                                                                if (stringArray != null) break block71;
                                                                                if (!bl2) break block72;
                                                                                serializable2 = (bq_0)component2;
                                                                                point4 = SwingUtilities.convertPoint(aM2, point, (Component)serializable2);
                                                                                point2.y = ((Component)serializable2).getLocationOnScreen().y;
                                                                                point2.x = ((Component)serializable2).getLocationOnScreen().x;
                                                                                try {
                                                                                    n18 = (Integer)aM2.X(serializable2);
                                                                                }
                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                    throw invocationTargetException.getTargetException();
                                                                                }
                                                                                n11 = n18;
                                                                                point3 = point4;
                                                                                if (stringArray != null) break block73;
                                                                                if (point3.x <= ((JComponent)serializable2).getWidth() / 2) break block74;
                                                                                point2.x += ((JComponent)serializable2).getWidth() + n17 / 2;
                                                                                ++n11;
                                                                                if (stringArray == null) break block75;
                                                                            }
                                                                            point3 = point2;
                                                                        }
                                                                        point3.x -= n17 / 2;
                                                                    }
                                                                    --point2.x;
                                                                    if (n12 == n11) {
                                                                        // empty if block
                                                                    }
                                                                    n16 = n12 + 1;
                                                                    if (stringArray != null) break block76;
                                                                    if (n16 != n11) break block77;
                                                                    n16 = 0;
                                                                }
                                                                n14 = n16;
                                                                break block77;
                                                            }
                                                            component = component2;
                                                            if (stringArray != null) break block78;
                                                            bl2 = component.getClass().equals(aM.class);
                                                        }
                                                        if (!bl2) break block77;
                                                        component = component2;
                                                    }
                                                    serializable2 = (aM)component;
                                                    n14 = 0;
                                                    if (stringArray == null) break block77;
                                                }
                                                n14 = 0;
                                            }
                                            aM3 = aM2;
                                            if (stringArray != null) break block79;
                                            try {
                                                jScrollPane = (JScrollPane)aM3.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (jScrollPane == null) break block80;
                                            aM3 = aM2;
                                        }
                                        serializable2 = aM3.getBounds();
                                        n13 = point.y;
                                        if (stringArray == null) {
                                            double d3;
                                            JScrollPane jScrollPane;
                                            try {
                                                jScrollPane = (JScrollPane)aM2.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (n13 > jScrollPane.getHeight()) {
                                                serializable = new Rectangle(0, (int)point.getY(), aM2.getWidth(), 5);
                                                aM2.scrollRectToVisible((Rectangle)serializable);
                                            }
                                            n13 = (d3 = ((Rectangle)serializable2).getY() - 0.0) == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                                        }
                                        if (stringArray != null) break block81;
                                        if (n13 >= 0) break block80;
                                        n13 = n15 = ((Rectangle)serializable2).y + point.y;
                                        if (stringArray != null) break block81;
                                        if (n13 < 0) {
                                            Rectangle rectangle = new Rectangle(((Rectangle)serializable2).x, point.y - 5, aM2.getWidth(), 5);
                                            aM2.scrollRectToVisible(rectangle);
                                        }
                                    }
                                    n13 = n14;
                                }
                                if (n13 != 0) {
                                    // empty if block
                                }
                                n10 = n14;
                                if (stringArray != null) break block82;
                                if (n10 != 0) break block83;
                                n11 = -1;
                                if (stringArray == null) break block84;
                            }
                            n10 = n11 - n12;
                        }
                        if (stringArray != null) break block85;
                        if (n10 > 1) {
                            --n11;
                        }
                    }
                    n10 = (d2 = point2.getX() - 0.0) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                }
                if (stringArray != null) break block86;
                if (n10 <= 0) break block87;
                double d4 = point2.getY() - 0.0;
                n10 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                if (stringArray != null) break block86;
                if (n10 > 0) {
                    ((th_1)aM.g).setLocation(point2);
                    ((th_1)aM.g).setSize(((th_1)aM.g).getWidth(), aM2.K - 2);
                }
            }
            n10 = bl ? 1 : 0;
        }
        if (stringArray == null) {
            if (n10 != 0) {
                ((th_1)aM.g).setVisible(true);
            }
            ((DP)aM.t).setVisible(false);
            n10 = n11;
        }
        return n10;
    }

    bq_0 y(t3_0 t3_02, aM aM2, boolean bl, boolean bl2) {
        bq_0 bq_02 = new bq_0(t3_02, aM2, this.Y, this.k, bl, this.K, bl2);
        return bq_02;
    }

    public th_1 L() {
        return (th_1)aM.g;
    }

    public void W(th_1 th_12) {
        aM.g = th_12;
    }

    public JScrollPane O() {
        return (JScrollPane)this.F;
    }

    public void x(JScrollPane jScrollPane) {
        this.F = jScrollPane;
    }

    public bq_0 a() {
        return (bq_0)this.i;
    }

    public void J(bq_0 bq_02) {
        this.i = bq_02;
    }

    public ge_0 v() {
        return (ge_0)this.W;
    }

    public void a(ge_0 ge_02) {
        this.W = ge_02;
    }

    public ArrayList g() {
        return (ArrayList)this.c;
    }

    public void e(ArrayList arrayList) {
        this.c = arrayList;
    }

    public Thread W() {
        return (Thread)this.q;
    }

    public void M(Thread thread) {
        this.q = thread;
    }

    public boolean J() {
        return this.Y;
    }

    public void N(boolean bl) {
        block6: {
            int n10;
            aM aM2;
            block4: {
                block5: {
                    String[] stringArray = aM.s();
                    aM2 = this;
                    n10 = bl;
                    if (stringArray != null) break block4;
                    aM2.Y = n10 != 0;
                    if (!bl) break block5;
                    this.K = aM.a(7865, 4720692661393674316L);
                    if (stringArray == null) break block6;
                }
                aM2 = this;
                n10 = aM.a(12773, 523748926135369501L);
            }
            aM2.K = n10;
        }
        try {
            this.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public t3_0 Q() {
        return (t3_0)this.E;
    }

    public void j(t3_0 t3_02) {
        this.E = t3_02;
    }

    public boolean C() {
        return this.k;
    }

    public void H(boolean bl) {
        this.k = bl;
        try {
            this.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void f() {
        block6: {
            aM aM2;
            block2: {
                block3: {
                    aM aM3;
                    String[] stringArray;
                    block4: {
                        block5: {
                            stringArray = aM.s();
                            aM2 = this;
                            if (stringArray != null) break block2;
                            if (!aM2.Y) break block3;
                            aM3 = this;
                            if (stringArray != null) break block4;
                            if (aM3.k) break block5;
                            ((th_1)aM.g).setSize(((th_1)aM.g).getWidth(), aM.a(30295, 4342977418755356845L));
                            this.X = 1;
                            this.I = 1;
                            if (stringArray == null) break block6;
                        }
                        this.X = 1;
                        aM3 = this;
                    }
                    aM3.I = 1;
                    ((th_1)aM.g).setSize(((th_1)aM.g).getWidth(), aM.a(8979, 3211277763751833056L));
                    if (stringArray == null) break block6;
                }
                this.X = aM.a(25600, 4680497975577783025L);
                aM2 = this;
            }
            aM2.I = aM.a(21971, 1226775875533445935L);
        }
        ((FlowLayout)this.p).setHgap(this.X);
        ((FlowLayout)this.p).setVgap(this.I);
    }

    public boolean K() {
        return this.b;
    }

    public void k(boolean bl) {
        this.b = bl;
    }

    public boolean P() {
        return this.G;
    }

    public void s(boolean bl) {
        this.G = bl;
    }

    public boolean A() {
        return this.S;
    }

    public void Y(boolean bl) {
        this.S = bl;
    }

    public boolean q() {
        return this.R;
    }

    public void a(boolean bl) {
        this.R = bl;
    }

    public boolean p() {
        return this.l;
    }

    public void i(boolean bl) {
        this.l = bl;
    }

    public int Q() {
        return this.K;
    }

    public void G(int n10) {
        this.K = n10;
    }

    public boolean l() {
        return this.f;
    }

    public void f(boolean bl) {
        this.f = bl;
    }

    public static jc_0 a() {
        return (jc_0)aM.T;
    }

    public static void v(jc_0 jc_02) {
        aM.T = jc_02;
    }

    public int z() {
        return this.y;
    }

    public void s(int n10) {
        this.y = n10;
    }

    public static DP q() {
        return (DP)aM.t;
    }

    public static void T(DP dP) {
        aM.t = dP;
    }

    public U G() {
        return (U)this.j;
    }

    public void G(U u10) {
        this.j = u10;
    }

    public boolean E() {
        return this.s;
    }

    public void J(boolean bl) {
        this.s = bl;
    }

    public CW u() {
        return (CW)this.B;
    }

    public void y(CW cW) {
        this.B = cW;
    }

    public boolean m() {
        return this.U;
    }

    public void d(boolean bl) {
        this.U = bl;
    }

    public boolean O() {
        return this.C;
    }

    public void m(boolean bl) {
        this.C = bl;
    }

    public FlowLayout P() {
        return (FlowLayout)this.p;
    }

    public void O(FlowLayout flowLayout) {
        this.p = flowLayout;
    }

    public boolean j() {
        return this.O;
    }

    public void M(boolean bl) {
        this.O = bl;
    }

    public void O() {
        this.v = null;
        this.W = null;
        this.F = null;
        this.i = null;
        this.c = null;
        this.E = null;
        this.h = null;
        this.M = null;
        this.p = null;
        this.V = null;
        this.q = null;
        this.m = null;
        this.n = null;
        this.A = null;
        this.j = null;
        this.B = null;
        this.u = null;
        this.Q = null;
    }

    public boolean L() {
        return this.P;
    }

    public void j(boolean bl) {
        this.P = bl;
    }

    public void L() {
        try {
            yt_1.F.W((Object)new DK(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static void F(String[] stringArray) {
        N = stringArray;
    }

    public static String[] s() {
        return N;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4657551212789948911L;
                var6_1 = new long[19];
                aM.F(null);
                var3_2 = 0;
                var4_3 = "\u00f8\u00c1\u00bf\u0084'_+7\u009f\u007fBx?\u00c3d}#\u001a\u007f_\u0001\u00b8z\u00c2\u00fa\u000f\u00d6\u00e4\u00fa;\u00aebQ+\u0019\nq\u00fcYW\u000f\u00c3\u0086;\u001d\u00d3J\u00ccRV\u00dem,B\u009e\u00e9[\u00ad\u0004\u00cf\u00bf\u00e7^\u008f\u00d0\u0015O@2O;\u001e\u0096\u00f0\u007fS\u00c3(0\u00d8.I\u00d2'j\u009b\u000b\u0086\u00cc#>\u00eda\u00a11\u00b5)\u00db\u001b\u008c\u00820\u00ae\u00f7\u00e4r\u00f7\u00e8\u0016\u0001\f\u001bI\u00b4\u00c4Kw\u0001\u00bf\u0011\"Y&\u00e8\u00ff\u00b7K\u001a\u000e\u00cd\u0001\u0099\u00f2\u00d2\u00b6\n";
                var5_4 = "\u00f8\u00c1\u00bf\u0084'_+7\u009f\u007fBx?\u00c3d}#\u001a\u007f_\u0001\u00b8z\u00c2\u00fa\u000f\u00d6\u00e4\u00fa;\u00aebQ+\u0019\nq\u00fcYW\u000f\u00c3\u0086;\u001d\u00d3J\u00ccRV\u00dem,B\u009e\u00e9[\u00ad\u0004\u00cf\u00bf\u00e7^\u008f\u00d0\u0015O@2O;\u001e\u0096\u00f0\u007fS\u00c3(0\u00d8.I\u00d2'j\u009b\u000b\u0086\u00cc#>\u00eda\u00a11\u00b5)\u00db\u001b\u008c\u00820\u00ae\u00f7\u00e4r\u00f7\u00e8\u0016\u0001\f\u001bI\u00b4\u00c4Kw\u0001\u00bf\u0011\"Y&\u00e8\u00ff\u00b7K\u001a\u000e\u00cd\u0001\u0099\u00f2\u00d2\u00b6\n".length();
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
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00fe\u00d8\u00e9\u0005<\u008eV\u00df\u0084J\u000bY\u008a\u00cc7\u00fb";
                    var5_4 = "\u00fe\u00d8\u00e9\u0005<\u008eV\u00df\u0084J\u000bY\u008a\u00cc7\u00fb".length();
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
lbl28:
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
lbl39:
                // 1 sources

                ** continue;
            }
        }
        aM.d = var6_1;
        aM.e = new Integer[19];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4EFE;
        if (e[n11] == null) {
            aM.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

