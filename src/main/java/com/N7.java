package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;

@XStreamAlias("text")
@XStreamConverter(com.B_.class)
public final class N7 implements Serializable, Cloneable {
   private String F;
   private String k;

   public N7() {
      this("");
   }

   public N7(String var1) {
      this(var1, null);
   }

   public N7(String var1, String var2) {
      this.F = var1;
      this.k = var2;
   }

   public String c() {
      return this.F;
   }

   public void U(String var1) {
      this.F = var1;
   }

   public String m() {
      return this.k;
   }

   public void j(String var1) {
      this.k = var1;
   }

   public N7 w() {
      return new N7(this.F, this.k);
   }

   @Override
   public String toString() {
      return this.F;
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.w();
   }
}





