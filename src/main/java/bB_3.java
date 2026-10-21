import java.util.List;
import org.pcap4j.packet.LengthBuilder;

public final class bB_3 implements LengthBuilder {
   private byte v;
   private boolean C;
   private List O;

   public bB_3() {
   }

   private bB_3(Fi_2 var1) {
      this.v = Fi_2.j(var1);
   }

   public bB_3 u(byte var1) {
      this.v = var1;
      return this;
   }

   public bB_3 E(List var1) {
      this.O = var1;
      return this;
   }

   public bB_3 a(boolean var1) {
      this.C = var1;
      return this;
   }

   public Fi_2 D() {
      return new Fi_2(this, null);
   }

   @Override
   public Object build() {
      return this.D();
   }

   @Override
   public LengthBuilder correctLengthAtBuild(boolean var1) {
      return this.a(var1);
   }

   static List B(bB_3 var0) {
      return var0.O;
   }

   static boolean t(bB_3 var0) {
      return var0.C;
   }

   static byte A(bB_3 var0) {
      return var0.v;
   }

   bB_3(Fi_2 var1, bB_3 var2) {
      this(var1);
   }
}





