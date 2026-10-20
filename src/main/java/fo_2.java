/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.SwingUtilities;

/*
 * Renamed from fo
 */
class fo_2
implements tk_2 {
    final m6 t;

    fo_2(m6 m62) {
        this.t = m62;
    }

    @Override
    public void R(U u10) {
        SwingUtilities.invokeLater(new bd_0(this, u10));
    }
}

