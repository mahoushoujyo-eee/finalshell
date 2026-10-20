/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import org.F.c;
import org.I;
import org.Y;
import org.b_0;
import org.v.RG;
import org.v._7;
import org.v.f1;
import org.v.f_0;
import org.v.hc_0;

/*
 * Renamed from org.v.hb
 */
public class hb_0
implements _7 {
    private final hc_0 w;
    @c
    private String v;
    @c
    private f1 b;
    @c
    private f1 Q;
    @c
    private f1 G;
    @c
    private Y j;
    static final boolean q;
    private static final String[] a;
    private static final String[] c;

    public hb_0(hc_0 hc_02) {
        this.w = hc_02;
        this.w.m(true);
    }

    /*
     * Exception decompiling
     */
    private f1 E() throws b_0, IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    @c
    public String y() {
        String string = this.v;
        this.v = null;
        return string;
    }

    @Override
    public f1 G() throws b_0, IOException {
        f1 f12;
        block13: {
            block12: {
                String[] stringArray;
                block11: {
                    block10: {
                        stringArray = RG.C();
                        try {
                            hb_0 hb_02;
                            try {
                                hb_02 = this;
                                if (stringArray == null) break block10;
                                if (hb_02.Q != null) break block11;
                            }
                            catch (b_0 b_02) {
                                throw hb_0.a(b_02);
                            }
                            hb_02 = this;
                        }
                        catch (b_0 b_03) {
                            throw hb_0.a(b_03);
                        }
                    }
                    hb_02.Q = this.E();
                }
                try {
                    try {
                        try {
                            if (q) break block12;
                            f12 = this.Q;
                            if (stringArray == null) break block13;
                        }
                        catch (b_0 b_04) {
                            throw hb_0.a(b_04);
                        }
                        if (f12 != null) break block12;
                    }
                    catch (b_0 b_05) {
                        throw hb_0.a(b_05);
                    }
                    throw new AssertionError();
                }
                catch (b_0 b_06) {
                    throw hb_0.a(b_06);
                }
            }
            f12 = this.Q;
        }
        return f12;
    }

    @Override
    public f1 R() throws b_0, IOException {
        f1 f12;
        block18: {
            block17: {
                String[] stringArray;
                block19: {
                    block16: {
                        hb_0 hb_02;
                        f1 f13;
                        block14: {
                            block15: {
                                stringArray = RG.C();
                                try {
                                    try {
                                        f13 = this.Q;
                                        if (stringArray == null) break block14;
                                        if (f13 != null) break block15;
                                    }
                                    catch (b_0 b_02) {
                                        throw hb_0.a(b_02);
                                    }
                                    this.Q = this.E();
                                }
                                catch (b_0 b_03) {
                                    throw hb_0.a(b_03);
                                }
                            }
                            try {
                                hb_02 = this;
                                if (stringArray == null) break block16;
                                f13 = hb_02.G;
                            }
                            catch (b_0 b_04) {
                                throw hb_0.a(b_04);
                            }
                        }
                        if (f13 != null) break block19;
                        hb_02 = this;
                    }
                    hb_02.G = this.E();
                }
                try {
                    try {
                        try {
                            if (q) break block17;
                            f12 = this.G;
                            if (stringArray == null) break block18;
                        }
                        catch (b_0 b_05) {
                            throw hb_0.a(b_05);
                        }
                        if (f12 != null) break block17;
                    }
                    catch (b_0 b_06) {
                        throw hb_0.a(b_06);
                    }
                    throw new AssertionError();
                }
                catch (b_0 b_07) {
                    throw hb_0.a(b_07);
                }
            }
            f12 = this.G;
        }
        return f12;
    }

    @Override
    public boolean g(String string) throws b_0, IOException {
        return this.G().Y.equals(string);
    }

    @Override
    public int k(String[] stringArray) throws b_0, IOException {
        return hb_0.u(stringArray, this.G().Y);
    }

    @Override
    public boolean E(f_0 f_02) throws b_0, IOException {
        boolean bl;
        try {
            bl = this.G().T == f_02;
        }
        catch (b_0 b_02) {
            throw hb_0.a(b_02);
        }
        return bl;
    }

    @Override
    public int f(f_0[] f_0Array) throws b_0, IOException {
        return hb_0.f(f_0Array, this.G().T);
    }

    @Override
    public boolean N(String string) throws b_0, IOException {
        return this.R().Y.equals(string);
    }

    @Override
    public f1 x() throws b_0, IOException {
        f1 f12;
        block16: {
            f1 f13;
            block14: {
                block15: {
                    f1 f14;
                    String[] stringArray;
                    block12: {
                        block13: {
                            stringArray = RG.C();
                            try {
                                try {
                                    f14 = this.Q;
                                    if (stringArray == null) break block12;
                                    if (f14 != null) break block13;
                                }
                                catch (b_0 b_02) {
                                    throw hb_0.a(b_02);
                                }
                                this.b = this.E();
                                return this.b;
                            }
                            catch (b_0 b_03) {
                                throw hb_0.a(b_03);
                            }
                        }
                        f14 = this.Q;
                    }
                    f13 = f14;
                    try {
                        try {
                            try {
                                try {
                                    if (stringArray == null) break block14;
                                    if (q) break block15;
                                }
                                catch (b_0 b_04) {
                                    throw hb_0.a(b_04);
                                }
                                f12 = f13;
                                if (stringArray == null) break block16;
                            }
                            catch (b_0 b_05) {
                                throw hb_0.a(b_05);
                            }
                            if (f12 != null) break block15;
                        }
                        catch (b_0 b_06) {
                            throw hb_0.a(b_06);
                        }
                        throw new AssertionError();
                    }
                    catch (b_0 b_07) {
                        throw hb_0.a(b_07);
                    }
                }
                this.b = f13;
                this.Q = this.G;
                this.G = null;
            }
            f12 = f13;
        }
        return f12;
    }

    @Override
    public void z(String string) throws b_0, IOException {
        String string2 = this.x().Y;
        try {
            if (!string2.equals(string)) {
                throw this.F("'" + string + hb_0.a(24575, -17268) + string2 + "'");
            }
        }
        catch (b_0 b_02) {
            throw hb_0.a(b_02);
        }
    }

    @Override
    public int t(String[] stringArray) throws b_0, IOException {
        String string;
        block12: {
            int n10;
            int n11;
            f1 f12;
            block11: {
                String[] stringArray2;
                block9: {
                    block10: {
                        f12 = this.x();
                        string = f12.Y;
                        stringArray2 = RG.C();
                        int n12 = hb_0.u(stringArray, string);
                        try {
                            try {
                                n11 = n12;
                                if (stringArray2 == null) break block9;
                                if (n11 == -1) break block10;
                            }
                            catch (b_0 b_02) {
                                throw hb_0.a(b_02);
                            }
                            return n12;
                        }
                        catch (b_0 b_03) {
                            throw hb_0.a(b_03);
                        }
                    }
                    n11 = string.startsWith(">") ? 1 : 0;
                }
                try {
                    try {
                        if (stringArray2 == null) break block11;
                        if (n11 == 0) break block12;
                    }
                    catch (b_0 b_04) {
                        throw hb_0.a(b_04);
                    }
                    n11 = hb_0.u(stringArray, ">");
                }
                catch (b_0 b_05) {
                    throw hb_0.a(b_05);
                }
            }
            if ((n10 = n11) != -1) {
                I i2 = f12.T();
                this.Q = new f1(i2.x(), i2.D(), i2.S() + 1, f_0.OPERATOR, string.substring(1));
                return n10;
            }
        }
        throw this.F(hb_0.a(24572, 16053) + hb_0.w(stringArray, " ") + hb_0.a(24567, -20562) + string + "'");
    }

    @Override
    public String q(f_0 f_02) throws b_0, IOException {
        f1 f12;
        block4: {
            f1 f13;
            block5: {
                f13 = this.x();
                String[] stringArray = RG.C();
                try {
                    try {
                        f12 = f13;
                        if (stringArray == null) break block4;
                        if (f12.T == f_02) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hb_0.a(b_02);
                    }
                    throw new b_0((Object)((Object)f_02) + hb_0.a(24570, -20373) + f13.Y + "'", f13.T());
                }
                catch (b_0 b_03) {
                    throw hb_0.a(b_03);
                }
            }
            f12 = f13;
        }
        return f12.Y;
    }

    @Override
    public int Z(f_0[] f_0Array) throws b_0, IOException {
        f_0 f_02;
        block5: {
            int n10;
            block4: {
                f1 f12 = this.x();
                f_02 = f12.T;
                int n11 = hb_0.f(f_0Array, f_02);
                String[] stringArray = RG.C();
                try {
                    try {
                        n10 = n11;
                        if (stringArray == null) break block4;
                        if (n10 == -1) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hb_0.a(b_02);
                    }
                    n10 = n11;
                }
                catch (b_0 b_03) {
                    throw hb_0.a(b_03);
                }
            }
            return n10;
        }
        throw this.F(hb_0.a(24569, 13189) + hb_0.w((Object[])f_0Array, " ") + hb_0.a(24575, -17268) + (Object)((Object)f_02) + "'");
    }

    @Override
    public boolean e(String string) throws b_0, IOException {
        boolean bl;
        block16: {
            f1 f12;
            block17: {
                f1 f13;
                String[] stringArray;
                block12: {
                    block13: {
                        boolean bl2;
                        block14: {
                            block15: {
                                stringArray = RG.C();
                                try {
                                    try {
                                        try {
                                            try {
                                                f13 = this.Q;
                                                if (stringArray == null) break block12;
                                                if (f13 == null) break block13;
                                            }
                                            catch (b_0 b_02) {
                                                throw hb_0.a(b_02);
                                            }
                                            bl2 = this.Q.Y.equals(string);
                                            if (stringArray == null) break block14;
                                        }
                                        catch (b_0 b_03) {
                                            throw hb_0.a(b_03);
                                        }
                                        if (bl2) break block15;
                                    }
                                    catch (b_0 b_04) {
                                        throw hb_0.a(b_04);
                                    }
                                    return false;
                                }
                                catch (b_0 b_05) {
                                    throw hb_0.a(b_05);
                                }
                            }
                            this.b = this.Q;
                            this.Q = this.G;
                            this.G = null;
                            bl2 = true;
                        }
                        return bl2;
                    }
                    f13 = this.E();
                }
                f12 = f13;
                try {
                    try {
                        bl = f12.Y.equals(string);
                        if (stringArray == null) break block16;
                        if (!bl) break block17;
                    }
                    catch (b_0 b_06) {
                        throw hb_0.a(b_06);
                    }
                    this.b = f12;
                    return true;
                }
                catch (b_0 b_07) {
                    throw hb_0.a(b_07);
                }
            }
            this.Q = f12;
            bl = false;
        }
        return bl;
    }

    @Override
    public int s(String[] stringArray) throws b_0, IOException {
        int n10;
        block14: {
            f1 f12;
            block15: {
                f1 f13;
                String[] stringArray2;
                block10: {
                    block11: {
                        int n11;
                        block12: {
                            int n12;
                            block13: {
                                stringArray2 = RG.C();
                                try {
                                    f13 = this.Q;
                                    if (stringArray2 == null) break block10;
                                    if (f13 == null) break block11;
                                }
                                catch (b_0 b_02) {
                                    throw hb_0.a(b_02);
                                }
                                n12 = hb_0.u(stringArray, this.Q.Y);
                                try {
                                    try {
                                        n11 = n12;
                                        if (stringArray2 == null) break block12;
                                        if (n11 != -1) break block13;
                                    }
                                    catch (b_0 b_03) {
                                        throw hb_0.a(b_03);
                                    }
                                    return -1;
                                }
                                catch (b_0 b_04) {
                                    throw hb_0.a(b_04);
                                }
                            }
                            this.b = this.Q;
                            this.Q = this.G;
                            this.G = null;
                            n11 = n12;
                        }
                        return n11;
                    }
                    f13 = this.E();
                }
                f12 = f13;
                int n13 = hb_0.u(stringArray, f12.Y);
                try {
                    try {
                        n10 = n13;
                        if (stringArray2 == null) break block14;
                        if (n10 == -1) break block15;
                    }
                    catch (b_0 b_05) {
                        throw hb_0.a(b_05);
                    }
                    this.b = f12;
                    return n13;
                }
                catch (b_0 b_06) {
                    throw hb_0.a(b_06);
                }
            }
            this.Q = f12;
            n10 = -1;
        }
        return n10;
    }

    @Override
    @c
    public String Y(f_0 f_02) throws b_0, IOException {
        block17: {
            f1 f12;
            f1 f13;
            block13: {
                String[] stringArray;
                block14: {
                    f1 f14;
                    block15: {
                        block16: {
                            f13 = this.Q;
                            stringArray = RG.C();
                            try {
                                try {
                                    try {
                                        try {
                                            f12 = f13;
                                            if (stringArray == null) break block13;
                                            if (f12 == null) break block14;
                                        }
                                        catch (b_0 b_02) {
                                            throw hb_0.a(b_02);
                                        }
                                        f14 = f13;
                                        if (stringArray == null) break block15;
                                    }
                                    catch (b_0 b_03) {
                                        throw hb_0.a(b_03);
                                    }
                                    if (f14.T == f_02) break block16;
                                }
                                catch (b_0 b_04) {
                                    throw hb_0.a(b_04);
                                }
                                return null;
                            }
                            catch (b_0 b_05) {
                                throw hb_0.a(b_05);
                            }
                        }
                        this.b = this.Q;
                        this.Q = this.G;
                        this.G = null;
                        f14 = f13;
                    }
                    return f14.Y;
                }
                f13 = this.E();
                try {
                    if (stringArray == null) break block17;
                    f12 = f13;
                }
                catch (b_0 b_06) {
                    throw hb_0.a(b_06);
                }
            }
            try {
                if (f12.T == f_02) {
                    this.b = f13;
                    return f13.Y;
                }
            }
            catch (b_0 b_07) {
                throw hb_0.a(b_07);
            }
            this.Q = f13;
        }
        return null;
    }

    @Override
    public int z(f_0[] f_0Array) throws b_0, IOException {
        int n10;
        block14: {
            f1 f12;
            block15: {
                f1 f13;
                String[] stringArray;
                block10: {
                    block11: {
                        int n11;
                        block12: {
                            int n12;
                            block13: {
                                stringArray = RG.C();
                                try {
                                    f13 = this.Q;
                                    if (stringArray == null) break block10;
                                    if (f13 == null) break block11;
                                }
                                catch (b_0 b_02) {
                                    throw hb_0.a(b_02);
                                }
                                n12 = hb_0.f(f_0Array, this.Q.T);
                                try {
                                    try {
                                        n11 = n12;
                                        if (stringArray == null) break block12;
                                        if (n11 == -1) break block13;
                                    }
                                    catch (b_0 b_03) {
                                        throw hb_0.a(b_03);
                                    }
                                    this.b = this.Q;
                                    this.Q = this.G;
                                    this.G = null;
                                }
                                catch (b_0 b_04) {
                                    throw hb_0.a(b_04);
                                }
                            }
                            n11 = n12;
                        }
                        return n11;
                    }
                    f13 = this.E();
                }
                f12 = f13;
                int n13 = hb_0.f(f_0Array, f12.T);
                try {
                    try {
                        n10 = n13;
                        if (stringArray == null) break block14;
                        if (n10 == -1) break block15;
                    }
                    catch (b_0 b_05) {
                        throw hb_0.a(b_05);
                    }
                    this.b = f12;
                    return n13;
                }
                catch (b_0 b_06) {
                    throw hb_0.a(b_06);
                }
            }
            this.Q = f12;
            n10 = -1;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public I r() {
        I i2;
        String[] stringArray = RG.C();
        hb_0 hb_02 = this;
        if (stringArray != null) {
            if (hb_02.b != null) {
                i2 = this.b.T();
                return i2;
            }
            hb_02 = this;
        }
        i2 = hb_02.w.m();
        return i2;
    }

    private static int u(String[] stringArray, String string) {
        int n10;
        block3: {
            String[] stringArray2 = RG.C();
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                n10 = stringArray[i2].equals(string) ? 1 : 0;
                if (stringArray2 != null) {
                    int n11;
                    if (stringArray2 != null) {
                        if (n10 == 0) continue;
                        n11 = i2;
                    }
                    return n11;
                }
                break block3;
            }
            n10 = -1;
        }
        return n10;
    }

    private static int f(f_0[] f_0Array, f_0 f_02) {
        int n10;
        block3: {
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < f_0Array.length; ++i2) {
                n10 = f_0Array[i2].equals((Object)f_02) ? 1 : 0;
                if (stringArray != null) {
                    int n11;
                    if (stringArray != null) {
                        if (n10 == 0) continue;
                        n11 = i2;
                    }
                    return n11;
                }
                break block3;
            }
            n10 = -1;
        }
        return n10;
    }

    @Override
    public void G(@c Y y2) {
        this.j = y2;
    }

    public String toString() {
        return this.Q + "/" + this.G + "/" + this.w.m();
    }

    private void d(String string, String string2, @c I i2) throws b_0 {
        block5: {
            Y y2;
            block4: {
                String[] stringArray = RG.C();
                try {
                    try {
                        y2 = this.j;
                        if (stringArray == null) break block4;
                        if (y2 == null) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hb_0.a(b_02);
                    }
                    y2 = this.j;
                }
                catch (b_0 b_03) {
                    throw hb_0.a(b_03);
                }
            }
            y2.U(string, string2, i2);
        }
    }

    protected final b_0 F(String string) {
        return new b_0(string, this.w.m());
    }

    private static String w(@c Object[] objectArray, String string) {
        StringBuilder stringBuilder;
        block5: {
            String[] stringArray = RG.C();
            Object[] objectArray2 = objectArray;
            if (stringArray != null) {
                if (objectArray2 == null) {
                    return hb_0.a(24571, 10203);
                }
                objectArray2 = objectArray;
            }
            if (objectArray2.length == 0) {
                return hb_0.a(24568, -4694);
            }
            StringBuilder stringBuilder2 = new StringBuilder().append(objectArray[0]);
            for (int i2 = 1; i2 < objectArray.length; ++i2) {
                stringBuilder = stringBuilder2.append(string).append(objectArray[i2]);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block5;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "'y\u0004\u0017\u0084+q\f\u000f1\u008aT\nS\u009ds[/s\u00ac\u00b2\r\u00a3\u0084@\u00fd\u00b4\b\u0095U6\u001c\u00f8c\u00cb.\u0003\u001b\u00dc\u00c4\u0016\u0012\u00caY\u00d5\u00a1\u0005\u00ff\u0005P\u000e\u00be\u0013B\u00c3\u00ff\u00d2\u0015\u0002\u00bd\u00a0cV\u0006M\u0007\u00b6\u001a\u00f9)\u0013f/\u00c3\u0097FLP\u0007\u00b4\ttZ\u00f69G)\u00f2U\u00a2\b\\\u008b\u000f\u00c7\u00df\u0018/A";
                var4_3 = "'y\u0004\u0017\u0084+q\f\u000f1\u008aT\nS\u009ds[/s\u00ac\u00b2\r\u00a3\u0084@\u00fd\u00b4\b\u0095U6\u001c\u00f8c\u00cb.\u0003\u001b\u00dc\u00c4\u0016\u0012\u00caY\u00d5\u00a1\u0005\u00ff\u0005P\u000e\u00be\u0013B\u00c3\u00ff\u00d2\u0015\u0002\u00bd\u00a0cV\u0006M\u0007\u00b6\u001a\u00f9)\u0013f/\u00c3\u0097FLP\u0007\u00b4\ttZ\u00f69G)\u00f2U\u00a2\b\\\u008b\u000f\u00c7\u00df\u0018/A".length();
                var1_4 = 3;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 69;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00d5%\u009aUJ\u00e7M\u00eb\u0003#)G\u00fc\u00cc\u00cc\u0013LHD\u00f5\u00b3\u0017\u009e\u00c2\u00c2\u00c1\u0089x\u00aa\u008d\u00fe\u0098\u00f3\u00faf\u00ee$d\u00a8\u00e4\u0010I\u00c6\u00b4\u0094";
                    var4_3 = "\u00d5%\u009aUJ\u00e7M\u00eb\u0003#)G\u00fc\u00cc\u00cc\u0013LHD\u00f5\u00b3\u0017\u009e\u00c2\u00c2\u00c1\u0089x\u00aa\u008d\u00fe\u0098\u00f3\u00faf\u00ee$d\u00a8\u00e4\u0010I\u00c6\u00b4\u0094".length();
                    var1_4 = 21;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 115;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 7;
                            break;
                        }
                        case 1: {
                            v15 = 95;
                            break;
                        }
                        case 2: {
                            v15 = 74;
                            break;
                        }
                        case 3: {
                            v15 = 51;
                            break;
                        }
                        case 4: {
                            v15 = 60;
                            break;
                        }
                        case 5: {
                            v15 = 41;
                            break;
                        }
                        default: {
                            v15 = 28;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        hb_0.a = var5;
        hb_0.c = new String[10];
        hb_0.q = hb_0.class.desiredAssertionStatus() == false;
    }

    private static b_0 a(b_0 b_02) {
        return b_02;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x5FFE) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 15;
                    break;
                }
                case 1: {
                    n14 = 207;
                    break;
                }
                case 2: {
                    n14 = 175;
                    break;
                }
                case 3: {
                    n14 = 36;
                    break;
                }
                case 4: {
                    n14 = 99;
                    break;
                }
                case 5: {
                    n14 = 195;
                    break;
                }
                case 6: {
                    n14 = 174;
                    break;
                }
                case 7: {
                    n14 = 156;
                    break;
                }
                case 8: {
                    n14 = 43;
                    break;
                }
                case 9: {
                    n14 = 89;
                    break;
                }
                case 10: {
                    n14 = 100;
                    break;
                }
                case 11: {
                    n14 = 238;
                    break;
                }
                case 12: {
                    n14 = 60;
                    break;
                }
                case 13: {
                    n14 = 30;
                    break;
                }
                case 14: {
                    n14 = 157;
                    break;
                }
                case 15: {
                    n14 = 180;
                    break;
                }
                case 16: {
                    n14 = 217;
                    break;
                }
                case 17: {
                    n14 = 118;
                    break;
                }
                case 18: {
                    n14 = 26;
                    break;
                }
                case 19: {
                    n14 = 194;
                    break;
                }
                case 20: {
                    n14 = 249;
                    break;
                }
                case 21: {
                    n14 = 182;
                    break;
                }
                case 22: {
                    n14 = 216;
                    break;
                }
                case 23: {
                    n14 = 250;
                    break;
                }
                case 24: {
                    n14 = 21;
                    break;
                }
                case 25: {
                    n14 = 159;
                    break;
                }
                case 26: {
                    n14 = 14;
                    break;
                }
                case 27: {
                    n14 = 10;
                    break;
                }
                case 28: {
                    n14 = 199;
                    break;
                }
                case 29: {
                    n14 = 38;
                    break;
                }
                case 30: {
                    n14 = 52;
                    break;
                }
                case 31: {
                    n14 = 227;
                    break;
                }
                case 32: {
                    n14 = 233;
                    break;
                }
                case 33: {
                    n14 = 234;
                    break;
                }
                case 34: {
                    n14 = 191;
                    break;
                }
                case 35: {
                    n14 = 144;
                    break;
                }
                case 36: {
                    n14 = 158;
                    break;
                }
                case 37: {
                    n14 = 189;
                    break;
                }
                case 38: {
                    n14 = 181;
                    break;
                }
                case 39: {
                    n14 = 81;
                    break;
                }
                case 40: {
                    n14 = 51;
                    break;
                }
                case 41: {
                    n14 = 13;
                    break;
                }
                case 42: {
                    n14 = 168;
                    break;
                }
                case 43: {
                    n14 = 18;
                    break;
                }
                case 44: {
                    n14 = 224;
                    break;
                }
                case 45: {
                    n14 = 110;
                    break;
                }
                case 46: {
                    n14 = 188;
                    break;
                }
                case 47: {
                    n14 = 4;
                    break;
                }
                case 48: {
                    n14 = 8;
                    break;
                }
                case 49: {
                    n14 = 48;
                    break;
                }
                case 50: {
                    n14 = 205;
                    break;
                }
                case 51: {
                    n14 = 50;
                    break;
                }
                case 52: {
                    n14 = 236;
                    break;
                }
                case 53: {
                    n14 = 126;
                    break;
                }
                case 54: {
                    n14 = 84;
                    break;
                }
                case 55: {
                    n14 = 2;
                    break;
                }
                case 56: {
                    n14 = 153;
                    break;
                }
                case 57: {
                    n14 = 19;
                    break;
                }
                case 58: {
                    n14 = 241;
                    break;
                }
                case 59: {
                    n14 = 101;
                    break;
                }
                case 60: {
                    n14 = 113;
                    break;
                }
                case 61: {
                    n14 = 40;
                    break;
                }
                case 62: {
                    n14 = 210;
                    break;
                }
                case 63: {
                    n14 = 200;
                    break;
                }
                case 64: {
                    n14 = 86;
                    break;
                }
                case 65: {
                    n14 = 163;
                    break;
                }
                case 66: {
                    n14 = 220;
                    break;
                }
                case 67: {
                    n14 = 193;
                    break;
                }
                case 68: {
                    n14 = 69;
                    break;
                }
                case 69: {
                    n14 = 102;
                    break;
                }
                case 70: {
                    n14 = 54;
                    break;
                }
                case 71: {
                    n14 = 53;
                    break;
                }
                case 72: {
                    n14 = 204;
                    break;
                }
                case 73: {
                    n14 = 93;
                    break;
                }
                case 74: {
                    n14 = 46;
                    break;
                }
                case 75: {
                    n14 = 130;
                    break;
                }
                case 76: {
                    n14 = 243;
                    break;
                }
                case 77: {
                    n14 = 172;
                    break;
                }
                case 78: {
                    n14 = 20;
                    break;
                }
                case 79: {
                    n14 = 162;
                    break;
                }
                case 80: {
                    n14 = 251;
                    break;
                }
                case 81: {
                    n14 = 235;
                    break;
                }
                case 82: {
                    n14 = 154;
                    break;
                }
                case 83: {
                    n14 = 170;
                    break;
                }
                case 84: {
                    n14 = 187;
                    break;
                }
                case 85: {
                    n14 = 134;
                    break;
                }
                case 86: {
                    n14 = 209;
                    break;
                }
                case 87: {
                    n14 = 64;
                    break;
                }
                case 88: {
                    n14 = 149;
                    break;
                }
                case 89: {
                    n14 = 91;
                    break;
                }
                case 90: {
                    n14 = 42;
                    break;
                }
                case 91: {
                    n14 = 111;
                    break;
                }
                case 92: {
                    n14 = 239;
                    break;
                }
                case 93: {
                    n14 = 252;
                    break;
                }
                case 94: {
                    n14 = 108;
                    break;
                }
                case 95: {
                    n14 = 197;
                    break;
                }
                case 96: {
                    n14 = 123;
                    break;
                }
                case 97: {
                    n14 = 231;
                    break;
                }
                case 98: {
                    n14 = 61;
                    break;
                }
                case 99: {
                    n14 = 229;
                    break;
                }
                case 100: {
                    n14 = 136;
                    break;
                }
                case 101: {
                    n14 = 107;
                    break;
                }
                case 102: {
                    n14 = 17;
                    break;
                }
                case 103: {
                    n14 = 105;
                    break;
                }
                case 104: {
                    n14 = 73;
                    break;
                }
                case 105: {
                    n14 = 9;
                    break;
                }
                case 106: {
                    n14 = 55;
                    break;
                }
                case 107: {
                    n14 = 28;
                    break;
                }
                case 108: {
                    n14 = 124;
                    break;
                }
                case 109: {
                    n14 = 44;
                    break;
                }
                case 110: {
                    n14 = 103;
                    break;
                }
                case 111: {
                    n14 = 142;
                    break;
                }
                case 112: {
                    n14 = 151;
                    break;
                }
                case 113: {
                    n14 = 6;
                    break;
                }
                case 114: {
                    n14 = 169;
                    break;
                }
                case 115: {
                    n14 = 68;
                    break;
                }
                case 116: {
                    n14 = 135;
                    break;
                }
                case 117: {
                    n14 = 31;
                    break;
                }
                case 118: {
                    n14 = 176;
                    break;
                }
                case 119: {
                    n14 = 173;
                    break;
                }
                case 120: {
                    n14 = 211;
                    break;
                }
                case 121: {
                    n14 = 23;
                    break;
                }
                case 122: {
                    n14 = 3;
                    break;
                }
                case 123: {
                    n14 = 223;
                    break;
                }
                case 124: {
                    n14 = 96;
                    break;
                }
                case 125: {
                    n14 = 208;
                    break;
                }
                case 126: {
                    n14 = 192;
                    break;
                }
                case 127: {
                    n14 = 218;
                    break;
                }
                case 128: {
                    n14 = 155;
                    break;
                }
                case 129: {
                    n14 = 116;
                    break;
                }
                case 130: {
                    n14 = 164;
                    break;
                }
                case 131: {
                    n14 = 232;
                    break;
                }
                case 132: {
                    n14 = 83;
                    break;
                }
                case 133: {
                    n14 = 166;
                    break;
                }
                case 134: {
                    n14 = 222;
                    break;
                }
                case 135: {
                    n14 = 41;
                    break;
                }
                case 136: {
                    n14 = 82;
                    break;
                }
                case 137: {
                    n14 = 12;
                    break;
                }
                case 138: {
                    n14 = 244;
                    break;
                }
                case 139: {
                    n14 = 177;
                    break;
                }
                case 140: {
                    n14 = 49;
                    break;
                }
                case 141: {
                    n14 = 62;
                    break;
                }
                case 142: {
                    n14 = 32;
                    break;
                }
                case 143: {
                    n14 = 70;
                    break;
                }
                case 144: {
                    n14 = 138;
                    break;
                }
                case 145: {
                    n14 = 121;
                    break;
                }
                case 146: {
                    n14 = 240;
                    break;
                }
                case 147: {
                    n14 = 198;
                    break;
                }
                case 148: {
                    n14 = 75;
                    break;
                }
                case 149: {
                    n14 = 37;
                    break;
                }
                case 150: {
                    n14 = 59;
                    break;
                }
                case 151: {
                    n14 = 165;
                    break;
                }
                case 152: {
                    n14 = 35;
                    break;
                }
                case 153: {
                    n14 = 114;
                    break;
                }
                case 154: {
                    n14 = 90;
                    break;
                }
                case 155: {
                    n14 = 56;
                    break;
                }
                case 156: {
                    n14 = 87;
                    break;
                }
                case 157: {
                    n14 = 80;
                    break;
                }
                case 158: {
                    n14 = 57;
                    break;
                }
                case 159: {
                    n14 = 145;
                    break;
                }
                case 160: {
                    n14 = 22;
                    break;
                }
                case 161: {
                    n14 = 25;
                    break;
                }
                case 162: {
                    n14 = 66;
                    break;
                }
                case 163: {
                    n14 = 247;
                    break;
                }
                case 164: {
                    n14 = 255;
                    break;
                }
                case 165: {
                    n14 = 167;
                    break;
                }
                case 166: {
                    n14 = 183;
                    break;
                }
                case 167: {
                    n14 = 11;
                    break;
                }
                case 168: {
                    n14 = 202;
                    break;
                }
                case 169: {
                    n14 = 190;
                    break;
                }
                case 170: {
                    n14 = 7;
                    break;
                }
                case 171: {
                    n14 = 95;
                    break;
                }
                case 172: {
                    n14 = 161;
                    break;
                }
                case 173: {
                    n14 = 248;
                    break;
                }
                case 174: {
                    n14 = 150;
                    break;
                }
                case 175: {
                    n14 = 226;
                    break;
                }
                case 176: {
                    n14 = 27;
                    break;
                }
                case 177: {
                    n14 = 16;
                    break;
                }
                case 178: {
                    n14 = 196;
                    break;
                }
                case 179: {
                    n14 = 146;
                    break;
                }
                case 180: {
                    n14 = 215;
                    break;
                }
                case 181: {
                    n14 = 128;
                    break;
                }
                case 182: {
                    n14 = 201;
                    break;
                }
                case 183: {
                    n14 = 24;
                    break;
                }
                case 184: {
                    n14 = 213;
                    break;
                }
                case 185: {
                    n14 = 76;
                    break;
                }
                case 186: {
                    n14 = 104;
                    break;
                }
                case 187: {
                    n14 = 221;
                    break;
                }
                case 188: {
                    n14 = 143;
                    break;
                }
                case 189: {
                    n14 = 179;
                    break;
                }
                case 190: {
                    n14 = 5;
                    break;
                }
                case 191: {
                    n14 = 78;
                    break;
                }
                case 192: {
                    n14 = 253;
                    break;
                }
                case 193: {
                    n14 = 39;
                    break;
                }
                case 194: {
                    n14 = 72;
                    break;
                }
                case 195: {
                    n14 = 34;
                    break;
                }
                case 196: {
                    n14 = 1;
                    break;
                }
                case 197: {
                    n14 = 203;
                    break;
                }
                case 198: {
                    n14 = 171;
                    break;
                }
                case 199: {
                    n14 = 246;
                    break;
                }
                case 200: {
                    n14 = 133;
                    break;
                }
                case 201: {
                    n14 = 79;
                    break;
                }
                case 202: {
                    n14 = 120;
                    break;
                }
                case 203: {
                    n14 = 139;
                    break;
                }
                case 204: {
                    n14 = 74;
                    break;
                }
                case 205: {
                    n14 = 212;
                    break;
                }
                case 206: {
                    n14 = 112;
                    break;
                }
                case 207: {
                    n14 = 132;
                    break;
                }
                case 208: {
                    n14 = 67;
                    break;
                }
                case 209: {
                    n14 = 71;
                    break;
                }
                case 210: {
                    n14 = 45;
                    break;
                }
                case 211: {
                    n14 = 230;
                    break;
                }
                case 212: {
                    n14 = 98;
                    break;
                }
                case 213: {
                    n14 = 109;
                    break;
                }
                case 214: {
                    n14 = 119;
                    break;
                }
                case 215: {
                    n14 = 29;
                    break;
                }
                case 216: {
                    n14 = 140;
                    break;
                }
                case 217: {
                    n14 = 152;
                    break;
                }
                case 218: {
                    n14 = 117;
                    break;
                }
                case 219: {
                    n14 = 129;
                    break;
                }
                case 220: {
                    n14 = 127;
                    break;
                }
                case 221: {
                    n14 = 137;
                    break;
                }
                case 222: {
                    n14 = 242;
                    break;
                }
                case 223: {
                    n14 = 0;
                    break;
                }
                case 224: {
                    n14 = 122;
                    break;
                }
                case 225: {
                    n14 = 147;
                    break;
                }
                case 226: {
                    n14 = 85;
                    break;
                }
                case 227: {
                    n14 = 214;
                    break;
                }
                case 228: {
                    n14 = 88;
                    break;
                }
                case 229: {
                    n14 = 63;
                    break;
                }
                case 230: {
                    n14 = 141;
                    break;
                }
                case 231: {
                    n14 = 254;
                    break;
                }
                case 232: {
                    n14 = 245;
                    break;
                }
                case 233: {
                    n14 = 92;
                    break;
                }
                case 234: {
                    n14 = 225;
                    break;
                }
                case 235: {
                    n14 = 219;
                    break;
                }
                case 236: {
                    n14 = 228;
                    break;
                }
                case 237: {
                    n14 = 160;
                    break;
                }
                case 238: {
                    n14 = 94;
                    break;
                }
                case 239: {
                    n14 = 58;
                    break;
                }
                case 240: {
                    n14 = 237;
                    break;
                }
                case 241: {
                    n14 = 206;
                    break;
                }
                case 242: {
                    n14 = 185;
                    break;
                }
                case 243: {
                    n14 = 131;
                    break;
                }
                case 244: {
                    n14 = 148;
                    break;
                }
                case 245: {
                    n14 = 178;
                    break;
                }
                case 246: {
                    n14 = 184;
                    break;
                }
                case 247: {
                    n14 = 77;
                    break;
                }
                case 248: {
                    n14 = 106;
                    break;
                }
                case 249: {
                    n14 = 33;
                    break;
                }
                case 250: {
                    n14 = 65;
                    break;
                }
                case 251: {
                    n14 = 47;
                    break;
                }
                case 252: {
                    n14 = 125;
                    break;
                }
                case 253: {
                    n14 = 115;
                    break;
                }
                case 254: {
                    n14 = 186;
                    break;
                }
                default: {
                    n14 = 97;
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
            hb_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

