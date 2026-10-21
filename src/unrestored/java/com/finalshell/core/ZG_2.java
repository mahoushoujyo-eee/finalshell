package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import javax.swing.KeyStroke;

public class ZG_2 {
   public int m;
   public int X;
   public int S;
   public String B;
   public KeyStroke N;
   public static int[] e;

   public ZG_2(int var1, String var2, int var3, int var4) {
      Ref.s(475095538131051066L, this, var1);
      long var6 = 485068014524919453L;
      Ref.s(485068014524919453L, var2, var6);
      Ref.s(280093782285122906L, this, var3);
      Ref.s(475485638447637979L, this, var4);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 374767772410438758L;
      Object[] var7 = var10002;
      Ref.h(374767772410438758L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw new RuntimeException(var9.getTargetException());
      }
   }

   public void F() {
      KeyStroke var10001 = KeyStroke.getKeyStroke(
         ((Integer)Ref.g(475485638447637979L, this)).intValue(), ((Integer)Ref.g(280093782285122906L, this)).intValue()
      );
      long var2 = 556570767736054289L;
      KeyStroke var1 = var10001;
      Ref.s(556570767736054289L, var1, var2);
   }

   public int m() {
      return ((Integer)Ref.g(280093782285122906L, this)).intValue();
   }

   public void A(int var1) {
      Ref.s(280093782285122906L, this, var1);
   }

   public int p() {
      return ((Integer)Ref.g(475485638447637979L, this)).intValue();
   }

   public void s(int var1) {
      Ref.s(475485638447637979L, this, var1);
   }

   public int K() {
      return ((Integer)Ref.g(475095538131051066L, this)).intValue();
   }

   public void Y(int var1) {
      Ref.s(475095538131051066L, this, var1);
   }

   public String y() {
      Object var1 = 485068014524919453L;
      return (String)Ref.g(485068014524919453L, var1);
   }

   public void C(String var1) {
      long var3 = 485068014524919453L;
      Ref.s(485068014524919453L, var1, var3);
   }

   public KeyStroke f() {
      Object var1 = 556570767736054289L;
      return (KeyStroke)Ref.g(556570767736054289L, var1);
   }

   public void h(KeyStroke var1) {
      long var3 = 556570767736054289L;
      Ref.s(556570767736054289L, var1, var3);
   }

   public static void p(int[] var0) {
      e = var0;
   }

   public static int[] Z() {
      return e;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (Z() != null) {
         p(new int[3]);
      }
   }
}





