/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import org.icmp4j.j;

/*
 * Renamed from Cn
 */
class cn_0
implements Runnable {
    final j k;
    final L9 X;
    final dw_2 U;

    cn_0(dw_2 dw_22, j j2, L9 l9) {
        this.U = dw_22;
        this.k = j2;
        this.X = l9;
    }

    @Override
    public void run() {
        block10: {
            KV kV;
            cn_0 cn_02;
            block9: {
                int[] nArray = L9.X();
                cn_02 = this;
                if (nArray != null) break block9;
                if (((j)cn_02.k).r() >= 0) break block10;
                cn_02 = this;
            }
            try {
                kV = (KV)cn_02.X.r();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            KV kV2 = kV;
            try {
                kV2.t(this.k);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.U.k.N(this.X);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lk_0.E(this.X, this.U.k);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

