package com.finalshell.core;

import com.finalshell.ui.model.KH;
import java.util.List;
import javax.swing.JComponent;

public class XG3 extends X62 {
   protected com.finalshell.ui.model.Cc2 k;

   public XG3(String var1) {
      this.k = (com.finalshell.ui.model.Cc2)PM.s(this.getClass().getResource(var1));
   }

   public XG3(com.finalshell.ui.model.Cc2 var1) {
      this.k = var1;
   }

   public com.finalshell.ui.model.Cc2 C() {
      return this.k;
   }

   @Override
   public String z() {
      return this.k.a$String();
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
   public String A$String() {
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
   public com.finalshell.ui.model.BN G(JComponent var1, KH var2) {
      return this.k.t(var1, var2);
   }
}





