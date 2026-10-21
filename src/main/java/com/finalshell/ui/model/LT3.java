package com.finalshell.ui.model;

import com.finalshell.core.WV;
import com.finalshell.ui.panel.Ky4;
import java.io.Serializable;

public class LT3 implements Serializable {
   public String e;
   public String C;
   public boolean d;
   public boolean V;
   boolean T;

   public LT3() {
      int var10000 = WV.U();
      this.e = "";
      this.C = "";
      this.d = true;
      this.V = true;
      int var1 = var10000;
      this.T = true;
      if (var1 != 0) {
         Ky4.K(new String[3]);
      }
   }

   public String A() {
      return this.e;
   }

   public void k(String var1) {
      this.e = var1;
   }

   public String X() {
      return this.C;
   }

   public void Z(String var1) {
      this.C = var1;
   }

   public boolean Q() {
      return this.d;
   }

   public void q(boolean var1) {
      this.d = var1;
   }

   public boolean F() {
      return this.V;
   }

   public void W(boolean var1) {
      this.V = var1;
   }

   public boolean M() {
      return this.T;
   }

   public void L(boolean var1) {
      this.T = var1;
   }
}





