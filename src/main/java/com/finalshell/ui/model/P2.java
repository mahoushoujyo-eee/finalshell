package com.finalshell.ui.model;

import com.finalshell.core.RT3;
import com.finalshell.core.X4_2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@XStreamAlias("TreeState")
@XStreamConverter(X4_2.class)
public class P2 implements Serializable, Cloneable {
   protected Map i = new LinkedHashMap();

   public P2() {
   }

   public P2(Map var1) {
      String var10000 = com.finalshell.ui.panel.S.d();
      super();
      String var2 = var10000;
      P2 var3 = this;
      Object var10001 = new LinkedHashMap();
      if (var2 != null) {
         this.i = (Map)var10001;
         if (var1 == null) {
            return;
         }

         var3 = this;
         var10001 = var1;
      }

      var3.E((Map)var10001);
   }

   public Map c() {
      return this.i;
   }

   public void E(Map var1) {
      this.i = var1;
   }

   public void P(String var1, boolean var2, boolean var3) {
      this.i.put(var1, new B2_2(var2, var3));
   }

   public boolean y(String var1) {
      String var10000 = com.finalshell.ui.panel.S.d();
      B2_2 var3 = (B2_2)this.i.get(var1);
      String var2 = var10000;
      B2_2 var4 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return false;
         }

         var4 = var3;
      }

      boolean var5 = var4.P();
      return var2 == null ? var5 : var5;
   }

   public boolean D(String var1) {
      String var10000 = com.finalshell.ui.panel.S.d();
      B2_2 var3 = (B2_2)this.i.get(var1);
      String var2 = var10000;
      B2_2 var4 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return false;
         }

         var4 = var3;
      }

      boolean var5 = var4.a();
      return var2 == null ? var5 : var5;
   }

   public P2 G() {
      return new P2(RT3.r((LinkedHashMap)this.i));
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.G();
   }
}





