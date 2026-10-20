/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.NE;
import com.kp_0;
import com.m.s;
import java.io.Serializable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Q
extends DefaultMutableTreeNode
implements Serializable {
    protected String R;
    private static final String a;

    public Q() {
        this.b();
    }

    public Q(Object object) {
        super(object);
        this.b();
    }

    public String H() {
        String string = s.d();
        String string2 = this.R;
        if (string != null) {
            if (string2 == null) {
                this.b();
            }
            string2 = this.R;
        }
        return string2;
    }

    public void n(String string) {
        this.R = string;
    }

    protected void b() {
        this.R = NE.E(a);
    }

    public Q w() {
        return (Q)super.getParent();
    }

    public TreePath i() {
        return new TreePath(this.getPath());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String toString() {
        String string;
        String string2 = s.d();
        Object object = this.userObject;
        if (string2 != null) {
            if (object == null) {
                string = kp_0.c(this.getClass());
                return string;
            }
            object = this.userObject;
        }
        string = object.toString();
        return string;
    }

    @Override
    public TreeNode getParent() {
        return this.w();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "7b".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 125;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 31;
                            break;
                        }
                        case 1: {
                            n17 = 81;
                            break;
                        }
                        case 2: {
                            n17 = 59;
                            break;
                        }
                        case 3: {
                            n17 = 79;
                            break;
                        }
                        case 4: {
                            n17 = 30;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 44;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

