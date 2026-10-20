/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.gw_0;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;

/*
 * Renamed from com.rv
 */
public final class rv_2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Rectangle Q(List list) {
        String string = FV.D();
        List list2 = list;
        if (string == null) {
            if (list2 == null) return null;
            list2 = list;
        }
        if (string == null) {
            if (list2.size() <= 0) return null;
            list2 = list;
        }
        Rectangle rectangle = rv_2.t(list2.toArray(new Point[list.size()]));
        return rectangle;
    }

    public static Rectangle t(Point[] pointArray) {
        block16: {
            Rectangle rectangle;
            block24: {
                int n10;
                Rectangle rectangle2;
                block23: {
                    String string;
                    block14: {
                        Point[] pointArray2;
                        block15: {
                            string = FV.D();
                            pointArray2 = pointArray;
                            if (string != null) break block15;
                            if (pointArray2 == null) break block16;
                            pointArray2 = pointArray;
                        }
                        if (pointArray2.length <= 0) break block16;
                        rectangle2 = new Rectangle(pointArray[0], new Dimension(0, 0));
                        for (int i2 = 1; i2 < pointArray.length; ++i2) {
                            Point point;
                            block22: {
                                Rectangle rectangle3;
                                int n11;
                                int n12;
                                block21: {
                                    int n13;
                                    block20: {
                                        block19: {
                                            block17: {
                                                block18: {
                                                    point = pointArray[i2];
                                                    n10 = point.x;
                                                    if (string != null) break block14;
                                                    n12 = rectangle2.x;
                                                    if (string != null) break block17;
                                                    if (n10 >= n12) break block18;
                                                    n13 = rectangle2.x - point.x;
                                                    rectangle2.x = point.x;
                                                    rectangle2.width += n13;
                                                    if (string == null) break block19;
                                                }
                                                n11 = rectangle2.x + rectangle2.width;
                                                n12 = point.x;
                                            }
                                            if (string != null) break block20;
                                            if (n11 < n12) {
                                                rectangle2.width = point.x - rectangle2.x;
                                            }
                                        }
                                        n11 = point.y;
                                        n12 = rectangle2.y;
                                    }
                                    if (string != null) break block21;
                                    if (n11 < n12) {
                                        n13 = rectangle2.y - point.y;
                                        rectangle2.y = point.y;
                                        rectangle2.height += n13;
                                        if (string == null) continue;
                                    }
                                    rectangle3 = rectangle2;
                                    if (string != null) break block22;
                                    n11 = rectangle3.y + rectangle2.height;
                                    n12 = point.y;
                                }
                                if (n11 >= n12) continue;
                                rectangle3 = rectangle2;
                            }
                            rectangle3.height = point.y - rectangle2.y;
                            if (string == null) continue;
                        }
                        n10 = rectangle2.width;
                    }
                    if (string != null) break block23;
                    if (n10 == 0) {
                        rectangle2.width = 1;
                    }
                    rectangle = rectangle2;
                    if (string != null) break block24;
                    n10 = rectangle.height;
                }
                if (n10 == 0) {
                    rectangle2.height = 1;
                }
                rectangle = rectangle2;
            }
            return rectangle;
        }
        return null;
    }

    public static Rectangle E(Rectangle[] rectangleArray) {
        block5: {
            Rectangle rectangle;
            block3: {
                Rectangle[] rectangleArray2;
                String string;
                block6: {
                    block4: {
                        string = FV.D();
                        rectangleArray2 = rectangleArray;
                        if (string != null) break block4;
                        if (rectangleArray2 == null) break block5;
                        rectangleArray2 = rectangleArray;
                    }
                    if (string != null) break block6;
                    if (rectangleArray2.length <= 0) break block5;
                    rectangleArray2 = rectangleArray;
                }
                Rectangle rectangle2 = rectangleArray2[0];
                for (int i2 = 1; i2 < rectangleArray.length; ++i2) {
                    rectangle = rv_2.B(rectangle2, rectangleArray[i2]);
                    if (string == null) {
                        rectangle2 = rectangle;
                        if (string == null) continue;
                    }
                    break block3;
                }
                rectangle = rectangle2;
            }
            return rectangle;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static Rectangle B(Rectangle var0, Rectangle var1_1) {
        var2_2 = FV.D();
        v0 = var0;
        if (var2_2 == null) {
            if (v0 == null) {
                v0 = var1_1;
                if (var2_2 == null) {
                    if (v0 != null) {
                        return var1_1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1;
            }
        }
        if (var2_2 == null) {
            if (v0 == null) {
                v0 = var0;
                if (var2_2 == null) {
                    if (v0 != null) {
                        return var0;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0;
            }
        }
        if (var2_2 == null) {
            if (v0 == null) {
                v0 = var1_1;
                if (var2_2 == null) {
                    if (v0 == null) {
                        return null;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0;
            }
        }
        var3_3 = Math.min(v0.x, var1_1.x);
        var4_4 = Math.min(var0.y, var1_1.y);
        var5_5 = Math.max(var0.x + var0.width, var1_1.x + var1_1.width);
        var6_6 = Math.max(var0.y + var0.height, var1_1.y + var1_1.height);
        return new Rectangle(var3_3, var4_4, var5_5 - var3_3, var6_6 - var4_4);
    }

    /*
     * Unable to fully structure code
     */
    public static Rectangle q(Rectangle var0) {
        var1_1 = FV.D();
        v0 = var0.width;
        if (var1_1 == null) {
            if (v0 >= 0) {
                v0 = var0.height;
                if (var1_1 == null) {
                    if (v0 >= 0) {
                        return var0;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0.x;
            }
        }
        var2_2 = v0;
        var3_3 = Math.abs(var0.width);
        v1 = var0.width;
        if (var1_1 == null) {
            if (v1 < 0) {
                var2_2 -= var3_3;
            }
            v1 = var0.y;
        }
        var4_4 = v1;
        var5_5 = Math.abs(var0.height);
        v2 = var0;
        if (var1_1 == null) {
            if (v2.height < 0) {
                var4_4 -= var5_5;
            }
            v2 = new Rectangle(var2_2, var4_4, var3_3, var5_5);
        }
        return v2;
    }

    public static Point s(Rectangle rectangle) {
        return new Point(rectangle.x + rectangle.width / 2, rectangle.y + rectangle.height / 2);
    }

    public static Point x(Point point, Point point2) {
        return new Point((point.x + point2.x) / 2, (point.y + point2.y) / 2);
    }

    public static Point p(int n10, int n11, int n12, int n13) {
        return new Point((n10 + n12) / 2, (n11 + n13) / 2);
    }

    public static Rectangle u(Rectangle rectangle, int n10) {
        return rv_2.i(rectangle, n10, n10, n10, n10);
    }

    public static Rectangle i(Rectangle rectangle, int n10, int n11, int n12, int n13) {
        return new Rectangle(rectangle.x - n11, rectangle.y - n10, rectangle.width + n11 + n13, rectangle.height + n10 + n12);
    }

    public static Point n(Point point, int n10, int n11) {
        return new Point(point.x + n10, point.y + n11);
    }

    public static double i(Point point, Point point2) {
        return rv_2.U(point.x, point.y, point2.x, point2.y);
    }

    public static double U(int n10, int n11, int n12, int n13) {
        double d2 = Math.asin((double)(n13 - n11) / Math.sqrt(gw_0.t(n12 - n10) + gw_0.t(n13 - n11)));
        return n10 > n12 ? -d2 - Math.PI : d2;
    }

    /*
     * Unable to fully structure code
     */
    public static Point N(Rectangle var0, Point var1_1) {
        block41: {
            block43: {
                block42: {
                    block37: {
                        block38: {
                            block40: {
                                block39: {
                                    block36: {
                                        block35: {
                                            block31: {
                                                block32: {
                                                    block34: {
                                                        block33: {
                                                            var3_2 = rv_2.s(var0);
                                                            var4_3 = var3_2.x;
                                                            var5_4 = var3_2.y;
                                                            var2_5 = FV.D();
                                                            var6_6 = var1_1.x;
                                                            var7_7 = var1_1.y;
                                                            v0 = var6_6;
                                                            v1 = var0.x;
                                                            if (var2_5 != null) break block31;
                                                            if (v0 >= v1) break block32;
                                                            var8_8 = var0.x;
                                                            v2 = var9_9 = (var4_3 * (var7_7 - var5_4) - var5_4 * (var6_6 - var4_3) - var8_8 * (var7_7 - var5_4)) / (var4_3 - var6_6);
                                                            v3 = var0.y;
                                                            if (var2_5 != null) break block33;
                                                            if (v2 < v3) break block34;
                                                            v2 = var9_9;
                                                            v3 = var0.y + var0.height;
                                                        }
                                                        if (v2 <= v3) {
                                                            return new Point(var8_8, var9_9);
                                                        }
                                                    }
                                                    if (var2_5 == null) break block35;
                                                }
                                                v0 = var6_6;
                                                v1 = var0.x + var0.width;
                                            }
                                            if (var2_5 != null) break block36;
                                            if (v0 <= v1) break block35;
                                            var8_8 = var0.x + var0.width;
                                            v0 = var9_9 = (var4_3 * (var7_7 - var5_4) - var5_4 * (var6_6 - var4_3) - var8_8 * (var7_7 - var5_4)) / (var4_3 - var6_6);
                                            v1 = var0.y;
                                            if (var2_5 == null) {
                                                if (v0 >= v1) {
                                                    v0 = var9_9;
                                                    v1 = var0.y + var0.height;
                                                    if (var2_5 == null) {
                                                        if (v0 <= v1) {
                                                            return new Point(var8_8, var9_9);
                                                        } else {
                                                            ** GOTO lbl42
                                                        }
                                                    } else {
                                                        ** GOTO lbl41
                                                    }
                                                } else {
                                                    ** GOTO lbl40
                                                }
                                            }
                                            break block36;
lbl40:
                                            // 2 sources

                                            break block35;
lbl41:
                                            // 2 sources

                                            break block36;
                                        }
                                        v0 = var7_7;
                                        v1 = var0.y;
                                    }
                                    if (var2_5 != null) break block37;
                                    if (v0 >= v1) break block38;
                                    var8_8 = var0.y;
                                    v4 = var9_9 = (var4_3 * (var7_7 - var5_4) - var5_4 * (var6_6 - var4_3) - var8_8 * (var4_3 - var6_6)) / (var7_7 - var5_4);
                                    v5 = var0.x;
                                    if (var2_5 != null) break block39;
                                    if (v4 < v5) break block40;
                                    v4 = var9_9;
                                    v5 = var0.x + var0.width;
                                }
                                if (v4 <= v5) {
                                    return new Point(var9_9, var8_8);
                                }
                            }
                            if (var2_5 == null) break block41;
                        }
                        v0 = var7_7;
                        v1 = var0.y + var0.height;
                    }
                    if (var2_5 != null) break block42;
                    if (v0 <= v1) break block41;
                    v0 = var0.y;
                    v1 = var0.height;
                }
                var8_8 = v0 + v1;
                v6 = var9_9 = (var4_3 * (var7_7 - var5_4) - var5_4 * (var6_6 - var4_3) - var8_8 * (var4_3 - var6_6)) / (var7_7 - var5_4);
                v7 = var0.x;
                if (var2_5 != null) break block43;
                if (v6 < v7) break block41;
                v6 = var9_9;
                v7 = var0.x + var0.width;
            }
            if (v6 <= v7) {
                return new Point(var9_9, var8_8);
            }
        }
        return var3_2;
    }

    public static double l(double d2) {
        return d2 * Math.PI / 180.0;
    }

    public static double p(double d2) {
        return d2 * 180.0 / Math.PI;
    }
}

