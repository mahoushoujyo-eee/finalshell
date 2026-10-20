/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.dq_1;
import java.io.IOException;

class mJ
implements Runnable {
    final dq_1 C;
    final String J;
    final ty_0 d;

    mJ(ty_0 ty_02, dq_1 dq_12, String string) {
        this.d = ty_02;
        this.C = dq_12;
        this.J = string;
    }

    @Override
    public void run() {
        try {
            ((dq_1)this.C).j().write(((String)this.J).getBytes());
            ((dq_1)this.C).j().flush();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

