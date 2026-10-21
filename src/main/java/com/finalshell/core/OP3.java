package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.util.List;

public class OP3 extends OR3 {
   final CB3 m;
   final boolean R;
   final Zn2 B;

   OP3(Zn2 var1, CB3 var2, boolean var3) {
      this.B = var1;
      this.m = var2;
      this.R = var3;
   }

   @Override
   public void r(CB3 var1, List var2) {
      String[] var3 = CB3.C$arrString();
      OP3 var10000 = this;
      if (var3 != null) {
         if (!this.m.H().equals(var1.H())) {
            return;
         }

         this.B.B(this);
         var10000 = this;
      }

      var10000.B.v(this.m, this.R);
   }

   @Override
   public void N(CB3 var1, Throwable var2) {
      String[] var3 = CB3.C$arrString();
      OP3 var10000 = this;
      if (var3 != null) {
         if (!this.m.H().equals(var1.H())) {
            return;
         }

         var10000 = this;
      }

      var10000.B.B(this);
   }
}





