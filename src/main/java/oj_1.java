/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Renamed from oJ
 */
class oj_1 {
    JLabel Y;
    JTextField N;
    String F;
    fw_0 R;
    final WS A;

    oj_1(WS wS, fw_0 fw_02, String string, JLabel jLabel, JTextField jTextField) {
        this.A = wS;
        this.F = string;
        this.R = fw_02;
        this.Y = jLabel;
        this.N = jTextField;
    }

    public JLabel j() {
        return (JLabel)this.Y;
    }

    public void l(JLabel jLabel) {
        this.Y = jLabel;
    }

    public JTextField b() {
        return (JTextField)this.N;
    }

    public void h(JTextField jTextField) {
        this.N = jTextField;
    }

    public String a() {
        return (String)this.F;
    }

    public void I(String string) {
        this.F = string;
    }

    public fw_0 v() {
        return (fw_0)this.R;
    }

    public void l(fw_0 fw_02) {
        this.R = fw_02;
    }
}

