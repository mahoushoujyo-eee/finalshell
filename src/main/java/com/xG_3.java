package com;

import java.util.List;
import javax.swing.JComponent;

public class xG_3 extends x6_2 {
   protected com.Cc_2 k;

   public xG_3(String var1) {
      this.k = (com.Cc_2)PM.s(this.getClass().getResource(var1));
   }

   public xG_3(com.Cc_2 var1) {
      this.k = var1;
   }

   public com.Cc_2 C() {
      return this.k;
   }

   @Override
   public String z() {
      return this.k.a();
   }

   @Override
   public String P() {
      return this.k.H();
   }

   @Override
   public String O() {
      return this.k.L();
   }

   @Override
   public String A() {
      return this.k.X();
   }

   @Override
   public List f() {
      return this.k.B();
   }

   @Override
   public String M() {
      return this.k.O();
   }

   @Override
   public com.BN G(JComponent var1, com.KH var2) {
      return this.k.t(var1, var2);
   }
}





