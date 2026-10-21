package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.Color;
import java.io.Serializable;

@XStreamAlias("GradientColorData")
public class PV implements Serializable, Cloneable {
   @XStreamAsAttribute
   private float B;
   @XStreamAsAttribute
   private Color v;

   public PV() {
      this.B = 0.0F;
      this.v = Color.WHITE;
   }

   public PV(float var1, Color var2) {
      this.B = var1;
      this.v = var2;
   }

   public Color N() {
      return this.v;
   }

   public void C(Color var1) {
      this.v = var1;
   }

   public float I() {
      return this.B;
   }

   public void P(float var1) {
      this.B = var1;
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = nx_4.R();
      Object var10000 = var1;
      if (var2 == 0) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      if (var2 == 0) {
         if (!(var10000 instanceof PV)) {
            return false;
         }

         var10000 = var1;
      }

      PV var3 = (PV)var10000;
      int var4 = Float.compare(this.I(), var3.I());
      if (var2 == 0) {
         if (var4 != 0) {
            return (boolean)0;
         }

         var4 = this.N().equals(var3.N());
      }

      if (var2 != 0) {
         return (boolean)var4;
      } else {
         return (boolean)(var4 != 0 ? 1 : 0);
      }
   }

   public PV H() {
      return new PV(this.B, com.FN.q(this.v));
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.H();
   }
}





