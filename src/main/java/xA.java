import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class xA {
   protected String m;
   private static com.ky_4[] M;

   public void W() {
      L2.B(this);
   }

   public abstract void N();

   public abstract void Y();

   public abstract void z();

   public abstract void c(int var1) throws mw_2;

   public abstract void V(int var1) throws mw_2;

   public abstract void b(int var1) throws mw_2;

   public abstract int S();

   public abstract InputStream S() throws IOException;

   public String F() {
      return this.m;
   }

   public abstract int h();

   public abstract OutputStream E() throws IOException;

   public abstract int q();

   public abstract int L();

   public abstract int E();

   public abstract boolean l();

   public abstract boolean x();

   public abstract boolean V();

   public abstract void A(int var1);

   public abstract void Z(int var1);

   public static void E(com.ky_4[] var0) {
      M = var0;
   }

   public static com.ky_4[] P() {
      return M;
   }

   static {
      if (P() == null) {
         E(new com.ky_4[5]);
      }
   }
}





