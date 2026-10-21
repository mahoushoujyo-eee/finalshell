package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.Fk2;
import com.finalshell.ui.model.CN3;
import com.finalshell.ui.model.EZ;
import com.finalshell.ui.panel.BM;
import com.finalshell.ui.panel.KD3;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import javax.swing.SwingUtilities;

public class YW extends MouseAdapter {
   public boolean f;
   public boolean M;
   public boolean Q;
   public boolean z;
   public boolean H;
   public boolean T;
   public boolean i;
   public boolean u;
   public boolean Z;
   public boolean G;
   public boolean R;
   public boolean W;
   public boolean q;
   public boolean L;
   public boolean e;
   public boolean F;
   public boolean m;
   public boolean D;
   public int k;
   public int O;
   public Rectangle h;
   public Insets j;
   public EZ g;
   public EZ p;
   final BM o;
   public static long[] a;
   public static Integer[] b;

   public YW(BM var1) {
      this.o = var1;
      this.f = false;
      this.M = false;
      this.Q = false;
      this.z = false;
      this.H = false;
      this.T = false;
      this.i = false;
      this.u = false;
      this.Z = false;
      this.G = false;
      this.R = false;
      this.W = false;
      this.q = false;
      this.L = false;
      this.e = false;
      this.F = false;
      this.m = false;
      this.D = false;
      this.k = -1;
      this.O = -1;
      this.h = null;
      this.j = null;
      this.g = null;
      this.p = null;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      this.d(var1, CN3.mouseWheelMoved);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.d(var1, CN3.mousePressed);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.d(var1, CN3.mouseDragged);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.d(var1, CN3.mouseReleased);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.d(var1, CN3.mouseEntered);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.d(var1, CN3.mouseExited);
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.d(var1, CN3.mouseMoved);
   }

