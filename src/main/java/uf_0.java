/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.HashMap;

/*
 * Renamed from Uf
 */
public class uf_0
implements Runnable {
    Thread L;
    HashMap Z = new HashMap();

    public uf_0() {
        this.L = new Thread(this);
        this.L.start();
    }

    synchronized void S(qm_0 qm_02, int n10) {
        aT aT2;
        ky_2[] ky_2Array = qm_0.J();
        HashMap hashMap = this.Z;
        Integer n11 = qm_02.W;
        if (ky_2Array != null) {
            if (!hashMap.containsKey(n11)) {
                aT2 = new aT(qm_02);
                this.Z.put(qm_02.W, aT2);
            }
            hashMap = this.Z;
            n11 = qm_02.W;
        }
        aT2 = (aT)hashMap.get(n11);
        aT2.C(n10);
    }

    synchronized void e(qm_0 qm_02) {
        if (!this.Z.containsKey(qm_02.W)) {
            aT aT2 = new aT(qm_02);
            this.Z.put(qm_02.W, aT2);
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
        var1_1 = qm_0.J();
        while (true) {
            block11: {
                var2_2 = this;
                // MONITORENTER : var2_2
                var3_4 = this.Z.keySet().iterator();
                try {
                    if (var1_1 == null) {
                        break block11;
                    }
                    ** GOTO lbl23
                }
                catch (InterruptedException v0) {
                    throw uf_0.a(v0);
                }
            }
            block8: while (true) {
                v2 /* !! */  = var3_4.next();
                do {
                    var4_5 = (Integer)v2 /* !! */ ;
                    var5_6 = (aT)this.Z.get(var4_5);
                    var5_6.t();
lbl23:
                    // 2 sources

                    if (var3_4.hasNext()) continue block8;
                    this.Z.clear();
                    this.Z = null;
                    this.Z = new HashMap<K, V>();
                    v2 /* !! */  = var2_2;
                } while (var1_1 == null);
                break;
            }
            // MONITOREXIT : v2 /* !! */ 
            try {
                Thread.sleep(cs_0.o);
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

