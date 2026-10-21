package com.finalshell.core;

import com.finalshell.ui.panel.Ks4;
import java.util.List;
import javax.swing.JComponent;

public class I1 extends IB {
   public Bn2 O;

   public I1(AS var1) {
      super(var1);
   }

   protected void s(Ks4 var1) {
      this.O = new C92_2(this);
      var1.j(this.O);
   }

   protected void P(Ks4 var1) {
      var1.N(this.O);
      this.O = null;
   }

   protected void K(Ks4 var1) {
      List var6;
      label23: {
         label25: {
            String[] var10000 = IH.M();
            String var3 = (String)this.o();
            String[] var2 = var10000;
            String var5 = var3;
            if (var2 != null) {
               if (var3 == null) {
                  break label25;
               }

               var5 = var3.trim();
            }

            String var10001 = "";
            if (var2 != null) {
               if (var5.equals("")) {
                  break label25;
               }

               var5 = var3;
               var10001 = ",";
            }

            var6 = NE.x(var5, var10001);
            break label23;
         }

         var6 = null;
      }

      List var4 = var6;
      var1.h(var4);
   }

   protected void G(Ks4 var1) {
      String[] var10000 = IH.M();
      String var3 = NE.I(var1.P(), ",");
      String[] var2 = var10000;
      String var10001 = var3;
      if (var2 != null) {
         var10001 = var3 != null ? var3 : "";
      }

      this.J(var10001);
   }

   @Override
   protected void T(JComponent var1) {
      this.G((Ks4)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.K((Ks4)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.P((Ks4)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.s((Ks4)var1);
   }
}





