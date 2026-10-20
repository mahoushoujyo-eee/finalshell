/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;

public class B3
extends PrintStream {
    HashSet K = new HashSet();
    StringBuffer k = new StringBuffer();
    private static final long a;

    public B3(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void write(byte[] byArray, int n10, int n11) {
        super.write(byArray, n10, n11);
        this.d(new String(byArray, n10, n11));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void d(String string) {
        B3 b3;
        boolean bl;
        block5: {
            block6: {
                bl = cn_1.B();
                b3 = this;
                if (bl) break block5;
                if (b3.k == null) break block6;
                b3 = this;
                if (bl) break block5;
                if (b3.k.length() < (int)a) {
                    this.k.append(string);
                }
            }
            b3 = this;
        }
        Iterator iterator = b3.K.iterator();
        boolean bl2 = true;
        do {
            if (bl2 && !(bl2 = false) && !bl) continue;
            CH cH = (CH)iterator.next();
            cH.d(string);
        } while (iterator.hasNext());
    }

    public void W(CH cH) {
        this.K.add(cH);
    }

    public void j(CH cH) {
        this.K.remove(cH);
    }

    public StringBuffer C() {
        return this.k;
    }

    public void p(StringBuffer stringBuffer) {
        this.k = stringBuffer;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3432898752115771358L;
        a = 0xC17E512E0DBE20CEL ^ l2;
    }
}

