package com;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public final class BX implements El_2, SwingConstants {
   protected com.QL d;
   protected final Hd_2 B;
   protected final com.c4_2 W;
   protected List Z;
   private static String[] T;
   private static final String a;

   public BX(com.QL var1) {
      B();
      this.Z = new ArrayList();
      this.d = var1;
      this.B = new Hd_2(ij_4.attached);
      this.B.putClientProperty(a, this);
      this.v(var1);
      w6_2.H(this.B, this.B, GR.s, new com.Lm_2(this));
      wf_4.V(this);
      this.B.addChangeListener(new p0_2(this));
      this.B.addMouseListener(new HD(this));
      this.W = new com.c0_2(this, true);
      com.ON.b(this.B, this.W);
      if (com.ky_4.F() != null) {
         q(new String[4]);
      }
   }

   public void Z() {
      String[] var10000 = B();
      com.QL var2 = this.z();
      String[] var1 = var10000;
      com.QL var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.u();
   }

   protected void v(com.QL var1) {
      String[] var10000 = B();
      com.OR var3 = var1.G();
      String[] var2 = var10000;
      com.OR var4 = var3;
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
   public com.BX F() {
      return this;
   }

   public com.QL z() {
      return this.d;
   }

   public void U(com.QL var1) {
      this.d = var1;
      this.v(var1);
      this.p();
   }

   public Hd_2 D() {
      return this.B;
   }

   public List a() {
      return this.Z;
   }

   public List N() {
      String[] var10000 = B();
      ArrayList var2 = new ArrayList(this.Z.size());
      Iterator var3 = this.Z.iterator();
      String[] var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            com.at_2 var4 = (com.at_2)var3.next();
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

   public boolean T(com.at_2 var1) {
      return this.p(var1.B());
   }

   public boolean p(String var1) {
      String[] var10000 = B();
      Iterator var3 = this.Z.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            com.at_2 var4 = (com.at_2)var3.next();
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

   public void O(com.at_2 var1) {
      this.J(var1, -1);
   }

   public void J(com.at_2 var1, int var2) {
      String[] var3 = B();
      int var10000 = var2;
      if (var3 == null) {
         var10000 = var2 != -1 ? var2 : this.B.getTabCount();
      }

      int var4 = var10000;
      this.Z.add(var4, var1);
      this.B.insertTab("", var1.I(), var1.c(), null, var4);
      this.B.setBackgroundAt(var4, var1.d());
      this.B.setTabComponentAt(var4, this.q(var1));
      var1.f(new p3_2(this));
   }

   protected JComponent q(com.at_2 var1) {
      return this.z().D().b(this, var1);
   }

   public void p() {
      String[] var10000 = B();
      Iterator var2 = this.a().iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         com.at_2 var3 = (com.at_2)var2.next();
         this.X(var3);
         if (var1 != null) {
            break;
         }
      }
   }

   public void X(com.at_2 var1) {
      this.D().setTabComponentAt(this.K(var1), this.q(var1));
   }

   public void I(com.at_2 var1) {
      this.D().setBackgroundAt(this.K(var1), var1.d());
   }

   public void r(com.at_2 var1) {
      this.D().setComponentAt(this.K(var1), var1.c());
   }

   public void u(com.at_2 var1) {
      this.O(var1);
      this.z().w(var1, this, this.K(var1));
   }

   public com.at_2 x(int var1) {
      return (com.at_2)this.Z.get(var1);
   }

   public com.at_2 H(String var1) {
      String[] var10000 = B();
      Iterator var3 = this.Z.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            com.at_2 var4 = (com.at_2)var3.next();
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

   public com.at_2 r() {
      int var1 = this.B.getSelectedIndex();
      return var1 != -1 ? (com.at_2)this.Z.get(var1) : null;
   }

   public int M() {
      return this.B.getSelectedIndex();
   }

   public void d(String var1) {
      this.V(this.m(var1));
   }

   public void q$void(com.at_2 var1) {
      this.V(this.K(var1));
   }

   public void V(int var1) {
      Hd_2 var3;
      label32: {
         String[] var2 = B();
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

   public void B() {
      String[] var10000 = B();
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
      String[] var10000 = B();
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

   public int K(com.at_2 var1) {
      return this.Z.indexOf(var1);
   }

   public boolean a(int var1) {
      return this.x(this.x(var1));
   }

   public boolean A(String var1) {
      return this.x(this.H(var1));
   }

   public boolean x(com.at_2 var1) {
      String[] var2 = B();
      if (var1 != null) {
         int var3 = this.K(var1);
         if (var2 != null) {
            return (boolean)var3;
         }

         if (var3 != -1) {
            var1.m(this.d(var1));
            this.B.remove(var3);
            this.Z.remove(var1);
            return true;
         }
      }

      return (boolean)0;
   }

   protected com.k__2 d(com.at_2 var1) {
      String[] var10000 = B();
      List var3 = var1.U();
      String[] var2 = var10000;

      for (com.k__2 var5 : var3) {
         label21: {
            com.k__2 var7 = var5;
            if (var2 == null) {
               if (!(var5 instanceof p3_2)) {
                  break label21;
               }

               var7 = var5;
            }

            com.BX var6 = ((p3_2)var7).m();
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
      String[] var10000 = B();
      Iterator var2 = com.aL.J((Collection)this.Z).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         com.at_2 var3 = (com.at_2)var2.next();
         this.u(var3);
         if (var1 != null) {
            break;
         }
      }
   }

   public boolean Q(int var1) {
      return this.u(this.x(var1));
   }

   public boolean w(String var1) {
      return this.u(this.H(var1));
   }

   public boolean u$boolean(com.at_2 var1) {
      String[] var2 = B();
      if (var1 != null) {
         com.QL var3 = this.z();
         int var4 = this.K(var1);
         boolean var10000 = var3.l(var1, this, var4);
         if (var2 == null) {
            if (var10000) {
               boolean var5 = this.x(var1);
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

   public void R(com.at_2 var1) {
      String[] var10000 = B();
      Iterator var3 = com.aL.J((Collection)this.Z).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         label35: {
            com.at_2 var4 = (com.at_2)var3.next();
            com.at_2 var5 = var4;
            if (var2 == null) {
               if (var4 == var1) {
                  break label35;
               }

               var5 = var4;
            }

            if (var2 == null && var5.J()) {
               this.u(var4);
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void b() {
      com.at_2 var1 = this.r();
      if (var1 != null) {
         this.u(var1);
      }
   }

   public void O() {
      String[] var10000 = B();
      com.QL var2 = this.z();
      String[] var1 = var10000;
      com.QL var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.h(this);
   }

   public boolean Q() {
      return this.z().G() == this;
   }

   public void f(com.at_2 var1, int var2) {
      String[] var10000 = B();
      com.QL var4 = this.z();
      String[] var3 = var10000;
      com.QL var5 = var4;
      if (var3 == null) {
         if (var4 == null) {
            return;
         }

         var5 = var4;
      }

      var5.e(this, var1, var2);
   }

   public void e() {
      String[] var1 = B();
      com.BX var10000 = this;
      if (var1 == null) {
         if (this.o() != 0) {
            return;
         }

         var10000 = this;
      }

      var10000.w();
   }

   public void d() {
      String[] var10000 = B();
      Container var2 = this.B.getParent();
      String[] var1 = var10000;
      Container var4 = var2;
      if (var1 == null) {
         if (!(var2 instanceof com.U.O)) {
            return;
         }

         var4 = var2;
      }

      com.DP var3 = com.QL.D((com.U.O)var4);
      var3.m();
   }

   public void Y() {
      String[] var10000 = B();
      Container var2 = this.B.getParent();
      String[] var1 = var10000;
      Container var4 = var2;
      if (var1 == null) {
         if (!(var2 instanceof com.U.O)) {
            return;
         }

         var4 = var2;
      }

      com.DP var3 = com.QL.D((com.U.O)var4);
      var3.u();
   }

   public void w() {
      String[] var10000 = B();
      com.QL var2 = this.z();
      String[] var1 = var10000;
      com.QL var3 = var2;
      if (var1 == null) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.Z(this);
   }

   public void z$void() {
      String[] var10000 = B();
      com.QL var2 = this.z();
      String[] var1 = var10000;
      com.QL var3 = var2;
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

   public static String[] B$String() {
      return T;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (B() != null) {
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





