package com.finalshell.ui.listener;

import com.finalshell.core.AL_2;
import com.finalshell.core.FN;
import com.finalshell.core.K5_2;
import com.finalshell.core.Na2;
import com.finalshell.core.Rv4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.tree.TreePath;

public class I4 extends MouseAdapter {
   public final K5_2 Q;
   public static long a;

   public I4(K5_2 var1) {
      this.Q = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var15;
      boolean var18;
      boolean var22;
      String var10000 = com.finalshell.ui.panel.S.d();
      this.Q.r = System.currentTimeMillis();
      String var2 = var10000;
      if (var2 != null) {
         int var23;
         label177: {
            label176: {
               label175:
               if (SwingUtilities.isLeftMouseButton(var1)) {
                  boolean var14 = this.Q.y();
                  if (var2 != null) {
                     if (var14) {
                        label193: {
                           TreePath var3;
                           label168: {
                              var3 = this.Q.getClosestPathForLocation(K5_2.r(this.Q), var1.getX(), var1.getY());
                              if (var3 != null) {
                                 var15 = (K5_2.i(this.Q, var3, var1.getX(), var1.getY())) ? 1 : 0;
                                 if (var2 != null) {
                                    if (var15 != 0) {
                                       break label193;
                                    }

                                    var15 = (this.Q.v(var3, var1.getX(), var1.getY())) ? 1 : 0;
                                 }

                                 if (var2 == null) {
                                    break label168;
                                 }

                                 if (var15 != 0) {
                                    break label193;
                                 }
                              }

                              var15 = this.Q.getRowForPath(K5_2.f(this.Q), var3);
                           }

                           int var4 = var15;
                           if (var3 == null) {
                              return;
                           }

                           int var6;
                           label155: {
                              label185: {
                                 int var5 = K5_2.g(this.Q, var4, var3.getPathCount() - 1);
                                 var6 = var1.getX() - var5;
                                 var10000 = (String)(this.Q.V());
                                 if (var2 != null) {
                                    if (var10000 == null) {
                                       break label185;
                                    }

                                    var10000 = (String)(this.Q.G(var4).contains(var1.getX(), var1.getY()));
                                 }

                                 if (var2 != null) {
                                    if (var10000 == null) {
                                       break label185;
                                    }

                                    var10000 = (String)(K5_2.s(this.Q).isRowSelected(var4));
                                 }

                                 if (var2 == null) {
                                    break label155;
                                 }

                                 if (var10000 == null) {
                                    var10000 = (String)(true);
                                    break label155;
                                 }
                              }

                              var10000 = (String)(false);
                           }

                           Na2 var7 = var10000;
                           Na2 var17 = K5_2.b(this.Q).getCellRenderer().getClass().equals(Na2.class);
                           if (var2 != null) {
                              if (var17 == null) {
                                 label135: {
                                    label187: {
                                       Na2 var8 = (Na2)K5_2.w(this.Q).getCellRenderer();
                                       var18 = (boolean)(var7);
                                       if (var2 != null) {
                                          if (var7 == null) {
                                             var18 = (boolean)(var8);
                                             Object[] var10001 = Registry.packArgs(var4, var6);
                                             long var10 = 460506329433732058L;
                                             Object[] var9 = var10001;
                                             Object var21 = Ref.h(460506329433732058L, var9, var10);

                                             try {
                                                var22 = (Boolean)var21;
                                             } catch (InvocationTargetException var11) {
                                                throw var11.getTargetException();
                                             }

                                             if (var2 == null) {
                                                break label135;
                                             }

                                             if (var22) {
                                                break label187;
                                             }
                                          }

                                          long var24;
                                          var18 = ((var24 = this.Q.R - (long)var4) == 0L ? 0 : (var24 < 0L ? -1 : 1)) != 0;
                                       }

                                       if (var2 == null) {
                                          break label135;
                                       }

                                       if (var18 != false) {
                                          var18 = (K5_2.E(this.Q).getSelectionCount()) != 0;
                                          if (var2 == null) {
                                             break label135;
                                          }

                                          if (!(var18 > 1)) {
                                             var18 = false;
                                             break label135;
                                          }
                                       }
                                    }

                                    var18 = true;
                                 }

                                 var7 = (Na2)(var18);
                              }

                              var17 = var7;
                           }

                           if (var17 == null) {
                              this.Q.G = var3;
                              if (var2 != null) {
                                 break label193;
                              }
                           }

                           this.Q.n = var1.getPoint();
                           this.Q.q = this.Q.n;
                           this.Q.P = this.s();
                           this.e(var1);
                           this.D();
                        }

                        if (var2 != null) {
                           break label175;
                        }
                     }

                     var19 = this.Q;
                     if (var2 == null) {
                        break label176;
                     }

                     var14 = this.Q.o$boolean();
                  }

                  if (var14) {
                     TreePath var12 = this.Q.getClosestPathForLocation(K5_2.k(this.Q), var1.getX(), var1.getY());
                     if (var2 == null) {
                        return;
                     }

                     if (var12 != null) {
                        var19 = this.Q;
                        if (var2 == null) {
                           break label176;
                        }

                        if (!K5_2.K(this.Q, var12, var1.getX(), var1.getY())) {
                           var19 = this.Q;
                           if (var2 == null) {
                              break label176;
                           }

                           if (!this.Q.v(var12, var1.getX(), var1.getY())) {
                              int var20 = K5_2.U(this.Q).getSelectionModel().getSelectionMode();
                              if (var2 != null) {
                                 if (var20 == 1) {
                                    K5_2.g(this.Q).setSelectionRow(this.Q.v(var1.getPoint(), true));
                                 }

                                 var20 = this.Q.getRowForPath(K5_2.L(this.Q), var12);
                              }

                              int var13 = var20;
                              var19 = this.Q;
                              if (var2 == null) {
                                 break label176;
                              }

                              if (this.Q.V()) {
                                 var19 = this.Q;
                                 var23 = var13;
                                 if (var2 == null) {
                                    break label177;
                                 }

                                 if (this.Q.G(var13).contains(var1.getX(), var1.getY())) {
                                    var19 = this.Q;
                                    if (var2 == null) {
                                       break label176;
                                    }

                                    if (K5_2.C(this.Q).isRowSelected(var13)) {
                                       this.Q.G = var12;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var19 = this.Q;
            }

            var23 = K5_2.e(this.Q).getLeadSelectionRow();
         }

         var19.R = (long)var23;
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      String var2;
      K5_2 var7;
      label58: {
         String var10000 = com.finalshell.ui.panel.S.d();
         long var3 = System.currentTimeMillis() - this.Q.r;
         var2 = var10000;
         long var9;
         int var6 = (var9 = var3 - a) == 0L ? 0 : (var9 < 0L ? -1 : 1);
         if (var2 != null) {
            if (var6 < 0) {
               return;
            }

            var7 = this.Q;
            if (var2 == null) {
               break label58;
            }

            var6 = (K5_2.D(this.Q).getDragEnabled()) ? 1 : 0;
         }

         if (var6 == 0) {
            return;
         }

         var7 = this.Q;
      }

      if (var2 != null) {
         if (var7.G != null) {
            TransferHandler var5 = K5_2.F(this.Q).getTransferHandler();
            var5.exportAsDrag(K5_2.R(this.Q), var1, var5.getSourceActions(K5_2.t(this.Q)));
            this.Q.G = null;
         }

         var7 = this.Q;
      }

      if (var2 != null) {
         if (!var7.y()) {
            return;
         }

         var7 = this.Q;
      }

      if (var2 != null) {
         if (var7.n == null) {
            return;
         }

         this.Q.q = var1.getPoint();
         this.e(var1);
         this.D();
         var7 = this.Q;
      }

      JTree var8 = K5_2.v(var7);
      if (var2 != null) {
         if (var8.getVisibleRect().contains(var1.getPoint())) {
            return;
         }

         var8 = K5_2.Y(this.Q);
      }

      var8.scrollRectToVisible(new Rectangle(var1.getPoint(), new Dimension(0, 0)));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var2 = com.finalshell.ui.panel.S.d();
      K5_2 var10000 = this.Q;
      if (var2 != null) {
         if (this.Q.G != null) {
            this.Q.G = null;
         }

         var10000 = this.Q;
      }

      if (var2 != null) {
         if (!var10000.y()) {
            return;
         }

         var10000 = this.Q;
      }

      if (var2 != null) {
         if (var10000.n == null) {
            return;
         }

         this.Q.n = null;
         var10000 = this.Q;
      }

      var10000.q = null;
      this.D();
   }

   public void e(MouseEvent var1) {
      String var2;
      ArrayList var4;
      int var15;
      label167: {
         label170: {
            String var10000 = com.finalshell.ui.panel.S.d();
            Rectangle var3 = Rv4.t(new Point[]{this.Q.n, this.Q.q});
            var4 = new ArrayList();
            var2 = var10000;
            byte var14 = (byte)((FN.y(var1)) ? 1 : 0);
            if (var2 != null) {
               if (var14 != 0) {
                  int var5 = 0;

                  while (var5 < K5_2.n(this.Q).getRowCount()) {
                     var15 = (this.Q.G(var5).intersects(var3)) ? 1 : 0;
                     if (var2 == null) {
                        break label167;
                     }

                     label173: {
                        if (var2 != null) {
                           if (var15 == 0) {
                              break label173;
                           }

                           var15 = (this.Q.P.contains(var5)) ? 1 : 0;
                        }

                        if (var2 != null && var15 == 0) {
                           var4.add(var5);
                        }
                     }

                     var5++;
                     if (var2 == null) {
                        break;
                     }
                  }

                  for (int var6 : this.Q.P) {
                     var4.add(var6);
                     if (var2 == null) {
                        break label170;
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  if (var2 != null) {
                     break label170;
                  }
               }

               var14 = (byte)((FN.m(var1)) ? 1 : 0);
            }

            if (var2 != null) {
               if (var14 != 0) {
                  ArrayList var9 = new ArrayList();
                  int var12 = 0;

                  while (var12 < K5_2.j(this.Q).getRowCount()) {
                     var15 = (this.Q.G(var12).intersects(var3)) ? 1 : 0;
                     if (var2 == null) {
                        break label167;
                     }

                     label177: {
                        if (var2 != null) {
                           if (var15 == 0) {
                              break label177;
                           }

                           var15 = (this.Q.P.contains(var12)) ? 1 : 0;
                        }

                        label116:
                        if (var2 != null) {
                           if (var15 != 0) {
                              var9.add(var12);
                              if (var2 != null) {
                                 break label116;
                              }
                           }

                           var4.add(var12);
                        }
                     }

                     var12++;
                     if (var2 == null) {
                        break;
                     }
                  }

                  for (int var7 : this.Q.P) {
                     var15 = (var9.contains(var7)) ? 1 : 0;
                     if (var2 == null) {
                        break label167;
                     }

                     if (var2 != null && var15 == 0) {
                        var4.add(var7);
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  if (var2 != null) {
                     break label170;
                  }
               }

               var14 = 0;
            }

            int var10 = var14;

            while (var10 < K5_2.y(this.Q).getRowCount()) {
               var15 = (this.Q.G(var10).intersects(var3)) ? 1 : 0;
               if (var2 == null) {
                  break label167;
               }

               if (var2 != null && var15 != 0) {
                  var4.add(var10);
               }

               var10++;
               if (var2 == null) {
                  break;
               }
            }
         }

         var15 = (AL_2.n(this.s(), var4)) ? 1 : 0;
      }

      if (var2 != null) {
         if (var15 != 0) {
            return;
         }

         var15 = var4.size();
      }

      if (var15 > 0) {
      }

      int[] var11 = new int[]{1, 2, 3};
      K5_2.I(this.Q).setSelectionRows(var11);
   }

   public List s() {
      String var10000 = com.finalshell.ui.panel.S.d();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;
      int[] var3 = K5_2.p(this.Q).getSelectionRows();
      int[] var8 = var3;
      if (var1 != null) {
         if (var3 == null) {
            return var2;
         }

         var8 = var3;
      }

      int[] var4 = var8;
      int var5 = var4.length;
      int var6 = 0;

      while (var6 < var5) {
         int var7 = var4[var6];
         if (var1 == null) {
            return var2;
         }

         var2.add(var7);
         var6++;
         if (var1 == null) {
            break;
         }
      }

      return var2;
   }

   public void D() {
      K5_2.H(this.Q).repaint(K5_2.a(this.Q).getVisibleRect());
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.v(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.z();
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.v(var1);
   }

   public void v(MouseEvent var1) {
      I4 var10000;
      String var2 = com.finalshell.ui.panel.S.d();
      var10000 = this;
      label30:
      if (var2 != null) {
         if (K5_2.G(this.Q).isEnabled()) {
            var10000 = this;
            if (var2 == null) {
               break label30;
            }

            if (this.Q.h) {
               label24: {
                  int var3 = this.Q.Y(var1.getPoint());
                  int var5 = this.Q.g;
                  if (var2 != null) {
                     if (this.Q.g == var3) {
                        break label24;
                     }

                     var5 = this.Q.g;
                  }

                  int var4 = var5;
                  this.Q.g = var3;
                  this.I(var3);
                  this.I(var4);
               }

               if (var2 != null) {
                  return;
               }
            }
         }

         var10000 = this;
      }

      var10000.z();
   }

   public void z() {
      int var1 = this.Q.g;
      this.Q.g = -1;
      this.I(var1);
   }

   public void I(int var1) {
      if (var1 != -1) {
         Rectangle var2 = this.Q.A(var1);
         if (var2 != null) {
            K5_2.i(this.Q).repaint(var2);
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5344468874904520112L;
      long var10002 = 5344468874904520110L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
   private static Object var19;
   private static Object R;
}