   public void d(MouseEvent var1, CN3 var2) {
      int[] var3 = KD3.u();
      YW var10000 = this;
      if (var3 == null) {
         if (!this.n(var1, var2)) {
            return;
         }

         var10000 = this;
      }

      var10000.o.repaint();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public boolean n(MouseEvent var1, CN3 var2) {
      int[] var10000 = KD3.u();
      BufferedImage var4 = this.o.O();
      int[] var3 = var10000;
      if (var4 == null) {
         return false;
      } else {
         int var5 = var1.getX();
         int var6 = var1.getY();
         int var7 = this.o.getWidth();
         int var8 = this.o.getHeight();
         int var9 = var4.getWidth() * BM.B(this.o);
         int var10 = var4.getHeight() * BM.B(this.o);
         Insets var11 = BM.v(this.o).U$Insets();
         int var10001 = BM.C(this.o);
         if (var3 == null) {
            var10001 = var10001 != 0 ? a(30561, 4735278992581391554L) : 0;
         }

         int var12 = (var7 + var10001) / 2 - var9 / 2;
         var10001 = BM.C(this.o);
         if (var3 == null) {
            var10001 = var10001 != 0 ? a(23745, 4742954739731292009L) : 0;
         }

         int var13 = (var8 + var10001) / 2 - var10 / 2;
         int var14 = 0;
         int var15 = BM.q(this.o, var12, var11);
         int var16 = BM.Y(this.o, var12, var9, var11);
         int var17 = BM.P(this.o, var13, var11);
         int var18 = BM.w(this.o, var13, var10, var11);
         byte var66 = (var2.equals(CN3.mousePressed)) ? 1 : 0;
         if (var3 == null) {
            if (var66 != 0) {
               this.o.requestFocusInWindow();
            }

            var66 = BM.D(this.o);
         }

         label1877: {
            label1876: {
               label1875: {
                  label1886: {
                     label1873: {
                        label1887: {
                           if (var3 == null) {
                              if (var66 == 0) {
                                 var66 = BM.x(this.o);
                                 if (var3 != null) {
                                    break label1873;
                                 }

                                 if (var66 == 0) {
                                    break label1887;
                                 }
                              }

                              var66 = (var2.equals(CN3.mouseMoved)) ? 1 : 0;
                           }

                           if (var3 != null) {
                              break label1875;
                           }

                           if (var66 != 0) {
                              break label1886;
                           }
                        }

                        var66 = (var2.equals(CN3.mouseDragged)) ? 1 : 0;
                     }

                     if (var3 != null) {
                        break label1875;
                     }

                     if (var66 == 0) {
                        var66 = (var2.equals(CN3.mouseEntered)) ? 1 : 0;
                        if (var3 != null) {
                           break label1875;
                        }

                        if (var66 == 0) {
                           var67 = var2.equals(CN3.mouseExited);
                           if (var3 != null) {
                              break label1877;
                           }

                           if (var67 == 0) {
                              break label1876;
                           }
                        }
                     }
                  }

                  var66 = 1;
               }

               var14 = var66;
            }

            var67 = BM.w(this.o);
         }

         label2046: {
            label1832:
            if (var3 == null) {
               label1843: {
                  if (var67 == 0) {
                     var67 = var2.equals(CN3.mouseWheelMoved);
                     if (var3 != null) {
                        break label1832;
                     }

                     if (var67 != 0) {
      int[] var68;
                        var68 = var1;
                        if (var3 != null) {
                           break label2046;
                        }

                        if (FN.m(var1)) {
                           break label1843;
                        }

                        var67 = FN.O(var1);
                        if (var3 != null) {
                           break label1832;
                        }

                        if (var67 != 0) {
      int[] var68;
                           break label1843;
                        }
                     }
                  }

                  var67 = SwingUtilities.isMiddleMouseButton(var1);
                  break label1832;
               }

               var68 = var1;
               break label2046;
            }

            label2062: {
               label1823: {
                  label1822: {
                     label1892: {
                        if (var3 == null) {
                           if (var67 == 0) {
                              break label1892;
                           }

                           var67 = this.f;
                        }

                        if (var3 != null) {
                           break label1823;
                        }

                        if (var67 != 0) {
                           break label1822;
                        }

                        var69 = this.o;
                        if (var3 != null) {
                           break label2062;
                        }

                        if (!BM.w(this.o)) {
                           break label1822;
                        }
                     }

                     var69 = this.o;
                     break label2062;
                  }

                  var67 = var2.equals(CN3.mousePressed);
               }

               if (var3 == null) {
                  if (var67 != 0) {
                     BM.Z(this.o, true);
                     this.f = true;
                     this.h = this.o.getVisibleRect();
                     var1 = SwingUtilities.convertMouseEvent(this.o, var1, BM.t(this.o));
                     this.k = var1.getX();
                     this.O = var1.getY();
                     this.o.setCursor(Cursor.getPredefinedCursor(a(19354, 1458221832100988988L)));
                     if (var3 == null) {
                        return (boolean)var14;
                     }
                  }

                  var67 = this.f;
               }

               label1796:
               if (var3 == null) {
                  if (var67 != 0) {
                     var67 = var2.equals(CN3.mouseDragged);
                     if (var3 != null) {
                        break label1796;
                     }

                     if (var67 != 0) {
                        var1 = SwingUtilities.convertMouseEvent(this.o, var1, BM.t(this.o));
                        BM.t(this.o).A$R8().setValue(this.h.x - (var1.getX() - this.k));
                        BM.t(this.o).i$R8().setValue(this.h.y - (var1.getY() - this.O));
                        this.o.setCursor(Cursor.getPredefinedCursor(a(3469, 3902783817702149672L)));
                        if (var3 == null) {
                           return (boolean)var14;
                        }
                     }
                  }

                  var67 = this.f;
               }

               if (var3 != null) {
                  return (boolean)var67;
               }

               if (var67 != 0) {
                  boolean var118 = var2.equals(CN3.mouseReleased);
                  if (var3 != null) {
                     return var118;
                  }

                  if (var118) {
                     BM.Z(this.o, false);
                     this.f = false;
                     this.o.setCursor(Cursor.getDefaultCursor());
                  }
               }

               return (boolean)var14;
            }

            label1895: {
               if (var3 == null) {
                  if (BM.v(var69) == null) {
                     return (boolean)var14;
                  }

                  var70 = this;
                  if (var3 != null) {
                     break label1895;
                  }

                  var69 = this.o;
               }

               if (BM.E(var69) == null) {
                  return (boolean)var14;
               }

               var70 = this;
            }

            label2048: {
               boolean var71 = var70.M;
               if (var3 == null) {
                  label1763:
                  if (var70.M == 0) {
                     var72 = BM.w(this.o);
                     if (var3 != null) {
                        break label2048;
                     }

                     if (var72 == 0) {
                        var72 = new Rectangle(var15, var13 + var10, var16 - var15, BM.B(this.o)).contains(var5, var6);
                        if (var3 != null) {
                           break label2048;
                        }

                        if (var72 != 0) {
                           break label1763;
                        }
                     }

                     var72 = this.H;
                     break label2048;
                  }

                  var71 = var2.equals(CN3.mousePressed);
               }

               label1900: {
                  if (var3 == null) {
                     if (var71) {
                        BM.Z(this.o, true);
                        this.M = true;
                        this.k = var5;
                        this.j = var11;
                        if (var3 == null) {
                           break label1900;
                        }
                     }

                     var71 = this.M;
                  }

                  label1740:
                  if (var3 == null) {
                     if (var71) {
                        var71 = var2.equals(CN3.mouseDragged);
                        if (var3 != null) {
                           break label1740;
                        }

                        if (var71) {
                           int var26 = (var5 - this.k) / BM.B(this.o);
                           int var20 = this.j.left + var26;
                           int var73 = var20;
                           if (var3 == null) {
                              if (var20 < 0) {
                                 var20 = 0;
                              }

                              var73 = var20;
                           }

                           var10001 = var4.getWidth() - 1;
                           if (var3 == null) {
                              if (var73 > var10001) {
                                 var20 = var4.getWidth() - 1;
                              }

                              var73 = this.j.right;
                              var10001 = var26;
                           }

                           int var21 = var73 - var10001;
                           int var74 = var21;
                           if (var3 == null) {
                              if (var21 < 0) {
                                 var21 = 0;
                              }

                              var74 = var21;
                           }

                           if (var3 == null) {
                              if (var74 > var4.getWidth() - 1) {
                                 var21 = var4.getWidth() - 1;
                              }

                              BM.v(this.o).t(this.j.top, var20, this.j.bottom, var21);
                              var74 = 1;
                           }

                           var14 = var74;
                           BM.A(this.o);
                           if (var3 == null) {
                              break label1900;
                           }
                        }
                     }

                     var71 = this.M;
                  }

                  if (var3 != null) {
                     return var71;
                  }

                  if (var71) {
                     boolean var119 = var2.equals(CN3.mouseReleased);
                     if (var3 != null) {
                        return var119;
                     }

                     if (var119) {
                        BM.Z(this.o, false);
                        this.M = false;
                        BM.U(this.o);
                        BM.A(this.o);
                     }
                  }
               }

               this.o.setCursor(Cursor.getPredefinedCursor(a(28457, 3903936605368315021L)));
               return (boolean)var14;
            }

            label2049: {
               if (var3 == null) {
                  label1714:
                  if (var72 == 0) {
                     var75 = BM.w(this.o);
                     if (var3 != null) {
                        break label2049;
                     }

                     if (var75 == 0) {
                        var75 = new Rectangle(var12 + var9, var17, BM.B(this.o), var18 - var17).contains(var5, var6);
                        if (var3 != null) {
                           break label2049;
                        }

                        if (var75 != 0) {
                           break label1714;
                        }
                     }

                     var75 = this.Q;
                     break label2049;
                  }

                  var72 = var2.equals(CN3.mousePressed);
               }

               label1905: {
                  if (var3 == null) {
                     if (var72 != 0) {
                        BM.Z(this.o, true);
                        this.H = true;
                        this.O = var6;
                        this.j = var11;
                        if (var3 == null) {
                           break label1905;
                        }
                     }

                     var72 = this.H;
                  }

                  label1691:
                  if (var3 == null) {
                     if (var72 != 0) {
                        var72 = var2.equals(CN3.mouseDragged);
                        if (var3 != null) {
                           break label1691;
                        }

                        if (var72 != 0) {
                           int var27 = (var6 - this.O) / BM.B(this.o);
                           int var38 = this.j.top + var27;
                           int var76 = var38;
                           if (var3 == null) {
                              if (var38 < 0) {
                                 var38 = 0;
                              }

                              var76 = var38;
                           }

                           var10001 = var4.getHeight() - 1;
                           if (var3 == null) {
                              if (var76 > var10001) {
                                 var38 = var4.getHeight() - 1;
                              }

                              var76 = this.j.bottom;
                              var10001 = var27;
                           }

                           int var50 = var76 - var10001;
                           int var77 = var50;
                           if (var3 == null) {
                              if (var50 < 0) {
                                 var50 = 0;
                              }

                              var77 = var50;
                           }

                           if (var3 == null) {
                              if (var77 > var4.getHeight() - 1) {
                                 var50 = var4.getHeight() - 1;
                              }

                              BM.v(this.o).t(var38, this.j.left, var50, this.j.right);
                              var77 = 1;
                           }

                           var14 = var77;
                           BM.A(this.o);
                           if (var3 == null) {
                              break label1905;
                           }
                        }
                     }

                     var72 = this.H;
                  }

                  if (var3 != null) {
                     return (boolean)var72;
                  }

                  if (var72 != 0) {
                     boolean var120 = var2.equals(CN3.mouseReleased);
                     if (var3 != null) {
                        return var120;
                     }

                     if (var120) {
                        BM.Z(this.o, false);
                        this.H = false;
                        BM.U(this.o);
                        BM.A(this.o);
                     }
                  }
               }

               this.o.setCursor(Cursor.getPredefinedCursor(a(25620, 4591689828834764723L)));
               return (boolean)var14;
            }

            label2050: {
               if (var3 == null) {
                  label1665:
                  if (var75 == 0) {
                     var78 = BM.w(this.o);
                     if (var3 != null) {
                        break label2050;
                     }

                     if (var78 == 0) {
      int var78;
                        var78 = var6;
                        if (var3 != null) {
                           break label2050;
                        }

                        if (var6 >= var13) {
                           var78 = var15 + BM.g$int(this.o);
                           if (var3 != null) {
                              break label2050;
                           }

                           if (var78 >= var5) {
                              var78 = var15 - BM.g$int(this.o);
                              if (var3 != null) {
                                 break label2050;
                              }

                              if (var78 <= var5) {
                                 break label1665;
                              }
                           }
                        }
                     }

                     var78 = this.z;
                     break label2050;
                  }

                  var75 = var2.equals(CN3.mousePressed);
               }

               label1910: {
                  if (var3 == null) {
                     if (var75 != 0) {
                        BM.Z(this.o, true);
                        this.Q = true;
                        this.k = var5;
                        this.j = var11;
                        if (var3 == null) {
                           break label1910;
                        }
                     }

                     var75 = this.Q;
                  }

                  label1636:
                  if (var3 == null) {
                     if (var75 != 0) {
                        var75 = var2.equals(CN3.mouseDragged);
                        if (var3 != null) {
                           break label1636;
                        }

                        if (var75 != 0) {
                           int var28 = (var5 - this.k) / BM.B(this.o);
                           int var39 = this.j.left + var28;
                           int var79 = var39;
                           if (var3 == null) {
                              if (var39 < 0) {
                                 var39 = 0;
                              }

                              var79 = var39;
                           }

                           if (var3 == null) {
                              if (var79 > var4.getWidth() - this.j.right - 1) {
                                 var39 = var4.getWidth() - this.j.right - 1;
                              }

                              BM.v(this.o).t(this.j.top, var39, this.j.bottom, this.j.right);
                              var79 = 1;
                           }

                           var14 = var79;
                           BM.A(this.o);
                           if (var3 == null) {
                              break label1910;
                           }
                        }
                     }

                     var75 = this.Q;
                  }

                  if (var3 != null) {
                     return (boolean)var75;
                  }

                  if (var75 != 0) {
                     boolean var121 = var2.equals(CN3.mouseReleased);
                     if (var3 != null) {
                        return var121;
                     }

                     if (var121) {
                        BM.Z(this.o, false);
                        this.Q = false;
                        BM.U(this.o);
                        BM.A(this.o);
                     }
                  }
               }

               this.o.setCursor(Cursor.getPredefinedCursor(a(12032, 7575239365437598881L)));
               return var14 != 0;
            }

            label2051: {
               if (var3 == null) {
                  label1613:
                  if (var78 == 0) {
                     var80 = BM.w(this.o);
                     if (var3 != null) {
                        break label2051;
                     }

                     if (var80 == 0) {
      int var80;
                        var80 = var6;
                        if (var3 != null) {
                           break label2051;
                        }

                        if (var6 >= var13) {
                           var80 = var16 + BM.g$int(this.o);
                           if (var3 != null) {
                              break label2051;
                           }

                           if (var80 >= var5) {
                              var80 = var16 - BM.g$int(this.o);
                              if (var3 != null) {
                                 break label2051;
                              }

                              if (var80 <= var5) {
                                 break label1613;
                              }
                           }
                        }
                     }

                     var80 = this.T;
                     break label2051;
                  }

                  var78 = var2.equals(CN3.mousePressed);
               }

               label1915: {
                  if (var3 == null) {
                     if (var78 != 0) {
                        BM.Z(this.o, true);
                        this.z = true;
                        this.k = var5;
                        this.j = var11;
                        if (var3 == null) {
                           break label1915;
                        }
                     }

                     var78 = this.z;
                  }

                  label1584:
                  if (var3 == null) {
                     if (var78 != 0) {
                        var78 = var2.equals(CN3.mouseDragged);
                        if (var3 != null) {
                           break label1584;
                        }

                        if (var78 != 0) {
                           int var29 = (var5 - this.k) / BM.B(this.o);
                           int var40 = this.j.right - var29;
                           int var81 = var40;
                           if (var3 == null) {
                              if (var40 < 0) {
                                 var40 = 0;
                              }

                              var81 = var40;
                           }

                           if (var3 == null) {
                              if (var81 > var4.getWidth() - this.j.left - 1) {
                                 var40 = var4.getWidth() - this.j.left - 1;
                              }

                              BM.v(this.o).t(this.j.top, this.j.left, this.j.bottom, var40);
                              var81 = 1;
                           }

                           var14 = var81;
                           BM.A(this.o);
                           if (var3 == null) {
                              break label1915;
                           }
                        }
                     }

                     var78 = this.z;
                  }

                  if (var3 != null) {
                     return (boolean)var78;
                  }

                  if (var78 != 0) {
                     boolean var122 = var2.equals(CN3.mouseReleased);
                     if (var3 != null) {
                        return var122;
                     }

                     if (var122) {
                        BM.Z(this.o, false);
                        this.z = false;
                        BM.U(this.o);
                        BM.A(this.o);
                     }
                  }
               }

               this.o.setCursor(Cursor.getPredefinedCursor(a(9245, 4824231993813116861L)));
               return (boolean)var14;
            }

            label2052: {
               if (var3 == null) {
                  label1561:
                  if (var80 == 0) {
                     var82 = BM.w(this.o);
                     if (var3 != null) {
                        break label2052;
                     }

                     if (var82 == 0) {
                        var82 = var5;
                        if (var3 != null) {
                           break label2052;
                        }

                        if (var5 >= var12) {
                           var82 = var17 + BM.g$int(this.o);
                           if (var3 != null) {
                              break label2052;
                           }

                           if (var82 >= var6) {
                              var82 = var17 - BM.g$int(this.o);
                              if (var3 != null) {
                                 break label2052;
                              }

                              if (var82 <= var6) {
                                 break label1561;
                              }
                           }
                        }
                     }

                     var82 = this.i;
                     break label2052;
                  }

                  var80 = var2.equals(CN3.mousePressed);
               }

               label1920: {
                  if (var3 == null) {
                     if (var80 != 0) {
                        BM.Z(this.o, true);
                        this.T = true;
                        this.O = var6;
                        this.j = var11;
                        if (var3 == null) {
                           break label1920;
                        }
                     }

                     var80 = this.T;
                  }

                  label1532:
                  if (var3 == null) {
                     if (var80 != 0) {
                        var80 = var2.equals(CN3.mouseDragged);
                        if (var3 != null) {
                           break label1532;
                        }

                        if (var80 != 0) {
                           int var30 = (var6 - this.O) / BM.B(this.o);
                           int var41 = this.j.top + var30;
                           int var83 = var41;
                           if (var3 == null) {
                              if (var41 < 0) {
                                 var41 = 0;
                              }

                              var83 = var41;
                           }

                           if (var3 == null) {
                              if (var83 > var4.getHeight() - this.j.bottom - 1) {
                                 var41 = var4.getHeight() - this.j.bottom - 1;
                              }

                              BM.v(this.o).t(var41, this.j.left, this.j.bottom, this.j.right);
                              var83 = 1;
                           }

                           var14 = var83;
                           BM.A(this.o);
                           if (var3 == null) {
                              break label1920;
                           }
                        }
                     }

                     var80 = this.T;
                  }

                  if (var3 != null) {
                     return (boolean)var80;
                  }

                  if (var80 != 0) {
                     boolean var123 = var2.equals(CN3.mouseReleased);
                     if (var3 != null) {
                        return var123;
                     }

                     if (var123) {
                        BM.Z(this.o, false);
                        this.T = false;
                        BM.U(this.o);
                        BM.A(this.o);
                     }
                  }
               }

               this.o.setCursor(Cursor.getPredefinedCursor(a(1392, 5711206895726462674L)));
               return (boolean)var14;
            }

            label2053: {
               label1492:
               if (var3 == null) {
                  label1496:
                  if (var82 == 0) {
                     var84 = this.o;
                     if (var3 != null) {
                        break label2053;
                     }

                     label1507:
                     if (!BM.w(this.o)) {
                        var82 = var5;
                        var10001 = var12;
                        if (var3 == null) {
                           if (var5 < var12) {
                              break label1507;
                           }

                           var82 = var18 + BM.g$int(this.o);
                           var10001 = var6;
                        }

                        if (var3 == null) {
                           if (var82 < var10001) {
                              break label1507;
                           }

                           var82 = var18 - BM.g$int(this.o);
                           if (var3 != null) {
                              break label1492;
                           }

                           var10001 = var6;
                        }

                        if (var82 <= var10001) {
                           break label1496;
                        }
                     }

                     var84 = this.o;
                     break label2053;
                  }

                  var82 = var2.equals(CN3.mousePressed);
               }

               label1927: {
                  if (var3 == null) {
                     if (var82 != 0) {
                        BM.Z(this.o, true);
                        this.i = true;
                        this.O = var6;
                        this.j = var11;
                        if (var3 == null) {
                           break label1927;
                        }
                     }

                     var82 = this.i;
                  }

                  label1476:
                  if (var3 == null) {
                     if (var82 != 0) {
                        var82 = var2.equals(CN3.mouseDragged);
                        if (var3 != null) {
                           break label1476;
                        }

                        if (var82 != 0) {
                           int var31 = (var6 - this.O) / BM.B(this.o);
                           int var42 = this.j.bottom - var31;
                           int var85 = var42;
                           if (var3 == null) {
                              if (var42 < 0) {
                                 var42 = 0;
                              }

                              var85 = var42;
                           }

                           if (var3 == null) {
                              if (var85 > var4.getHeight() - this.j.top - 1) {
                                 var42 = var4.getHeight() - this.j.top - 1;
                              }

                              BM.v(this.o).t(this.j.top, this.j.left, var42, this.j.right);
                              var85 = 1;
                           }

                           var14 = var85;
                           BM.A(this.o);
                           if (var3 == null) {
                              break label1927;
                           }
                        }
                     }

                     var82 = this.i;
                  }

                  if (var3 != null) {
                     return (boolean)var82;
                  }

                  if (var82 != 0) {
                     boolean var124 = var2.equals(CN3.mouseReleased);
                     if (var3 != null) {
                        return var124;
                     }

                     if (var124) {
                        BM.Z(this.o, false);
                        this.i = false;
                        BM.U(this.o);
                        BM.A(this.o);
                     }
                  }
               }

               this.o.setCursor(Cursor.getPredefinedCursor(a(5450, 4092936664386377443L)));
               return (boolean)var14;
            }

            Iterator var32 = BM.v(var84).U$List().iterator();

            EZ var43;
            label2054: {
               label2055: {
                  label2056: {
                     label2057: {
                        label2058: {
                           label2059: {
                              label1450: {
                                 label1449: {
                                    label1448: {
                                       label1447: {
                                          label1446: {
                                             label1445: {
                                                label1935: {
                                                   while (true) {
                                                      if (var32.hasNext()) {
                                                         var43 = (EZ)var32.next();
                                                         var86 = var43.C();
                                                         if (var3 != null) {
                                                            break;
                                                         }

                                                         label2008: {
                                                            if (var3 == null) {
                                                               if (var86 != 0) {
                                                                  break label2008;
                                                               }

                                                               var86 = this.Z;
                                                            }

                                                            if (var3 == null) {
                                                               if (var86 != 0) {
                                                                  var87 = this.g.Y(var43);
                                                                  if (var3 != null) {
                                                                     break label2054;
                                                                  }

                                                                  if (var87 != 0) {
                                                                     break label1449;
                                                                  }
                                                               }

                                                               var86 = BM.w(this.o);
                                                            }

                                                            label1316:
                                                            if (var3 == null) {
                                                               if (var86 == 0) {
                                                                  var86 = new Rectangle(
                                                                        var12 + var43.x() * BM.B(this.o),
                                                                        var13 - BM.B(this.o),
                                                                        (var43.f() - var43.x() + 1) * BM.B(this.o),
                                                                        BM.B(this.o) + (BM.K(this.o) ? var10 : 0)
                                                                     )
                                                                     .contains(var5, var6);
                                                                  if (var3 != null) {
                                                                     break label1316;
                                                                  }

                                                                  if (var86 != 0) {
                                                                     break label1449;
                                                                  }
                                                               }

                                                               var86 = var6;
                                                            }

                                                            if (var3 == null) {
                                                               if (var86 > var13 + var10) {
                                                                  break label2008;
                                                               }

                                                               var86 = this.G;
                                                            }

                                                            if (var3 == null) {
                                                               if (var86 != 0) {
                                                                  var88 = this.g.Y(var43);
                                                                  if (var3 != null) {
                                                                     break label2055;
                                                                  }

                                                                  if (var88 != 0) {
                                                                     break label1448;
                                                                  }
                                                               }

                                                               var86 = BM.w(this.o);
                                                            }

                                                            label1334:
                                                            if (var3 == null) {
                                                               if (var86 == 0) {
                                                                  var86 = var12 + var43.x() * BM.B(this.o) - BM.g$int(this.o);
                                                                  if (var3 != null) {
                                                                     break label1334;
                                                                  }

                                                                  if (var86 <= var5) {
                                                                     var86 = var5;
                                                                     if (var3 != null) {
                                                                        break label1334;
                                                                     }

                                                                     if (var5 <= var12 + var43.x() * BM.B(this.o) + BM.g$int(this.o)) {
                                                                        break label1448;
                                                                     }
                                                                  }
                                                               }

                                                               var86 = this.R;
                                                            }

                                                            if (var3 == null) {
                                                               if (var86 != 0) {
                                                                  var86 = this.g.Y(var43);
                                                                  if (var3 != null) {
                                                                     break label2056;
                                                                  }

                                                                  if (var86 != 0) {
                                                                     break label1447;
                                                                  }
                                                               }

                                                               var86 = BM.w(this.o);
                                                            }

                                                            if (var3 == null) {
                                                               if (var86 != 0) {
                                                                  break label2008;
                                                               }

                                                               var86 = var12 + (var43.f() + 1) * BM.B(this.o) - BM.g$int(this.o);
                                                            }

                                                            var10001 = var5;
                                                            if (var3 == null) {
                                                               if (var86 > var5) {
                                                                  break label2008;
                                                               }

                                                               var86 = var5;
                                                               if (var3 != null) {
                                                                  break label2056;
                                                               }

                                                               var10001 = var12 + (var43.f() + 1) * BM.B(this.o) + BM.g$int(this.o);
                                                            }

                                                            if (var86 <= var10001) {
                                                               break label1447;
                                                            }
                                                         }

                                                         if (var3 == null) {
                                                            continue;
                                                         }
                                                      }

                                                      var32 = BM.v(this.o).g().iterator();
                                                      var86 = var32.hasNext();
                                                      break;
                                                   }

                                                   while (var86 != 0) {
                                                      var43 = (EZ)var32.next();
                                                      var93 = var43.C();
                                                      if (var3 != null) {
                                                         break label1450;
                                                      }

                                                      label2009: {
                                                         if (var3 == null) {
                                                            if (var93 != 0) {
                                                               break label2009;
                                                            }

                                                            var93 = this.W;
                                                         }

                                                         if (var3 == null) {
                                                            if (var93 != 0) {
                                                               var94 = this.g.Y(var43);
                                                               if (var3 != null) {
                                                                  break label2057;
                                                               }

                                                               if (var94 != 0) {
                                                                  break label1446;
                                                               }
                                                            }

                                                            var93 = BM.w(this.o);
                                                         }

                                                         label1368:
                                                         if (var3 == null) {
                                                            if (var93 == 0) {
                                                               var93 = new Rectangle(
                                                                     var12 - BM.B(this.o),
                                                                     var13 + var43.x() * BM.B(this.o),
                                                                     BM.B(this.o) + (BM.K(this.o) ? var9 : 0),
                                                                     (var43.f() - var43.x() + 1) * BM.B(this.o)
                                                                  )
                                                                  .contains(var5, var6);
                                                               if (var3 != null) {
                                                                  break label1368;
                                                               }

                                                               if (var93 != 0) {
                                                                  break label1446;
                                                               }
                                                            }

                                                            var93 = var5;
                                                         }

                                                         if (var3 == null) {
                                                            if (var93 > var12 + var9) {
                                                               break label2009;
                                                            }

                                                            var93 = this.q;
                                                         }

                                                         if (var3 == null) {
                                                            if (var93 != 0) {
                                                               var95 = this.g.Y(var43);
                                                               if (var3 != null) {
                                                                  break label2058;
                                                               }

                                                               if (var95 != 0) {
                                                                  break label1445;
                                                               }
                                                            }

                                                            var93 = BM.w(this.o);
                                                         }

                                                         label1386:
                                                         if (var3 == null) {
                                                            if (var93 == 0) {
                                                               var93 = var13 + var43.x() * BM.B(this.o) - BM.g$int(this.o);
                                                               if (var3 != null) {
                                                                  break label1386;
                                                               }

                                                               if (var93 <= var6) {
                                                                  var93 = var6;
                                                                  if (var3 != null) {
                                                                     break label1386;
                                                                  }

                                                                  if (var6 <= var13 + var43.x() * BM.B(this.o) + BM.g$int(this.o)) {
                                                                     break label1445;
                                                                  }
                                                               }
                                                            }

                                                            var93 = this.L;
                                                         }

                                                         if (var3 == null) {
                                                            if (var93 != 0) {
                                                               var93 = this.g.Y(var43);
                                                               if (var3 != null) {
                                                                  break label2059;
                                                               }

                                                               if (var93 != 0) {
                                                                  break label1935;
                                                               }
                                                            }

                                                            var93 = BM.w(this.o);
                                                         }

                                                         if (var3 == null) {
                                                            if (var93 != 0) {
                                                               break label2009;
                                                            }

                                                            var93 = var13 + (var43.f() + 1) * BM.B(this.o) - BM.g$int(this.o);
                                                         }

                                                         var10001 = var6;
                                                         if (var3 == null) {
                                                            if (var93 > var6) {
                                                               break label2009;
                                                            }

                                                            var93 = var6;
                                                            if (var3 != null) {
                                                               break label2059;
                                                            }

                                                            var10001 = var13 + (var43.f() + 1) * BM.B(this.o) + BM.g$int(this.o);
                                                         }

                                                         if (var93 <= var10001) {
                                                            break label1935;
                                                         }
                                                      }

                                                      if (var3 != null) {
                                                         var93 = BM.z(this.o);
                                                         break label1450;
                                                      }

                                                      var86 = var32.hasNext();
                                                   }

                                                   var93 = BM.z(this.o);
                                                   break label1450;
                                                }

                                                var93 = var2.equals(CN3.mousePressed);
                                                break label2059;
                                             }

                                             var95 = var2.equals(CN3.mousePressed);
                                             break label2058;
                                          }

                                          var94 = var2.equals(CN3.mousePressed);
                                          break label2057;
                                       }

                                       var86 = var2.equals(CN3.mousePressed);
                                       break label2056;
                                    }

                                    var88 = var2.equals(CN3.mousePressed);
                                    break label2055;
                                 }

                                 var87 = var2.equals(CN3.mousePressed);
                                 break label2054;
                              }

                              label2010: {
                                 label1265:
                                 if (var3 == null) {
                                    label1276: {
                                       if (var93 != 0) {
                                          var100 = this.u;
                                          if (var3 != null) {
                                             break label2010;
                                          }

                                          if (this.u) {
                                             break label1276;
                                          }

                                          var93 = BM.w(this.o);
                                          if (var3 != null) {
                                             break label1265;
                                          }

                                          if (var93 == 0) {
                                             var93 = new Rectangle(var15, var17, var16 - var15, var18 - var17).contains(var5, var6);
                                             if (var3 != null) {
                                                break label1265;
                                             }

                                             if (var93 != 0) {
                                                break label1276;
                                             }
                                          }
                                       }

                                       var93 = SwingUtilities.isLeftMouseButton(var1);
                                       break label1265;
                                    }

                                    var100 = var2.equals(CN3.mousePressed);
                                    break label2010;
                                 }

                                 label1257:
                                 if (var3 == null) {
                                    label1255:
                                    if (var93 != 0) {
                                       label1253: {
                                          label1953: {
                                             var93 = this.e;
                                             if (var3 == null) {
                                                if (!this.e) {
                                                   var93 = BM.w(this.o);
                                                   if (var3 != null) {
                                                      break label1253;
                                                   }

                                                   if (var93 != 0) {
                                                      break label1953;
                                                   }
                                                }

                                                var93 = var2.equals(CN3.mousePressed);
                                             }

                                             label1244:
                                             if (var3 == null) {
                                                if (var93 != 0) {
                                                   var93 = var5;
                                                   if (var3 != null) {
                                                      break label1244;
                                                   }

                                                   if (var5 > var12) {
                                                      var93 = var5;
                                                      if (var3 != null) {
                                                         break label1244;
                                                      }

                                                      if (var5 < var12 + var9) {
                                                         var93 = var6;
                                                         if (var3 != null) {
                                                            break label1244;
                                                         }

                                                         if (var6 < var13) {
                                                            BM.Z(this.o, true);
                                                            this.e = true;
                                                            this.k = var5;
                                                            this.g = new EZ((var5 - var12) / BM.B(this.o), false);
                                                            BM.v(this.o).H(this.g);
                                                            var14 = 1;
                                                            if (var3 == null) {
                                                               break label1953;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }

                                                var93 = this.e;
                                             }

                                             label1228:
                                             if (var3 == null) {
                                                if (var93 != 0) {
                                                   var93 = var2.equals(CN3.mouseDragged);
                                                   if (var3 != null) {
                                                      break label1228;
                                                   }

                                                   if (var93 != 0) {
                                                      int var33 = (this.k - var12) / BM.B(this.o);
                                                      int var45 = (var5 - var12) / BM.B(this.o);
                                                      this.g.z(Math.max(0, Math.min(var33, var45)));
                                                      this.g.T(Math.min(var4.getWidth() - 1, Math.max(var33, var45)));
                                                      var14 = 1;
                                                      break label1953;
                                                   }
                                                }

                                                var93 = this.e;
                                             }

                                             if (var3 != null) {
                                                break label1253;
                                             }

                                             if (var93 != 0) {
                                                var93 = var2.equals(CN3.mouseReleased);
                                                if (var3 != null) {
                                                   break label1253;
                                                }

                                                if (var93 != 0) {
                                                   BM.Z(this.o, false);
                                                   this.e = false;
                                                   BM.W(this.o);
                                                   var14 = 1;
                                                   BM.U(this.o);
                                                   BM.A(this.o);
                                                }
                                             }
                                          }

                                          var93 = this.F;
                                       }

                                       if (var3 == null) {
                                          if (var93 == 0) {
                                             var93 = BM.w(this.o);
                                             if (var3 != null) {
                                                break label1257;
                                             }

                                             if (var93 != 0) {
                                                break label1255;
                                             }
                                          }

                                          var93 = var2.equals(CN3.mousePressed);
                                       }

                                       label1205:
                                       if (var3 == null) {
                                          if (var93 != 0) {
                                             var93 = var6;
                                             if (var3 != null) {
                                                break label1205;
                                             }

                                             if (var6 > var13) {
                                                var93 = var6;
                                                if (var3 != null) {
                                                   break label1205;
                                                }

                                                if (var6 < var13 + var10) {
                                                   var93 = var5;
                                                   if (var3 != null) {
                                                      break label1205;
                                                   }

                                                   if (var5 < var12) {
                                                      BM.Z(this.o, true);
                                                      this.F = true;
                                                      this.O = var6;
                                                      this.g = new EZ((var6 - var13) / BM.B(this.o), false);
                                                      BM.v(this.o).o(this.g);
                                                      var14 = 1;
                                                      if (var3 == null) {
                                                         break label1255;
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          var93 = this.F;
                                       }

                                       label1189:
                                       if (var3 == null) {
                                          if (var93 != 0) {
                                             var93 = var2.equals(CN3.mouseDragged);
                                             if (var3 != null) {
                                                break label1189;
                                             }

                                             if (var93 != 0) {
                                                int var34 = (this.O - var13) / BM.B(this.o);
                                                int var46 = (var6 - var13) / BM.B(this.o);
                                                this.g.z(Math.max(0, Math.min(var34, var46)));
                                                this.g.T(Math.min(var4.getHeight() - 1, Math.max(var34, var46)));
                                                var14 = 1;
                                                if (var3 == null) {
                                                   break label1255;
                                                }
                                             }
                                          }

                                          var93 = this.F;
                                       }

                                       if (var3 != null) {
                                          break label1257;
                                       }

                                       if (var93 != 0) {
                                          var93 = var2.equals(CN3.mouseReleased);
                                          if (var3 != null) {
                                             break label1257;
                                          }

                                          if (var93 != 0) {
                                             BM.Z(this.o, false);
                                             this.F = false;
                                             BM.F(this.o);
                                             var14 = 1;
                                             BM.U(this.o);
                                             BM.A(this.o);
                                          }
                                       }
                                    }

                                    var93 = SwingUtilities.isRightMouseButton(var1);
                                 }

                                 if (var3 == null) {
                                    label1170:
                                    if (var93 != 0) {
                                       label1168: {
                                          label1955: {
                                             var129 = this.m;
                                             if (var3 == null) {
                                                if (!this.m) {
                                                   var129 = BM.w(this.o);
                                                   if (var3 != null) {
                                                      break label1168;
                                                   }

                                                   if (var129 != 0) {
                                                      break label1955;
                                                   }
                                                }

                                                var129 = var2.equals(CN3.mousePressed);
                                             }

                                             label1159:
                                             if (var3 == null) {
                                                if (var129 != 0) {
                                                   var129 = var5;
                                                   if (var3 != null) {
                                                      break label1159;
                                                   }

                                                   if (var5 > var12) {
                                                      var129 = var5;
                                                      if (var3 != null) {
                                                         break label1159;
                                                      }

                                                      if (var5 < var12 + var9) {
                                                         var129 = var6;
                                                         if (var3 != null) {
                                                            break label1159;
                                                         }

                                                         if (var6 < var13) {
                                                            BM.Z(this.o, true);
                                                            this.m = true;
                                                            this.k = var5;
                                                            this.p = new EZ((var5 - var12) / BM.B(this.o), false);
                                                            this.V();
                                                            var14 = 1;
                                                            if (var3 == null) {
                                                               break label1955;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }

                                                var129 = this.m;
                                             }

                                             label1143:
                                             if (var3 == null) {
                                                if (var129 != 0) {
                                                   var129 = var2.equals(CN3.mouseDragged);
                                                   if (var3 != null) {
                                                      break label1143;
                                                   }

                                                   if (var129 != 0) {
                                                      int var35 = (this.k - var12) / BM.B(this.o);
                                                      int var47 = (var5 - var12) / BM.B(this.o);
                                                      this.p.z(Math.max(0, Math.min(var35, var47)));
                                                      this.p.T(Math.min(var4.getWidth() - 1, Math.max(var35, var47)));
                                                      this.V();
                                                      var14 = 1;
                                                      if (var3 == null) {
                                                         break label1955;
                                                      }
                                                   }
                                                }

                                                var129 = this.m;
                                             }

                                             if (var3 != null) {
                                                break label1168;
                                             }

                                             if (var129 != 0) {
                                                var129 = var2.equals(CN3.mouseReleased);
                                                if (var3 != null) {
                                                   break label1168;
                                                }

                                                if (var129 != 0) {
                                                   BM.Z(this.o, false);
                                                   this.m = false;
                                                   var14 = 1;
                                                   BM.U(this.o);
                                                   BM.A(this.o);
                                                }
                                             }
                                          }

                                          var129 = this.D;
                                       }

                                       if (var3 == null) {
                                          if (var129 == 0) {
                                             byte var130 = BM.w(this.o);
                                             if (var3 != null) {
                                                return (boolean)var130;
                                             }

                                             if (var130 != 0) {
                                                break label1170;
                                             }
                                          }

                                          var129 = var2.equals(CN3.mousePressed);
                                       }

                                       label1119:
                                       if (var3 == null) {
                                          if (var129 != 0) {
                                             var129 = var6;
                                             if (var3 != null) {
                                                break label1119;
                                             }

                                             if (var6 > var13) {
                                                var129 = var6;
                                                if (var3 != null) {
                                                   break label1119;
                                                }

                                                if (var6 < var13 + var10) {
                                                   var129 = var5;
                                                   if (var3 != null) {
                                                      break label1119;
                                                   }

                                                   if (var5 < var12) {
                                                      BM.Z(this.o, true);
                                                      this.D = true;
                                                      this.O = var6;
                                                      this.p = new EZ((var6 - var13) / BM.B(this.o), false);
                                                      this.z();
                                                      var14 = 1;
                                                      if (var3 == null) {
                                                         break label1170;
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          var129 = this.D;
                                       }

                                       label1103:
                                       if (var3 == null) {
                                          if (var129 != 0) {
                                             var129 = var2.equals(CN3.mouseDragged);
                                             if (var3 != null) {
                                                break label1103;
                                             }

                                             if (var129 != 0) {
                                                int var36 = (this.O - var13) / BM.B(this.o);
                                                int var48 = (var6 - var13) / BM.B(this.o);
                                                this.p.z(Math.max(0, Math.min(var36, var48)));
                                                this.p.T(Math.min(var4.getHeight() - 1, Math.max(var36, var48)));
                                                this.z();
                                                var14 = 1;
                                                if (var3 == null) {
                                                   break label1170;
                                                }
                                             }
                                          }

                                          var129 = this.D;
                                       }

                                       if (var3 != null) {
                                          return (boolean)var129;
                                       }

                                       if (var129 != 0) {
                                          boolean var131 = var2.equals(CN3.mouseReleased);
                                          if (var3 != null) {
                                             return var131;
                                          }

                                          if (var131) {
                                             BM.Z(this.o, false);
                                             this.D = false;
                                             var14 = 1;
                                             BM.U(this.o);
                                             BM.A(this.o);
                                          }
                                       }
                                    }

                                    this.o.setCursor(Cursor.getDefaultCursor());
                                    var93 = var14;
                                 }

                                 return (boolean)var93;
                              }

                              label1956: {
                                 if (var3 == null) {
                                    if (var100) {
                                       BM.Z(this.o, true);
                                       this.u = true;
                                       this.k = var5;
                                       this.O = var6;
                                       this.j = var11;
                                       if (var3 == null) {
                                          break label1956;
                                       }
                                    }

                                    var100 = this.u;
                                 }

                                 label1078:
                                 if (var3 == null) {
                                    if (var100) {
                                       var100 = var2.equals(CN3.mouseDragged);
                                       if (var3 != null) {
                                          break label1078;
                                       }

                                       if (var100) {
                                          int var37 = (var6 - this.O) / BM.B(this.o);
                                          int var49 = this.j.top + var37;
                                          int var101 = var49;
                                          if (var3 == null) {
                                             if (var49 < 0) {
                                                var49 = 0;
                                             }

                                             var101 = var49;
                                          }

                                          var10001 = var4.getHeight() - 1;
                                          if (var3 == null) {
                                             if (var101 > var10001) {
                                                var49 = var4.getHeight() - 1;
                                             }

                                             var101 = this.j.bottom;
                                             var10001 = var37;
                                          }

                                          int var57 = var101 - var10001;
                                          int var102 = var57;
                                          if (var3 == null) {
                                             if (var57 < 0) {
                                                var57 = 0;
                                             }

                                             var102 = var57;
                                          }

                                          var10001 = var4.getHeight() - 1;
                                          if (var3 == null) {
                                             if (var102 > var10001) {
                                                var57 = var4.getHeight() - 1;
                                             }

                                             var102 = var5 - this.k;
                                             var10001 = BM.B(this.o);
                                          }

                                          int var63 = var102 / var10001;
                                          int var65 = this.j.left + var63;
                                          int var103 = var65;
                                          if (var3 == null) {
                                             if (var65 < 0) {
                                                var65 = 0;
                                             }

                                             var103 = var65;
                                          }

                                          var10001 = var4.getWidth() - 1;
                                          if (var3 == null) {
                                             if (var103 > var10001) {
                                                var65 = var4.getWidth() - 1;
                                             }

                                             var103 = this.j.right;
                                             var10001 = var63;
                                          }

                                          int var24 = var103 - var10001;
                                          int var104 = var24;
                                          if (var3 == null) {
                                             if (var24 < 0) {
                                                var24 = 0;
                                             }

                                             var104 = var24;
                                          }

                                          if (var3 == null) {
                                             if (var104 > var4.getWidth() - 1) {
                                                var24 = var4.getWidth() - 1;
                                             }

                                             BM.v(this.o).t(var49, var65, var57, var24);
                                             var104 = 1;
                                          }

                                          var14 = var104;
                                          BM.A(this.o);
                                          break label1956;
                                       }
                                    }

                                    var100 = this.u;
                                 }

                                 if (var3 != null) {
                                    return var100;
                                 }

                                 if (var100) {
                                    boolean var134 = var2.equals(CN3.mouseReleased);
                                    if (var3 != null) {
                                       return var134;
                                    }

                                    if (var134) {
                                       BM.Z(this.o, false);
                                       this.u = false;
                                       BM.U(this.o);
                                       BM.A(this.o);
                                    }
                                 }
                              }

                              this.o.setCursor(Cursor.getPredefinedCursor(a(25620, 4591689828834764723L)));
                              return (boolean)var14;
                           }

                           label1958: {
                              if (var3 == null) {
                                 if (var93 != 0) {
                                    BM.Z(this.o, true);
                                    this.L = true;
                                    this.O = var6;
                                    this.g = var43.R();
                                    if (var3 == null) {
                                       break label1958;
                                    }
                                 }

                                 var93 = this.L;
                              }

                              label1055:
                              if (var3 == null) {
                                 if (var93 != 0) {
                                    var93 = var2.equals(CN3.mouseDragged);
                                    if (var3 != null) {
                                       break label1055;
                                    }

                                    if (var93 != 0) {
                                       label1959: {
                                          int var54 = (var6 - this.O) / BM.B(this.o);
                                          int var60 = this.g.f() + var54;
                                          var96 = var60;
                                          var10001 = this.g.x();
                                          if (var3 == null) {
                                             if (var60 < var10001) {
                                                var60 = this.g.x();
                                             }

                                             var96 = var60;
                                             if (var3 != null) {
                                                break label1959;
                                             }

                                             var10001 = var4.getHeight() - 1;
                                          }

                                          if (var96 > var10001) {
                                             var60 = var4.getHeight() - 1;
                                          }

                                          var43.T(var60);
                                          var96 = 1;
                                       }

                                       var14 = var96;
                                       if (var3 == null) {
                                          break label1958;
                                       }
                                    }
                                 }

                                 var93 = this.L;
                              }

                              if (var3 != null) {
                                 return (boolean)var93;
                              }

                              if (var93 != 0) {
                                 boolean var128 = var2.equals(CN3.mouseReleased);
                                 if (var3 != null) {
                                    return var128;
                                 }

                                 if (var128) {
                                    BM.Z(this.o, false);
                                    this.L = false;
                                    BM.F(this.o);
                                    var14 = 1;
                                    BM.U(this.o);
                                    BM.A(this.o);
                                 }
                              }
                           }

                           this.o.setCursor(Cursor.getPredefinedCursor(a(5450, 4092936664386377443L)));
                           return (boolean)var14;
                        }

                        label1961: {
                           if (var3 == null) {
                              if (var95 != 0) {
                                 BM.Z(this.o, true);
                                 this.q = true;
                                 this.O = var6;
                                 this.g = var43.R();
                                 if (var3 == null) {
                                    break label1961;
                                 }
                              }

                              var95 = this.q;
                           }

                           label1024:
                           if (var3 == null) {
                              if (var95 != 0) {
                                 var95 = var2.equals(CN3.mouseDragged);
                                 if (var3 != null) {
                                    break label1024;
                                 }

                                 if (var95 != 0) {
                                    int var55 = (var6 - this.O) / BM.B(this.o);
                                    int var61 = this.g.x() + var55;
                                    int var97 = var61;
                                    if (var3 == null) {
                                       if (var61 < 0) {
                                          var61 = 0;
                                       }

                                       var97 = var61;
                                    }

                                    if (var3 == null) {
                                       if (var97 > this.g.f()) {
                                          var61 = this.g.f();
                                       }

                                       var43.z(var61);
                                       var97 = 1;
                                    }

                                    var14 = var97;
                                    if (var3 == null) {
                                       break label1961;
                                    }
                                 }
                              }

                              var95 = this.q;
                           }

                           if (var3 != null) {
                              return (boolean)var95;
                           }

                           if (var95 != 0) {
                              boolean var133 = var2.equals(CN3.mouseReleased);
                              if (var3 != null) {
                                 return var133;
                              }

                              if (var133) {
                                 BM.Z(this.o, false);
                                 this.q = false;
                                 BM.F(this.o);
                                 var14 = 1;
                                 BM.U(this.o);
                                 BM.A(this.o);
                              }
                           }
                        }

                        this.o.setCursor(Cursor.getPredefinedCursor(a(5450, 4092936664386377443L)));
                        return (boolean)var14;
                     }

                     label1963: {
                        if (var3 == null) {
                           if (var94 != 0) {
                              BM.Z(this.o, true);
                              this.W = true;
                              this.O = var6;
                              this.g = var43.R();
                              if (var3 == null) {
                                 break label1963;
                              }
                           }

                           var94 = this.W;
                        }

                        label997:
                        if (var3 == null) {
                           if (var94 != 0) {
                              var94 = var2.equals(CN3.mouseDragged);
                              if (var3 != null) {
                                 break label997;
                              }

                              if (var94 != 0) {
                                 int var56 = (var6 - this.O) / BM.B(this.o);
                                 int var62 = this.g.x() + var56;
                                 int var98 = var62;
                                 if (var3 == null) {
                                    if (var62 < 0) {
                                       var62 = 0;
                                    }

                                    var98 = var62;
                                 }

                                 var10001 = var4.getHeight() - 1;
                                 if (var3 == null) {
                                    if (var98 > var10001) {
                                       var62 = var4.getHeight() - 1;
                                    }

                                    var98 = this.g.f();
                                    var10001 = var56;
                                 }

                                 int var64 = var98 + var10001;
                                 int var99 = var64;
                                 if (var3 == null) {
                                    if (var64 < 0) {
                                       var64 = 0;
                                    }

                                    var99 = var64;
                                 }

                                 if (var3 == null) {
                                    if (var99 > var4.getHeight() - 1) {
                                       var64 = var4.getHeight() - 1;
                                    }

                                    var43.z(var62);
                                    var43.T(var64);
                                    var99 = 1;
                                 }

                                 var14 = var99;
                                 if (var3 == null) {
                                    break label1963;
                                 }
                              }
                           }

                           var94 = this.W;
                        }

                        if (var3 != null) {
                           return (boolean)var94;
                        }

                        if (var94 != 0) {
                           boolean var132 = var2.equals(CN3.mouseReleased);
                           if (var3 != null) {
                              return var132;
                           }

                           if (var132) {
                              BM.Z(this.o, false);
                              this.W = false;
                              BM.F(this.o);
                              var14 = 1;
                              BM.U(this.o);
                              BM.A(this.o);
                           }
                        }
                     }

                     this.o.setCursor(Cursor.getPredefinedCursor(a(25620, 4591689828834764723L)));
                     return (boolean)var14;
                  }

                  label1965: {
                     if (var3 == null) {
                        if (var86 != 0) {
                           BM.Z(this.o, true);
                           this.R = true;
                           this.k = var5;
                           this.g = var43.R();
                           if (var3 == null) {
                              break label1965;
                           }
                        }

                        var86 = this.R;
                     }

                     label967:
                     if (var3 == null) {
                        if (var86 != 0) {
                           var86 = var2.equals(CN3.mouseDragged);
                           if (var3 != null) {
                              break label967;
                           }

                           if (var86 != 0) {
                              label1966: {
                                 int var51 = (var5 - this.k) / BM.B(this.o);
                                 int var22 = this.g.f() + var51;
                                 var89 = var22;
                                 var10001 = this.g.x();
                                 if (var3 == null) {
                                    if (var22 < var10001) {
                                       var22 = this.g.x();
                                    }

                                    var89 = var22;
                                    if (var3 != null) {
                                       break label1966;
                                    }

                                    var10001 = var4.getWidth() - 1;
                                 }

                                 if (var89 > var10001) {
                                    var22 = var4.getWidth() - 1;
                                 }

                                 var43.T(var22);
                                 var89 = 1;
                              }

                              var14 = var89;
                              if (var3 == null) {
                                 break label1965;
                              }
                           }
                        }

                        var86 = this.R;
                     }

                     if (var3 != null) {
                        return (boolean)var86;
                     }

                     if (var86 != 0) {
                        boolean var125 = var2.equals(CN3.mouseReleased);
                        if (var3 != null) {
                           return var125;
                        }

                        if (var125) {
                           BM.Z(this.o, false);
                           this.R = false;
                           BM.W(this.o);
                           var14 = 1;
                           BM.U(this.o);
                           BM.A(this.o);
                        }
                     }
                  }

                  this.o.setCursor(Cursor.getPredefinedCursor(a(9245, 4824231993813116861L)));
                  return (boolean)var14;
               }

               label1968: {
                  if (var3 == null) {
                     if (var88 != 0) {
                        BM.Z(this.o, true);
                        this.G = true;
                        this.k = var5;
                        this.g = var43.R();
                        if (var3 == null) {
                           break label1968;
                        }
                     }

                     var88 = this.G;
                  }

                  label936:
                  if (var3 == null) {
                     if (var88 != 0) {
                        var88 = var2.equals(CN3.mouseDragged);
                        if (var3 != null) {
                           break label936;
                        }

                        if (var88 != 0) {
                           int var52 = (var5 - this.k) / BM.B(this.o);
                           int var58 = this.g.x() + var52;
                           int var90 = var58;
                           if (var3 == null) {
                              if (var58 < 0) {
                                 var58 = 0;
                              }

                              var90 = var58;
                           }

                           if (var3 == null) {
                              if (var90 > this.g.f()) {
                                 var58 = this.g.f();
                              }

                              var43.z(var58);
                              var90 = 1;
                           }

                           var14 = var90;
                           if (var3 == null) {
                              break label1968;
                           }
                        }
                     }

                     var88 = this.G;
                  }

                  if (var3 != null) {
                     return (boolean)var88;
                  }

                  if (var88 != 0) {
                     boolean var127 = var2.equals(CN3.mouseReleased);
                     if (var3 != null) {
                        return var127;
                     }

                     if (var127) {
                        BM.Z(this.o, false);
                        this.G = false;
                        BM.W(this.o);
                        var14 = 1;
                        BM.U(this.o);
                        BM.A(this.o);
                     }
                  }
               }

               this.o.setCursor(Cursor.getPredefinedCursor(a(9245, 4824231993813116861L)));
               return (boolean)var14;
            }

            label1970: {
               if (var3 == null) {
                  if (var87 != 0) {
                     BM.Z(this.o, true);
                     this.Z = true;
                     this.k = var5;
                     this.g = var43.R();
                     if (var3 == null) {
                        break label1970;
                     }
                  }

                  var87 = this.Z;
               }

               label909:
               if (var3 == null) {
                  if (var87 != 0) {
                     var87 = var2.equals(CN3.mouseDragged);
                     if (var3 != null) {
                        break label909;
                     }

                     if (var87 != 0) {
                        int var53 = (var5 - this.k) / BM.B(this.o);
                        int var59 = this.g.x() + var53;
                        int var91 = var59;
                        if (var3 == null) {
                           if (var59 < 0) {
                              var59 = 0;
                           }

                           var91 = var59;
                        }

                        var10001 = var4.getWidth() - 1;
                        if (var3 == null) {
                           if (var91 > var10001) {
                              var59 = var4.getWidth() - 1;
                           }

                           var91 = this.g.f();
                           var10001 = var53;
                        }

                        int var23 = var91 + var10001;
                        int var92 = var23;
                        if (var3 == null) {
                           if (var23 < 0) {
                              var23 = 0;
                           }

                           var92 = var23;
                        }

                        if (var3 == null) {
                           if (var92 > var4.getWidth() - 1) {
                              var23 = var4.getWidth() - 1;
                           }

                           var43.z(var59);
                           var43.T(var23);
                           var92 = 1;
                        }

                        var14 = var92;
                        if (var3 == null) {
                           break label1970;
                        }
                     }
                  }

                  var87 = this.Z;
               }

               if (var3 != null) {
                  return (boolean)var87;
               }

               if (var87 != 0) {
                  boolean var126 = var2.equals(CN3.mouseReleased);
                  if (var3 != null) {
                     return var126;
                  }

                  if (var126) {
                     BM.Z(this.o, false);
                     this.Z = false;
                     BM.W(this.o);
                     var14 = 1;
                     BM.U(this.o);
                     BM.A(this.o);
                  }
               }
            }

            this.o.setCursor(Cursor.getPredefinedCursor(a(25620, 4591689828834764723L)));
            return (boolean)var14;
         }

         MouseWheelEvent var19 = (MouseWheelEvent)var68;
         this.o.b(this.o.F() - var19.getWheelRotation());
         this.o.setCursor(Cursor.getDefaultCursor());
         return (boolean)var14;
      }
   }

   public void V() {
      int[] var10000 = KD3.u();
      boolean[] var2 = BM.Y(this.o);
      int[] var1 = var10000;
      int var3 = this.p.x();

      while (true) {
         if (var3 <= this.p.f()) {
            var2[var3] = false;
            var3++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         BM.v(this.o).f(Fk2.h(var2));
         BM.g$void(this.o);
         break;
      }
   }

   public void z() {
      int[] var10000 = KD3.u();
      boolean[] var2 = BM.P(this.o);
      int var3 = this.p.x();
      int[] var1 = var10000;

      while (true) {
         if (var3 <= this.p.f()) {
            var2[var3] = false;
            var3++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         BM.v(this.o).e(Fk2.h(var2));
         BM.g$void(this.o);
         break;
      }
   }

   YW(BM var1, com.finalshell.core.XD var2) {
      this(var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 928;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4424023602517480002L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "\u0014µ\u0011q¨±µô¡95Ô \u0089>èF\u008e\u0011û{v\u0014\u00992 U\u007fPÑf\u0094\u0010Yy\u008bu`þÂ@;7n¸¸\u001cf\u0011\u0095$N+æÚr\u009a\u000b\u0095+§\u0087õü";
      int var5 = "\u0014µ\u0011q¨±µô¡95Ô \u0089>èF\u008e\u0011û{v\u0014\u00992 U\u007fPÑf\u0094\u0010Yy\u008bu`þÂ@;7n¸¸\u001cf\u0011\u0095$N+æÚr\u009a\u000b\u0095+§\u0087õü"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ö\u009fÙ{6\u008fÍ? \u0091 \u0086é\u0013\u0084¨";
                  var5 = "Ö\u009fÙ{6\u008fÍ? \u0091 \u0086é\u0013\u0084¨".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}







