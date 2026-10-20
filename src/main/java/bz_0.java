/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from Bz
 */
public class bz_0
implements Runnable {
    Thread D;
    HashMap M = new HashMap();

    public bz_0() {
        this.D = new Thread(this);
        this.D.start();
    }

    synchronized void Q(UR uR2, int n10) {
        g9 g92;
        String[] stringArray = QI.N();
        HashMap hashMap = this.M;
        Integer n11 = uR2.v;
        if (stringArray != null) {
            if (!hashMap.containsKey(n11)) {
                g92 = new g9(uR2);
                this.M.put(uR2.v, g92);
            }
            hashMap = this.M;
            n11 = uR2.v;
        }
        g92 = (g9)hashMap.get(n11);
        g92.S(n10);
    }

    synchronized void u(UR uR2) {
        if (!this.M.containsKey(uR2.v)) {
            g9 g92 = new g9(uR2);
            this.M.put(uR2.v, g92);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        var1_1 = QI.N();
        while (true) {
            block11: {
                var2_2 = this;
                // MONITORENTER : var2_2
                var3_4 = this.M.keySet().iterator();
                try {
                    if (var1_1 == null) {
                        break block11;
                    }
                    ** GOTO lbl23
                }
                catch (InterruptedException v0) {
                    throw bz_0.a(v0);
                }
            }
            block8: while (true) {
                v2 /* !! */  = var3_4.next();
                do {
                    var4_5 = (Integer)v2 /* !! */ ;
                    var5_6 = (g9)this.M.get(var4_5);
                    var5_6.x();
lbl23:
                    // 2 sources

                    if (var3_4.hasNext()) continue block8;
                    this.M.clear();
                    this.M = null;
                    this.M = new HashMap<K, V>();
                    v2 /* !! */  = var2_2;
                } while (var1_1 == null);
                break;
            }
            // MONITOREXIT : v2 /* !! */ 
            try {
                Thread.sleep(yh_0.M);
                continue;
            }
            catch (InterruptedException var2_3) {
                var2_3.printStackTrace();
                continue;
            }
            break;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

