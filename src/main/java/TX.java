import java.util.EventObject;

public class TX extends EventObject {
   private final int N;
   private final boolean l;
   private final boolean P;

   public TX(xJ var1, int var2, boolean var3, boolean var4) {
      super(var1);
      this.N = var2;
      this.l = var4;
      this.P = var3;
   }

   public int C() {
      return this.N;
   }

   public boolean H() {
      return this.l;
   }

   public boolean O() {
      return this.P;
   }
}





