package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.LinearGradientPaint;
import java.awt.Shape;
import java.awt.Window;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D.Double;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JToolBar;
import javax.swing.LookAndFeel;
import javax.swing.RootPaneContainer;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolBarUI;
import javax.swing.plaf.basic.BasicToolBarUI.DragWindow;

public class pk_4 extends BasicToolBarUI implements com.W2, com.L0 {
   private Color o = nJ_3.m;
   private Color n = nJ_3.o;
   private Color y = nJ_3.I;
   private Color B = nJ_3.r;
   private boolean t;
   private int v;
   private int d;
   private Insets k;
   private int u;
   private com.LS q;
   private com.og_4 c;
   private final Color J;
   private final Color[] W;
   private final float[] K;
   private AncestorListener G;
   private PropertyChangeListener x;
   private PropertyChangeListener a;
   private static final String[] b;
   private static final String[] e;
   private static final long[] f;
   private static final Integer[] g;

   public pk_4() {
      String var10000 = xT_3.l();
      this.t = nJ_3.i;
      this.v = nJ_3.f;
      this.d = nJ_3.k;
      this.k = nJ_3.s;
      String var1 = var10000;
      this.u = nJ_3.R;
      this.q = nJ_3.x;
      this.c = nJ_3.t;
      this.J = new Color(a(31377, 5196034962051609868L), a(99, 69284681394180095L), a(99, 69284681394180095L));
      this.W = new Color[]{GO.l, this.J, this.J, GO.l};
      this.K = new float[]{0.0F, 0.33F, 0.66F, 1.0F};
      if (var1 == null) {
         com.ky_4.K(new String[3]);
      }
   }

   public static ComponentUI createUI(JComponent var0) {
      return new pk_4();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      com.FN.Y(this.toolBar);
      LookAndFeel.installProperty(this.toolBar, a(13921, 10260), Boolean.FALSE);
      com.WO.t(this.toolBar, this.c);
      this.h();
      this.T(this.toolBar, true);
      this.G = new com.F9(this);
      this.toolBar.addAncestorListener(this.G);
      this.x = new com.Kg_2(this);
      this.toolBar.addPropertyChangeListener(a(13920, -8928), this.x);
      this.toolBar.addPropertyChangeListener(a(13922, -23677), this.x);
      this.a = new com.y0_2(this);
      this.toolBar.addPropertyChangeListener(a(13925, 21319), this.a);
   }

   @Override
   public void uninstallUI(JComponent var1) {
      com.WO.C(this.toolBar, this.c);
      var1.removeAncestorListener(this.G);
      var1.removePropertyChangeListener(a(13927, -2027), this.x);
      var1.removePropertyChangeListener(a(13924, -12426), this.x);
      var1.removePropertyChangeListener(a(13926, -6321), this.a);
      super.uninstallUI(var1);
      this.toolBar = null;
   }

   @Override
   public Shape B() {
      String var1 = xT_3.l();
      pk_4 var10000 = this;
      if (var1 != null) {
         label20:
         if (this.c == null) {
            var10000 = this;
            if (var1 != null) {
               if (this.t) {
                  break label20;
               }

               var10000 = this;
            }

            return GA.X(var10000.toolBar, this.L(), this.z());
         }

         var10000 = this;
      }

      return com.FN.N(var10000.toolBar);
   }

   public boolean j() {
      return this.t;
   }

   public void M(boolean var1) {
      this.t = var1;
      this.h();
      if (this.c != null && !var1) {
         this.toolBar.setOpaque(false);
      }
   }

   public com.og_4 x() {
      return this.c;
   }

   public void l(com.og_4 var1) {
      com.WO.C(this.toolBar, this.c);
      this.c = var1;
      com.WO.t(this.toolBar, this.c);
      this.h();
   }

   public int z() {
      String var1 = xT_3.l();
      int var10000 = this.t;
      if (var1 != null) {
         if (this.t) {
            return 0;
         }

         var10000 = this.v;
      }

      return var10000;
   }

   public void L(int var1) {
      this.v = var1;
   }

   public Color q() {
      return this.o;
   }

   public void k(Color var1) {
      this.o = var1;
   }

   public Color z$Color() {
      return this.n;
   }

   public void L(Color var1) {
      this.n = var1;
   }

   public Color S() {
      return this.y;
   }

   public void e(Color var1) {
      this.y = var1;
   }

   public Color k() {
      return this.B;
   }

   public void x(Color var1) {
      this.B = var1;
   }

   public int L() {
      String var1 = xT_3.l();
      int var10000 = this.t;
      if (var1 != null) {
         if (this.t) {
            return 0;
         }

         var10000 = this.d;
      }

      return var10000;
   }

   public void x(int var1) {
      this.d = var1;
      this.h();
   }

   public Insets D() {
      return this.k;
   }

