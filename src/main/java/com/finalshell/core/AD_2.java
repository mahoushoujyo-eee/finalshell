package com.finalshell.core;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AD_2 {
   public final ZT f;
   public final Predicate o;
   public Supplier s = AD_2::lambda$new$0;
   public Integer m = null;
   public boolean T = false;
   public boolean Y = false;

   public AD_2(@NotNull ZT var1, @NotNull Predicate var2) {
      this.f = var1;
      this.o = var2;
   }

   public AD_2(@NotNull ZT var1) {
      this(var1, AD_2::lambda$new$1);
   }

   @NotNull
   public ZT l() {
      return this.f;
   }

   @Nullable
   public Integer D() {
      return this.m;
   }

   public boolean v(KeyEvent var1) {
      int var10000 = ConnectionProperty.M$int();
      Iterator var3 = this.f.j().iterator();
      int var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            KeyStroke var4 = (KeyStroke)var3.next();
            var5 = var4.equals(KeyStroke.getKeyStrokeForEvent(var1));
            if (var2 == 0) {
               break;
            }

            if (var2 == 0) {
               return var5;
            }

            if (var5) {
               return true;
            }

            if (var2 != 0) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public boolean X(@Nullable KeyEvent var1) {
      return (Boolean)this.s.get();
   }

   public boolean k(@Nullable KeyEvent var1) {
      return this.o.test(var1);
   }

   public static boolean G(@NotNull CS3_2 var0, @NotNull KeyEvent var1) {
      int var10000 = ConnectionProperty.M$int();
      Iterator var3 = var0.n().iterator();
      int var2 = var10000;

      while (true) {
         label52:
         if (var3.hasNext()) {
            AD_2 var4 = (AD_2)var3.next();
            var5 = var4.v(var1);
            if (var2 == 0) {
               break;
            }

            if (var2 != 0) {
               if (!var5) {
                  if (var2 != 0) {
                     continue;
                  }
                  break label52;
               }

               var5 = var4.X(var1);
            }

            if (var2 != 0) {
               if (!var5) {
                  return false;
               }

               var5 = var4.k(var1);
            }

            if (var2 == 0) {
               return var5;
            }

            if (var5) {
               return true;
            }

            return false;
         }

         CS3_2 var6 = var0.c();
         if (var2 == 0) {
            return G(var6, var1);
         }

         if (var6 != null) {
            return G(var0.c(), var1);
         }

         var5 = false;
         break;
      }

      return var5;
   }

   @NotNull
   public String X() {
      return this.f.s();
   }

   public AD_2 u(Integer var1) {
      this.m = var1;
      return this;
   }

   public AD_2 c(@NotNull Supplier var1) {
      this.s = var1;
      return this;
   }

   public AD_2 P(boolean var1) {
      this.T = var1;
      return this;
   }

   @NotNull
   public JMenuItem N() {
      int var10000 = ConnectionProperty.M$int();
      JMenuItem var2 = new JMenuItem(this.f.s());
      int var1 = var10000;
      AD_2 var3 = this;
      if (var1 != 0) {
         if (this.m != null) {
            var2.setMnemonic(this.m);
         }

         var3 = this;
      }

      if (!var3.f.j().isEmpty()) {
         var2.setAccelerator((KeyStroke)this.f.j().get(0));
      }

      var2.addActionListener(this::lambda$toMenuItem$2);
      var2.setEnabled(this.X(null));
      return var2;
   }

   public boolean q() {
      return this.T;
   }

   public boolean V() {
      return this.Y;
   }

   public AD_2 I(boolean var1) {
      this.Y = var1;
      return this;
   }

   @Override
   public String toString() {
      return "'" + this.f.s() + "'";
   }

   public static void m(@NotNull JPopupMenu var0, @NotNull CS3_2 var1) {
      r(var1, new H_(var0));
   }

   public static void r(@NotNull CS3_2 var0, @NotNull Ob2_2 var1) {
      int var10000 = ConnectionProperty.y();
      List var3 = k(var0);
      boolean var4 = true;
      int var2 = var10000;
      Iterator var5 = var3.iterator();

      label63:
      while (true) {
         boolean var10 = var5.hasNext();

         label61:
         while (var10) {
            CS3_2 var6 = (CS3_2)var5.next();
            var10 = var4;
            if (var2 == 0) {
               var10 = !var4;
            }

            boolean var7 = var10;
            var4 = true;

            for (AD_2 var9 : var6.n()) {
               var10 = var9.V();
               if (var2 != 0) {
                  continue label61;
               }

               if (var2 == 0) {
                  if (var10) {
                     continue;
                  }

                  var10 = var7;
               }

               label55: {
                  label54: {
                     if (var2 == 0) {
                        if (!var10) {
                           var10 = var9.q();
                           if (var2 != 0) {
                              break label55;
                           }

                           if (!var10) {
                              break label54;
                           }
                        }

                        var1.M();
                        var10 = false;
                     }

                     var7 = var10;
                  }

                  var1.O(var9);
                  var10 = false;
               }

               var4 = var10;
               if (var2 != 0) {
                  break;
               }
            }

            if (var2 != 0) {
               return;
            }
            continue label63;
         }

         return;
      }
   }

   @NotNull
   public static List k(@NotNull CS3_2 var0) {
      int var10000 = ConnectionProperty.y();
      ArrayList var2 = new ArrayList();
      CS3_2 var3 = var0;
      int var1 = var10000;

      while (true) {
         if (var3 != null) {
      int var4;
            var4 = var2;
            if (var1 != 0) {
               break;
            }

            var2.add(0, var3);
            var3 = var3.c();
            if (var1 == 0) {
      int var4;
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public void lambda$toMenuItem$2(ActionEvent var1) {
      this.k(null);
   }

   public static boolean lambda$new$1(KeyEvent var0) {
      return true;
   }

   public static Boolean lambda$new$0() {
      return true;
   }

   static JMenuItem z(AD_2 var0) {
      return var0.N();
   }
}






