/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class LW
implements Runnable {
    Thread o;
    HashMap s = new HashMap();

    public LW() {
        this.o = new Thread(this);
        this.o.start();
    }

    synchronized void d(qu_0 qu_02, int n10) {
        z1 z12;
        String[] stringArray = QI.N();
        HashMap hashMap = this.s;
        Integer n11 = qu_02.a;
        if (stringArray != null) {
            if (!hashMap.containsKey(n11)) {
                z12 = new z1(qu_02);
                this.s.put(qu_02.a, z12);
            }
            hashMap = this.s;
            n11 = qu_02.a;
        }
        z12 = (z1)hashMap.get(n11);
        z12.k(n10);
    }

    synchronized void i(qu_0 qu_02) {
        if (!this.s.containsKey(qu_02.a)) {
            z1 z12 = new z1(qu_02);
            this.s.put(qu_02.a, z12);
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
                var3_4 = this.s.keySet().iterator();
                try {
                    if (var1_1 == null) {
                        break block11;
                    }
                    ** GOTO lbl23
                }
                catch (InterruptedException v0) {
                    throw LW.a(v0);
                }
            }
            block8: while (true) {
                v2 /* !! */  = var3_4.next();
                do {
                    var4_5 = (Integer)v2 /* !! */ ;
                    var5_6 = (z1)this.s.get(var4_5);
                    var5_6.h();
lbl23:
                    // 2 sources

                    if (var3_4.hasNext()) continue block8;
                    this.s.clear();
                    this.s = null;
                    this.s = new HashMap<K, V>();
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