   public void O(Insets var1) {
      this.k = var1;
      this.h();
   }

   public com.LS c() {
      return this.q;
   }

   public void W(com.LS var1) {
      this.q = var1;
      this.h();
   }

   public int S$int() {
      return this.u;
   }

   public void y(int var1) {
      this.u = var1;
      this.T(this.toolBar, false);
   }

   @Override
   public void h() {
      String var1;
      pk_4 var6;
      label332: {
         var1 = xT_3.l();
         JToolBar var10000 = this.toolBar;
         if (var1 != null) {
            if (this.toolBar == null) {
               return;
            }

            var6 = this;
            if (var1 == null) {
               break label332;
            }

            var10000 = this.toolBar;
         }

         if (com.FN.l((JComponent)var10000)) {
            return;
         }

         var6 = this;
      }

      if (var1 != null) {
         if (var6.c != null) {
            Insets var2 = this.c.B(this.toolBar);
            this.toolBar.setBorder(GA.C(this.k.top + var2.top, this.k.left + var2.left, this.k.bottom + var2.bottom, this.k.right + var2.right));
            if (var1 != null) {
               return;
            }
         }

         var6 = this;
      }

      if (var1 != null) {
         if (!var6.t) {
            int var7 = this.toolBar.isFloatable();
            if (var1 != null) {
               var7 = var7 != 0 ? 5 : 0;
            }

            int var5 = var7;
            int var8 = this.toolBar.getOrientation();
            if (var1 != null) {
               var8 = var8 == 0 ? 1 : 0;
            }

            label335: {
               int var3;
               byte var4;
               label363: {
                  var3 = var8;
                  var4 = this.toolBar.getComponentOrientation().isLeftToRight();
                  boolean var9 = this.q.equals(com.LS.standalone);
                  if (var1 != null) {
                     if (var9) {
                        var6 = this;
                        if (var1 != null) {
                           if (this.isFloating()) {
                              int var10002 = var3;
                              if (var1 != null) {
                                 var10002 = var3 == 0 ? var5 : 0;
                              }

                              int var10001;
                              int var10003;
                              label296: {
                                 label340: {
                                    var10001 = this.k.top + var10002;
                                    var10003 = var3;
                                    if (var1 != null) {
                                       if (var3 == 0) {
                                          break label340;
                                       }

                                       var10003 = var4;
                                    }

                                    if (var1 == null) {
                                       break label296;
                                    }

                                    if (var10003 != 0) {
                                       var10003 = var5;
                                       break label296;
                                    }
                                 }

                                 var10003 = 0;
                              }

                              int var10005;
                              label285: {
                                 label341: {
                                    var10002 = this.k.left + var10003;
                                    var10005 = var3;
                                    if (var1 != null) {
                                       if (var3 == 0) {
                                          break label341;
                                       }

                                       var10005 = var4;
                                    }

                                    if (var1 == null) {
                                       break label285;
                                    }

                                    if (var10005 == 0) {
                                       var10005 = var5;
                                       break label285;
                                    }
                                 }

                                 var10005 = 0;
                              }

                              this.toolBar.setBorder(GA.C(var10001, var10002, this.k.bottom, this.k.right + var10005));
                              if (var1 != null) {
                                 break label335;
                              }
                           }

                           var6 = this;
                        }

                        int var14 = this.k.top + 1 + this.d;
                        int var19 = var3;
                        if (var1 != null) {
                           var19 = var3 == 0 ? var5 : 0;
                        }

                        int var27;
                        label270: {
                           label342: {
                              var14 += var19;
                              var19 = this.k.left + 1 + this.d;
                              var27 = var3;
                              if (var1 != null) {
                                 if (var3 == 0) {
                                    break label342;
                                 }

                                 var27 = var4;
                              }

                              if (var1 == null) {
                                 break label270;
                              }

                              if (var27 != 0) {
                                 var27 = var5;
                                 break label270;
                              }
                           }

                           var27 = 0;
                        }

                        int var35;
                        int var10004;
                        label259: {
                           label343: {
                              var19 += var27;
                              var27 = this.k.bottom + 1 + this.d;
                              var10004 = this.k.right + 1 + this.d;
                              var35 = var3;
                              if (var1 != null) {
                                 if (var3 == 0) {
                                    break label343;
                                 }

                                 var35 = var4;
                              }

                              if (var1 == null) {
                                 break label259;
                              }

                              if (var35 == 0) {
                                 var35 = var5;
                                 break label259;
                              }
                           }

                           var35 = 0;
                        }

                        var6.toolBar.setBorder(GA.C(var14, var19, var27, var10004 + var35));
                        if (var1 != null) {
                           break label335;
                        }
                     }

                     var6 = this;
                     if (var1 == null) {
                        break label363;
                     }

                     var9 = this.isFloating();
                  }

                  if (var9) {
                     int var22 = var3;
                     if (var1 != null) {
                        var22 = var3 == 0 ? var5 : 0;
                     }

                     int var16;
                     int var29;
                     label241: {
                        label345: {
                           var16 = this.k.top + var22;
                           var29 = var3;
                           if (var1 != null) {
                              if (var3 == 0) {
                                 break label345;
                              }

                              var29 = var4;
                           }

                           if (var1 == null) {
                              break label241;
                           }

                           if (var29 != 0) {
                              var29 = var5;
                              break label241;
                           }
                        }

                        var29 = 0;
                     }

                     int var36;
                     label230: {
                        label346: {
                           var22 = this.k.left + var29;
                           var36 = var3;
                           if (var1 != null) {
                              if (var3 == 0) {
                                 break label346;
                              }

                              var36 = var4;
                           }

                           if (var1 == null) {
                              break label230;
                           }

                           if (var36 == 0) {
                              var36 = var5;
                              break label230;
                           }
                        }

                        var36 = 0;
                     }

                     this.toolBar.setBorder(GA.C(var16, var22, this.k.bottom, this.k.right + var36));
                     if (var1 != null) {
                        break label335;
                     }
                  }

                  var6 = this;
               }

               int var24 = var3;
               if (var1 != null) {
                  var24 = var3 == 0 ? var5 : 0;
               }

               int var17;
               int var30;
               label211: {
                  label347: {
                     var17 = this.k.top + var24;
                     var30 = var3;
                     if (var1 != null) {
                        if (var3 == 0) {
                           break label347;
                        }

                        var30 = var4;
                     }

                     if (var1 == null) {
                        break label211;
                     }

                     if (var30 != 0) {
                        var30 = var5;
                        break label211;
                     }
                  }

                  var30 = 0;
               }

               label200: {
                  label348: {
                     var24 = this.k.left + var30;
                     var30 = var3;
                     if (var1 != null) {
                        if (var3 != 0) {
                           break label348;
                        }

                        var30 = var4;
                     }

                     if (var1 == null) {
                        break label200;
                     }

                     if (var30 == 0) {
                        var30 = 1;
                        break label200;
                     }
                  }

                  var30 = 0;
               }

               var24 += var30;
               int var33 = var3;
               if (var1 != null) {
                  var33 = var3 != 0 ? 1 : 0;
               }

               int var37;
               label188: {
                  label349: {
                     var30 = this.k.bottom + var33;
                     var37 = var3;
                     if (var1 != null) {
                        if (var3 == 0) {
                           break label349;
                        }

                        var37 = var4;
                     }

                     if (var1 == null) {
                        break label188;
                     }

                     if (var37 == 0) {
                        var37 = var5;
                        break label188;
                     }
                  }

                  var37 = 0;
               }

               label177: {
                  label350: {
                     var33 = this.k.right + var37;
                     var37 = var3;
                     if (var1 != null) {
                        if (var3 != 0) {
                           break label350;
                        }

                        var37 = var4;
                     }

                     if (var1 == null) {
                        break label177;
                     }

                     if (var37 != 0) {
                        var37 = 1;
                        break label177;
                     }
                  }

                  var37 = 0;
               }

               var6.toolBar.setBorder(GA.C(var17, var24, var30, var33 + var37));
            }

            if (var1 != null) {
               return;
            }
         }

         var6 = this;
      }

      var6.toolBar.setBorder(GA.C(this.k.top, this.k.left, this.k.bottom, this.k.right));
   }

