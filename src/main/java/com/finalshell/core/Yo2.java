package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Yo2 extends Fv2_2{
   protected final InputStream t;
   protected final OutputStream A;
   protected final InputStreamReader R;
   protected final Charset k;
   public final Process g;
   @Nullable
   public final List l;

   public Yo2(@NotNull Process var1, @NotNull Charset var2) {
      this(var1, var2, null);
   }

   public Yo2(@NotNull Process var1, @NotNull Charset var2, @Nullable List var3) {
      this.A = var1.getOutputStream();
      this.k = var2;
      this.t = var1.getInputStream();
      this.R = new InputStreamReader(this.t, var2);
      this.g = var1;
      this.l = var3;
   }

   @NotNull
   public Process y() {
      return this.g;
   }

   @Override
   public abstract String b();

   @Nullable
   public List P() {
      String var1 = Dx4.g();
      List var10000 = this.l;
      if (var1 == null) {
         var10000 = this.l != null ? Collections.unmodifiableList(this.l) : null;
      }

      return var10000;
   }

   @Override
   public int x(char[] var1, int var2, int var3) throws IOException {
      return this.R.read(var1, var2, var3);
   }

   @Override
   public void q(byte[] var1) throws IOException {
      this.A.write(var1);
      this.A.flush();
   }

   @Override
   public boolean K() {
      return this.g.isAlive();
   }

   @Override
   public void E(String var1) throws IOException {
      this.q(var1.getBytes(this.k));
   }

   @Override
   public void a() {
      this.g.destroy();

      try {
         this.A.close();
      } catch (IOException var3) {
      }

      try {
         this.t.close();
      } catch (IOException var2) {
      }
   }

   @Override
   public int f() throws InterruptedException {
      return this.g.waitFor();
   }

   @Override
   public boolean A() throws IOException {
      return this.R.ready();
   }
}





