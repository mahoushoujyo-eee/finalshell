package com.m;

import com.rv_4;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.tree.TreePath;

class i extends MouseAdapter {
   final com.m.K Q;
   private static final long a;

   i(com.m.K var1) {
      this.Q = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var10000 = com.m.s.d();
      this.Q.r = System.currentTimeMillis();
      String var2 = var10000;
      if (var2 != null) {
         int var21;
         label177: {
            label176: {
               label175:
               if (SwingUtilities.isLeftMouseButton(var1)) {
                  boolean var12 = this.Q.y();
                  if (var2 != null) {
                     if (var12) {
                        label193: {
                           TreePath var3;
                           label168: {
                              var3 = this.Q.getClosestPathForLocation(com.m.K.r(this.Q), var1.getX(), var1.getY());
                              if (var3 != null) {
                                 var13 = com.m.K.i(this.Q, var3, var1.getX(), var1.getY());
                                 if (var2 != null) {
                                    if (var13 != 0) {
                                       break label193;
                                    }

                                    var13 = this.Q.v(var3, var1.getX(), var1.getY());
                                 }

                                 if (var2 == null) {
                                    break label168;
                                 }

                                 if (var13 != 0) {
                                    break label193;
                                 }
                              }

                              var13 = this.Q.getRowForPath(com.m.K.f(this.Q), var3);
                           }

                           int var4 = var13;
                           if (var3 == null) {
                              return;
                           }

                           int var6;
                           label155: {
                              label185: {
                                 int var5 = com.m.K.g(this.Q, var4, var3.getPathCount() - 1);
                                 var6 = var1.getX() - var5;
                                 var14 = this.Q.V();
                                 if (var2 != null) {
                                    if (var14 == 0) {
                                       break label185;
                                    }

                                    var14 = this.Q.G(var4).contains(var1.getX(), var1.getY());
                                 }

                                 if (var2 != null) {
                                    if (var14 == 0) {
                                       break label185;
                                    }

                                    var14 = com.m.K.s(this.Q).isRowSelected(var4);
                                 }

                                 if (var2 == null) {
                                    break label155;
                                 }

                                 if (var14 != 0) {
                                    var14 = 1;
                                    break label155;
                                 }
                              }

                              var14 = 0;
                           }

                           int var7 = var14;
                           int var15 = com.m.K.b(this.Q).getCellRenderer().getClass().equals(na_2.class);
                           if (var2 != null) {
                              if (var15 != 0) {
                                 label135: {
                                    label187: {
                                       na_2 var8 = (na_2)com.m.K.w(this.Q).getCellRenderer();
                                       var16 = var7;
                                       if (var2 != null) {
                                          if (var7 != 0) {
                                             Object[] var10001 = com.c.a(var4, var6);
                                             Method var10003 = com.c.d(460506329433732058L);
                                             Object[] var10002 = var10001;
                                             na_2 var20 = var8;
                                             Method var17 = var10003;

                                             try {
                                                var16 = (Boolean)var17.invoke(var20, var10002);
                                             } catch (InvocationTargetException var9) {
                                                throw var9.getTargetException();
                                             }

                                             if (var2 == null) {
                                                break label135;
                                             }

                                             if (var16 != 0) {
                                                break label187;
                                             }
                                          }

                                          long var22;
                                          var16 = (var22 = this.Q.R - (long)var4) == 0L ? 0 : (var22 < 0L ? -1 : 1);
                                       }

                                       if (var2 == null) {
                                          break label135;
                                       }

                                       if (var16 != 0) {
                                          var16 = com.m.K.E(this.Q).getSelectionCount();
                                          if (var2 == null) {
                                             break label135;
                                          }

                                          if (var16 <= 1) {
                                             var16 = 0;
                                             break label135;
                                          }
                                       }
                                    }

                                    var16 = 1;
                                 }

                                 var7 = var16;
                              }

                              var15 = var7;
                           }

                           if (var15 != 0) {
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

                     var18 = this.Q;
                     if (var2 == null) {
                        break label176;
                     }

                     var12 = this.Q.o();
                  }

                  if (var12) {
                     TreePath var10 = this.Q.getClosestPathForLocation(com.m.K.k(this.Q), var1.getX(), var1.getY());
                     if (var2 == null) {
                        return;
                     }

                     if (var10 != null) {
                        var18 = this.Q;
                        if (var2 == null) {
                           break label176;
                        }

                        if (!com.m.K.K(this.Q, var10, var1.getX(), var1.getY())) {
                           var18 = this.Q;
                           if (var2 == null) {
                              break label176;
                           }

                           if (!this.Q.v(var10, var1.getX(), var1.getY())) {
                              int var19 = com.m.K.U(this.Q).getSelectionModel().getSelectionMode();
                              if (var2 != null) {
                                 if (var19 == 1) {
                                    com.m.K.g(this.Q).setSelectionRow(this.Q.v(var1.getPoint(), true));
                                 }

                                 var19 = this.Q.getRowForPath(com.m.K.L(this.Q), var10);
                              }

                              int var11 = var19;
                              var18 = this.Q;
                              if (var2 == null) {
                                 break label176;
                              }

                              if (this.Q.V()) {
                                 var18 = this.Q;
                                 var21 = var11;
                                 if (var2 == null) {
                                    break label177;
                                 }

                                 if (this.Q.G(var11).contains(var1.getX(), var1.getY())) {
                                    var18 = this.Q;
                                    if (var2 == null) {
                                       break label176;
                                    }

                                    if (com.m.K.C(this.Q).isRowSelected(var11)) {
                                       this.Q.G = var10;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var18 = this.Q;
            }

            var21 = com.m.K.e(this.Q).getLeadSelectionRow();
         }

         var18.R = (long)var21;
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      String var2;
      com.m.K var7;
      label58: {
         String var10000 = com.m.s.d();
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

            var6 = com.m.K.D(this.Q).getDragEnabled();
         }

         if (var6 == 0) {
            return;
         }

         var7 = this.Q;
      }

      if (var2 != null) {
         if (var7.G != null) {
            TransferHandler var5 = com.m.K.F(this.Q).getTransferHandler();
            var5.exportAsDrag(com.m.K.R(this.Q), var1, var5.getSourceActions(com.m.K.t(this.Q)));
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

      JTree var8 = com.m.K.v(var7);
      if (var2 != null) {
         if (var8.getVisibleRect().contains(var1.getPoint())) {
            return;
         }

         var8 = com.m.K.Y(this.Q);
      }

      var8.scrollRectToVisible(new Rectangle(var1.getPoint(), new Dimension(0, 0)));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var2 = com.m.s.d();
      com.m.K var10000 = this.Q;
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

   private void e(MouseEvent var1) {
      String var2;
      ArrayList var4;
      int var15;
      label167: {
         label170: {
            String var10000 = com.m.s.d();
            Rectangle var3 = rv_4.t(new Point[]{this.Q.n, this.Q.q});
            var4 = new ArrayList();
            var2 = var10000;
            byte var14 = com.FN.y(var1);
            if (var2 != null) {
               if (var14 != 0) {
                  int var5 = 0;

                  while (var5 < com.m.K.n(this.Q).getRowCount()) {
                     var15 = this.Q.G(var5).intersects(var3);
                     if (var2 == null) {
                        break label167;
                     }

                     label173: {
                        if (var2 != null) {
                           if (var15 == 0) {
                              break label173;
                           }

                           var15 = this.Q.P.contains(var5);
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

               var14 = com.FN.m(var1);
            }

            if (var2 != null) {
               if (var14 != 0) {
                  ArrayList var9 = new ArrayList();
                  int var12 = 0;

                  while (var12 < com.m.K.j(this.Q).getRowCount()) {
                     var15 = this.Q.G(var12).intersects(var3);
                     if (var2 == null) {
                        break label167;
                     }

                     label177: {
                        if (var2 != null) {
                           if (var15 == 0) {
                              break label177;
                           }

                           var15 = this.Q.P.contains(var12);
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
                     var15 = var9.contains(var7);
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

            while (var10 < com.m.K.y(this.Q).getRowCount()) {
               var15 = this.Q.G(var10).intersects(var3);
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

         var15 = com.aL.n(this.s(), var4);
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
      com.m.K.I(this.Q).setSelectionRows(var11);
   }

   private List s() {
      String var10000 = com.m.s.d();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;
      int[] var3 = com.m.K.p(this.Q).getSelectionRows();
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

   private void D() {
      com.m.K.H(this.Q).repaint(com.m.K.a(this.Q).getVisibleRect());
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

   private void v(MouseEvent var1) {
      com.m.i var10000;
      String var2 = com.m.s.d();
      var10000 = this;
      label30:
      if (var2 != null) {
         if (com.m.K.G(this.Q).isEnabled()) {
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

   private void z() {
      int var1 = this.Q.g;
      this.Q.g = -1;
      this.I(var1);
   }

   private void I(int var1) {
      if (var1 != -1) {
         Rectangle var2 = this.Q.A(var1);
         if (var2 != null) {
            com.m.K.i(this.Q).repaint(var2);
         }
      }
   }

   static {
      long var0 = 5344468874904520112L;
      long var10002 = 5344468874904520110L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





