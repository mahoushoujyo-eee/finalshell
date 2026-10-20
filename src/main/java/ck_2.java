/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import javax.swing.filechooser.FileSystemView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from ck
 */
public class ck_2
implements Serializable {
    long f;
    long L;
    String S;
    long r;
    String X;
    Timestamp H;
    File v;
    int R;
    String o;
    String t;
    boolean I;
    long x;
    int V;
    boolean G;
    int a;
    String m;
    String q;
    int y;
    int l;
    static FileSystemView U;
    ln_2 O;

    public ck_2(File file) {
        this.G = false;
        try {
            this.N(file);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public ck_2() {
        this.G = false;
    }

    public String T() {
        return (String)this.S;
    }

    public void H(String string) {
        this.S = string;
    }

    public long m() {
        return this.r;
    }

    public void R(long l2) {
        this.r = l2;
    }

    public String a() {
        return (String)this.X;
    }

    public void T(String string) {
        this.X = string;
    }

    public long T() {
        return this.f;
    }

    public void q(long l2) {
        this.f = l2;
    }

    public long V() {
        return this.L;
    }

    public void w(long l2) {
        this.L = l2;
    }

    public Timestamp U() {
        return (Timestamp)this.H;
    }

    public void H(Timestamp timestamp) {
        this.H = timestamp;
    }

    public boolean M() {
        return (File)this.v != null;
    }

    public File i() {
        return (File)this.v;
    }

    public void N(File file) {
        this.v = file;
        this.o = file.getAbsolutePath();
        this.t = ((FileSystemView)ck_2.U).getSystemDisplayName(file);
        this.X = file.getName();
        try {
            this.R(file.length());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.x = file.lastModified();
    }

    public int p() {
        return this.R;
    }

    public void l(int n10) {
        this.R = n10;
    }

    public String d() {
        return (String)this.o;
    }

    public void o(String string) {
        this.o = string;
    }

    public String y() {
        return (String)this.t;
    }

    public void Q(String string) {
        this.t = string;
    }

    public void B(boolean bl) {
        this.I = bl;
    }

    public long Q() {
        return this.x;
    }

    public void Q(long l2) {
        this.x = l2;
    }

    public int I() {
        return this.V;
    }

    public void U(int n10) {
        this.V = n10;
    }

    public boolean l() {
        return this.G;
    }

    public void d(boolean bl) {
        this.G = bl;
    }

    public int v() {
        return this.a;
    }

    public void s(int n10) {
        this.a = n10;
    }

    public String S() {
        return (String)this.m;
    }

    public void W(String string) {
        this.m = string;
    }

    public String M() {
        return (String)this.q;
    }

    public void h(String string) {
        this.q = string;
    }

    public int f() {
        return this.y;
    }

    public void z(int n10) {
        this.y = n10;
    }

    public int s() {
        return this.l;
    }

    public void a(int n10) {
        this.l = n10;
    }

    public ln_2 u() {
        return (ln_2)this.O;
    }

    public void J(ln_2 ln_22) {
        this.O = ln_22;
    }

    static {
        ck_2.U = FileSystemView.getFileSystemView();
    }
}

