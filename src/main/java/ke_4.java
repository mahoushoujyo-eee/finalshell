import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public class ke_4 {
   private InputStream K;
   private OutputStream Z;
   boolean S = true;

   public ke_4(InputStream var1, OutputStream var2) {
      this.K = var1;
      this.Z = var2;
   }

   public void G(FY var1) throws IOException {
      Q8 var2 = new Q8(this, var1, this.K, this.Z);
      var2.o();
      this.Z.flush();
   }

   public void N(Map var1) throws IOException {
      DH var2 = new DH(this, var1, this.K, this.Z);
      var2.k();
      this.Z.flush();
   }

   public void g() {
      this.S = false;
   }

   public boolean J() {
      int var1 = To_2.L();
      boolean var10000 = this.S;
      if (var1 != 0) {
         var10000 = !this.S;
      }

      return var10000;
   }
}