   private void T(JComponent var1, boolean var2) {
      String var3;
      boolean var4;
      label23: {
         String var10000 = xT_3.l();
         var4 = var1.getLayout() instanceof com.TA;
         var3 = var10000;
         boolean var7 = var2;
         if (var3 != null) {
            if (var2) {
               break label23;
            }

            var7 = var4;
         }

         if (!var7) {
            return;
         }
      }

      com.TA var5 = new com.TA(this.u, this.toolBar.getOrientation());
      if (var3 != null) {
         if (var4) {
            com.TA var6 = (com.TA)var1.getLayout();
            var5.w(var6.C());
         }

         var1.setLayout(var5);
      }
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      String var3 = xT_3.l();
      pk_4 var10000 = this;
      if (var3 != null) {
         if (this.c != null) {
            this.c.u((Graphics2D)var1, com.FN.N(var2), var2);
            if (var3 != null) {
               return;
            }
         }

         var10000 = this;
      }

      if (!var10000.t) {
         Graphics2D var4 = (Graphics2D)var1;
         Object var5 = RV.X(var4);
         int var17 = this.toolBar.getOrientation();
         if (var3 != null) {
            var17 = var17 == 0 ? 1 : 0;
         }

         byte var7;
         label246: {
            int var6 = var17;
            var7 = var2.getComponentOrientation().isLeftToRight();
            int var18 = this.isFloating();
            if (var3 != null) {
               if (var18 != 0) {
                  label229: {
                     if (var6 != 0) {
                        var4.setPaint(new GradientPaint(0.0F, (float)(var2.getHeight() / 2), this.o, 0.0F, (float)var2.getHeight(), this.n));
                        if (var3 != null) {
                           break label229;
                        }
                     }

                     var4.setPaint(new GradientPaint((float)(var2.getWidth() / 2), 0.0F, this.o, (float)var2.getWidth(), 0.0F, this.n));
                  }

                  var4.fillRect(0, 0, var2.getWidth(), var2.getHeight());
                  if (var3 != null) {
                     break label246;
                  }
               }

               var18 = this.q.equals(com.LS.standalone);
            }

            if (var3 != null) {
               if (var18 != 0) {
                  Double var8 = new Double(
                     (double)this.d,
                     (double)this.d,
                     (double)(var2.getWidth() - this.d * 2 - 1),
                     (double)(var2.getHeight() - this.d * 2 - 1),
                     (double)this.v,
                     (double)this.v
                  );
                  int var19 = var2.isEnabled();
                  if (var3 != null) {
                     if (var19 != 0) {
                        RV.Y(var4, var8, GO.r, this.d);
                     }

                     var19 = var6;
                  }

                  label218: {
                     if (var19 != 0) {
                        var4.setPaint(new GradientPaint(0.0F, (float)(var2.getHeight() / 2), this.o, 0.0F, (float)var2.getHeight(), this.n));
                        if (var3 != null) {
                           break label218;
                        }
                     }

                     var4.setPaint(new GradientPaint((float)(var2.getWidth() / 2), 0.0F, this.o, (float)var2.getWidth(), 0.0F, this.n));
                  }

                  var4.fill(var8);
                  var4.setPaint(var2.isEnabled() ? this.y : this.B);
                  var4.draw(var8);
                  if (var3 != null) {
                     break label246;
                  }
               }

               var18 = var6;
            }

            label210: {
               if (var18 != 0) {
                  var4.setPaint(new GradientPaint(0.0F, (float)(var2.getHeight() / 2), this.o, 0.0F, (float)var2.getHeight(), this.n));
                  if (var3 != null) {
                     break label210;
                  }
               }

               var4.setPaint(new GradientPaint((float)(var2.getWidth() / 2), 0.0F, this.o, (float)var2.getWidth(), 0.0F, this.n));
            }

            var4.fillRect(0, 0, var2.getWidth(), var2.getHeight());
            var4.setPaint(var2.isEnabled() ? this.y : this.B);
            int var20 = var6;
            if (var3 != null) {
               if (var6 != 0) {
                  var4.drawLine(0, var2.getHeight() - 1, var2.getWidth() - 1, var2.getHeight() - 1);
                  if (var3 != null) {
                     break label246;
                  }
               }

               var20 = var7;
            }

            if (var20 != 0) {
               var4.drawLine(var2.getWidth() - 1, 0, var2.getWidth() - 1, var2.getHeight() - 1);
               if (var3 != null) {
                  break label246;
               }
            }

            var4.drawLine(0, 0, 0, var2.getHeight() - 1);
         }

         label249: {
            int var21 = this.toolBar.isFloatable();
            if (var3 != null) {
               if (var21 == 0) {
                  break label249;
               }

               var21 = this.toolBar.getOrientation();
            }

            if (var3 != null) {
               if (var21 == 0) {
                  label251: {
                     int var12 = this.d + 1;
                     int var9 = var2.getHeight() - this.d - 2;
                     int var22 = var9;
                     if (var3 != null) {
                        if (var9 <= var12) {
                           break label251;
                        }

                        var4.setPaint(new LinearGradientPaint(0.0F, (float)var12, 0.0F, (float)var9, this.K, this.W));
                        var22 = this.q.equals(com.LS.standalone);
                     }

                     label176: {
                        if (var3 != null) {
                           if (var22 != 0) {
                              int var24 = this.d + 1 + this.k.left;
                              int var10001 = this.isFloating();
                              if (var3 != null) {
                                 var10001 = var10001 != 0 ? -1 : 1;
                              }

                              var23 = var24 + var10001;
                              break label176;
                           }

                           var22 = this.k.left + 2;
                        }

                        var23 = var22 - 1;
                     }

                     int var10 = var23;
                     int var25 = var7;
                     if (var3 != null) {
                        if (var7 == 0) {
                           var10 = var2.getWidth() - var10 - 2;
                        }

                        var25 = var2.getHeight() / 2 - 3;
                     }

                     int var11 = var25;

                     label163: {
                        while (var11 >= var12) {
                           var4.fillRect(var10, var11, 2, 2);
                           var11 -= 4;
                           if (var3 == null) {
                              break label163;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var11 = var2.getHeight() / 2 + 1;
                     }

                     while (var11 + 2 <= var9) {
                        var4.fillRect(var10, var11, 2, 2);
                        var11 += 4;
                        if (var3 == null) {
                           break label249;
                        }

                        if (var3 == null) {
                           break;
                        }
                     }
                  }

                  if (var3 != null) {
                     break label249;
                  }
               }

               var21 = this.d + 1;
            }

            int var13 = var21;
            int var14 = var2.getWidth() - this.d - 2;
            int var26 = var14;
            if (var3 != null) {
               if (var14 <= var13) {
                  break label249;
               }

               var4.setPaint(new LinearGradientPaint((float)var13, 0.0F, (float)var14, 0.0F, this.K, this.W));
               var26 = this.q.equals(com.LS.standalone);
            }

            label143: {
               if (var3 != null) {
                  if (var26 != 0) {
                     int var28 = this.d + 1 + this.k.top;
                     int var29 = this.isFloating();
                     if (var3 != null) {
                        var29 = var29 != 0 ? -1 : 1;
                     }

                     var27 = var28 + var29;
                     break label143;
                  }

                  var26 = this.k.top + 2;
               }

               var27 = var26 - 1;
            }

            int var15 = var27;
            int var16 = var2.getWidth() / 2 - 3;

            label130: {
               while (var16 >= var13) {
                  var4.fillRect(var16, var15, 2, 2);
                  var16 -= 4;
                  if (var3 == null) {
                     break label130;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               var16 = var2.getWidth() / 2 + 1;
            }

            while (var16 + 2 <= var14) {
               var4.fillRect(var16, var15, 2, 2);
               var16 += 4;
               if (var3 == null) {
                  return;
               }

               if (var3 == null) {
                  break;
               }
            }
         }

         RV.X(var4, var5);
      }
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      Dimension var4;
      label18: {
         String var2 = xT_3.l();
         LayoutManager var10000 = var1.getLayout();
         if (var2 != null) {
            if (var10000 == null) {
               var4 = null;
               break label18;
            }

            var10000 = var1.getLayout();
         }

         var4 = var10000.preferredLayoutSize(var1);
      }

      Dimension var3 = var4;
      if (this.c != null) {
         var3 = com.FN.h(var3, this.c.d(var1));
      }

      return var3;
   }

   @Override
   protected RootPaneContainer createFloatingWindow(JToolBar var1) {
      com.D3 var3;
      label23: {
         String var10000 = xT_3.l();
         Window var4 = com.FN.L(var1);
         String var2 = var10000;
         boolean var6 = var4 instanceof Frame;
         if (var2 != null) {
            if (var6) {
               var3 = new com.D3(this, (Frame)var4, var1.getName(), false);
               if (var2 != null) {
                  break label23;
               }
            }

            var6 = var4 instanceof Dialog;
         }

         if (var6) {
            var3 = new com.D3(this, (Dialog)var4, var1.getName(), false);
            if (var2 != null) {
               break label23;
            }
         }

         var3 = new com.D3(this, (Frame)null, var1.getName(), false);
      }

      var3.getRootPane().setName(a(13923, -25429));
      var3.setTitle(var1.getName());
      var3.setResizable(false);
      WindowListener var5 = this.createFrameListener();
      var3.addWindowListener(var5);
      return var3;
   }

   @Override
   protected DragWindow createDragWindow(JToolBar var1) {
      DragWindow var2 = super.createDragWindow(var1);
      Xk_2.f(var2, 0.5F);
      return var2;
   }

   @Override
   protected void installRolloverBorders(JComponent var1) {
   }

   @Override
   protected void installNonRolloverBorders(JComponent var1) {
   }

   @Override
   protected void installNormalBorders(JComponent var1) {
   }

   @Override
   protected void setBorderToRollover(Component var1) {
   }

   @Override
   protected void setBorderToNonRollover(Component var1) {
   }

   @Override
   protected void setBorderToNormal(Component var1) {
   }

   static JToolBar b(pk_4 var0) {
      return var0.toolBar;
   }

   static void I(pk_4 var0, JComponent var1, boolean var2) {
      var0.T(var1, var2);
   }

   static JToolBar K(pk_4 var0) {
      return var0.toolBar;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "ßÜx¹Å\u0082KEãU-\u0014\u0080O\u001a`\f\u0014WÔù\u001eÌìÈ\u0086?¼\u0001ÈU;\u0014+ o\u008d¢©\u0082cCè\u009b2\"]bÇª§ Ö\t\u0091¹\u009fÌå½\u0015\rG\u0016õ¤g\u0001Ì¨ÐíÎRC*\u0096PÝ\u0087'i×\u0005\u0007¤\u000bÛ\u009dø\u0091Õ\u0087Iå£A%";
      int var12 = "ßÜx¹Å\u0082KEãU-\u0014\u0080O\u001a`\f\u0014WÔù\u001eÌìÈ\u0086?¼\u0001ÈU;\u0014+ o\u008d¢©\u0082cCè\u009b2\"]bÇª§ Ö\t\u0091¹\u009fÌå½\u0015\rG\u0016õ¤g\u0001Ì¨ÐíÎRC*\u0096PÝ\u0087'i×\u0005\u0007¤\u000bÛ\u009dø\u0091Õ\u0087Iå£A%"
         .length();
      char var9 = 11;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 95;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 44;
                        break;
                     case 1:
                        var58 = 87;
                        break;
                     case 2:
                        var58 = 89;
                        break;
                     case 3:
                        var58 = 37;
                        break;
                     case 4:
                        var58 = 127;
                        break;
                     case 5:
                        var58 = 24;
                        break;
                     default:
                        var58 = 106;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     b = var13;
                     e = new String[8];
                     long var0 = 1114445160718269919L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = ";\u009c\u0016æ¿ÛHM®5üCà£²¾";
                     int var5 = ";\u009c\u0016æ¿ÛHM®5üCà£²¾".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     f = var6;
                     g = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "u\u0005\u000bú\u0097C\t2\u0004ÅU\u0080 \u0097\u00809";
                  var12 = "u\u0005\u000bú\u0097C\t2\u0004ÅU\u0080 \u0097\u00809".length();
                  var9 = 6;
                  var16 = -1;
            }

            var10000 = 61;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 13927) & 65535;
      if (e[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 14;
               break;
            case 1:
               var10000 = 203;
               break;
            case 2:
               var10000 = 186;
               break;
            case 3:
               var10000 = 74;
               break;
            case 4:
               var10000 = 139;
               break;
            case 5:
               var10000 = 40;
               break;
            case 6:
               var10000 = 4;
               break;
            case 7:
               var10000 = 121;
               break;
            case 8:
               var10000 = 169;
               break;
            case 9:
               var10000 = 100;
               break;
            case 10:
               var10000 = 34;
               break;
            case 11:
               var10000 = 85;
               break;
            case 12:
               var10000 = 17;
               break;
            case 13:
               var10000 = 208;
               break;
            case 14:
               var10000 = 114;
               break;
            case 15:
               var10000 = 116;
               break;
            case 16:
               var10000 = 237;
               break;
            case 17:
               var10000 = 240;
               break;
            case 18:
               var10000 = 245;
               break;
            case 19:
               var10000 = 84;
               break;
            case 20:
               var10000 = 162;
               break;
            case 21:
               var10000 = 247;
               break;
            case 22:
               var10000 = 196;
               break;
            case 23:
               var10000 = 135;
               break;
            case 24:
               var10000 = 154;
               break;
            case 25:
               var10000 = 152;
               break;
            case 26:
               var10000 = 65;
               break;
            case 27:
               var10000 = 241;
               break;
            case 28:
               var10000 = 67;
               break;
            case 29:
               var10000 = 125;
               break;
            case 30:
               var10000 = 177;
               break;
            case 31:
               var10000 = 49;
               break;
            case 32:
               var10000 = 216;
               break;
            case 33:
               var10000 = 126;
               break;
            case 34:
               var10000 = 55;
               break;
            case 35:
               var10000 = 219;
               break;
            case 36:
               var10000 = 8;
               break;
            case 37:
               var10000 = 50;
               break;
            case 38:
               var10000 = 38;
               break;
            case 39:
               var10000 = 32;
               break;
            case 40:
               var10000 = 187;
               break;
            case 41:
               var10000 = 119;
               break;
            case 42:
               var10000 = 155;
               break;
            case 43:
               var10000 = 20;
               break;
            case 44:
               var10000 = 115;
               break;
            case 45:
               var10000 = 10;
               break;
            case 46:
               var10000 = 64;
               break;
            case 47:
               var10000 = 122;
               break;
            case 48:
               var10000 = 70;
               break;
            case 49:
               var10000 = 147;
               break;
            case 50:
               var10000 = 235;
               break;
            case 51:
               var10000 = 51;
               break;
            case 52:
               var10000 = 238;
               break;
            case 53:
               var10000 = 250;
               break;
            case 54:
               var10000 = 231;
               break;
            case 55:
               var10000 = 26;
               break;
            case 56:
               var10000 = 1;
               break;
            case 57:
               var10000 = 209;
               break;
            case 58:
               var10000 = 255;
               break;
            case 59:
               var10000 = 88;
               break;
            case 60:
               var10000 = 109;
               break;
            case 61:
               var10000 = 103;
               break;
            case 62:
               var10000 = 158;
               break;
            case 63:
               var10000 = 56;
               break;
            case 64:
               var10000 = 214;
               break;
            case 65:
               var10000 = 15;
               break;
            case 66:
               var10000 = 161;
               break;
            case 67:
               var10000 = 244;
               break;
            case 68:
               var10000 = 181;
               break;
            case 69:
               var10000 = 24;
               break;
            case 70:
               var10000 = 45;
               break;
            case 71:
               var10000 = 75;
               break;
            case 72:
               var10000 = 207;
               break;
            case 73:
               var10000 = 92;
               break;
            case 74:
               var10000 = 96;
               break;
            case 75:
               var10000 = 13;
               break;
            case 76:
               var10000 = 143;
               break;
            case 77:
               var10000 = 168;
               break;
            case 78:
               var10000 = 249;
               break;
            case 79:
               var10000 = 66;
               break;
            case 80:
               var10000 = 254;
               break;
            case 81:
               var10000 = 43;
               break;
            case 82:
               var10000 = 248;
               break;
            case 83:
               var10000 = 18;
               break;
            case 84:
               var10000 = 44;
               break;
            case 85:
               var10000 = 229;
               break;
            case 86:
               var10000 = 2;
               break;
            case 87:
               var10000 = 99;
               break;
            case 88:
               var10000 = 12;
               break;
            case 89:
               var10000 = 221;
               break;
            case 90:
               var10000 = 193;
               break;
            case 91:
               var10000 = 165;
               break;
            case 92:
               var10000 = 167;
               break;
            case 93:
               var10000 = 227;
               break;
            case 94:
               var10000 = 107;
               break;
            case 95:
               var10000 = 105;
               break;
            case 96:
               var10000 = 215;
               break;
            case 97:
               var10000 = 35;
               break;
            case 98:
               var10000 = 163;
               break;
            case 99:
               var10000 = 42;
               break;
            case 100:
               var10000 = 9;
               break;
            case 101:
               var10000 = 176;
               break;
            case 102:
               var10000 = 226;
               break;
            case 103:
               var10000 = 149;
               break;
            case 104:
               var10000 = 157;
               break;
            case 105:
               var10000 = 252;
               break;
            case 106:
               var10000 = 80;
               break;
            case 107:
               var10000 = 192;
               break;
            case 108:
               var10000 = 53;
               break;
            case 109:
               var10000 = 210;
               break;
            case 110:
               var10000 = 220;
               break;
            case 111:
               var10000 = 60;
               break;
            case 112:
               var10000 = 174;
               break;
            case 113:
               var10000 = 86;
               break;
            case 114:
               var10000 = 110;
               break;
            case 115:
               var10000 = 91;
               break;
            case 116:
               var10000 = 178;
               break;
            case 117:
               var10000 = 27;
               break;
            case 118:
               var10000 = 170;
               break;
            case 119:
               var10000 = 185;
               break;
            case 120:
               var10000 = 224;
               break;
            case 121:
               var10000 = 90;
               break;
            case 122:
               var10000 = 230;
               break;
            case 123:
               var10000 = 22;
               break;
            case 124:
               var10000 = 47;
               break;
            case 125:
               var10000 = 146;
               break;
            case 126:
               var10000 = 30;
               break;
            case 127:
               var10000 = 68;
               break;
            case 128:
               var10000 = 233;
               break;
            case 129:
               var10000 = 58;
               break;
            case 130:
               var10000 = 11;
               break;
            case 131:
               var10000 = 120;
               break;
            case 132:
               var10000 = 164;
               break;
            case 133:
               var10000 = 23;
               break;
            case 134:
               var10000 = 217;
               break;
            case 135:
               var10000 = 253;
               break;
            case 136:
               var10000 = 194;
               break;
            case 137:
               var10000 = 6;
               break;
            case 138:
               var10000 = 101;
               break;
            case 139:
               var10000 = 236;
               break;
            case 140:
               var10000 = 151;
               break;
            case 141:
               var10000 = 251;
               break;
            case 142:
               var10000 = 202;
               break;
            case 143:
               var10000 = 25;
               break;
            case 144:
               var10000 = 134;
               break;
            case 145:
               var10000 = 5;
               break;
            case 146:
               var10000 = 118;
               break;
            case 147:
               var10000 = 98;
               break;
            case 148:
               var10000 = 0;
               break;
            case 149:
               var10000 = 140;
               break;
            case 150:
               var10000 = 212;
               break;
            case 151:
               var10000 = 76;
               break;
            case 152:
               var10000 = 117;
               break;
            case 153:
               var10000 = 184;
               break;
            case 154:
               var10000 = 197;
               break;
            case 155:
               var10000 = 62;
               break;
            case 156:
               var10000 = 171;
               break;
            case 157:
               var10000 = 61;
               break;
            case 158:
               var10000 = 59;
               break;
            case 159:
               var10000 = 37;
               break;
            case 160:
               var10000 = 127;
               break;
            case 161:
               var10000 = 159;
               break;
            case 162:
               var10000 = 63;
               break;
            case 163:
               var10000 = 189;
               break;
            case 164:
               var10000 = 205;
               break;
            case 165:
               var10000 = 7;
               break;
            case 166:
               var10000 = 106;
               break;
            case 167:
               var10000 = 179;
               break;
            case 168:
               var10000 = 188;
               break;
            case 169:
               var10000 = 3;
               break;
            case 170:
               var10000 = 54;
               break;
            case 171:
               var10000 = 173;
               break;
            case 172:
               var10000 = 82;
               break;
            case 173:
               var10000 = 31;
               break;
            case 174:
               var10000 = 218;
               break;
            case 175:
               var10000 = 145;
               break;
            case 176:
               var10000 = 132;
               break;
            case 177:
               var10000 = 190;
               break;
            case 178:
               var10000 = 153;
               break;
            case 179:
               var10000 = 222;
               break;
            case 180:
               var10000 = 46;
               break;
            case 181:
               var10000 = 71;
               break;
            case 182:
               var10000 = 48;
               break;
            case 183:
               var10000 = 180;
               break;
            case 184:
               var10000 = 137;
               break;
            case 185:
               var10000 = 228;
               break;
            case 186:
               var10000 = 41;
               break;
            case 187:
               var10000 = 232;
               break;
            case 188:
               var10000 = 94;
               break;
            case 189:
               var10000 = 136;
               break;
            case 190:
               var10000 = 175;
               break;
            case 191:
               var10000 = 108;
               break;
            case 192:
               var10000 = 199;
               break;
            case 193:
               var10000 = 39;
               break;
            case 194:
               var10000 = 72;
               break;
            case 195:
               var10000 = 129;
               break;
            case 196:
               var10000 = 156;
               break;
            case 197:
               var10000 = 57;
               break;
            case 198:
               var10000 = 112;
               break;
            case 199:
               var10000 = 97;
               break;
            case 200:
               var10000 = 150;
               break;
            case 201:
               var10000 = 213;
               break;
            case 202:
               var10000 = 19;
               break;
            case 203:
               var10000 = 83;
               break;
            case 204:
               var10000 = 113;
               break;
            case 205:
               var10000 = 172;
               break;
            case 206:
               var10000 = 201;
               break;
            case 207:
               var10000 = 144;
               break;
            case 208:
               var10000 = 36;
               break;
            case 209:
               var10000 = 200;
               break;
            case 210:
               var10000 = 198;
               break;
            case 211:
               var10000 = 111;
               break;
            case 212:
               var10000 = 141;
               break;
            case 213:
               var10000 = 133;
               break;
            case 214:
               var10000 = 16;
               break;
            case 215:
               var10000 = 79;
               break;
            case 216:
               var10000 = 93;
               break;
            case 217:
               var10000 = 28;
               break;
            case 218:
               var10000 = 239;
               break;
            case 219:
               var10000 = 246;
               break;
            case 220:
               var10000 = 130;
               break;
            case 221:
               var10000 = 73;
               break;
            case 222:
               var10000 = 78;
               break;
            case 223:
               var10000 = 148;
               break;
            case 224:
               var10000 = 87;
               break;
            case 225:
               var10000 = 102;
               break;
            case 226:
               var10000 = 242;
               break;
            case 227:
               var10000 = 123;
               break;
            case 228:
               var10000 = 138;
               break;
            case 229:
               var10000 = 225;
               break;
            case 230:
               var10000 = 29;
               break;
            case 231:
               var10000 = 128;
               break;
            case 232:
               var10000 = 124;
               break;
            case 233:
               var10000 = 52;
               break;
            case 234:
               var10000 = 95;
               break;
            case 235:
               var10000 = 21;
               break;
            case 236:
               var10000 = 104;
               break;
            case 237:
               var10000 = 89;
               break;
            case 238:
               var10000 = 243;
               break;
            case 239:
               var10000 = 77;
               break;
            case 240:
               var10000 = 33;
               break;
            case 241:
               var10000 = 81;
               break;
            case 242:
               var10000 = 211;
               break;
            case 243:
               var10000 = 191;
               break;
            case 244:
               var10000 = 131;
               break;
            case 245:
               var10000 = 223;
               break;
            case 246:
               var10000 = 182;
               break;
            case 247:
               var10000 = 142;
               break;
            case 248:
               var10000 = 183;
               break;
            case 249:
               var10000 = 195;
               break;
            case 250:
               var10000 = 206;
               break;
            case 251:
               var10000 = 166;
               break;
            case 252:
               var10000 = 160;
               break;
            case 253:
               var10000 = 234;
               break;
            case 254:
               var10000 = 69;
               break;
            default:
               var10000 = 204;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20381;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }
}





