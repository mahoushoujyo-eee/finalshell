package com;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class dL_3 {
   private final Class s;
   private final Ph_2 Z;
   private final String z;

   public dL_3(Class var1, Ph_2 var2) {
      this.s = var1;
      this.Z = var2;
      this.z = var2.G();
   }

   public Class p() {
      return this.s;
   }

   public Method W() {
      return this.Z.Y;
   }

   public Field X() {
      return this.Z.w;
   }

   public String y() {
      return this.Z.I;
   }

   public String t() {
      return this.Z.N;
   }

   public Class w() {
      return this.Z.O;
   }

   public Type X$Type() {
      return this.Z.a;
   }

   public int y$int() {
      return this.Z.c;
   }

   public boolean U() {
      return this.Z.s;
   }

   public Annotation V(Class var1) {
      return this.Z.m(var1);
   }

   public String Y() {
      return this.z;
   }
}





