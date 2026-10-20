/*
 * Decompiled with CFR 0.152.
 */
import com.KD;
import com.c;
import com.qe_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from df
 */
class df_2
implements ActionListener {
    final K_ d;

    df_2(K_ k_) {
        this.d = k_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            KD kD;
            block9: {
                boolean bl;
                block7: {
                    int[] nArray;
                    block8: {
                        block4: {
                            block5: {
                                nArray = jx_0.O();
                                bl = ((qe_0)this.d.V).isSelected();
                                if (nArray != null) break block4;
                                if (!bl) break block5;
                                this.d.k = K_.I;
                                ((qe_0)this.d.V).setSelected(true);
                                if (nArray == null) break block6;
                            }
                            bl = ((qe_0)this.d.n).isSelected();
                        }
                        if (nArray != null) break block7;
                        if (!bl) break block8;
                        ((qe_0)this.d.n).setSelected(true);
                        try {
                            this.d.L(this.d.G);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (nArray == null) break block6;
                    }
                    kD = (KD)this.d.D;
                    if (nArray != null) break block9;
                    bl = kD.isSelected();
                }
                if (!bl) break block6;
                kD = (KD)this.d.D;
            }
            kD.setSelected(true);
            this.d.k = K_.i;
        }
    }
}

