/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.ArrayList;
import org.icmp4j.j;

/*
 * Renamed from Yu
 */
public class yu_0 {
    ArrayList Z = new ArrayList();
    int H;
    int c = (int)b;
    boolean a = false;
    int n;
    private static int[] d;
    private static final long b;

    public yu_0() {
        int[] nArray = yu_0.D();
        this.n = 0;
        if (ky_2.F() != null) {
            yu_0.k(new int[5]);
        }
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void T(j var1_1) {
        block11: {
            block12: {
                block9: {
                    block10: {
                        v0 = yu_0.D();
                        this.Z.add(var1_1);
                        var2_2 = v0;
                        v1 = this.Z.size();
                        if (var2_2 != null) {
                            if (v1 > this.c) {
                                this.Z.remove(0);
                            }
                            v1 = (int)this.a;
                        }
                        if (var2_2 == null) break block9;
                        if (v1 != 0) break block10;
                        v1 = (int)var1_1.q();
                        if (var2_2 == null) break block11;
                        if (v1 == 0) break block12;
                        this.H = var1_1.r();
                        if (var2_2 != null) break block12;
                        ky_2.K(new String[2]);
                    }
                    v1 = var1_1.r();
                }
                if (var2_2 == null) break block11;
                if (v1 > 0) {
                    this.H = var1_1.r();
                }
            }
            v1 = 0;
        }
        var3_3 = v1;
        var5_4 = this.Z.iterator();
        if (var2_2 != null) ** GOTO lbl37
        block0: while (true) {
            var4_5 = (j)var5_4.next();
            v2 = var4_5.r();
            if (var2_2 == null) ** GOTO lbl39
            if (v2 == 0) {
                ++var3_3;
            }
lbl37:
            // 4 sources

            do {
                v2 = var5_4.hasNext();
lbl39:
                // 2 sources

                if (v2 != 0) continue block0;
                this.n = var3_3;
            } while (var2_2 == null);
            break;
        }
    }

    public int f() {
        return this.Z.size();
    }

    public ArrayList C() {
        return this.Z;
    }

    public int y() {
        return this.H;
    }

    public void T(int n10) {
        this.H = n10;
    }

    public static void k(int[] nArray) {
        d = nArray;
    }

    public static int[] D() {
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (yu_0.D() == null) {
            yu_0.k(new int[5]);
        }
        long l2 = 861350464523823344L;
        b = 0x9FFC33C110F69DCL ^ l2;
    }
}

