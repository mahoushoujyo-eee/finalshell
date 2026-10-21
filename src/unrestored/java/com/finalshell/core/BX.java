package com.finalshell.core;

import com.finalshell.ui.listener.P02;
import com.finalshell.ui.model.Ij4;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public final class BX implements El2, SwingConstants {
   public com.finalshell.ui.panel.QL d;
   public final com.finalshell.ui.panel.Hd2 B;
   public final C42 W;
   public List Z;
   public static String[] T;
   public static String a;

   public BX(com.finalshell.ui.panel.QL var1) {
      B$arrString();
      this.Z = new ArrayList();
      this.d = var1;
      this.B = new com.finalshell.ui.panel.Hd2(Ij4.attached);
      this.B.putClientProperty(a, this);
      this.v(var1);
      W62.H(this.B, this.B, GR.s, new Lm2(this));
      Wf4.V(this);
      this.B.addChangeListener(new P02(this));
      this.B.addMouseListener(new com.finalshell.ui.listener.HD(this));
      this.W = new C02_2(this, true);
      ON.b(this.B, this.W);
      if (Ky4.F$arrString() != null) {
         q(new String[4]);
      }
   }

   public void Z() {
      String[] var10000;
      var10000 = B$arrString();
      com.finalshell.ui.panel.QL var2 = this.z$QL();
      String[] var1 = var10000;
      com.finalshell.ui.panel.QL var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.u();
   }

   public void v(com.finalshell.ui.panel.QL var1) {
      String[] var10000;
      var10000 = B$arrString();
      OR var3 = var1.G$OR();
      String[] var2 = var10000;
      OR var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var4 = var3;
      }

      var4.j(this.B);
   }

   @Override
   public Component u() {
      return this.D();
   }

   @Override
   public BX F() {
      return this;
   }

   public com.finalshell.ui.panel.QL z$QL() {
      return this.d;
   }

   public void U(com.finalshell.ui.panel.QL var1) {
      this.d = var1;
      this.v(var1);
      this.p();
   }

   public com.finalshell.ui.panel.Hd2 D() {
      return this.B;
   }

   public List a() {
      return this.Z;
   }

   public List N() {
      String[] var10000;
      ArrayList var5;
      var10000 = B$arrString();
      ArrayList var2 = new ArrayList(this.Z.size());
      Iterator var3 = this.Z.iterator();
      String[] var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            At2 var4 = (At2)var3.next();
            var5 = var2;
            if (var1 != null) {
               break;
            }

            var2.add(var4.B());
            if (var1 == null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public int o() {
      return this.Z.size();
   }

   public boolean T(At2 var1) {
      return this.p(var1.B());
   }

   public boolean p(String var1) {
      String[] var10000;
      boolean var5;
      var10000 = B$arrString();
      Iterator var3 = this.Z.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            At2 var4 = (At2)var3.next();
            var5 = var4.B().equals(var1);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            if (var2 == null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   public void O(At2 var1) {
      this.J(var1, -1);
   }

   public void J(At2 var1, int var2) {
      String[] var3 = B$arrString();
      int var10000 = var2;
      if (var3 == null) {
         var10000 = var2 != -1 ? var2 : this.B.getTabCount();
      }

      int var4 = var10000;
      this.Z.add(var4, var1);
      this.B.insertTab("", var1.I(), var1.c(), null, var4);
      this.B.setBackgroundAt(var4, var1.d());
      this.B.setTabComponentAt(var4, this.q$JComponent(var1));
      var1.f(new P32(this));
   }

   public JComponent q$JComponent(At2 var1) {
      return this.z$QL().D().b(this, var1);
   }

   public void p() {
      String[] var10000;
      var10000 = B$arrString();
      Iterator var2 = this.a().iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         At2 var3 = (At2)var2.next();
         this.X(var3);
         if (var1 != null) {
            break;
         }
      }
   }

   public void X(At2 var1) {
      this.D().setTabComponentAt(this.K(var1), this.q$JComponent(var1));
   }

   public void I(At2 var1) {
      this.D().setBackgroundAt(this.K(var1), var1.d());
   }

   public void r(At2 var1) {
      this.D().setComponentAt(this.K(var1), var1.c());
   }

   public void u$void(At2 var1) {
      this.O(var1);
      this.z$QL().w(var1, this, this.K(var1));
   }

   public At2 x(int var1) {
      return (At2)this.Z.get(var1);
   }

   public At2 H(String var1) {
      String[] var10000;
      At2 var5;
      var10000 = B$arrString();
      Iterator var3 = this.Z.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            At2 var4 = (At2)var3.next();
            var5 = var4;
            if (var2 != null) {
               break;
            }

            if (var4.B().equals(var1)) {
               var5 = var4;
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         return null;
      }

      return var5;
   }

   public At2 r() {
      int var1 = this.B.getSelectedIndex();
      return var1 != -1 ? (At2)this.Z.get(var1) : null;
   }

   public int M() {
      return this.B.getSelectedIndex();
   }

   public void d(String var1) {
      this.V(this.m(var1));
   }

   public void q$void(At2 var1) {
      this.V(this.K(var1));
   }

   public void V(int var1) {
      int var10000;
      com.finalshell.ui.panel.Hd2 var3;
      label32: {
         String[] var2 = B$arrString();
         var10000 = 0;
         label28:
         if (var2 == null) {
            if (0 <= var1) {
               var10000 = var1;
               if (var2 != null) {
                  break label28;
               }

               if (var1 < this.B.getTabCount()) {
                  this.B.setSelectedIndex(var1);
                  if (var2 == null) {
                     return;
                  }
               }
            }

            var3 = this.B;
            if (var2 != null) {
               break label32;
            }

            var10000 = this.B.getTabCount();
         }

         if (var10000 <= 0) {
            return;
         }

         var3 = this.B;
      }

      var3.setSelectedIndex(0);
   }

   public void B$void() {
      String[] var10000;
      var10000 = B$arrString();
      int var2 = this.o();
      String[] var1 = var10000;
      int var4 = var2;
      int var10001 = 1;
      if (var1 == null) {
         if (var2 <= 1) {
            return;
         }

         var4 = this.M();
         var10001 = 1;
      }

      label18: {
         int var3 = var4 - var10001;
         var10001 = var3;
         byte var10002 = -1;
         if (var1 == null) {
            if (var3 != -1) {
               var10001 = var3;
               break label18;
            }

            var10001 = var2;
            var10002 = 1;
         }

         var10001 -= var10002;
      }

      this.V(var10001);
   }

   public void U() {
      String[] var10000;
      var10000 = B$arrString();
      int var2 = this.o();
      String[] var1 = var10000;
      int var4 = var2;
      int var10001 = 1;
      if (var1 == null) {
         if (var2 <= 1) {
            return;
         }

         var4 = this.M();
         var10001 = 1;
      }

      int var3 = var4 + var10001;
      var10001 = var3;
      if (var1 == null) {
         var10001 = var3 == var2 ? 0 : var3;
      }

      this.V(var10001);
   }

   public int m(String var1) {
      return this.K(this.H(var1));
   }

   public int K(At2 var1) {
      return this.Z.indexOf(var1);
   }

   public boolean a(int var1) {
      return this.x(this.x(var1));
   }

   public boolean A(String var1) {
      return this.x(this.H(var1));
   }

   public boolean x(At2 var1) {
      String[] var2 = B$arrString();
      if (var1 != null) {
         int var3 = this.K(var1);
         if (var2 != null) {
            return var3 != 0;
         }

         if (var3 != -1) {
            var1.m(this.d(var1));
            this.B.remove(var3);
            this.Z.remove(var1);
            return true;
         }
      }

      return 0 != 0;
   }

   public K__2 d(At2 var1) {
      String[] var10000;
      var10000 = B$arrString();
      List var3 = var1.U();
      String[] var2 = var10000;

      for (K__2 var5 : var3) {
         label21: {
            K__2 var7 = var5;
            if (var2 == null) {
               if (!(var5 instanceof P32)) {
                  break label21;
               }

               var7 = var5;
            }

            BX var6 = ((P32)var7).m();
            if (var6 == this) {
               return var5;
            }
         }

         if (var2 != null) {
            break;
         }
      }

      return null;
   }

   public void J() {
      String[] var10000;
      var10000 = B$arrString();
      Iterator var2 = AL_2.J((Collection)this.Z).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         At2 var3 = (At2)var2.next();
         this.u$boolean(var3);
         if (var1 != null) {
            break;
         }
      }
   }

   public boolean Q(int var1) {
      return this.u$boolean(this.x(var1));
   }

   public boolean w(String var1) {
      return this.u$boolean(this.H(var1));
   }

   public boolean u$boolean(At2 var1) {
      boolean var10000;
      boolean var5;
      String[] var2 = B$arrString();
      if (var1 != null) {
         com.finalshell.ui.panel.QL var3 = this.z$QL();
         int var4 = this.K(var1);
         var10000 = var3.l(var1, this, var4);
         if (var2 == null) {
            if (var10000) {
               var5 = this.x(var1);
               this.e();
               var3.p(var1, this, var4);
               return var5;
            }

            var10000 = false;
         }

         return var10000;
      } else {
         return false;
      }
   }

   public void R(At2 var1) {
      String[] var10000;
      At2 var5;
      var10000 = B$arrString();
      Iterator var3 = AL_2.J((Collection)this.Z).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         label35: {
            At2 var4 = (At2)var3.next();
            var5 = var4;
            if (var2 == null) {
               if (var4 == var1) {
                  break label35;
               }

               var5 = var4;
            }

            if (var2 == null && var5.J()) {
               this.u$boolean(var4);
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void b() {
      At2 var1 = this.r();
      if (var1 != null) {
         this.u$boolean(var1);
      }
   }

   public void O() {
      String[] var10000;
      var10000 = B$arrString();
      com.finalshell.ui.panel.QL var2 = this.z$QL();
      String[] var1 = var10000;
      com.finalshell.ui.panel.QL var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.h(this);
   }

   public boolean Q() {
      return this.z$QL().G$BX() == this;
   }

   public void f(At2 var1, int var2) {
      String[] var10000;
      com.finalshell.ui.panel.QL var5;
      var10000 = B$arrString();
      com.finalshell.ui.panel.QL var4 = this.z$QL();
      String[] var3 = var10000;
      var5 = var4;
      if (var3 == null) {
         if (var4 == null) {
            return;
         }

         var5 = var4;
      }

      var5.e(this, var1, var2);
   }

   public void e() {
      BX var10000;
      String[] var1 = B$arrString();
      var10000 = this;
      if (var1 == null) {
         if (this.o() != 0) {
            return;
         }

         var10000 = this;
      }

      var10000.w();
   }

   public void d() {
      String[] var10000;
      var10000 = B$arrString();
      Container var2 = this.B.getParent();
      String[] var1 = var10000;
      Container var4 = var2;
      if (var1 == null) {
         if (!(var2 instanceof com.finalshell.ui.panel.O2)) {
            return;
         }

         var4 = var2;
      }

      DP_2 var3 = com.finalshell.ui.panel.QL.D((com.finalshell.ui.panel.O2)var4);
      var3.m();
   }

   public void Y() {
      String[] var10000;
      var10000 = B$arrString();
      Container var2 = this.B.getParent();
      String[] var1 = var10000;
      Container var4 = var2;
      if (var1 == null) {
         if (!(var2 instanceof com.finalshell.ui.panel.O2)) {
            return;
         }

         var4 = var2;
      }

      DP_2 var3 = com.finalshell.ui.panel.QL.D((com.finalshell.ui.panel.O2)var4);
      var3.u$void();
   }

   public void w() {
      String[] var10000;
      var10000 = B$arrString();
      com.finalshell.ui.panel.QL var2 = this.z$QL();
      String[] var1 = var10000;
      com.finalshell.ui.panel.QL var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.Z(this);
   }

   public void z$void() {
      String[] var10000;
      var10000 = B$arrString();
      com.finalshell.ui.panel.QL var2 = this.z$QL();
      String[] var1 = var10000;
      com.finalshell.ui.panel.QL var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.Z(var2.H());
   }

   public static void q(String[] var0) {
      T = var0;
   }

   public static String[] B$arrString() {
      return T;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (B$arrString() != null) {
         q(new String[5]);
      }

      char[] var10003 = "S\u0007@?\u0001/JCFS+\u0002/\nS\tW+".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 58;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      } else {
         var6 = 58;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 13;
               break;
            case 1:
               var23 = 82;
               break;
            case 2:
               var23 = 25;
               break;
            case 3:
               var23 = 112;
               break;
            case 4:
               var23 = 86;
               break;
            case 5:
               var23 = 112;
               break;
            default:
               var23 = 30;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





