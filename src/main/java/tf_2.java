/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from tf
 */
public class tf_2
implements Serializable {
    Long M;
    String s;
    List x;
    List k;
    String r;
    long q;
    boolean u;
    String N;
    File X;
    FileSystemView S;
    String T;
    int A;
    boolean R;
    boolean F;
    boolean p;
    long w;
    boolean a;
    int c;
    String o;
    int I;
    int O;
    ln_2 U;

    public tf_2(File file) {
        this.x = new ArrayList();
        this.k = new ArrayList();
        this.S = FileSystemView.getFileSystemView();
        this.R = true;
        this.F = false;
        this.p = false;
        this.a = false;
        try {
            this.t(file);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public tf_2() {
        this.x = new ArrayList();
        this.k = new ArrayList();
        this.S = FileSystemView.getFileSystemView();
        this.R = true;
        this.F = false;
        this.p = false;
        this.a = false;
    }

    public String M() {
        return (String)this.s;
    }

    public int y(String string) {
        int n10;
        block6: {
            int n11 = 0;
            String[] stringArray = F8.y();
            List list = (List)this.x;
            int n12 = 0;
            while (n12 < list.size()) {
                tf_2 tf_22 = (tf_2)list.get(n12);
                if (stringArray == null) {
                    String string2;
                    try {
                        string2 = (String)tf_22.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n10 = string2.equals(string) ? 1 : 0;
                    if (stringArray != null) break block6;
                    if (n10 != 0) {
                        n11 = n12;
                        if (stringArray == null) break;
                    }
                    ++n12;
                }
                if (stringArray == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public ck_2 o(String string) {
        ck_2 ck_22;
        block5: {
            ck_2 ck_23 = null;
            int n10 = 0;
            String[] stringArray = F8.y();
            while (n10 < ((List)this.k).size()) {
                ck_2 ck_24 = (ck_2)((List)this.k).get(n10);
                if (stringArray == null) {
                    String string2;
                    ck_22 = ck_24;
                    if (stringArray != null) break block5;
                    try {
                        string2 = (String)ck_22.d();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (string2 == string) {
                        ck_23 = ck_24;
                    }
                    ++n10;
                }
                if (stringArray == null) continue;
            }
            ck_22 = ck_23;
        }
        return ck_22;
    }

    public void F(String string) {
        Iterator iterator = ((List)this.k).iterator();
        String[] stringArray = F8.y();
        while (iterator.hasNext()) {
            block6: {
                block5: {
                    String string2;
                    ck_2 ck_22 = (ck_2)iterator.next();
                    try {
                        string2 = (String)ck_22.d();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    boolean bl = string2.equals(string);
                    if (stringArray != null) break block5;
                    if (!bl) break block6;
                    bl = ((List)this.k).remove(ck_22);
                }
                if (stringArray == null) break;
            }
            if (stringArray == null) continue;
        }
    }

    public void m(String string) {
        Iterator iterator = ((List)this.x).iterator();
        String[] stringArray = F8.y();
        while (iterator.hasNext()) {
            block6: {
                block5: {
                    String string2;
                    tf_2 tf_22 = (tf_2)iterator.next();
                    try {
                        string2 = (String)tf_22.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    boolean bl = string2.equals(string);
                    if (stringArray != null) break block5;
                    if (!bl) break block6;
                    bl = ((List)this.x).remove(tf_22);
                }
                if (stringArray == null) break;
            }
            if (stringArray == null) continue;
        }
    }

    public void q() {
        try {
            lk_0.r(this.x);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void f() {
        try {
            lk_0.l(this.k);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void h(String string) {
        this.s = string;
    }

    public Long P() {
        return (Long)this.M;
    }

    public void o(Long l2) {
        this.M = l2;
    }

    public void n(ck_2 ck_22) {
        ((List)this.k).remove(ck_22);
    }

    public void I(ck_2 ck_22) {
        ((List)this.k).add(ck_22);
    }

    public List f() {
        return (List)this.x;
    }

    public void b(List list) {
        this.x = list;
    }

    public List M() {
        return (List)this.k;
    }

    public void P(List list) {
        this.k = list;
    }

    public String p() {
        return (String)this.r;
    }

    public void x(String string) {
        this.r = string;
    }

    public boolean p() {
        return this.u;
    }

    public void v(boolean bl) {
        this.u = bl;
    }

    public long E() {
        return this.q;
    }

    public void o(long l2) {
        this.q = l2;
    }

    public String k() {
        return (String)this.N;
    }

    public void u(String string) {
        this.N = string;
    }

    public File M() {
        return (File)this.X;
    }

    public boolean z() {
        return this.R;
    }

    public void t(File file) {
        this.R = true;
        this.X = file;
        if (file != null) {
            // empty if block
        }
        this.M = file.getAbsolutePath().hashCode();
        this.N = file.getAbsolutePath();
        this.T = ((FileSystemView)this.S).getSystemDisplayName(file);
        this.s = file.getName();
        this.w = file.lastModified();
    }

    public String g() {
        return (String)this.T;
    }

    public void D(String string) {
        this.T = string;
    }

    public int r() {
        return this.A;
    }

    public void z(int n10) {
        this.A = n10;
    }

    public void t(boolean bl) {
        this.R = bl;
    }

    public boolean H() {
        return this.F;
    }

    public void z(boolean bl) {
        this.F = bl;
    }

    public boolean M() {
        return this.p;
    }

    public void r(boolean bl) {
        this.p = bl;
    }

    public long w() {
        return this.w;
    }

    public void W(long l2) {
        this.w = l2;
    }

    public boolean Y() {
        return this.a;
    }

    public void J(boolean bl) {
        this.a = bl;
    }

    public int y() {
        return this.c;
    }

    public void j(int n10) {
        this.c = n10;
    }

    public String C() {
        return (String)this.o;
    }

    public void E(String string) {
        this.o = string;
    }

    public int n() {
        return this.I;
    }

    public void Z(int n10) {
        this.I = n10;
    }

    public int B() {
        return this.O;
    }

    public void v(int n10) {
        this.O = n10;
    }

    public ln_2 V() {
        return (ln_2)this.U;
    }

    public void p(ln_2 ln_22) {
        this.U = ln_22;
    }
}

