package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

@XStreamAlias("PluginLibrary")
public class Su2 implements Serializable {
   public String a;
   public String M;
   public String A;
   public String O;
   public String F;

   public Su2() {
   }

   public Su2(String var1, String var2, String var3, String var4, String var5) {
      this.a = var1;
      this.M = var2;
      this.A = var3;
      this.O = var4;
      this.F = var5;
   }

   public String I() {
      return this.a;
   }

   public void G(String var1) {
      this.a = var1;
   }

   public String x() {
      return this.M;
   }

   public void q(String var1) {
      this.M = var1;
   }

   public String y() {
      return this.A;
   }

   public void a(String var1) {
      this.A = var1;
   }

   public String b() {
      return this.O;
   }

   public void m(String var1) {
      this.O = var1;
   }

   public String m() {
      return this.F;
   }

   public void e(String var1) {
      this.F = var1;
   }

   @Override
   public String toString() {
      return this.M + " " + this.O;
   }
}





