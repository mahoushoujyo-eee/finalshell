package com.finalshell.ui.panel;

import com.finalshell.core.Gi2;
import com.finalshell.core.KD;
import com.finalshell.core.Og4;
import com.finalshell.core.PZ;
import com.finalshell.core.TJ;
import com.finalshell.core.TO;
import com.finalshell.ui.listener.PW;
import com.finalshell.ui.listener.Y0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class K22 extends Ky4 implements SwingConstants {
   public int F = -1;
   public boolean o = false;
   public PZ O;
   public PropertyChangeListener Z;
   public static String[] a;
   public static String[] b;

   public K22(JComponent[] var1) {
      this(0, var1);
   }

   public K22(boolean var1, JComponent[] var2) {
      this(0, var1, var2);
   }

   public K22(int var1, JComponent[] var2) {
      this(var1, false, var2);
   }

   public K22(int var1, boolean var2, JComponent[] var3) {
      this.o = var2;
      this.putClientProperty(b(-2048, -17279), Boolean.valueOf(true));
      this.setOpaque(false);
      this.F(var1);
      this.addContainerListener(new Y0(this, var2));
      this.Z = new PW(this);
      this.S(var3);
   }

   public KD r$KD(int var1) {
      return (KD)this.getComponent(var1);
   }

   public KD o(String var1) {
      int[] var10000 = K32.L$arrint();
      Component[] var3 = this.getComponents();
      int var4 = var3.length;
      int[] var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         Component var6 = var3[var5];
         if (var2 != null) {
            if (var6.getName().equals(var1)) {
               return (KD)var6;
            }

            var5++;
         }

         if (var2 == null) {
            break;
         }
      }

      return null;
   }

   public boolean V() {
      int[] var1 = K32.L$arrint();
      ButtonModel var10000 = this.O.getSelection();
      if (var1 != null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = this.O.getSelection();
      }

      boolean var2 = var10000.isSelected();
      return var1 == null ? var2 : var2;
   }

   public boolean t() {
      return this.o;
   }

   public void q(boolean var1) {
      K22 var3;
      label26: {
         int[] var2 = K32.L$arrint();
         boolean var10000 = this.o;
         if (var2 != null) {
            if (this.o == var1) {
               return;
            }

            var3 = this;
            if (var2 == null) {
               break label26;
            }

            this.o = var1;
            var10000 = var1;
         }

         if (var10000) {
            this.L(this);
            if (var2 != null) {
               return;
            }
         }

         var3 = this;
      }

      var3.q(this);
   }

   public PZ l() {
      int[] var1 = K32.L$arrint();
      PZ var10000 = this.O;
      if (var1 != null) {
         if (this.O == null) {
            this.O = new PZ();
            this.O.F(false);
         }

         var10000 = this.O;
      }

      return var10000;
   }

   public void L(Component var1) {
      int[] var2;
      K22 var8;
      label35: {
         var2 = K32.L$arrint();
         boolean var10000 = this.N(var1);
         if (var2 != null) {
            if (var10000) {
               this.l().add((AbstractButton)var1);
               if (var2 != null) {
                  return;
               }
            }

            var8 = this;
            if (var2 == null) {
               break label35;
            }

            var10000 = this.m(var1);
         }

         if (!var10000) {
            return;
         }

         var8 = (K22)var1;
      }

      K22 var3 = var8;

      for (Component var7 : var3.getComponents()) {
         this.L(var7);
         if (var2 == null) {
            break;
         }
      }
   }

   public void q(Component var1) {
      int[] var2;
      K22 var8;
      label35: {
         var2 = K32.L$arrint();
         boolean var10000 = this.N(var1);
         if (var2 != null) {
            if (var10000) {
               this.l().remove((AbstractButton)var1);
               if (var2 != null) {
                  return;
               }
            }

            var8 = this;
            if (var2 == null) {
               break label35;
            }

            var10000 = this.m(var1);
         }

         if (!var10000) {
            return;
         }

         var8 = (K22)var1;
      }

      K22 var3 = var8;

      for (Component var7 : var3.getComponents()) {
         this.q(var7);
         if (var2 == null) {
            break;
         }
      }
   }

   public boolean M() {
      return this.l().f();
   }

   public void V(boolean var1) {
      this.l().F(var1);
   }

   public int v() {
      return this.F;
   }

   public void F(int var1) {
      int[] var2 = K32.L$arrint();
      K22 var10000 = this;
      if (var2 != null) {
         if (this.F == var1) {
            return;
         }

         this.F = var1;
         var10000 = this;
      }

      var10000.setLayout((LayoutManager)(var1 == 0 ? new TJ(0, false) : new TO(0, 0, 0, true, false)));
      this.Y();
   }

   public void Y() {
      int var22;
      int[] var10000 = K32.L$arrint();
      Component[] var2 = this.getComponents();
      int[] var1 = var10000;
      int var18 = this.F;
      if (var1 != null) {
         var18 = this.F == 0 ? 1 : 0;
      }

      int var3 = var18;
      int var4 = 0;
      int var5 = 0;

      while (var5 < var2.length) {
         label187: {
            byte var19 = (byte)((this.O(var2[var5])) ? 1 : 0);
            if (var1 != null) {
               if (var19 != 0) {
                  Gi2 var6 = (Gi2)((AbstractButton)var2[var5]).getUI();
                  int var20 = var4;
                  if (var1 != null) {
                     label171:
                     if (var4 != 0) {
                        if (var3 != 0) {
                           var6.m(false);
                           var6.Q(false);
                           if (var1 != null) {
                              break label171;
                           }
                        }

                        var6.J(false);
                        var6.L(false);
                     }

                     var20 = var5;
                  }

                  label165:
                  if (var1 != null) {
                     label163:
                     if (var20 < var2.length - 1) {
                        int var21 = (this.O(var2[var5 + 1])) ? 1 : 0;
                        if (var1 != null) {
                           if (var21 == 0) {
                              var20 = (this.m(var2[var5 + 1])) ? 1 : 0;
                              if (var1 == null) {
                                 break label165;
                              }

                              if (var20 == 0) {
                                 break label163;
                              }
                           }

                           var21 = var3;
                        }

                        if (var21 != 0) {
                           var6.E(false);
                           var6.K(true);
                           if (var1 != null) {
                              break label163;
                           }
                        }

                        var6.r(false);
                        var6.W(true);
                     }

                     var20 = 1;
                  }

                  var4 = var20;
                  if (var1 != null) {
                     break label187;
                  }
               }

               var19 = (byte)((this.m(var2[var5])) ? 1 : 0);
            }

            if (var1 != null) {
               if (var19 != 0) {
                  K22 var12;
                  var12 = (K22)var2[var5];
                  var22 = var4;
                  label140:
                  if (var1 != null) {
                     if (var4 != 0) {
                        Component[] var7 = var12.getComponents();
                        int var8 = var7.length;
                        int var9 = 0;

                        while (var9 < var8) {
                           Component var10 = var7[var9];
                           if (var1 != null) {
                              var22 = (this.O(var10)) ? 1 : 0;
                              if (var1 == null) {
                                 break label140;
                              }

                              label129:
                              if (var22 != 0) {
                                 Gi2 var11 = (Gi2)((AbstractButton)var10).getUI();
                                 if (var1 != null) {
                                    if (var3 != 0) {
                                       var11.m(false);
                                       var11.Q(false);
                                       if (var1 != null) {
                                          break label129;
                                       }
                                    }

                                    var11.J(false);
                                 }

                                 var11.L(false);
                              }

                              var9++;
                           }

                           if (var1 == null) {
                              break;
                           }
                        }
                     }

                     var22 = var5;
                  }

                  label115:
                  if (var1 != null) {
                     label113:
                     if (var22 < var2.length - 1) {
                        K22 var23 = this;
                        if (var1 != null) {
                           if (!this.O(var2[var5 + 1])) {
                              var22 = (this.m(var2[var5 + 1])) ? 1 : 0;
                              if (var1 == null) {
                                 break label115;
                              }

                              if (var22 == 0) {
                                 break label113;
                              }
                           }

                           var23 = var12;
                        }

                        Component[] var13 = var23.getComponents();
                        int var14 = var13.length;
                        int var15 = 0;

                        while (var15 < var14) {
                           Component var16 = var13[var15];
                           if (var1 != null) {
                              var22 = (this.O(var16)) ? 1 : 0;
                              if (var1 == null) {
                                 break label115;
                              }

                              label97:
                              if (var22 != 0) {
                                 Gi2 var17 = (Gi2)((AbstractButton)var16).getUI();
                                 if (var1 != null) {
                                    if (var3 != 0) {
                                       var17.E(false);
                                       var17.K(true);
                                       if (var1 != null) {
                                          break label97;
                                       }
                                    }

                                    var17.r(false);
                                 }

                                 var17.W(true);
                              }

                              var15++;
                           }

                           if (var1 == null) {
                              break;
                           }
                        }
                     }

                     var22 = 1;
                  }

                  var4 = var22;
                  if (var1 != null) {
                     break label187;
                  }
               }

               var19 = 0;
            }

            var4 = var19;
         }

         var5++;
         if (var1 == null) {
            break;
         }
      }
   }

   @Override
   public void addImpl(Component var1, Object var2, int var3) {
      super.addImpl(var1, var2, var3);
      var1.addPropertyChangeListener(b(-2045, 21840), this.Z);
   }

   @Override
   public void remove(int var1) {
      this.getComponent(var1).removePropertyChangeListener(b(-2046, 6650), this.Z);
      super.remove(var1);
   }

   public boolean N(Component var1) {
      return var1 instanceof AbstractButton;
   }

   public boolean O(Component var1) {
      int[] var2 = K32.L$arrint();
      boolean var10000 = this.N(var1);
      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = ((AbstractButton)var1).getUI() instanceof Gi2;
      }

      return var2 == null ? var10000 : var10000;
   }

   public boolean m(Component var1) {
      return var1 instanceof K22;
   }

   public void u(boolean var1) {
      this.U(this, var1);
   }

   public void U(K22 var1, boolean var2) {
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label21: {
            Component var7 = var4[var6];
            Object var8 = this;
            if (var3 != null) {
               if (this.m(var7)) {
                  this.U((K22)var7, var2);
                  if (var3 != null) {
                     break label21;
                  }
               }

               var8 = var7;
            }

            var8.setFocusable(var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void L(Color var1) {
      this.P(this, var1);
   }

   public void P(K22 var1, Color var2) {
      Component[] var4 = var1.getComponents();
      int[] var10000 = K32.L$arrint();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label21: {
            Component var7 = var4[var6];
            Object var8 = this;
            if (var3 != null) {
               if (this.m(var7)) {
                  this.P((K22)var7, var2);
                  if (var3 != null) {
                     break label21;
                  }
               }

               var8 = var7;
            }

            var8.setForeground(var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void y(Color var1) {
      this.c(this, var1);
   }

   public void c(K22 var1, Color var2) {
      K22 var10;
      Component[] var4 = var1.getComponents();
      int[] var10000 = K32.L$arrint();
      int var5 = var4.length;
      int var6 = 0;
      int[] var3 = var10000;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.j(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.c((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void i(boolean var1) {
      this.H(this, var1);
   }

   public void H(K22 var1, boolean var2) {
      int[] var3 = K32.L$arrint();
      K22 var10000 = this;
      if (var3 != null) {
         if (this.F == 0) {
            Component[] var4 = var1.getComponents();
            int var5 = var4.length;
            int var6 = 0;

            while (var6 < var5) {
               Component var7 = var4[var6];
               this.J(var7, var2);
               var6++;
               if (var3 == null) {
                  return;
               }

               if (var3 == null) {
                  break;
               }
            }

            if (var3 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.J(this.K(), var2);
   }

   public void J(Component var1, boolean var2) {
      K22 var5;
      Component var10001;
      label26: {
         int[] var3 = K32.L$arrint();
         boolean var10000 = this.O(var1);
         if (var3 != null) {
            if (var10000) {
               Gi2 var4 = (Gi2)((AbstractButton)var1).getUI();
               var4.J(var2);
               if (var3 != null) {
                  return;
               }
            }

            var5 = this;
            var10001 = var1;
            if (var3 == null) {
               break label26;
            }

            var10000 = this.m(var1);
         }

         if (!var10000) {
            return;
         }

         var5 = this;
         var10001 = var1;
      }

      var5.H((K22)var10001, var2);
   }

   public void l(boolean var1) {
      this.A(this, var1);
   }

   public void A(K22 var1, boolean var2) {
      int[] var3 = K32.L$arrint();
      K22 var10000 = this;
      if (var3 != null) {
         if (this.F == 1) {
            Component[] var4 = var1.getComponents();
            int var5 = var4.length;
            int var6 = 0;

            while (var6 < var5) {
               Component var7 = var4[var6];
               this.Q(var7, var2);
               var6++;
               if (var3 == null) {
                  return;
               }

               if (var3 == null) {
                  break;
               }
            }

            if (var3 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.Q(this.K(), var2);
   }

   public void Q(Component var1, boolean var2) {
      K22 var5;
      Component var10001;
      label26: {
         int[] var3 = K32.L$arrint();
         boolean var10000 = this.O(var1);
         if (var3 != null) {
            if (var10000) {
               Gi2 var4 = (Gi2)((AbstractButton)var1).getUI();
               var4.m(var2);
               if (var3 != null) {
                  return;
               }
            }

            var5 = this;
            var10001 = var1;
            if (var3 == null) {
               break label26;
            }

            var10000 = this.m(var1);
         }

         if (!var10000) {
            return;
         }

         var5 = this;
         var10001 = var1;
      }

      var5.A((K22)var10001, var2);
   }

   public void O(boolean var1) {
      this.n(this, var1);
   }

   public void n(K22 var1, boolean var2) {
      int[] var3 = K32.L$arrint();
      K22 var10000 = this;
      if (var3 != null) {
         if (this.F == 0) {
            Component[] var4 = var1.getComponents();
            int var5 = var4.length;
            int var6 = 0;

            while (var6 < var5) {
               Component var7 = var4[var6];
               this.R(var7, var2);
               var6++;
               if (var3 == null) {
                  return;
               }

               if (var3 == null) {
                  break;
               }
            }

            if (var3 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.R(this.q(), var2);
   }

   public void R(Component var1, boolean var2) {
      K22 var5;
      Component var10001;
      label26: {
         int[] var3 = K32.L$arrint();
         boolean var10000 = this.O(var1);
         if (var3 != null) {
            if (var10000) {
               Gi2 var4 = (Gi2)((AbstractButton)var1).getUI();
               var4.r(var2);
               if (var3 != null) {
                  return;
               }
            }

            var5 = this;
            var10001 = var1;
            if (var3 == null) {
               break label26;
            }

            var10000 = this.m(var1);
         }

         if (!var10000) {
            return;
         }

         var5 = this;
         var10001 = var1;
      }

      var5.n((K22)var10001, var2);
   }

   public void P(boolean var1) {
      this.R(this, var1);
   }

   public void R(K22 var1, boolean var2) {
      int[] var3 = K32.L$arrint();
      K22 var10000 = this;
      if (var3 != null) {
         if (this.F == 1) {
            Component[] var4 = var1.getComponents();
            int var5 = var4.length;
            int var6 = 0;

            while (var6 < var5) {
               Component var7 = var4[var6];
               this.k(var7, var2);
               var6++;
               if (var3 == null) {
                  return;
               }

               if (var3 == null) {
                  break;
               }
            }

            if (var3 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.k(this.q(), var2);
   }

   public void k(Component var1, boolean var2) {
      K22 var5;
      Component var10001;
      label26: {
         int[] var3 = K32.L$arrint();
         boolean var10000 = this.O(var1);
         if (var3 != null) {
            if (var10000) {
               Gi2 var4 = (Gi2)((AbstractButton)var1).getUI();
               var4.E(var2);
               if (var3 != null) {
                  return;
               }
            }

            var5 = this;
            var10001 = var1;
            if (var3 == null) {
               break label26;
            }

            var10000 = this.m(var1);
         }

         if (!var10000) {
            return;
         }

         var5 = this;
         var10001 = var1;
      }

      var5.R((K22)var10001, var2);
   }

   public void Z(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.i(var1);
      this.l(var2);
      this.O(var3);
      this.P(var4);
   }

   public void L(boolean var1) {
      this.z(this, var1);
   }

   public void z(K22 var1, boolean var2) {
      K22 var10;
      Component[] var4 = var1.getComponents();
      int[] var10000 = K32.L$arrint();
      int var5 = var4.length;
      int var6 = 0;
      int[] var3 = var10000;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.f(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.z((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void S(boolean var1) {
      this.C(this, var1);
   }

   public void C(K22 var1, boolean var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int[] var3 = var10000;

      for (Component var7 : var4) {
         label30: {
            Component var10001;
            label38: {
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.y(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.C((K22)var10001, var2);
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public void K(Color var1) {
      this.M(this, var1);
   }

   public void M(K22 var1, Color var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int[] var3 = var10000;

      for (Component var7 : var4) {
         label30: {
            Component var10001;
            label38: {
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.u(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.M((K22)var10001, var2);
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public void r$void(int var1) {
      this.m(this, var1);
   }

   public void m(K22 var1, int var2) {
      K22 var10;
      Component[] var4 = var1.getComponents();
      int[] var10000 = K32.L$arrint();
      int var5 = var4.length;
      int var6 = 0;
      int[] var3 = var10000;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.D(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.m((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void W(boolean var1) {
      this.o(this, var1);
   }

   public void o(K22 var1, boolean var2) {
      K22 var10;
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int[] var10000 = K32.L$arrint();
      int var6 = 0;
      int[] var3 = var10000;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.d(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.o((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void J(int var1) {
      this.M(this, var1);
   }

   public void M(K22 var1, int var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int[] var3 = var10000;

      for (Component var7 : var4) {
         label30: {
            Component var10001;
            label38: {
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.z(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.M((K22)var10001, var2);
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public void n(Color var1) {
      this.k(this, var1);
   }

   public void k(K22 var1, Color var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int[] var3 = var10000;

      for (Component var7 : var4) {
         label30: {
            Component var10001;
            label38: {
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.F(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.k((K22)var10001, var2);
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public void s(int var1) {
      this.H(this, var1);
   }

   public void H(K22 var1, int var2) {
      K22 var10;
      Component[] var4 = var1.getComponents();
      int[] var10000 = K32.L$arrint();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.r(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.H((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void t(Color var1) {
      this.Q(this, var1);
   }

   public void Q(K22 var1, Color var2) {
      K22 var10;
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int[] var10000 = K32.L$arrint();
      int var6 = 0;
      int[] var3 = var10000;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.O(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.Q((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void w(int var1) {
      this.F(this, var1);
   }

   public void F(K22 var1, int var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int[] var3 = var10000;

      for (Component var7 : var4) {
         label30: {
            Component var10001;
            label38: {
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.l(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.F((K22)var10001, var2);
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public void a(boolean var1) {
      this.x(this, var1);
   }

   public void x(K22 var1, boolean var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.q(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.x((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void s(boolean var1) {
      this.W(this, var1);
   }

   public void W(K22 var1, boolean var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.l(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.W((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void D(Og4 var1) {
      this.I(this, var1);
   }

   public void I(K22 var1, Og4 var2) {
      K22 var10;
      Component[] var4 = var1.getComponents();
      int[] var10000 = K32.L$arrint();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.S(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.I((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void Q(boolean var1) {
      this.D(this, var1);
   }

   public void D(K22 var1, boolean var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.B(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.D((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void E(boolean var1) {
      this.N(this, var1);
   }

   public void N(K22 var1, boolean var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         label30: {
            Component var10001;
            label38: {
               Component var7 = var4[var6];
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.M(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.N((K22)var10001, var2);
         }

         var6++;
         if (var3 == null) {
            break;
         }
      }
   }

   public void I(Insets var1) {
      this.i(this, var1);
   }

   public void W(int var1, int var2, int var3, int var4) {
      this.I(new Insets(var1, var2, var3, var4));
   }

   public void A(int var1) {
      this.W(var1, var1, var1, var1);
   }

   public void i(K22 var1, Insets var2) {
      K22 var10;
      int[] var10000 = K32.L$arrint();
      Component[] var4 = var1.getComponents();
      int[] var3 = var10000;

      for (Component var7 : var4) {
         label30: {
            Component var10001;
            label38: {
               boolean var9 = this.O(var7);
               if (var3 != null) {
                  if (var9) {
                     Gi2 var8 = (Gi2)((AbstractButton)var7).getUI();
                     var8.Q(var2);
                     if (var3 != null) {
                        break label30;
                     }
                  }

                  var10 = this;
                  var10001 = var7;
                  if (var3 == null) {
                     break label38;
                  }

                  var9 = this.m(var7);
               }

               if (!var9) {
                  break label30;
               }

               var10 = this;
               var10001 = var7;
            }

            var10.i((K22)var10001, var2);
         }

         if (var3 == null) {
            break;
         }
      }
   }

   @Override
   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      Component[] var3 = this.getComponents();
      int[] var10000 = K32.L$arrint();
      int var4 = var3.length;
      int[] var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         Component var6 = var3[var5];
         var6.setEnabled(var1);
         var5++;
         if (var2 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -2046) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 161;
               break;
            case 1:
               var10000 = 178;
               break;
            case 2:
               var10000 = 167;
               break;
            case 3:
               var10000 = 59;
               break;
            case 4:
               var10000 = 99;
               break;
            case 5:
               var10000 = 252;
               break;
            case 6:
               var10000 = 68;
               break;
            case 7:
               var10000 = 189;
               break;
            case 8:
               var10000 = 227;
               break;
            case 9:
               var10000 = 241;
               break;
            case 10:
               var10000 = 128;
               break;
            case 11:
               var10000 = 176;
               break;
            case 12:
               var10000 = 196;
               break;
            case 13:
               var10000 = 174;
               break;
            case 14:
               var10000 = 180;
               break;
            case 15:
               var10000 = 134;
               break;
            case 16:
               var10000 = 9;
               break;
            case 17:
               var10000 = 65;
               break;
            case 18:
               var10000 = 203;
               break;
            case 19:
               var10000 = 18;
               break;
            case 20:
               var10000 = 5;
               break;
            case 21:
               var10000 = 197;
               break;
            case 22:
               var10000 = 151;
               break;
            case 23:
               var10000 = 90;
               break;
            case 24:
               var10000 = 12;
               break;
            case 25:
               var10000 = 136;
               break;
            case 26:
               var10000 = 123;
               break;
            case 27:
               var10000 = 25;
               break;
            case 28:
               var10000 = 32;
               break;
            case 29:
               var10000 = 158;
               break;
            case 30:
               var10000 = 97;
               break;
            case 31:
               var10000 = 168;
               break;
            case 32:
               var10000 = 122;
               break;
            case 33:
               var10000 = 47;
               break;
            case 34:
               var10000 = 152;
               break;
            case 35:
               var10000 = 247;
               break;
            case 36:
               var10000 = 131;
               break;
            case 37:
               var10000 = 77;
               break;
            case 38:
               var10000 = 57;
               break;
            case 39:
               var10000 = 100;
               break;
            case 40:
               var10000 = 88;
               break;
            case 41:
               var10000 = 191;
               break;
            case 42:
               var10000 = 226;
               break;
            case 43:
               var10000 = 199;
               break;
            case 44:
               var10000 = 51;
               break;
            case 45:
               var10000 = 42;
               break;
            case 46:
               var10000 = 50;
               break;
            case 47:
               var10000 = 3;
               break;
            case 48:
               var10000 = 223;
               break;
            case 49:
               var10000 = 62;
               break;
            case 50:
               var10000 = 21;
               break;
            case 51:
               var10000 = 142;
               break;
            case 52:
               var10000 = 72;
               break;
            case 53:
               var10000 = 15;
               break;
            case 54:
               var10000 = 165;
               break;
            case 55:
               var10000 = 113;
               break;
            case 56:
               var10000 = 17;
               break;
            case 57:
               var10000 = 31;
               break;
            case 58:
               var10000 = 212;
               break;
            case 59:
               var10000 = 111;
               break;
            case 60:
               var10000 = 41;
               break;
            case 61:
               var10000 = 87;
               break;
            case 62:
               var10000 = 234;
               break;
            case 63:
               var10000 = 231;
               break;
            case 64:
               var10000 = 44;
               break;
            case 65:
               var10000 = 43;
               break;
            case 66:
               var10000 = 83;
               break;
            case 67:
               var10000 = 28;
               break;
            case 68:
               var10000 = 75;
               break;
            case 69:
               var10000 = 96;
               break;
            case 70:
               var10000 = 177;
               break;
            case 71:
               var10000 = 84;
               break;
            case 72:
               var10000 = 190;
               break;
            case 73:
               var10000 = 144;
               break;
            case 74:
               var10000 = 107;
               break;
            case 75:
               var10000 = 204;
               break;
            case 76:
               var10000 = 112;
               break;
            case 77:
               var10000 = 238;
               break;
            case 78:
               var10000 = 2;
               break;
            case 79:
               var10000 = 64;
               break;
            case 80:
               var10000 = 14;
               break;
            case 81:
               var10000 = 71;
               break;
            case 82:
               var10000 = 1;
               break;
            case 83:
               var10000 = 202;
               break;
            case 84:
               var10000 = 13;
               break;
            case 85:
               var10000 = 250;
               break;
            case 86:
               var10000 = 225;
               break;
            case 87:
               var10000 = 145;
               break;
            case 88:
               var10000 = 38;
               break;
            case 89:
               var10000 = 24;
               break;
            case 90:
               var10000 = 124;
               break;
            case 91:
               var10000 = 188;
               break;
            case 92:
               var10000 = 89;
               break;
            case 93:
               var10000 = 249;
               break;
            case 94:
               var10000 = 154;
               break;
            case 95:
               var10000 = 184;
               break;
            case 96:
               var10000 = 171;
               break;
            case 97:
               var10000 = 55;
               break;
            case 98:
               var10000 = 20;
               break;
            case 99:
               var10000 = 70;
               break;
            case 100:
               var10000 = 39;
               break;
            case 101:
               var10000 = 132;
               break;
            case 102:
               var10000 = 116;
               break;
            case 103:
               var10000 = 206;
               break;
            case 104:
               var10000 = 26;
               break;
            case 105:
               var10000 = 61;
               break;
            case 106:
               var10000 = 74;
               break;
            case 107:
               var10000 = 119;
               break;
            case 108:
               var10000 = 209;
               break;
            case 109:
               var10000 = 48;
               break;
            case 110:
               var10000 = 218;
               break;
            case 111:
               var10000 = 104;
               break;
            case 112:
               var10000 = 221;
               break;
            case 113:
               var10000 = 86;
               break;
            case 114:
               var10000 = 103;
               break;
            case 115:
               var10000 = 201;
               break;
            case 116:
               var10000 = 52;
               break;
            case 117:
               var10000 = 251;
               break;
            case 118:
               var10000 = 155;
               break;
            case 119:
               var10000 = 192;
               break;
            case 120:
               var10000 = 164;
               break;
            case 121:
               var10000 = 157;
               break;
            case 122:
               var10000 = 79;
               break;
            case 123:
               var10000 = 35;
               break;
            case 124:
               var10000 = 160;
               break;
            case 125:
               var10000 = 106;
               break;
            case 126:
               var10000 = 69;
               break;
            case 127:
               var10000 = 208;
               break;
            case 128:
               var10000 = 6;
               break;
            case 129:
               var10000 = 54;
               break;
            case 130:
               var10000 = 163;
               break;
            case 131:
               var10000 = 130;
               break;
            case 132:
               var10000 = 217;
               break;
            case 133:
               var10000 = 211;
               break;
            case 134:
               var10000 = 150;
               break;
            case 135:
               var10000 = 7;
               break;
            case 136:
               var10000 = 219;
               break;
            case 137:
               var10000 = 173;
               break;
            case 138:
               var10000 = 156;
               break;
            case 139:
               var10000 = 248;
               break;
            case 140:
               var10000 = 243;
               break;
            case 141:
               var10000 = 92;
               break;
            case 142:
               var10000 = 181;
               break;
            case 143:
               var10000 = 215;
               break;
            case 144:
               var10000 = 94;
               break;
            case 145:
               var10000 = 187;
               break;
            case 146:
               var10000 = 198;
               break;
            case 147:
               var10000 = 229;
               break;
            case 148:
               var10000 = 22;
               break;
            case 149:
               var10000 = 133;
               break;
            case 150:
               var10000 = 93;
               break;
            case 151:
               var10000 = 138;
               break;
            case 152:
               var10000 = 244;
               break;
            case 153:
               var10000 = 10;
               break;
            case 154:
               var10000 = 143;
               break;
            case 155:
               var10000 = 118;
               break;
            case 156:
               var10000 = 85;
               break;
            case 157:
               var10000 = 81;
               break;
            case 158:
               var10000 = 120;
               break;
            case 159:
               var10000 = 4;
               break;
            case 160:
               var10000 = 33;
               break;
            case 161:
               var10000 = 240;
               break;
            case 162:
               var10000 = 67;
               break;
            case 163:
               var10000 = 53;
               break;
            case 164:
               var10000 = 36;
               break;
            case 165:
               var10000 = 224;
               break;
            case 166:
               var10000 = 237;
               break;
            case 167:
               var10000 = 19;
               break;
            case 168:
               var10000 = 195;
               break;
            case 169:
               var10000 = 129;
               break;
            case 170:
               var10000 = 239;
               break;
            case 171:
               var10000 = 210;
               break;
            case 172:
               var10000 = 172;
               break;
            case 173:
               var10000 = 253;
               break;
            case 174:
               var10000 = 148;
               break;
            case 175:
               var10000 = 254;
               break;
            case 176:
               var10000 = 125;
               break;
            case 177:
               var10000 = 207;
               break;
            case 178:
               var10000 = 139;
               break;
            case 179:
               var10000 = 98;
               break;
            case 180:
               var10000 = 141;
               break;
            case 181:
               var10000 = 117;
               break;
            case 182:
               var10000 = 182;
               break;
            case 183:
               var10000 = 66;
               break;
            case 184:
               var10000 = 169;
               break;
            case 185:
               var10000 = 170;
               break;
            case 186:
               var10000 = 233;
               break;
            case 187:
               var10000 = 95;
               break;
            case 188:
               var10000 = 185;
               break;
            case 189:
               var10000 = 46;
               break;
            case 190:
               var10000 = 80;
               break;
            case 191:
               var10000 = 109;
               break;
            case 192:
               var10000 = 108;
               break;
            case 193:
               var10000 = 76;
               break;
            case 194:
               var10000 = 193;
               break;
            case 195:
               var10000 = 147;
               break;
            case 196:
               var10000 = 49;
               break;
            case 197:
               var10000 = 34;
               break;
            case 198:
               var10000 = 232;
               break;
            case 199:
               var10000 = 101;
               break;
            case 200:
               var10000 = 140;
               break;
            case 201:
               var10000 = 0;
               break;
            case 202:
               var10000 = 78;
               break;
            case 203:
               var10000 = 121;
               break;
            case 204:
               var10000 = 153;
               break;
            case 205:
               var10000 = 214;
               break;
            case 206:
               var10000 = 27;
               break;
            case 207:
               var10000 = 58;
               break;
            case 208:
               var10000 = 23;
               break;
            case 209:
               var10000 = 8;
               break;
            case 210:
               var10000 = 205;
               break;
            case 211:
               var10000 = 60;
               break;
            case 212:
               var10000 = 40;
               break;
            case 213:
               var10000 = 235;
               break;
            case 214:
               var10000 = 186;
               break;
            case 215:
               var10000 = 45;
               break;
            case 216:
               var10000 = 149;
               break;
            case 217:
               var10000 = 30;
               break;
            case 218:
               var10000 = 222;
               break;
            case 219:
               var10000 = 37;
               break;
            case 220:
               var10000 = 236;
               break;
            case 221:
               var10000 = 110;
               break;
            case 222:
               var10000 = 245;
               break;
            case 223:
               var10000 = 255;
               break;
            case 224:
               var10000 = 166;
               break;
            case 225:
               var10000 = 137;
               break;
            case 226:
               var10000 = 114;
               break;
            case 227:
               var10000 = 105;
               break;
            case 228:
               var10000 = 246;
               break;
            case 229:
               var10000 = 56;
               break;
            case 230:
               var10000 = 162;
               break;
            case 231:
               var10000 = 115;
               break;
            case 232:
               var10000 = 194;
               break;
            case 233:
               var10000 = 220;
               break;
            case 234:
               var10000 = 91;
               break;
            case 235:
               var10000 = 183;
               break;
            case 236:
               var10000 = 127;
               break;
            case 237:
               var10000 = 126;
               break;
            case 238:
               var10000 = 179;
               break;
            case 239:
               var10000 = 102;
               break;
            case 240:
               var10000 = 146;
               break;
            case 241:
               var10000 = 228;
               break;
            case 242:
               var10000 = 230;
               break;
            case 243:
               var10000 = 73;
               break;
            case 244:
               var10000 = 242;
               break;
            case 245:
               var10000 = 82;
               break;
            case 246:
               var10000 = 135;
               break;
            case 247:
               var10000 = 216;
               break;
            case 248:
               var10000 = 29;
               break;
            case 249:
               var10000 = 159;
               break;
            case 250:
               var10000 = 213;
               break;
            case 251:
               var10000 = 11;
               break;
            case 252:
               var10000 = 200;
               break;
            case 253:
               var10000 = 175;
               break;
            case 254:
               var10000 = 63;
               break;
            default:
               var10000 = 16;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\"vãÊ\"\u008aÞ\u0007ÿÃX|U\\0\u0014Q¿*\u001fñò·+Ð\u0090s¨ÓE'L\u000b4\u00942";
      int var4 = "\"vãÊ\"\u008aÞ\u0007ÿÃX|U\\0\u0014Q¿*\u001fñò·+Ð\u0090s¨ÓE'L\u000b4\u00942".length();
      char var1 = 7;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 71;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 71;
               var10006 = var6;
            } else {
               var13 = 71;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 71;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 46;
                     break;
                  case 1:
                     var29 = 18;
                     break;
                  case 2:
                     var29 = 101;
                     break;
                  case 3:
                     var29 = 40;
                     break;
                  case 4:
                     var29 = 124;
                     break;
                  case 5:
                     var29 = 50;
                     break;
                  default:
                     var29 = 63;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[3];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}





