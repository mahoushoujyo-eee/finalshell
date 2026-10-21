package com.finalshell.core;

import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;

public class EY extends TransferHandler {
   protected boolean o;
   protected int R = 1;
   protected boolean O;
   public static int H;

   public EY() {
      this(false, true);
   }

   public EY(boolean var1, boolean var2) {
      this.i(var1);
      this.e(var2);
   }

   public boolean d() {
      return this.o;
   }

   public void i(boolean var1) {
      this.o = var1;
   }

   public int E() {
      return this.R;
   }

   public void T(int var1) {
      this.R = var1;
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return this.E();
   }

   @Override
   protected Transferable createTransferable(JComponent var1) {
      int var2 = P$int();
      EY var10000 = this;
      if (var2 == 0) {
         if (!this.d()) {
            return null;
         }

         var10000 = this;
      }

      List var3 = var10000.S();
      List var4 = var3;
      if (var2 == 0) {
         if (var3 == null) {
            return null;
         }

         var4 = var3;
      }

      return var4.size() > 0 ? new C_4_2(var3) : null;
   }

   public List S() {
      File var1 = this.P$File();
      return var1 != null ? Arrays.asList(var1) : null;
   }

   public File P$File() {
      return null;
   }

   public boolean A() {
      return this.O;
   }

   public void e(boolean var1) {
      this.O = var1;
   }

   @Override
   public boolean canImport(TransferSupport var1) {
      return this.A();
   }

   @Override
   public boolean importData(TransferSupport var1) {
      int var2 = G();
      boolean var10000 = var1.isDrop();
      if (var2 != 0) {
         if (!var10000) {
            return false;
         }

         var10000 = this.Q(var1.getTransferable());
      }

      return var2 == 0 ? var10000 : var10000;
   }

   public boolean Q(Transferable var1) {
      int var2 = G();
      boolean var10000 = this.A();
      if (var2 != 0) {
         if (!var10000) {
            return false;
         }

         var10000 = this.d(PG.s(var1));
      }

      return var2 == 0 ? var10000 : var10000;
   }

   public boolean d(List var1) {
      return true;
   }

   public static void U(int var0) {
      H = var0;
   }

   public static int G() {
      return H;
   }

   public static int P$int() {
      int var0 = G();
      return var0 == 0 ? 9 : 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (P$int() != 0) {
         U(40);
      }
   }
}





