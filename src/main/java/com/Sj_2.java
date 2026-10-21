package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.List;

@XStreamAlias("DocumentPaneState")
public class Sj_2 implements Serializable {
   @XStreamAsAttribute
   private Boolean A;
   @XStreamAsAttribute
   private String D;
   @XStreamImplicit
   private List y;
   @XStreamAsAttribute
   private Integer B;
   @XStreamAsAttribute
   private Double b;
   private com.F5 e;

   public Sj_2() {
   }

   public Sj_2(String var1, List var2) {
      this.A = false;
      this.D = var1;
      this.y = var2;
   }

   public Sj_2(int var1, double var2, com.F5 var4) {
      this.A = true;
      this.B = var1;
      this.b = var2;
      this.e = var4;
   }

   public Boolean T() {
      String[] var1 = com.BX.B();
      Boolean var10000 = this.A;
      if (var1 == null) {
         if (this.A == null) {
            return false;
         }

         var10000 = this.A;
      }

      boolean var2 = var10000;
      if (var1 != null) {
         return var2;
      } else {
         return var2 ? true : false;
      }
   }

   public void K(Boolean var1) {
      this.A = var1;
   }

   public String e() {
      return this.D;
   }

   public void K(String var1) {
      this.D = var1;
   }

   public List n() {
      return this.y;
   }

   public void H(List var1) {
      this.y = var1;
   }

   public Integer Z() {
      return this.B;
   }

   public void Q(Integer var1) {
      this.B = var1;
   }

   public Double b() {
      return this.b;
   }

   public void u(Double var1) {
      this.b = var1;
   }

   public com.F5 d() {
      return this.e;
   }

   public void n(com.F5 var1) {
      this.e = var1;
   }
}





