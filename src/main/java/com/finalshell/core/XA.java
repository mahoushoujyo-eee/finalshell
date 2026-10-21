package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class XA {
   public String m;
   public static Ky4[] M;

   public void W() {
      L2.B(this);
   }

   public abstract void N();

   public abstract void Y();

   public abstract void z();

   public abstract void c(int var1) throws Mw2;

   public abstract void V(int var1) throws Mw2;

   public abstract void b(int var1) throws Mw2;

   public abstract int S$int();

   public abstract InputStream S$InputStream() throws IOException;

   public String F() {
      return this.m;
   }

   public abstract int h();

   public abstract OutputStream E$OutputStream() throws IOException;

   public abstract int q();

   public abstract int L();

   public abstract int E$int();

   public abstract boolean l();

   public abstract boolean x();

   public abstract boolean V();

   public abstract void A(int var1);

   public abstract void Z(int var1);

   public static void E(Ky4[] var0) {
      M = var0;
   }

   public static Ky4[] P() {
      return M;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (P() == null) {
         E(new Ky4[5]);
      }
   }
}





