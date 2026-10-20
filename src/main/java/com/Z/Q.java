/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.FN;
import com.OR;
import com.Z.A;
import com.Z.O;
import com.Z.T;
import com.a9;
import com.aL;
import com.au_0;
import com.b.V;
import com.cx_1;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.xg_0;
import com.z.p_0;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Window;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Q
extends JFileChooser
implements au_0,
cx_1 {
    protected List f = null;
    private static final String a;

    public Q() {
        super(p_0.m);
    }

    public Q(String string) {
        super(string);
    }

    public Q(File file) {
        super(file);
    }

    public Q(FileSystemView fileSystemView) {
        super(fileSystemView);
    }

    public Q(File file, FileSystemView fileSystemView) {
        super(file, fileSystemView);
    }

    public Q(String string, FileSystemView fileSystemView) {
        super(string, fileSystemView);
    }

    @Override
    protected JDialog createDialog(Component component) throws HeadlessException {
        JDialog jDialog = super.createDialog(component);
        try {
            if (this.f != null) {
                jDialog.setIconImages(this.f);
            }
        }
        catch (HeadlessException headlessException) {
            throw Q.a(headlessException);
        }
        return jDialog;
    }

    public Image K() {
        Image image;
        block11: {
            block9: {
                List list;
                block10: {
                    String string;
                    block8: {
                        string = T.v();
                        try {
                            try {
                                list = this.f;
                                if (string != null) break block8;
                                if (list == null) break block9;
                            }
                            catch (HeadlessException headlessException) {
                                throw Q.a(headlessException);
                            }
                            list = this.f;
                        }
                        catch (HeadlessException headlessException) {
                            throw Q.a(headlessException);
                        }
                    }
                    try {
                        try {
                            if (string != null) break block10;
                            if (list.size() <= 0) break block9;
                        }
                        catch (HeadlessException headlessException) {
                            throw Q.a(headlessException);
                        }
                        list = this.f.get(0);
                    }
                    catch (HeadlessException headlessException) {
                        throw Q.a(headlessException);
                    }
                }
                image = (Image)((Object)list);
                break block11;
            }
            image = null;
        }
        return image;
    }

    public List S() {
        return this.f;
    }

    public void a(ImageIcon imageIcon) {
        this.K(imageIcon.getImage());
    }

    public void K(Image image) {
        this.s(Arrays.asList(image));
    }

    public void C(List list) {
        this.s(xg_0.i(list));
    }

    public void s(List list) {
        block7: {
            Window window;
            block8: {
                Window window2;
                String string;
                block6: {
                    this.f = list;
                    string = T.v();
                    window2 = FN.L(this);
                    try {
                        window = window2;
                        if (string != null) break block6;
                        if (window == null) break block7;
                    }
                    catch (HeadlessException headlessException) {
                        throw Q.a(headlessException);
                    }
                    window = window2;
                }
                try {
                    try {
                        if (string != null) break block8;
                        if (!(window instanceof JDialog)) break block7;
                    }
                    catch (HeadlessException headlessException) {
                        throw Q.a(headlessException);
                    }
                    window = window2;
                }
                catch (HeadlessException headlessException) {
                    throw Q.a(headlessException);
                }
            }
            window.setIconImages(list);
        }
    }

    public void t(String string) {
        this.u(string, new Object[0]);
    }

    public void e(String string) {
        File file;
        Q q2;
        try {
            q2 = this;
            file = string != null ? new File(string) : null;
        }
        catch (HeadlessException headlessException) {
            throw Q.a(headlessException);
        }
        q2.setCurrentDirectory(file);
    }

    public void f(String string) {
        File file;
        Q q2;
        try {
            q2 = this;
            file = string != null ? new File(string) : null;
        }
        catch (HeadlessException headlessException) {
            throw Q.a(headlessException);
        }
        q2.setSelectedFile(file);
    }

    public T d() {
        return this.n().v();
    }

    public List H() {
        return this.n().h();
    }

    public V H() {
        return this.n().E();
    }

    public boolean u() {
        return this.n().Q();
    }

    public void D(boolean bl) {
        this.n().a(bl);
    }

    public void W(O o2) {
        this.n().u(o2);
    }

    public void h(String string) {
        this.n().F(string);
    }

    public A n() {
        return (A)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block31: {
            block30: {
                block28: {
                    block29: {
                        block27: {
                            block26: {
                                block25: {
                                    block33: {
                                        block23: {
                                            block24: {
                                                var1_1 = T.v();
                                                v0 = this;
                                                if (var1_1 != null) break block23;
                                                try {
                                                    block32: {
                                                        if (!v0.isAcceptAllFileFilterUsed()) break block24;
                                                        break block32;
                                                        catch (Throwable v1) {
                                                            throw Q.a(v1);
                                                        }
                                                    }
                                                    this.removeChoosableFileFilter(this.getAcceptAllFileFilter());
                                                }
                                                catch (Throwable v2) {
                                                    throw Q.a(v2);
                                                }
                                            }
                                            v0 = this;
                                        }
                                        if (var1_1 != null) ** GOTO lbl42
                                        if (v0.getUI() == null) break block25;
                                        break block33;
                                        catch (Throwable v3) {
                                            throw Q.a(v3);
                                        }
                                    }
                                    try {
                                        block34: {
                                            v4 = this;
                                            if (var1_1 != null) break block26;
                                            break block34;
                                            catch (Throwable v5) {
                                                throw Q.a(v5);
                                            }
                                        }
                                        if (!(v4.getUI() instanceof A)) {
                                        }
                                        ** GOTO lbl49
                                    }
                                    catch (Throwable v6) {
                                        throw Q.a(v6);
                                    }
                                }
                                try {
                                    v0 = this;
lbl42:
                                    // 2 sources

                                    v0.setUI((A)kp_0.w(a9.I, new Object[0]));
                                    break block27;
                                }
                                catch (Throwable var2_2) {
                                    try {
                                        ne_1.g(this, var2_2);
                                        this.setUI(new A());
                                        if (var1_1 == null) break block27;
lbl49:
                                        // 2 sources

                                        v4 = this;
                                    }
                                    catch (Throwable v7) {
                                        throw Q.a(v7);
                                    }
                                }
                            }
                            v4.setUI(this.getUI());
                        }
                        try {
                            try {
                                v8 = this;
                                if (var1_1 != null) break block28;
                                if (v8.getFileSystemView() != null) break block29;
                            }
                            catch (Throwable v9) {
                                throw Q.a(v9);
                            }
                            this.setFileSystemView(FileSystemView.getFileSystemView());
                        }
                        catch (Throwable v10) {
                            throw Q.a(v10);
                        }
                    }
                    kp_0.k(this, Q.a, this.getUI().getFileView(this));
                    v8 = this;
                }
                try {
                    try {
                        if (var1_1 != null) break block30;
                        if (!v8.isAcceptAllFileFilterUsed()) break block31;
                    }
                    catch (Throwable v11) {
                        throw Q.a(v11);
                    }
                    v8 = this;
                }
                catch (Throwable v12) {
                    throw Q.a(v12);
                }
            }
            v8.addChoosableFileFilter(this.getAcceptAllFileFilter());
        }
    }

    @Override
    public void u(String string, Object[] objectArray) {
        i2_0.n(this, string, objectArray);
    }

    @Override
    public void F(Object[] objectArray) {
        i2_0.U(this, objectArray);
    }

    @Override
    public void N(String string, Object[] objectArray) {
        i2_0.q(this, string, objectArray);
    }

    @Override
    public void M() {
        i2_0.L(this);
    }

    @Override
    public boolean k() {
        return i2_0.Z(this);
    }

    @Override
    public void M(ld_2 ld_22) {
        i2_0.g(this, ld_22);
    }

    @Override
    public void i() {
        i2_0.o(this);
    }

    @Override
    public void o(String string) {
        i2_0.f(this, string);
    }

    @Override
    public void I() {
        i2_0.p(this);
    }

    @Override
    public String q() {
        return i2_0.O(this);
    }

    public static File d() {
        return Q.p(null, null, null);
    }

    public static File K(OR oR) {
        return Q.p(null, null, oR);
    }

    public static File s(Component component, OR oR) {
        return Q.p(component, null, oR);
    }

    public static File T(String string, OR oR) {
        return Q.p(null, string, oR);
    }

    public static File X(Component component, String string) {
        return Q.p(component, string, null);
    }

    public static File p(Component component, String string, OR oR) {
        block11: {
            Q q2;
            block10: {
                String string2;
                Q q3;
                block8: {
                    block9: {
                        q3 = new Q(string);
                        string2 = T.v();
                        try {
                            try {
                                q2 = q3;
                                if (string2 != null) break block8;
                                q2.setMultiSelectionEnabled(false);
                                if (oR == null) break block9;
                            }
                            catch (HeadlessException headlessException) {
                                throw Q.a(headlessException);
                            }
                            oR.j(q3);
                        }
                        catch (HeadlessException headlessException) {
                            throw Q.a(headlessException);
                        }
                    }
                    q2 = q3;
                }
                try {
                    try {
                        if (string2 != null) break block10;
                        if (q2.showOpenDialog(component) != 0) break block11;
                    }
                    catch (HeadlessException headlessException) {
                        throw Q.a(headlessException);
                    }
                    q2 = q3;
                }
                catch (HeadlessException headlessException) {
                    throw Q.a(headlessException);
                }
            }
            return q2.getSelectedFile();
        }
        return null;
    }

    public static List K() {
        return Q.d(null, null, null);
    }

    public static List H(OR oR) {
        return Q.d(null, null, oR);
    }

    public static List H(Component component, OR oR) {
        return Q.d(component, null, oR);
    }

    public static List A(String string, OR oR) {
        return Q.d(null, string, oR);
    }

    public static List b(Component component, String string) {
        return Q.d(component, string, null);
    }

    public static List d(Component component, String string, OR oR) {
        block11: {
            Q q2;
            block10: {
                String string2;
                Q q3;
                block8: {
                    block9: {
                        q3 = new Q(string);
                        string2 = T.v();
                        try {
                            try {
                                q2 = q3;
                                if (string2 != null) break block8;
                                q2.setMultiSelectionEnabled(true);
                                if (oR == null) break block9;
                            }
                            catch (HeadlessException headlessException) {
                                throw Q.a(headlessException);
                            }
                            oR.j(q3);
                        }
                        catch (HeadlessException headlessException) {
                            throw Q.a(headlessException);
                        }
                    }
                    q2 = q3;
                }
                try {
                    try {
                        if (string2 != null) break block10;
                        if (q2.showOpenDialog(component) != 0) break block11;
                    }
                    catch (HeadlessException headlessException) {
                        throw Q.a(headlessException);
                    }
                    q2 = q3;
                }
                catch (HeadlessException headlessException) {
                    throw Q.a(headlessException);
                }
            }
            return aL.o(q2.getSelectedFiles());
        }
        return null;
    }

    public static File C() {
        return Q.V(null, null, null);
    }

    public static File m(OR oR) {
        return Q.V(null, null, oR);
    }

    public static File q(Component component, OR oR) {
        return Q.V(component, null, oR);
    }

    public static File r(String string, OR oR) {
        return Q.V(null, string, oR);
    }

    public static File R(Component component, String string) {
        return Q.V(component, string, null);
    }

    public static File V(Component component, String string, OR oR) {
        block11: {
            Q q2;
            block10: {
                String string2;
                Q q3;
                block8: {
                    block9: {
                        q3 = new Q(string);
                        string2 = T.v();
                        try {
                            try {
                                q2 = q3;
                                if (string2 != null) break block8;
                                q2.setMultiSelectionEnabled(true);
                                if (oR == null) break block9;
                            }
                            catch (HeadlessException headlessException) {
                                throw Q.a(headlessException);
                            }
                            oR.j(q3);
                        }
                        catch (HeadlessException headlessException) {
                            throw Q.a(headlessException);
                        }
                    }
                    q2 = q3;
                }
                try {
                    try {
                        if (string2 != null) break block10;
                        if (q2.showSaveDialog(component) != 0) break block11;
                    }
                    catch (HeadlessException headlessException) {
                        throw Q.a(headlessException);
                    }
                    q2 = q3;
                }
                catch (HeadlessException headlessException) {
                    throw Q.a(headlessException);
                }
            }
            return q2.getSelectedFile();
        }
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "'\u0017\tgc;8;\u001b8".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 22;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 68;
                            break;
                        }
                        case 1: {
                            n17 = 104;
                            break;
                        }
                        case 2: {
                            n17 = 89;
                            break;
                        }
                        case 3: {
                            n17 = 24;
                            break;
                        }
                        case 4: {
                            n17 = 25;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 120;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

