/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Map;
import java.util.WeakHashMap;

public final class PY {
    private static final Map h = new WeakHashMap();
    private static final Map y = new WeakHashMap();
    private static final Map W = new WeakHashMap();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int f(Component component) {
        Dimension dimension = (Dimension)h.get(component);
        String string = FV.D();
        Dimension dimension2 = dimension;
        if (string == null) {
            if (dimension2 == null) return -1;
            dimension2 = dimension;
        }
        int n10 = dimension2.width;
        return n10;
    }

    public static Component Q(Component component, int n10) {
        block4: {
            block2: {
                Dimension dimension;
                Dimension dimension2;
                block3: {
                    dimension2 = (Dimension)h.get(component);
                    String string = FV.D();
                    dimension = dimension2;
                    if (string != null) break block2;
                    if (dimension != null) break block3;
                    dimension2 = new Dimension(n10, -1);
                    h.put(component, dimension2);
                    if (string == null) break block4;
                }
                dimension = dimension2;
            }
            dimension.width = n10;
        }
        return component;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int m(Component component) {
        Dimension dimension = (Dimension)h.get(component);
        String string = FV.D();
        Dimension dimension2 = dimension;
        if (string == null) {
            if (dimension2 == null) return -1;
            dimension2 = dimension;
        }
        int n10 = dimension2.height;
        return n10;
    }

    public static Component j(Component component, int n10) {
        block4: {
            block2: {
                Dimension dimension;
                Dimension dimension2;
                block3: {
                    dimension2 = (Dimension)h.get(component);
                    String string = FV.D();
                    dimension = dimension2;
                    if (string != null) break block2;
                    if (dimension != null) break block3;
                    dimension2 = new Dimension(-1, n10);
                    h.put(component, dimension2);
                    if (string == null) break block4;
                }
                dimension = dimension2;
            }
            dimension.height = n10;
        }
        return component;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int S(Component component) {
        Dimension dimension = (Dimension)y.get(component);
        String string = FV.D();
        Dimension dimension2 = dimension;
        if (string == null) {
            if (dimension2 == null) return -1;
            dimension2 = dimension;
        }
        int n10 = dimension2.width;
        return n10;
    }

    public static Component N(Component component, int n10) {
        block4: {
            block2: {
                Dimension dimension;
                Dimension dimension2;
                block3: {
                    dimension2 = (Dimension)y.get(component);
                    String string = FV.D();
                    dimension = dimension2;
                    if (string != null) break block2;
                    if (dimension != null) break block3;
                    dimension2 = new Dimension(n10, -1);
                    y.put(component, dimension2);
                    if (string == null) break block4;
                }
                dimension = dimension2;
            }
            dimension.width = n10;
        }
        return component;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int Z(Component component) {
        Dimension dimension = (Dimension)y.get(component);
        String string = FV.D();
        Dimension dimension2 = dimension;
        if (string == null) {
            if (dimension2 == null) return -1;
            dimension2 = dimension;
        }
        int n10 = dimension2.height;
        return n10;
    }

    public static Component w(Component component, int n10) {
        block4: {
            block2: {
                Dimension dimension;
                Dimension dimension2;
                block3: {
                    dimension2 = (Dimension)y.get(component);
                    String string = FV.D();
                    dimension = dimension2;
                    if (string != null) break block2;
                    if (dimension != null) break block3;
                    dimension2 = new Dimension(-1, n10);
                    y.put(component, dimension2);
                    if (string == null) break block4;
                }
                dimension = dimension2;
            }
            dimension.height = n10;
        }
        return component;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int J(Component component) {
        Dimension dimension = (Dimension)W.get(component);
        String string = FV.D();
        Dimension dimension2 = dimension;
        if (string == null) {
            if (dimension2 == null) return -1;
            dimension2 = dimension;
        }
        int n10 = dimension2.width;
        return n10;
    }

    public static Component b(Component component, int n10) {
        block4: {
            block2: {
                Dimension dimension;
                Dimension dimension2;
                block3: {
                    dimension2 = (Dimension)W.get(component);
                    String string = FV.D();
                    dimension = dimension2;
                    if (string != null) break block2;
                    if (dimension != null) break block3;
                    dimension2 = new Dimension(n10, -1);
                    W.put(component, dimension2);
                    if (string == null) break block4;
                }
                dimension = dimension2;
            }
            dimension.width = n10;
        }
        return component;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int i(Component component) {
        Dimension dimension = (Dimension)W.get(component);
        String string = FV.D();
        Dimension dimension2 = dimension;
        if (string == null) {
            if (dimension2 == null) return -1;
            dimension2 = dimension;
        }
        int n10 = dimension2.height;
        return n10;
    }

    public static Component y(Component component, int n10) {
        block4: {
            block2: {
                Dimension dimension;
                Dimension dimension2;
                block3: {
                    dimension2 = (Dimension)W.get(component);
                    String string = FV.D();
                    dimension = dimension2;
                    if (string != null) break block2;
                    if (dimension != null) break block3;
                    dimension2 = new Dimension(-1, n10);
                    W.put(component, dimension2);
                    if (string == null) break block4;
                }
                dimension = dimension2;
            }
            dimension.height = n10;
        }
        return component;
    }

    public static Dimension W(Component component, Dimension dimension) {
        Dimension dimension2;
        block27: {
            Dimension dimension3;
            block24: {
                Dimension dimension4;
                String string;
                block25: {
                    block26: {
                        Dimension dimension5;
                        block22: {
                            block23: {
                                Dimension dimension6;
                                block21: {
                                    block18: {
                                        block19: {
                                            block20: {
                                                block16: {
                                                    block17: {
                                                        dimension6 = (Dimension)h.get(component);
                                                        string = FV.D();
                                                        dimension5 = (Dimension)y.get(component);
                                                        dimension4 = (Dimension)W.get(component);
                                                        dimension3 = new Dimension(dimension);
                                                        dimension2 = dimension6;
                                                        if (string != null) break block16;
                                                        if (dimension2 == null) break block17;
                                                        dimension2 = dimension6;
                                                        if (string != null) break block16;
                                                        if (dimension2.width == -1) break block17;
                                                        dimension3.width = dimension6.width;
                                                        if (string == null) break block18;
                                                    }
                                                    dimension2 = dimension5;
                                                }
                                                if (string != null) break block19;
                                                if (dimension2 == null) break block20;
                                                dimension2 = dimension5;
                                                if (string != null) break block19;
                                                if (dimension2.width != -1) {
                                                    dimension3.width = Math.max(dimension5.width, dimension3.width);
                                                }
                                            }
                                            dimension2 = dimension4;
                                        }
                                        if (string != null) break block21;
                                        if (dimension2 == null) break block18;
                                        dimension2 = dimension4;
                                        if (string != null) break block21;
                                        if (dimension2.width != -1) {
                                            dimension3.width = Math.min(dimension3.width, dimension4.width);
                                        }
                                    }
                                    dimension2 = dimension6;
                                }
                                if (string != null) break block22;
                                if (dimension2 == null) break block23;
                                dimension2 = dimension6;
                                if (string != null) break block22;
                                if (dimension2.height == -1) break block23;
                                dimension3.height = dimension6.height;
                                if (string == null) break block24;
                            }
                            dimension2 = dimension5;
                        }
                        if (string != null) break block25;
                        if (dimension2 == null) break block26;
                        dimension2 = dimension5;
                        if (string != null) break block25;
                        if (dimension2.height != -1) {
                            dimension3.height = Math.max(dimension5.height, dimension3.height);
                        }
                    }
                    dimension2 = dimension4;
                }
                if (string != null) break block27;
                if (dimension2 == null) break block24;
                dimension2 = dimension4;
                if (string != null) break block27;
                if (dimension2.height != -1) {
                    dimension3.height = Math.min(dimension3.height, dimension4.height);
                }
            }
            dimension2 = dimension3;
        }
        return dimension2;
    }

    public static Component O(Component component, int n10, int n11) {
        component.setPreferredSize(new Dimension(n10, n11));
        return component;
    }
}

