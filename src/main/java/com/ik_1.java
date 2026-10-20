/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.ky_2;
import com.ok_1;
import com.qm_0;
import java.awt.Component;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.iK
 */
public class ik_1 {
    private static int C;

    public static List O(String string, Component component) {
        List list;
        block4: {
            block3: {
                List list2;
                int n10;
                block2: {
                    list = FN.C(string, component);
                    n10 = ik_1.o();
                    list2 = list;
                    if (n10 != 0) break block2;
                    if (list2.size() <= 0) break block3;
                    list2 = list;
                }
                ik_1.V(list2, component);
                if (n10 == 0) break block4;
                ky_2.K(new String[1]);
            }
            ik_1.o(component);
        }
        return list;
    }

    public static void A(Component component) {
        ik_1.A(component, null);
    }

    public static void A(Component component, Component component2) {
        block5: {
            qm_0 qm_02;
            qm_0 qm_03;
            int n10;
            block6: {
                Component component3;
                block4: {
                    n10 = ik_1.o();
                    component3 = component;
                    if (n10 != 0) break block4;
                    if (component3 == null) break block5;
                    component3 = component;
                }
                qm_02 = qm_03 = ok_1.P(FN.L(component3));
                if (n10 != 0) break block6;
                if (qm_02 == null) break block5;
                qm_03.w();
                qm_02 = qm_03;
            }
            Component component4 = component2;
            if (n10 == 0) {
                component4 = component4 != null ? component2 : qm_03;
            }
            qm_02.a(component4);
            qm_03.M(new Component[]{component});
        }
    }

    public static void E(List list) {
        ik_1.V(list, null);
    }

    public static void V(List list, Component component) {
        block9: {
            List list2;
            int n10;
            block8: {
                n10 = ik_1.Q();
                list2 = list;
                if (n10 == 0) break block8;
                if (list2 == null) break block9;
                list2 = list;
            }
            if (list2.size() > 0) {
                ArrayList<String> arrayList = new ArrayList<String>();
                for (Component component2 : list) {
                    qm_0 qm_02 = ok_1.P(FN.L(component2));
                    if (qm_02 != null) {
                        if (!arrayList.contains(qm_02.g())) {
                            Component component3 = component;
                            if (n10 != 0) {
                                component3 = component3 != null ? component : qm_02;
                            }
                            qm_02.a(component3);
                            qm_02.w();
                            arrayList.add(qm_02.g());
                        }
                        qm_02.M(new Component[]{component2});
                    }
                    if (n10 != 0) continue;
                }
            }
        }
    }

    public static void I(Component component) {
        block3: {
            qm_0 qm_02;
            block4: {
                qm_0 qm_03;
                Component component2;
                int n10;
                block2: {
                    n10 = ik_1.Q();
                    component2 = component;
                    if (n10 == 0) break block2;
                    if (component2 == null) break block3;
                    component2 = component;
                }
                qm_02 = qm_03 = ok_1.P(FN.L(component2));
                if (n10 == 0) break block4;
                if (qm_02 == null) break block3;
                qm_02 = qm_03;
            }
            qm_02.C(new Component[]{component});
        }
    }

    public static void A(List list) {
        block4: {
            List list2;
            int n10;
            block5: {
                block3: {
                    n10 = ik_1.o();
                    list2 = list;
                    if (n10 != 0) break block3;
                    if (list2 == null) break block4;
                    list2 = list;
                }
                if (n10 != 0) break block5;
                if (list2.size() <= 0) break block4;
                list2 = list;
            }
            for (Component component : list2) {
                block7: {
                    qm_0 qm_02;
                    block6: {
                        qm_0 qm_03;
                        qm_02 = qm_03 = ok_1.P(FN.L(component));
                        if (n10 != 0) break block6;
                        if (qm_02 == null) break block7;
                        qm_02 = qm_03;
                    }
                    qm_02.C(new Component[]{component});
                }
                if (n10 == 0) continue;
            }
        }
    }

    public static void o(Component component) {
        ik_1.x(FN.L(component));
    }

    public static void x(Window window) {
        block3: {
            qm_0 qm_02;
            block2: {
                qm_0 qm_03 = ok_1.P(window);
                int n10 = ik_1.Q();
                qm_02 = qm_03;
                if (n10 == 0) break block2;
                if (qm_02 == null) break block3;
                qm_02 = qm_03;
            }
            qm_02.w();
        }
    }

    public static void J(Component component) {
        ik_1.c(FN.L(component), component);
    }

    public static void c(Window window, Component component) {
        int n10;
        block5: {
            qm_0 qm_02;
            block4: {
                qm_0 qm_03 = ok_1.P(window);
                n10 = ik_1.o();
                qm_02 = qm_03;
                if (n10 != 0) break block4;
                if (qm_02 == null) break block5;
                qm_02 = qm_03;
            }
            qm_02.a(component);
        }
        if (ky_2.F() != null) {
            ik_1.U(++n10);
        }
    }

    public static void U(int n10) {
        C = n10;
    }

    public static int Q() {
        return C;
    }

    public static int o() {
        int n10 = ik_1.Q();
        if (n10 == 0) {
            return 72;
        }
        return 0;
    }

    static {
        if (ik_1.o() != 0) {
            ik_1.U(70);
        }
    }
}

